/*
SQLyog v10.2 
MySQL - 5.6.25-log : Database - edumaster
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`edumaster` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `edumaster`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `aNum` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `aname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apsd` varchar(20) COLLATE utf8_unicode_ci DEFAULT 'admin',
  PRIMARY KEY (`aNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `admin` */

insert  into `admin`(`aNum`,`aname`,`apsd`) values ('admin','admin','admin');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `cno` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程号',
  `cname` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程名',
  `majorInfo` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '所属专业',
  `cInfo` text COLLATE utf8_unicode_ci COMMENT '课程描述',
  `credit` float DEFAULT NULL COMMENT '学分',
  `clong` int(10) DEFAULT NULL COMMENT '课时',
  `cadd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地点',
  `weekday` char(4) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上课星期',
  `ctime` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上课时间',
  `tno` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cimg` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cno`),
  KEY `majorInfo` (`majorInfo`),
  KEY `tno` (`tno`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`majorInfo`) REFERENCES `major` (`majorNum`),
  CONSTRAINT `course_ibfk_2` FOREIGN KEY (`tno`) REFERENCES `teacher` (`tno`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `course` */

insert  into `course`(`cno`,`cname`,`majorInfo`,`cInfo`,`credit`,`clong`,`cadd`,`weekday`,`ctime`,`tno`,`cimg`) values (1,'高等数学',NULL,'高等数学',5,17,'10-231','周一','1-3','T001',NULL),(2,'C语言','WC','C语言是一门通用计算机编程语言，应用广泛。C语言的设计目标是提供一种能以简易的方式编译、处理低级存储器、产生少量的机器码以及不需要任何运行环境支持便能运行的编程语言。\r\n尽管C语言提供了许多低级处理的功能，但仍然保持着良好跨平台的特性，以一个标准规格写出的C语言程序可在许多电脑平台上进行编译，甚至包含一些嵌入式处理器（单片机或称MCU）以及超级电脑等作业平台。\r\n二十世纪八十年代，为了避免各开发厂商用的C语言语法产生差异，由美国国家标准局为C语言订定了一套完整的国际标准语法，称为ANSI C，作为C语言最初的标准',4,16,'10-112','周二','4-5','T001',NULL),(3,'Java程序设计','L','这里是课程介绍',3,16,'2N-123','周三','6-7','T001',NULL),(4,'数字图像处理','JG','这里是课程介绍',2,16,'2S-333','周四','3-5','T002',NULL),(5,'毛概','XXJK','这里是课程介绍',3,16,'2N-422','周五','10-12','T001',NULL),(6,'思修','WC','这里是课程介绍',2,16,'2N-230','周三','8-9','T001',NULL),(7,'羽毛球','WC','这里是课程介绍',2,16,'体育馆','周二','1-2','T001',NULL),(8,'排球','WC','这里是课程介绍',2,12,'体育馆','周一','3-4','T004',NULL),(9,'游泳','SK','这里是课程介绍',2,12,'游泳馆','周二','6-7','T001',NULL),(10,'高等数学','SK','这里是课程介绍',1,24,'3-434','周一','7-8','T002',NULL),(14,'公开课','SK','这里是课程介绍',3,16,'10-231','周三','3-5','T005',NULL),(15,'C++','XXJK','编程语言',3,18,'3-211','周四','6-7','T001',NULL),(16,'马克思','XXDZ','马克思',3,16,'2-211','周三','3-5','T001',NULL),(17,'数据库设计',NULL,'数据库设计',3,16,'10-308','周二','3-5','T001',NULL);

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `majorNum` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `majorName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `majorTeh` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dept` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `deptTeh` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`majorNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `major` */

insert  into `major`(`majorNum`,`majorName`,`majorTeh`,`dept`,`deptTeh`) values ('CF','材料与纺织学院','系主任','材料','辅导员'),('FS','服装设计学院','系主任','服装设计','辅导员'),('JG','经济管理学院','系主任','经济管理','辅导员'),('L','理学院','系主任','数学','辅导员'),('SK','生命科学学院','系主任','化学','辅导员'),('WC','文化传播学院','系主任','文化','辅导员'),('XXDZ','信息学院','系主任','电子信息','辅导员'),('XXJK','信息学院','系主任','计算机科学','辅导员'),('XXSM','信息学院','系主任','数字媒体','辅导员');

