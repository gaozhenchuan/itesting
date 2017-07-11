CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* Procedure structure for procedure `init_sequence` */

DROP PROCEDURE IF EXISTS `init_Sequence`;

DELIMITER $$

CREATE DEFINER=`root`@`%` PROCEDURE `init_Sequence`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `Sequence`; 
CREATE TABLE `Sequence` (
    `name` VARCHAR(50) NOT NULL,
    `current_value` bigint(10) NOT NULL,
    `increment` INT NOT NULL DEFAULT 1,
    PRIMARY KEY (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*所有的表数据插入*/
/*Data for the table `Sequence` */
insert  into `Sequence`(`name`,`current_value`) values ('Sys_User', 1);
insert  into `Sequence`(`name`,`current_value`) values ('Sys_Role', 1);
insert  into `Sequence`(`name`,`current_value`) values ('Sys_UserRole', 1);
insert  into `Sequence`(`name`,`current_value`) values ('Sys_Group', 1);
insert  into `Sequence`(`name`,`current_value`) values ('Sys_UserInfo', 1);
insert  into `Sequence`(`name`,`current_value`) values ('Sys_UserGroup', 1);

END 
$$ DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
