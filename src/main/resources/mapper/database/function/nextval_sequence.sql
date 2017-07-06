CREATE DATABASE IF NOT EXISTS `utest` DEFAULT CHARACTER SET utf8;

/* FUNCTION structure for FUNCTION `nextval` */

DROP FUNCTION IF EXISTS nextval; 

DELIMITER $$

CREATE DEFINER=root@localhost FUNCTION nextval (seq_name VARCHAR(50)) 
    RETURNS INTEGER
    LANGUAGE SQL 
    DETERMINISTIC 
    CONTAINS SQL 
    SQL SECURITY DEFINER 
    COMMENT ''
BEGIN
    UPDATE sequence
        SET current_value = current_value + increment 
        WHERE name = seq_name; 
    RETURN currval(seq_name); 
END
$$ DELIMITER ;

SET SQL_MODE=NO_ENGINE_SUBSTITUTION;
SET FOREIGN_KEY_CHECKS=0;