/*Table structure for table `selectcourse` */

DROP TABLE IF EXISTS `selectcourse`;

CREATE TABLE `selectcourse` (
  `scNum` int(11) NOT NULL AUTO_INCREMENT,
  `cno` int(11) DEFAULT NULL,
  `sno` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score` float DEFAULT NULL,
  `isHave` int(11) DEFAULT NULL,
  PRIMARY KEY (`scNum`),
  KEY `sno` (`sno`),
  KEY `cno` (`cno`),
  CONSTRAINT `selectcourse_ibfk_1` FOREIGN KEY (`sno`) REFERENCES `student` (`sno`),
  CONSTRAINT `selectcourse_ibfk_2` FOREIGN KEY (`cno`) REFERENCES `course` (`cno`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `selectcourse` */

insert  into `selectcourse`(`scNum`,`cno`,`sno`,`score`,`isHave`) values (2,6,'2014329700001',90,1),(5,4,'2014329700001',67,1),(63,6,'2014329700009',88,NULL),(64,1,'2014329700002',80,NULL),(65,9,'2014329700002',90,NULL),(66,4,'2014329700002',67,NULL),(67,6,'2014329700002',66,NULL),(85,5,'2014329700002',89,NULL),(86,7,'2014329700002',20,NULL),(105,5,'2014329700003',70,NULL),(107,7,'2014329700003',80,NULL),(110,15,'2014329700003',80,NULL),(111,14,'2014329700003',NULL,NULL),(112,5,'2014329700003',70,NULL),(113,2,'2014329700003',80,NULL),(114,2,'2014329700003',NULL,NULL);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `ssex` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spsd` varchar(20) COLLATE utf8_unicode_ci DEFAULT '000000',
  `majorNum` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sgrade` int(10) DEFAULT NULL,
  PRIMARY KEY (`sno`),
  KEY `majorNum` (`majorNum`),
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`majorNum`) REFERENCES `major` (`majorNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `student` */

insert  into `student`(`sno`,`ssex`,`sname`,`spsd`,`majorNum`,`sgrade`) values ('1015','男','学生一','000000','JG',2014),('2013789900004','女','学生十','000000','XXJK',2013),('2014329700001','女','学生一','000000','L',2014),('2014329700002','女','学生二','000000','XXDZ',2014),('2014329700003','女','黄燚','123456','XXSM',2014),('2014329700009','男','学生九','000000','WC',2014),('201432970100','男','测试学生','000000',NULL,2014);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tsex` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tage` int(4) DEFAULT NULL,
  `tpsd` varchar(20) COLLATE utf8_unicode_ci DEFAULT '000000',
  `tInfo` text COLLATE utf8_unicode_ci COMMENT '简介',
  `timg` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `majorInfo` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pro` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '职称',
  PRIMARY KEY (`tno`),
  KEY `teacher_ibfk_1` (`majorInfo`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`majorInfo`) REFERENCES `major` (`majorNum`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `teacher` */

insert  into `teacher`(`tno`,`tname`,`tsex`,`tage`,`tpsd`,`tInfo`,`timg`,`majorInfo`,`pro`) values ('T001','T1','男',33,'123456','有丰富的教学经验','',NULL,'教授'),('T002','T2','女',30,'000000','有丰富的教学经验',NULL,'JG','讲师'),('T003','T3','男',28,'000000','有丰富的教学经验',NULL,NULL,'副教授'),('T004','T4','女',36,'000000','有丰富的教学经验',NULL,'XXDZ','教授'),('T005','T5','男',42,'000000','有丰富的教学经验',NULL,'XXJK','教授'),('T006','T6','男',45,'000000','有丰富的教学经验',NULL,NULL,'教授');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
