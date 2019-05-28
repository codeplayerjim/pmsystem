/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : renshi

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2019-03-22 22:30:40
*/

SET FOREIGN_KEY_CHECKS=0;

use  pmsystem;

-- ----------------------------
-- Table structure for `pms_birth_recore`
-- ----------------------------
DROP TABLE IF EXISTS `pms_birth_recore`;
CREATE TABLE `pms_birth_recore` (
  `id` int(20) NOT NULL,
  `firstchild` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `employee_inspection_hospital` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `childbirth_hospital` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `birth_certificate_number` varchar(20) DEFAULT NULL,
  `birth_surgery_date` DATETIME  DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk COMMENT='生育记录';

-- ----------------------------
-- Records of pms_birth_recore
-- ----------------------------
INSERT INTO `pms_birth_recore` VALUES ('1', '二胎', '玛丽妇科医院', '妇科医院', '1110010', '2019-02-03 15:14:21');
INSERT INTO `pms_birth_recore` VALUES ('2', '头胎', '玛丽妇科医院', '人民第三医院', '1003223', '2020-01-02 16:24:30');
INSERT INTO `pms_birth_recore` VALUES ('3', '二胎', '玛丽妇科医院', '妇科医院', '1020020', '19-05-25 19:20:30');


-- ----------------------------
-- Table structure for `pms_contract_signing`
-- ----------------------------
DROP TABLE IF EXISTS `pms_contract_signing`;
CREATE TABLE `pms_contract_signing` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `category` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `exipr_time` DATETIME DEFAULT NULL COMMENT'到期',
  `expir_situation` DATETIME DEFAULT NULL COMMENT'到期情况',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='合同签订情况';

-- ----------------------------
-- Records of pms_contract_signing
-- ----------------------------
INSERT INTO `pms_contract_signing` VALUES ('1', '厨师合同', '2019-06-12 00:00:00', '已签约');
INSERT INTO `pms_contract_signing` VALUES ('2', '技师合同', '2020-12-30 00:00:00', '已签约');
INSERT INTO `pms_contract_signing` VALUES ('3', '厨师合同', '2022-10-05 00:00:00', '已签约');


-- ----------------------------
-- Table structure for `pms_employee`
-- ----------------------------
DROP TABLE IF EXISTS `pms_employee`;
CREATE TABLE `pms_employee` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `nation` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'民族',
  `birthpalce` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'籍贯',
  `job_number` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'工号',
  `date_of_birth`DATETIME  DEFAULT NULL,
  `identification_number` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `is_marry` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'婚否',
  `political_status` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `house_register_type` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'户口性质',
  `Canteen` varchar(20) DEFAULT NULL,
  `department` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `authr_stren` varchar(20) DEFAULT NULL comment'编制',
  `photo` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'照片（红底）',
  `position` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '职务',
  `highest_education` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'最高学历',
  `graduated_school` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'毕业院校',
  `id_card` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '身份证',
  `email` varchar(20) DEFAULT NULL,
  `house_register_location` varchar(20) DEFAULT NULL comment'户口所在地',
  `residence` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'现居地址',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='在职员工基本信息';

-- ----------------------------
-- Records of pms_employee
-- ----------------------------
INSERT INTO `pms_employee` VALUES ('1', '李四', '男', '汉', '广东省梅州市', '121212', '1968-02-02 16:26:56', 'xxxxxx', '已婚', '党员', '本地', '第三食堂', '厨房部', '厨房', 'none', '厨师长', '本科', '中三大学', '13033640222', '1303364022@qq.com', '广东省梅州市', '广东省梅州市');
INSERT INTO `pms_employee` VALUES ('2', '李娜', '女', '汉', '广东省汕尾市', '021565', '1977-02-06 12:10:20', 'xxxxxx', '已婚', '团员', '本地', '第二食堂', '烹饪部', '厨房', 'none', '烹饪厨师长', '本科', '暨南大学', '12123213213', '1212322@qq.com', '广东省汕尾市', '广东省汕尾市');


-- ----------------------------
-- Table structure for `pms_family_planning_certificate`
-- ----------------------------
DROP TABLE IF EXISTS `pms_family_planning_certificate`;
CREATE TABLE `pms_family_planning_certificate` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `numbering` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `household_registration` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `measures` varchar(200) CHARACTER SET utf8mb4 DEFAULT NULL,
  `live` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `department_contact` datetime DEFAULT NULL,
  `meal_time` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='计生证';

-- ----------------------------
-- Records of pms_family_planning_certificate
-- ----------------------------
INSERT INTO `pms_family_planning_certificate` VALUES ('1', '056755', '湖北省湖北市', '人工避孕', '广东省广州市', '15767771923', '2019-08-07 14:20:44');
INSERT INTO `pms_family_planning_certificate` VALUES ('2', '0563202', '广东省梅州市', '人工避孕', '广东省广州市', '15767771925', '2020-10-20 14:20:44');
INSERT INTO `pms_family_planning_certificate` VALUES ('3', '0222222', '广西省桂林市', '人工避孕', '广东省广州市', '15767771926', '2022-10-16 14:20:44');

-- ----------------------------
-- Table structure for `pms_free_of_charge`
-- ----------------------------
DROP TABLE IF EXISTS `pms_free_of_charge`;
CREATE TABLE `pms_free_of_charge` (
  `id` int(20) NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `department` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `number` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `continue` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `type` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk COMMENT='免费伙食';

-- ----------------------------
-- Records of pms_free_of_charge
-- ----------------------------
INSERT INTO `pms_free_of_charge` VALUES ('1', '李四', '厨房部', '230236622', '快到期', '临时卡');
INSERT INTO `pms_free_of_charge` VALUES ('2', '王五', '厨房部', '226565656', '未到期', '钱包卡');
INSERT INTO `pms_free_of_charge` VALUES ('3', '孙红', '技师部', '454545451', '快到期', '临时卡');

-- ----------------------------
-- Table structure for `pms_health_certificate`
-- ----------------------------
DROP TABLE IF EXISTS `pms_health_certificate`;
CREATE TABLE `pms_health_certificate` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `serv_time` DATETIME  DEFAULT NULL,
  `expir_time` DATETIME  DEFAULT NULL,
  `institution` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `has_script` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='健康证';

-- ----------------------------
-- Records of pms_health_certificate
-- ----------------------------
INSERT INTO `pms_health_certificate` VALUES ('1', '2018-12-20 10:20:44', '2019-10-20 13:20:55', '东莞市第三医院', '否');
INSERT INTO `pms_health_certificate` VALUES ('2', '2018-12-20 10:20:44', '2019-10-20 13:20:55', '东莞市第三医院', '是');

-- ----------------------------
-- Table structure for `pms_inauguration`
-- ----------------------------
DROP TABLE IF EXISTS `pms_inauguration`;
CREATE TABLE `pms_inauguration` (
  `id` int(20) NOT NULL,
  `entry_time` DATETIME DEFAULT NULL,
  `
separation_time` DATETIME  DEFAULT NULL,
  `employment_record` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk COMMENT='就职情况';

-- ----------------------------
-- Records of pms_inauguration
-- ----------------------------
INSERT INTO `pms_inauguration` VALUES ('1', '2018-12-02 13:45:20', '2019-06-30 15:30:21', '特级厨师');
INSERT INTO `pms_inauguration` VALUES ('2', '2019-01-03 14:12:23', '2020-02-26 19:14:50', '技师');
INSERT INTO `pms_inauguration` VALUES ('3', '2017-02-21 15:23:21', '2019-02-21 15:20:10', '中级厨师');

-- ----------------------------
-- Table structure for `pms_family`
-- ----------------------------

DROP TABLE IF EXISTS pms_family;
CREATE TABLE pms_family(
                            `id` int(20) NOT NULL AUTO_INCREMENT,
                            `parent_id` int(20) DEFAULT NULL comment '父母联系人',
                            `spouse_id` int(20) DEFAULT NULL comment '',
                            `child_id` int(20) DEFAULT NULL,
                            `friend_id` int(20) DEFAULT NULL comment'紧急联系人',
                            PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=gbk COMMENT='家庭情况';

-- ----------------------------
-- Records of pms_family
-- ----------------------------
INSERT INTO `pms_family` VALUES ('1', '1', '1', '1', '1');
INSERT INTO `pms_family` VALUES ('2', '2', '2', '2', '2');
INSERT INTO `pms_family` VALUES ('3', '3', '3', '3', '3');
INSERT INTO `pms_family` VALUES ('4', '4', '4', '4', '4');
INSERT INTO `pms_family` VALUES ('5', '5', '5', '5', '5');

-- ----------------------------
-- Table structure for `pms_emergency_contact`
-- ----------------------------
use pmsystem;
DROP TABLE IF EXISTS `pms_emergency_contact`;
CREATE TABLE `pms_emergency_contact` (
                                       `id` int(20) NOT NULL AUTO_INCREMENT,
                                       `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                       `phone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                       PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='紧急联系人';

-- ----------------------------
-- Records of pms_emergency_contact
-- ----------------------------
INSERT INTO `pms_emergency_contact` VALUES ('2', '爱好', '12333336652');



-- ----------------------------
-- Table structure for `pms_parental_situation`
-- ----------------------------
DROP TABLE IF EXISTS `pms_parental_situation`;
CREATE TABLE `pms_parental_situation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `relationship` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `age` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `employer` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='父母情况：姓名、关系、年龄、工作单位、联系方式；\r\n
②配偶情况：姓名、年龄、工作单位、联系方式；
③子女情况：数量、姓名、年龄、性别、工作单位、联系方式；\r\n
④紧急联系人：姓名、电话；';

-- ----------------------------
-- Records of pms_parental_situation
-- ----------------------------
INSERT INTO `pms_parental_situation` VALUES ('1', '李林', '父亲', '56', '第三医院', '16589666');
INSERT INTO `pms_parental_situation` VALUES ('2', '王文凤', '母亲', '55', '教师', '12321313');

-- ----------------------------
-- Table structure for `pms_child situation`
-- ----------------------------

DROP TABLE IF EXISTS pms_child_situation;
CREATE TABLE pms_child_situation(
                                     `id` int(20) NOT NULL AUTO_INCREMENT,
                                     `quantity` int(20) DEFAULT NULL comment '数量',
                                      sex ENUM('男','女','保密'),
                                     `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                     `age` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                     `employer` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '工作单位',
                                     `phone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                     PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='子女情况';

-- ----------------------------
-- Records of pms_child situation
-- ----------------------------
INSERT INTO `pms_child_situation` VALUES ('3','男', '1', '李明', '10', 'none', 'none');

use pmsystem;
-- Table structure for `pms_spouse_situation`
-- ----------------------------
DROP TABLE IF EXISTS `pms_spouse_situation`;
CREATE TABLE `pms_spouse_situation` (
                                      `id` int(20) NOT NULL AUTO_INCREMENT,
                                      `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      `age` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      `employer` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      `phone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='配偶情况';

-- ----------------------------
-- Records of pms_spouse_situation
-- ----------------------------
INSERT INTO `pms_spouse_situation` VALUES ('2', '江小白', '22', '护士', '13033640221');


-- ----------------------------
-- Table structure for `pms_professional_skills_certificate`
-- ----------------------------
DROP TABLE IF EXISTS `pms_professional_skills_certificate`;
CREATE TABLE `pms_professional_skills_certificate` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `occupation` varchar(20) DEFAULT NULL,
  `professional` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='员工相关专业技能证书档案';

-- ----------------------------
-- Records of pms_professional_skills_certificate
-- ----------------------------
INSERT INTO `pms_professional_skills_certificate` VALUES ('1', '张三', '男', '41', '高级烹饪师', '特级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('2', '李四', '女', '33', '中级烹饪师', '中级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('3', '王五', '女', '32', '高级点心师', '特级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('4', '阿婆罗', '男', '23', '高级技师', '高级技师证');

-- ----------------------------
-- Table structure for `pms_provident_fund_purchase`
-- ----------------------------
DROP TABLE IF EXISTS `pms_provident_fund_purchase`;
CREATE TABLE `pms_provident_fund_purchase` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL,
  `age` int(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `occupation` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `purchase_time` DATETIME  DEFAULT NULL,
  `stop_selling_time` DATETIME  DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=gbk COMMENT='公积金购买情况';

-- ----------------------------
-- Records of pms_provident_fund_purchase
-- ----------------------------
INSERT INTO `pms_provident_fund_purchase` VALUES ('0', '张三', '44', '男', '高级烹饪师', '2016-05-20 13:45:20 ', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('2', '李四', '43', '男', '中级烹饪师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('3', '王五', '33', '男', '其它级别的厨师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('4', 'c罗', '34', '男', '点心师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('5', '梅西', '20', '女', '本科学历厨师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('6', '贝尔纳带司机', '21', '女', '专科学历点心师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('7', '里贝里', '22', '男', '本科学历点心师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('8', '罗本', '23', '男', '服务师', '2016-05-20 13:45:20', '2020-02-26 13:45:20');

-- ----------------------------
-- Table structure for `pms_purchase_and_purchase_situation`
-- ----------------------------

DROP TABLE IF EXISTS `pms_purchase_and_purchase_situation`;
CREATE TABLE `pms_purchase_and_purchase_situation` (
  `apartment` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `purchase_time` DATETIME  DEFAULT NULL,
  `time_to_suspend` DATETIME  DEFAULT NULL,
  `personal_computer_number` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='购保情况';

-- ----------------------------
-- Records of pms_purchase_and_purchase_situation
-- ----------------------------
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ('厨师部', '张伟', '1', '2017-02-06 12:20:30', '2022-10-01 12:20:30', '11212212');
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ('技师部', '李斯', '2', '2016-02-21 12:20:30', '2022-10-06 12:20:30', '11121212');
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ('烹饪部', '刘邦', '3', '2016-05-03 12:20:30', '2021-05-06 12:20:30', '65656564');

-- ----------------------------
-- Table structure for `pms_retire_employer`
-- ----------------------------
DROP TABLE IF EXISTS pms_retire_employee;
CREATE TABLE `pms_retire_employer` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sex` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `national` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `birthplace` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `birthday` DATETIME  DEFAULT NULL,
   BankCard int(32) CHARACTER SET utf8mb4 DEFAULT NULL comment'银行卡'
  `number` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '身份证号码',
  `address` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '现居地址',
  `phone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '紧急联系电话',
  EmergencyContact varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL 紧急联系人联系方式
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='事业编制退休人员员工基本信息';

-- ----------------------------
-- Records of pms_retire_employer
-- ----------------------------
INSERT INTO pms_retire_employee VALUES ('1', '男', '王五', '汉', '河北省河北市', '1966-12-03  ', '123212112', '广东省广州市', '1111111111');
INSERT INTO pms_retire_employee VALUES ('2', '女', '哈利', '维吾尔族', '新疆维吾尔', '1989-02-12  ', '1266546545', '广东省广州市', '1235446565');

-- ----------------------------
-- ----------------------------
-- Table structure for `pms_training`
-- ----------------------------
DROP TABLE IF EXISTS `pms_training`;
CREATE TABLE `pms_training` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `train_program` varchar(12) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训项目',
  `train_time` DATETIME  DEFAULT NULL comment '培训时间',
  `train_location` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训地点',
  `train_content` varchar(12) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训内容',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工培训记录表';

-- ----------------------------
-- Records of pms_training
-- ----------------------------
INSERT INTO `pms_training` VALUES ('1', '张伟', '料理培训', '2014-02-22 12:20:30', '培训部B区', '烹饪技巧');
INSERT INTO `pms_training` VALUES ('2', '维斯', '厨房培训', '2013-09-27 12:20:30', '培训部D区', '厨师修养');
INSERT INTO `pms_training` VALUES ('3', '昂加', '技师培训', '2011-05-11 12:20:30', '培训部A区', '技术指导');

-- ----------------------------
-- Table structure for `pms_subsidy`
-- ----------------------------
DROP TABLE IF EXISTS `pms_subsidy`;
CREATE TABLE `pms_subsidy` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `receive_time` DATETIME  DEFAULT NULL comment '领取补助时间',
  `sub` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '补助金额',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工领取补助记录表';

-- ----------------------------
-- Records of pms_subsidy
-- ----------------------------
INSERT INTO `pms_subsidy` VALUES ('1', '张伟', '2017-02-03 12:20:30', '2000元');
INSERT INTO `pms_subsidy` VALUES ('2', '维斯', '2018-08-24 12:20:30', '500元');
INSERT INTO `pms_subsidy` VALUES ('3', '昂加', '2019-01-15 12:20:30', '3000元');

-- ----------------------------
-- Table structure for `pms_rewards_and_punishments`
-- ----------------------------
DROP TABLE IF EXISTS `pms_rewards_and_punishments`;
CREATE TABLE `pms_rewards_and_punishments` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `rewards` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL comment '奖励',
  `reward_time` DATETIME  DEFAULT NULL comment '奖励时间',
  `punishments` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL comment '惩罚',
  `punishment_time` DATETIME  DEFAULT NULL comment '惩罚时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工奖惩信息记录表';

-- ----------------------------
-- Records of pms_rewards_and_punishments
-- ----------------------------
INSERT INTO `pms_rewards_and_punishments` VALUES ('1', '张伟', '奖励2000元', '2015-07-26 12:20:30', '扣工资1000元' '2019-03-03 12:20:30');
INSERT INTO `pms_rewards_and_punishments` VALUES ('2', '维斯', '无', '无', '扣工资200元' '2016-05-17 12:20:30');
INSERT INTO `pms_rewards_and_punishments` VALUES ('3', '昂加', '无', '无', '无' '无');

-- ----------------------------
-- Table structure for `pms_work_permit_processing_record`
-- ----------------------------
DROP TABLE IF EXISTS `pms_work_permit_processing_record`;
CREATE TABLE `pms_work_permit_processing_record` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `age` varchar(30) DEFAULT NULL,
  `occupation` varchar(20) DEFAULT NULL,
  `permit` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='工作证办理记录';

-- ----------------------------
-- Records of pms_work_permit_processing_record
-- ----------------------------
INSERT INTO `pms_work_permit_processing_record` VALUES ('1', '贝克汉姆', '男', '20', '点心师', '点心师工作证');
INSERT INTO `pms_work_permit_processing_record` VALUES ('2', '倪妮', '女', '26', '厨师', '厨师证');
INSERT INTO `pms_work_permit_processing_record` VALUES ('3', '安然', '女', '24', '技师', '高级技师证');
INSERT INTO `pms_work_permit_processing_record` VALUES ('4', '墨染', '男', '29', '厨师', '中级厨师证');


create table if not exists pmsystem.pms_admin
(
  id int auto_increment
    primary key,
  username varchar(64) null,
  password varchar(64) null,
  icon varchar(500) null comment '头像',
  email varchar(100) null comment '邮箱',
  nick_name varchar(200) null comment '昵称',
  note varchar(500) null comment '备注信息',
  create_time datetime null comment '创建时间',
  login_time datetime null comment '最后登录时间',
  status int(1) default 1 null comment '帐号启用状态：0->禁用；1->启用'
)
  comment '后台用户表';

INSERT INTO `pms_admin` VALUES ('1', 'test', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', null, '测试账号', null, '2018-09-29 13:55:30', '2018-09-29 13:55:39', '1');
INSERT INTO `pms_admin` VALUES ('2', 'admin', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/170157_yIl3_1767531.jpg', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-03-20 15:38:50', '1');
INSERT INTO `pms_admin` VALUES ('3', 'admin', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/170157_yIl3_1767531.jpg', 'pmadmin@163.com', '人事管理员', '人事管理员', '2018-10-08 13:32:47', '2019-03-20 15:38:50', '1');

create table if not exists pmsystem.pms_permission
(
  id int(11) auto_increment
    primary key,
  pid int(11) null comment '父级权限id',
  name varchar(100) null comment '名称',
  value varchar(200) null comment '权限值',
  icon varchar(500) null comment '图标',
  type int(1) null comment '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  uri varchar(200) null comment '前端资源路径',
  status int(1) null comment '启用状态；0->禁用；1->启用',
  create_time datetime null comment '创建时间',
  sort int null comment '排序'
)
  comment '后台用户权限表';



INSERT INTO pms_permission VALUES ('1', '0', '员工', null, null, '0', null, '1', '2018-09-29 16:15:14', '0');
INSERT INTO pms_permission VALUES ('2', '1', '员工列表', 'pms:employee:read', null, '1', '/pms/employee/index', '1', '2018-09-29 16:17:01', '0');
INSERT INTO pms_permission VALUES ('3', '1', '添加员工', 'pms:employee:create', null, '1', '/pms/employee/add', '1', '2018-09-29 16:18:51', '0');
INSERT INTO pms_permission VALUES ('4', '1', '员工分类', 'pms:employeeCategory:read', null, '1', '/pms/employeeCate/index', '1', '2018-09-29 16:23:07', '0');
INSERT INTO pms_permission VALUES ('5', '1', '员工类型', 'pms:employeeAttribute:read', null, '1', '/pms/employeeAttr/index', '1', '2018-09-29 16:24:43', '0');
INSERT INTO pms_permission VALUES ('6', '1', '管理员数据管理', 'pms:admin:read', null, '1', '/pms/admin/index', '1', '2018-09-29 16:25:45', '0');
INSERT INTO pms_permission VALUES ('7', '2', '编辑员工', 'pms:employee:update', null, '2', '/pms/employee/updateemployee', '1', '2018-09-29 16:34:23', '0');
INSERT INTO pms_permission VALUES ('8', '2', '删除员工', 'pms:employee:delete', null, '2', '/pms/employee/delete', '1', '2018-09-29 16:38:33', '0');
INSERT INTO pms_permission VALUES ('9', '4', '添加员工分类', 'pms:employeeCategory:create', null, '2', '/pms/employeeCate/create', '1', '2018-09-29 16:43:23', '0');
INSERT INTO pms_permission VALUES ('10', '4', '修改员工分类', 'pms:employeeCategory:update', null, '2', '/pms/employeeCate/update', '1', '2018-09-29 16:43:55', '0');
INSERT INTO pms_permission VALUES ('11', '4', '删除员工分类', 'pms:employeeCategory:delete', null, '2', '/pms/employeeAttr/delete', '1', '2018-09-29 16:44:38', '0');
INSERT INTO pms_permission VALUES ('12', '5', '添加员工类型', 'pms:employeeAttribute:create', null, '2', '/pms/employeeAttr/create', '1', '2018-09-29 16:45:25', '0');
INSERT INTO pms_permission VALUES ('13', '5', '修改员工类型', 'pms:employeeAttribute:update', null, '2', '/pms/employeeAttr/update', '1', '2018-09-29 16:48:08', '0');
INSERT INTO pms_permission VALUES ('14', '5', '删除员工类型', 'pms:employeeAttribute:delete', null, '2', '/pms/employeeAttr/delete', '1', '2018-09-29 16:48:44', '0');
INSERT INTO pms_permission VALUES ('15', '6', '添加管理员数据', 'pms:admin:create', null, '2', '/pms/admin/add', '1', '2018-09-29 16:49:34', '0');
INSERT INTO pms_permission VALUES ('16', '6', '修改管理员数据', 'pms:admin:update', null, '2', '/pms/admin/update', '1', '2018-09-29 16:50:55', '0');
INSERT INTO pms_permission VALUES ('17', '6', '删除管理员数据', 'pms:admin:delete', null, '2', '/pms/admin/delete', '1', '2018-09-29 16:50:59', '0');
INSERT INTO pms_permission VALUES ('18', '0', '首页', null, null, '0', null, '1', '2018-09-29 16:51:57', '0');
INSERT INTO pms_permission VALUES ('19', '0', '删除紧急联系人数据', 'pms:emergency:delete', null, '2', '/pms/emergency/delete', '1', '2018-09-29 16:50:59', '0');
INSERT INTO pms_permission VALUES ('20', '1', '紧急联系人数据管理', 'pms:emergency:read', null, '1', '/pms/emergency/index', '1', '2018-09-29 16:25:45', '0');


create table if not exists pmsystem.pms_role
(
  id int(11) auto_increment
    primary key,
  name varchar(100) null comment '名称',
  description varchar(500) null comment '描述',
  admin_count int null comment '后台用户数量',
  create_time datetime null comment '创建时间',
  status int(1) default 1 null comment '启用状态：0->禁用；1->启用',
  sort int default 0 null
)
  comment '后台用户角色表';



INSERT INTO pms_role VALUES ('1', '系统管理员', '系统管理员', '0', '2018-09-30 15:46:11', '1', '0');
INSERT INTO pms_role VALUES ('2', '系统分类管理员', '系统分类管理员', '0', '2018-09-30 15:53:45', '1', '0');
INSERT INTO pms_role VALUES ('3', '系统类型管理员', '系统类型管理员', '0', '2018-09-30 15:53:56', '1', '0');
INSERT INTO pms_role VALUES ('4', '人事管理员', '人事管理员', '0', '2019-03-31 15:54:12', '1', '0');
INSERT INTO pms_role VALUES ('5', '人事管理员', '人事管理员', '0', '2019-03-31 15:54:12', '1', '0');

create table if not exists pmsystem.pms_role_permission_relation
(
  id int(11) auto_increment
    primary key,
  role_id int(11) null,
  permission_id int(11) null
)
  comment '后台用户角色和权限关系表';
use pmsystem;

INSERT INTO pms_role_permission_relation VALUES ('1', '1', '1');
INSERT INTO pms_role_permission_relation VALUES ('2', '1', '2');
INSERT INTO pms_role_permission_relation VALUES ('3', '1', '3');
INSERT INTO pms_role_permission_relation VALUES ('4', '1', '7');
INSERT INTO pms_role_permission_relation VALUES ('5', '1', '8');
INSERT INTO pms_role_permission_relation VALUES ('6', '2', '4');
INSERT INTO pms_role_permission_relation VALUES ('7', '2', '9');
INSERT INTO pms_role_permission_relation VALUES ('8', '2', '10');
INSERT INTO pms_role_permission_relation VALUES ('9', '2', '11');
INSERT INTO pms_role_permission_relation VALUES ('10', '3', '5');
INSERT INTO pms_role_permission_relation VALUES ('11', '3', '12');
INSERT INTO pms_role_permission_relation VALUES ('12', '3', '13');
INSERT INTO pms_role_permission_relation VALUES ('13', '3', '14');
INSERT INTO pms_role_permission_relation VALUES ('18', '2', '1');
INSERT INTO pms_role_permission_relation VALUES ('19', '2', '2');
INSERT INTO pms_role_permission_relation VALUES ('20', '2', '3');
INSERT INTO pms_role_permission_relation VALUES ('21', '2', '7');
INSERT INTO pms_role_permission_relation VALUES ('22', '2', '8');

  create table if not exists pmsystem.pms_admin_role_relation
(
	id int auto_increment
		primary key,
	admin_id int null,
	role_id int null
)
comment '后台用户和角色关系表';

INSERT INTO `pms_admin_role_relation` VALUES ('13', '3', '1');
INSERT INTO `pms_admin_role_relation` VALUES ('15', '3', '2');
INSERT INTO `pms_admin_role_relation` VALUES ('17', '4', '2');

create table if not exists pmsystem.pms_admin_permission_relation
(
    id int auto_increment
        primary key,
    admin_id int null,
    permission_id int null,
    type int(1) null
)
    comment '后台用户和权限关系表(除角色中定义的权限以外的加减权限)';

