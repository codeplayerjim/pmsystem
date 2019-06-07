package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsAdminLoginParam;
import com.spaker.pmsystem.dto.PmsAdminParam;
import com.spaker.pmsystem.service.PmsAdminService;
import com.sparker.pmsystem.common.api.CommonPage;
import com.sparker.pmsystem.common.api.CommonResult ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台管理员管理
 * Created by sunshine on 2019/4/9.
 */
@Controller
@Api(tags = "PmsAdminControleler",description = "管理员")
@RequestMapping("/admin")
public class PmsAdminController {
    @Autowired
    private PmsAdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "管理员注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PmsAdmin> register(@RequestBody PmsAdminParam pmsAdminParam,BindingResult result){
        PmsAdmin pmsAdmin=adminService.register(pmsAdminParam);
        if (pmsAdmin==null){
            return  CommonResult .failed();
        }
        return  CommonResult .success(pmsAdmin);

    }
    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody PmsAdminLoginParam pmsAdminLoginParam,BindingResult result){
        String token=adminService.login(pmsAdminLoginParam.getUsername(),pmsAdminLoginParam.getPassword());
        if (token==null){
            return CommonResult .vaildateFailed("管理员名或密码错误");
        }
        Map<String,String>tokenMap=new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult .success(tokenMap);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/token/refresh",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult refreshToken(HttpServletRequest request){
        String token=request.getHeader(tokenHeader);
        String refreshToken=adminService.refreshToken(token);
        if (refreshToken==null){
            return CommonResult .failed();
        }
        //显示至前端
        Map<String,String>tokenMap=new HashMap<>();
        tokenMap.put("token",refreshToken);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult .success(tokenMap);
    }


    @ApiOperation(value = "获取当前登录管理员信息")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(Principal principal){
        String username=principal.getName();
        PmsAdmin pmsAdmin=adminService.getAdminByUsername(username);
//        List<PmsRole>pmsRoles=adminService.getRoleList(pmsAdmin.getId());
        Map<String,Object>data=new HashMap<>();
        data.put("username",pmsAdmin.getUsername());
        data.put("roles",new String[]{"TEST"});
//        data.put("roles",pmsRoles.get(0));
        data.put("icon",pmsAdmin.getIcon());
        return CommonResult .success(data);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout(){return CommonResult .success(null);}

    @ApiOperation("根据管理员名或姓名分页获取管理员列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsAdmin>> list(@RequestParam(value = "name",required = false)String name,
                                         @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                         @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        List<PmsAdmin>adminList=adminService.list(name,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(adminList));

    }

    @ApiOperation("获取指定管理员信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getItem(@PathVariable Integer id){
        PmsAdmin pmsAdmin=adminService.getItem(id);
        return CommonResult .success(pmsAdmin);
    }

    @ApiOperation("修改指定管理员信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Integer id,@RequestBody PmsAdmin admin){
        int count=adminService.update(id,admin);
        if (count>0){
            return CommonResult .success(count);
        }
        return CommonResult .failed();
    }
    @ApiOperation("删除指定管理员信息")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Integer id){
        int count=adminService.delete(id);
        if(count>0){
            return CommonResult .success(count);
        }
        return CommonResult .failed();
    }


    @ApiOperation("给管理员分配角色")
    @RequestMapping(value = "/role/update",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRole(@RequestParam("adminId")int adminId,
                             @RequestParam("roleIds")List<Integer>roleIds){
        int count=adminService.updatePermission(adminId,roleIds);
        if (count>0){
            return CommonResult .success(count);
        }
        return CommonResult .failed();
    }

    @ApiOperation("获取指定管理员的角色")
    @RequestMapping(value = "/role/{adminId}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsRole>> getRoleList(@PathVariable int adminId){
        List<PmsRole>roleList=adminService.getRoleList(adminId);
        return CommonResult .success(roleList);
    }

    @ApiOperation("给管理员分配+-权限")
    @RequestMapping(value = "/permission/update",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePermission(@RequestParam Integer adminId,
                                   @RequestParam("permissionIds")List<Integer>permissionIds)
    {
        int count=adminService.updatePermission(adminId,permissionIds);
        if(count>0){
            return CommonResult .success(count);
        }
        return CommonResult .failed();
    }

    @ApiOperation("获取管理员所有权限(包括+-权限)")
    @RequestMapping(value = "/permission/{adminId}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsPermission>> getPermissionList(@PathVariable Integer adminId){
        List<PmsPermission>permissionList=adminService.getPermissionList(adminId);
        return CommonResult .success(permissionList);
    }

    @ApiOperation("数据库备份")
    @RequestMapping(value = "/databasebackup",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public CommonResult datebasebackup(HttpServletResponse response){
        String dbUser="root";
        String dbPassWord="root";
        String filePath="D:/backup";
        String dbName="pmsystem";
        try {
            Process process=Runtime.getRuntime().exec("cmd /c mysqldump -u "+dbUser+"-p"+dbPassWord+dbName+">"
                    +filePath+"/"+dbName+new java.util.Date().getTime()+".sql");
            return CommonResult .success(process);
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult .failed();
        }
    }

    @ApiOperation("数据库恢复")
    @RequestMapping(value = "/databaserestore",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public CommonResult datebaserestore(HttpServletResponse response){
        String dbUser="root";
        String dbPassWord="root";
        String filePath="D:/backup";
        String dbName="pmsystem";
        try {
            Process process=Runtime.getRuntime().exec("cmd /c mysql -u "+dbUser+  "-p "+dbPassWord+dbName+"<"
                    +filePath+"/"+dbName+new java.util.Date().getTime()+".sql");
            return CommonResult .success(process);
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult .failed();
        }

    }

}
