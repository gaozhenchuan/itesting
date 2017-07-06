CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* Procedure structure for procedure `init_sequence` */

DROP PROCEDURE IF EXISTS `init_sequence`;

DELIMITER $$

CREATE DEFINER=`root`@`%` PROCEDURE `init_sequence`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS sequence; 
CREATE TABLE sequence (
    name VARCHAR(50) NOT NULL,
    current_value INT NOT NULL,
    increment INT NOT NULL DEFAULT 1,
    PRIMARY KEY (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*所有的表数据插入*/
/*Data for the table `sequence` */
insert  into `sequence`(`name`,`current_value`) values ('Sys_User', 1);

END 
$$ DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
