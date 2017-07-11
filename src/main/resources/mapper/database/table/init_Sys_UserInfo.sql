CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* Procedure structure for procedure `init_Sys_UserInfo` */

DROP PROCEDURE IF EXISTS `init_Sys_UserInfo`;

DELIMITER $$

CREATE DEFINER=`root`@`%` PROCEDURE `init_Sys_UserInfo`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `Sys_UserInfo`;
CREATE TABLE `Sys_UserInfo` (
    `id` bigint(10) NOT NULL COMMENT '编号',
    `userId` varchar(30) NOT NULL COMMENT '用户编号',
    `userName` varchar(30) NOT NULL COMMENT '用户姓名',
    `userCard` varchar(30) NOT NULL COMMENT '身份证号码',
    `userBirth` varchar(30) NOT NULL COMMENT '出生日期',
    `userHistory` varchar(30) NOT NULL COMMENT '学历',
    `userSex` varchar(30) NOT NULL COMMENT '性别',
    `userNation` varchar(30) NOT NULL COMMENT '民族',
    `userBirthplace` varchar(30) NOT NULL COMMENT '籍贯',
    `userMarried` varchar(30) NOT NULL COMMENT '婚姻状况',
    `userStandBy` varchar(30) NOT NULL COMMENT '户籍所在地',
    `userAddress` varchar(30) NOT NULL COMMENT '通讯地址',
    `userEmail` varchar(30) NOT NULL COMMENT '邮政编码',
    `userPhone` varchar(30) NOT NULL COMMENT '固定电话',
    `userMobie` varchar(30) NOT NULL COMMENT '手机号码',
    `userEmail` varchar(30) NOT NULL COMMENT '电子邮箱',
    `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态区分',
    `description` varchar(50) NOT NULL COMMENT '描述',
    `createTime` DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
    `createUser` varchar(30) NOT NULL COMMENT '创建者',
    `updateTime` DATETIME NOT NULL DEFAULT now() COMMENT '更新时间',
    `updateUser` varchar(30) NOT NULL COMMENT '更新者',
     PRIMARY KEY (`id`,`userId`)
     KEY FK_UserInfo_userId(`userId`),
     constraint FK_UserInfo_userId FOREIGN KEY (`userId`) REFERENCES Sys_User (`userId`) 
     ON DELETE restrict ON UPDATE restrict
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*所有的表数据插入*/
/*Data for the table `Sys_UserInfo` */
insert  into `Sys_UserInfo`(`id`,`url`,`name`) values ();

END 
$$ DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
