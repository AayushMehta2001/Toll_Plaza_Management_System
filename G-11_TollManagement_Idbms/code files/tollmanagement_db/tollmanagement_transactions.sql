CREATE DATABASE  IF NOT EXISTS `tollmanagement` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tollmanagement`;
-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: localhost    Database: tollmanagement
-- ------------------------------------------------------
-- Server version	8.0.20-0ubuntu0.19.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `tranid` int NOT NULL AUTO_INCREMENT,
  `vehicle_no` varchar(15) DEFAULT NULL,
  `boothid` int DEFAULT NULL,
  `journeytype` varchar(50) DEFAULT NULL,
  `fareid` int DEFAULT NULL,
  `visitdate` date DEFAULT NULL,
  PRIMARY KEY (`tranid`),
  KEY `vehicle_no` (`vehicle_no`),
  KEY `jt` (`journeytype`),
  KEY `boothid` (`boothid`),
  KEY `fareid` (`fareid`),
  CONSTRAINT `jt` FOREIGN KEY (`journeytype`) REFERENCES `fare` (`journeytype`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`vehicle_no`) REFERENCES `details` (`vehicle_no`),
  CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`boothid`) REFERENCES `booth` (`boothid`),
  CONSTRAINT `transactions_ibfk_3` FOREIGN KEY (`fareid`) REFERENCES `fare` (`fareid`)
) ENGINE=InnoDB AUTO_INCREMENT=10025 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (10000,'RJ14 GR 1206',100,'Single',100,'2020-11-01'),(10001,'RJ14 GR 1206',105,'Single',100,'2020-11-03'),(10002,'RJ14 RQ 7819',102,'Single',104,'2020-11-05'),(10003,'DL90 TI 6629',100,'Return',111,'2020-10-07'),(10004,'DL59 BZ 9221',103,'Return',107,'2020-11-08'),(10005,'DL86 AE 5801',104,'Return',103,'2020-11-10'),(10006,'DL22 AU 2662',100,'Single',100,'2020-11-12'),(10007,'RJ41 JR 6910',102,'Return',111,'2020-09-14'),(10008,'RJ05 SC 5673',101,'Single',106,'2020-09-16'),(10009,'RJ56 LA 2075',103,'Single',104,'2020-10-18'),(10010,'MH16 YB 6683',104,'Single',102,'2020-11-20'),(10011,'MH04 ZF 4311',101,'Single',104,'2020-11-22'),(10012,'MH04 ZF 4311',104,'Return',105,'2020-11-24'),(10013,'MH26 BI 3702',102,'Single',108,'2020-10-26'),(10014,'RJ01 KK 7367',105,'Single',102,'2020-10-28'),(10015,'MH16 YB 0001',104,'Single',102,'2020-11-01'),(10016,'MH04 ZF 4311',101,'Single',104,'2020-11-03'),(10017,'MH04 ZF 4311',104,'Return',105,'2020-11-05'),(10018,'MH26 BI 3702',102,'Single',108,'2020-10-05'),(10019,'RJ01 KK 7367',105,'Single',102,'2020-10-05'),(10023,'UP80 PA 1234',102,'Single',108,'2020-11-05'),(10024,'UP80 PA 1234',104,'Single',108,'2020-11-06');
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-20 11:37:08
