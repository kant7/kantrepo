CREATE DATABASE  IF NOT EXISTS `toby` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `toby`;

DROP TABLE IF EXISTS `tab_mybatis`;

CREATE TABLE `tab_mybatis` (
  `NAME` varchar(100) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PHONE` varchar(100) NOT NULL,
  PRIMARY KEY (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

GRANT ALL PRIVILEGES ON *.* TO java@localhost IDENTIFIED BY 'java' with grant option;

INSERT INTO `tab_mybatis` VALUES ('hoon', 'dokkl@naver.com', '010-6788-9629');