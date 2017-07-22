CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* Procedure structure for procedure `init_Sys_Role` */

DROP PROCEDURE IF EXISTS `init_Sys_Role`;

DELIMITER $$

CREATE DEFINER=`root`@`%` PROCEDURE `init_Sys_Role`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `Sys_Role`;
CREATE TABLE `Sys_Role` (
    `id` bigint(10) NOT NULL COMMENT '编号',
    `roleId` varchar(30) NOT NULL COMMENT '角色编号',
    `roleName` varchar(30) NOT NULL COMMENT '角色名称',
    `roleParentId` varchar(30) NOT NULL COMMENT '父角色编号',
    `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态区分',
    `description` varchar(50) NOT NULL COMMENT '描述',
    `createTime` DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
    `createUser` varchar(30) NOT NULL COMMENT '创建者',
    `updateTime` DATETIME NOT NULL DEFAULT now() COMMENT '更新时间',
    `updateUser` varchar(30) NOT NULL COMMENT '更新者',
     PRIMARY KEY (`id`,`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*所有的表数据插入*/
/*Data for the table `Sys_Role` */
insert  into `Sys_Role`(`id`,`url`,`name`) values ();

END 
$$ DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
