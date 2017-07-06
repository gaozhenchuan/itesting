CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* Procedure structure for procedure `init_Sys_User` */

DROP PROCEDURE IF EXISTS `init_Sys_User`;

DELIMITER $$

CREATE DEFINER=`root`@`%` PROCEDURE `init_Sys_User`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `Sys_User`;
CREATE TABLE `Sys_User` (
    `id` bigint(10) NOT NULL AUTO_INCREMENT,
    `url` varchar(256) DEFAULT NULL COMMENT 'url地址',
    `name` varchar(64) DEFAULT NULL COMMENT 'url描述',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*所有的表数据插入*/
/*Data for the table `Sys_User` */
insert  into `Sys_User`(`id`,`url`,`name`) values (4,'/permission/index.shtml','权限列表'),(6,'/permission/addPermission.shtml','权限添加'),(7,'/permission/deletePermissionById.shtml','权限删除'),(8,'/member/list.shtml','用户列表'),(9,'/member/online.shtml','在线用户'),(10,'/member/changeSessionStatus.shtml','用户Session踢出'),(11,'/member/forbidUserById.shtml','用户激活&禁止'),(12,'/member/deleteUserById.shtml','用户删除'),(13,'/permission/addPermission2Role.shtml','权限分配'),(14,'/role/clearRoleByUserIds.shtml','用户角色分配清空'),(15,'/role/addRole2User.shtml','角色分配保存'),(16,'/role/deleteRoleById.shtml','角色列表删除'),(17,'/role/addRole.shtml','角色列表添加'),(18,'/role/index.shtml','角色列表'),(19,'/permission/allocation.shtml','权限分配'),(20,'/role/allocation.shtml','角色分配');

END 
$$ DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
