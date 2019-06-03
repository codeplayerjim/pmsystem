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
  `canteen` varchar(20) DEFAULT NULL,
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
  `idNumber` int(20) DEFAULT NULL comment '编号',
  `household_registration` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'户籍地',
  `contraception_measures` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'避孕措施',
  `residence` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '现居地',
  `department_contact` datetime DEFAULT NULL comment '计生部门联系电话',
  `vaild_time` DATETIME DEFAULT NULL comment '计生证有效时间',
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='计生证';

-- ----------------------------
-- Records of pms_family_planning_certificate
-- ----------------------------
INSERT INTO `pms_family_planning_certificate` VALUES ('1', '0567555', '湖北省湖北市', '人工避孕', '广东省广州市', '15767771923', '2019-08-07 14:20:44');
INSERT INTO `pms_family_planning_certificate` VALUES ('2', '0563202', '广东省梅州市', '人工避孕', '广东省广州市', '15767771925', '2020-10-20 14:20:44');
INSERT INTO `pms_family_planning_certificate` VALUES ('3', '0222222', '广西省桂林市', '人工避孕', '广东省广州市', '15767771926', '2022-10-16 14:20:44');

-- ----------------------------
-- Table structure for `pms_free_of_charge`
-- ----------------------------
DROP TABLE IF EXISTS `pms_free_of_charge`;
CREATE TABLE `pms_free_of_charge` (
  `id` int(20) NOT NULL,
  `cardNumber` int(20) DEFAULT NULL COMMENT '卡号',
  `cardType` ENUM('临时卡','钱包卡','无') CHARACTER SET utf8mb4 DEFAULT NULL,
  is_alarm ENUM('新办理','旧办理')CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk COMMENT='免费伙食';

-- ----------------------------
-- Records of pms_free_of_charge
-- ----------------------------
INSERT INTO `pms_free_of_charge` VALUES ('1','23334031' , '无', '新办理');
INSERT INTO `pms_free_of_charge` VALUES ('2', '12223421',  '钱包卡','旧办理');
INSERT INTO `pms_free_of_charge` VALUES ('3', '13334522',  '临时卡','新办理');

-- ----------------------------
-- Table structure for `pms_health_certificate`
-- ----------------------------
DROP TABLE IF EXISTS `pms_health_certificate`;
CREATE TABLE `pms_health_certificate` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `serv_time` DATETIME  DEFAULT NULL comment'办理时间',
  `expir_time` DATETIME  DEFAULT NULL comment'到期时间',
  `institution` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'机构',
  `has_script` ENUM('是','否') default '是' comment'是否有原件',
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
  `entry_time` DATETIME DEFAULT NULL comment'入职时间',
  `separation_time` DATETIME  DEFAULT NULL comment'离职时间',
  `employed_time` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT'历史就职时间',
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
                            `spouse_id` int(20) DEFAULT NULL comment '配偶联系人',
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
                                       `emergname` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '紧急联系人姓名',
                                       `emergphone` int(20) DEFAULT NULL comment '紧急联系人电话号码',
                                       PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='紧急联系人';

-- ----------------------------
-- Records of pms_emergency_contact
-- ----------------------------
INSERT INTO `pms_emergency_contact` VALUES ('1', '李先生', '12333336652');



-- ----------------------------
-- Table structure for `pms_parental_situation`
-- ----------------------------
DROP TABLE IF EXISTS `pms_parental_situation`;
CREATE TABLE `pms_parental_situation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '姓名',
  `relationship` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '关系',
  `age` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '年龄',
  `workplace` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '工作单位',
  `contact` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '联系方式',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='父母情况';

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
                                     `workplace` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '工作单位',
                                     `contact` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'联系方式',
                                     PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='子女情况';

-- ----------------------------
-- Records of pms_child situation
-- ----------------------------
INSERT INTO `pms_child_situation` VALUES ('1','1', '男', '李明', '10', 'beijing dajian', 'phone13346552340');


-- Table structure for `pms_spouse_situation`
-- ----------------------------
DROP TABLE IF EXISTS `pms_spouse_situation`;
CREATE TABLE `pms_spouse_situation` (
                                      `id` int(20) NOT NULL AUTO_INCREMENT,
                                      `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      `age` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
                                      `workplace` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'工作单位',
                                      `contact` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment'联系方式',
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
  certificate_No int(30) default null comment'证书号',
  profession_level varchar(5) default null comment '专业技能级别',
  release_organization varchar(20) default null comment '发证机关',
  release_data DATETIME default null comment'发证日期' ,
  `profession_skill` varchar(20) DEFAULT NULL comment '专业技能',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='员工相关专业技能证书档案';

-- ----------------------------
-- Records of pms_professional_skills_certificate
-- ----------------------------
INSERT INTO `pms_professional_skills_certificate` VALUES ('1', '133455520211', '一级','广东人事考试厅','2019-06-05 13:45:20' , '特级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('2', '222113334455', '一级','广东人事考试厅','2019-07-05 12:43:20' ,  '中级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('3', '259993304552', '一级','广东人事考试厅','2019-08-05 15:11:20' ,  '特级厨师证');
INSERT INTO `pms_professional_skills_certificate` VALUES ('4', '204921029105', '一级','广东人事考试厅','2019-02-05 13:55:20' , '高级技师证');

-- ----------------------------
-- Table structure for `pms_provident_fund_purchase`
-- ----------------------------
DROP TABLE IF EXISTS `pms_provident_fund_purchase`;
CREATE TABLE `pms_provident_fund_purchase` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `purchase_time` DATETIME  DEFAULT NULL comment '购买情况',
  `end_time` DATETIME  DEFAULT NULL comment '停买情况',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=gbk COMMENT='公积金购买情况';

-- ----------------------------
-- Records of pms_provident_fund_purchase
-- ----------------------------
INSERT INTO `pms_provident_fund_purchase` VALUES ('1',  '2016-05-20 13:45:20 ', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('2', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('3',  '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('4', '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('5',  '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('6',  '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('7',  '2016-05-20 13:45:20', '2020-02-26 13:45:20');
INSERT INTO `pms_provident_fund_purchase` VALUES ('8', '2016-05-20 13:45:20', '2020-02-26 13:45:20');

-- ----------------------------
-- Table structure for `pms_purchase_and_purchase_situation`
-- ----------------------------

DROP TABLE IF EXISTS `pms_purchase_and_purchase_situation`;
CREATE TABLE `pms_purchase_and_purchase_situation` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `purchase_time` DATETIME  DEFAULT NULL comment'购保时间',
  `time_to_suspend` DATETIME  DEFAULT NULL comment'停保时间',
  personal_computer_id int(20) DEFAULT NULL comment'个人电脑号',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='购保情况';

-- ----------------------------
-- Records of pms_purchase_and_purchase_situation
-- ----------------------------
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ( '1', '2017-02-06 12:20:30', '2022-10-01 12:20:30', '11212212');
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ( '2', '2016-02-21 12:20:30', '2022-10-06 12:20:30', '11121212');
INSERT INTO `pms_purchase_and_purchase_situation` VALUES ( '3', '2016-05-03 12:20:30', '2021-05-06 12:20:30', '65656564');

-- ----------------------------
-- Table structure for `pms_retire_employer`
-- ----------------------------
DROP TABLE IF EXISTS pms_retire_employee;
CREATE TABLE `pms_retire_employee` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sex` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `nation` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '民族',
  native_place varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '籍贯',
  `birthplace` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '出生地',
  `birthday` DATETIME  DEFAULT NULL comment '出生年月',
   bankCard int(32)  DEFAULT NULL comment='银行卡',
  `idCard` int(32) DEFAULT NULL COMMENT='身份证号码',
  `residence` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment='现居地址',
  `emergphone` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment='紧急联系电话',
  EmergencyContact varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL Comment='紧急联系人联系方式',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='事业编制退休人员员工基本信息';

-- ----------------------------
-- Records of pms_retire_employer
-- ----------------------------
INSERT INTO pms_retire_employee VALUES ('1', '男', '王五', '汉', '河北省河北市','河北省河北市', '1966-12-03 ', '123212112','441081109207050102', '广东省广州市', '1111111111','手机号码：1332244');
INSERT INTO pms_retire_employee VALUES ('2', '女', '哈利', '维吾尔族', '新疆维吾尔','新疆维吾尔', '1989-02-12 ', '1266546545','4410801199702010221', '广东省广州市', '1235446565','手机号码：22331122');

-- ----------------------------
-- ----------------------------
-- Table structure for `pms_training`
-- ----------------------------
DROP TABLE IF EXISTS `pms_training`;
CREATE TABLE `pms_training` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `program` varchar(12) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训项目',
  `time` DATETIME  DEFAULT NULL comment '培训时间',
  `location` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训地点',
  `content` varchar(12) CHARACTER SET utf8mb4 DEFAULT NULL comment '培训内容',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工培训记录表';

-- ----------------------------
-- Records of pms_training
-- ----------------------------
INSERT INTO `pms_training` VALUES ('1',  '料理培训', '2014-02-22 12:20:30', '培训部B区', '烹饪技巧');
INSERT INTO `pms_training` VALUES ('2',  '厨房培训', '2013-09-27 12:20:30', '培训部D区', '厨师修养');
INSERT INTO `pms_training` VALUES ('3',  '技师培训', '2011-05-11 12:20:30', '培训部A区', '技术指导');

-- ----------------------------
-- Table structure for `pms_subsidy`
-- ----------------------------
DROP TABLE IF EXISTS `pms_subsidy`;
CREATE TABLE `pms_subsidy` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `subsidy_time` DATETIME  DEFAULT NULL comment '领取补助时间',
  amount_of_subsidies varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL comment '补助金额',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工领取补助记录表';

-- ----------------------------
-- Records of pms_subsidy
-- ----------------------------
INSERT INTO `pms_subsidy` VALUES ('1',  '2017-02-03 12:20:30', '2000元');
INSERT INTO `pms_subsidy` VALUES ('2',  '2018-08-24 12:20:30', '500元');
INSERT INTO `pms_subsidy` VALUES ('3',  '2019-01-15 12:20:30', '3000元');

-- ----------------------------
-- Table structure for `pms_rewards_and_punishments`
-- ----------------------------
DROP TABLE IF EXISTS `pms_rewards_and_punishments`;
CREATE TABLE `pms_rewards_and_punishments` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `rewards` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL comment '奖励',
  `reward_time` DATETIME  DEFAULT NULL comment '奖励时间',
  `punishments` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL comment '惩罚',
  `punishment_time` DATETIME  DEFAULT NULL comment '惩罚时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='员工奖惩信息记录表';

-- ----------------------------
-- Records of pms_rewards_and_punishments
-- ----------------------------
INSERT INTO `pms_rewards_and_punishments` VALUES ('1',  '奖励2000元', '2015-07-26 12:20:30', '扣工资1000元','2019-03-03 12:20:30');
INSERT INTO `pms_rewards_and_punishments` VALUES ('2',  '奖励3000元', '2019-07-24 12:29:33', '扣工资200元' ,'2016-05-17 12:20:30');
INSERT INTO `pms_rewards_and_punishments` VALUES ('3',  '奖励300元', '2019-06-26 14:20:30', '扣工资100元','2019-03-25 12:20:30');

-- ----------------------------
-- Table structure for `pms_work_permit_processing_record`
-- ----------------------------
DROP TABLE IF EXISTS `pms_work_permit_processing_record`;
CREATE TABLE `pms_work_permit_processing_record` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  healthy_id int(20) default null ,
  family_planning_certificate_id int(20) default null ,
  expir_time datetime null comment '到期日期',
  serv_time datetime null comment '办理日期',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='工作证办理记录';

-- ----------------------------
-- Records of pms_work_permit_processing_record
-- ----------------------------
INSERT INTO `pms_work_permit_processing_record` VALUES ('1','1','1','2015-07-26 12:20:30','2015-07-26 12:20:30');
INSERT INTO `pms_work_permit_processing_record` VALUES ('2', '1','','2015-07-26 12:20:30','2015-07-26 12:20:30');
INSERT INTO `pms_work_permit_processing_record` VALUES ('3', '2','1','2015-07-26 12:20:30','2015-07-26 12:20:30');
INSERT INTO `pms_work_permit_processing_record` VALUES ('4', '3','2','2015-07-26 12:20:30','2015-07-26 12:20:30');


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

INSERT INTO `pms_admin` VALUES ('1', 'test', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', '', null, '测试账号', null, '2018-09-29 13:55:30', '2018-09-29 13:55:39', '1');
INSERT INTO `pms_admin` VALUES ('2', 'admin', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', '', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-03-20 15:38:50', '1');
INSERT INTO `pms_admin` VALUES ('3', 'admin', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', '', 'pmadmin@163.com', '人事管理员', '人事管理员', '2018-10-08 13:32:47', '2019-03-20 15:38:50', '1');

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

