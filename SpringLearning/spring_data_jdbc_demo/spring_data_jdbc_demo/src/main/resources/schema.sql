DROP schema IF EXISTS `sampledb`;

CREATE schema IF NOT EXISTS `sampledb`;

use `sampledb`;

DROP TABLE  IF EXISTS `USER`;

CREATE TABLE `USER` (
        `ID` int(11) NOT NULL AUTO_INCREMENT,
        `USER_NAME` VARCHAR(45) NOT NULL,
        `PASSWORD` VARCHAR(45) NOT NULL,
        `EMAIL` VARCHAR(100) DEFAULT NULL,
        `CREATED_TIME` datetime NOT NULL,
        `DOB` DATE NOT NULL,
         PRIMARY KEY (`ID`),
         UNIQUE KEY `USER_NAME_UNIQUE` (`USER_NAME`)
);



INSERT INTO `USER` VALUES
(1, 'ALTAF123', '12345', 'ALTAF123@gmail.com', '2021-06-30 13:04:30', '1994-11-18'),
(2, 'shan123', '5', 'shan123@gmail.com', '2021-06-30 13:04:30', '1994-11-18'),
(3, 'naj123', '12345', 'naj123@gmail.com', '2021-06-30 13:04:30', '1994-11-18');