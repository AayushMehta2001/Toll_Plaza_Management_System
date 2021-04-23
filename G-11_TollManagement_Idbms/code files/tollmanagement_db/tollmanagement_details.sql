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
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `details` (
  `vehicle_no` varchar(15) NOT NULL,
  `vehicletype` varchar(50) DEFAULT NULL,
  `owner` varchar(30) DEFAULT NULL,
  `aadhaar` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`vehicle_no`),
  KEY `vt` (`vehicletype`),
  CONSTRAINT `vt` FOREIGN KEY (`vehicletype`) REFERENCES `fare` (`vehicletype`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details`
--

LOCK TABLES `details` WRITE;
/*!40000 ALTER TABLE `details` DISABLE KEYS */;
INSERT INTO `details` VALUES ('DL22 AU 2662','3 Wheeler','Sanskar','0006 XXXX 3564'),('DL59 BZ 9221','Bus','Umang','0004 XXXX 1346'),('DL86 AE 5801','Car/Jeep','Kartik','0005 XXXX 9874'),('DL90 TI 6629','MAV','Aashita','0003 XXXX 4523'),('MH04 ZF 4311','LCV','Dastagiri','0011 XXXX 4542'),('MH16 YB 0001','Car/Jeep','Ansh','0014 XXXX 2348'),('MH16 YB 6683','Car/Jeep','Shivam','0010 XXXX 4587'),('MH26 BI 3702','Truck','Anant','0012 XXXX 0973'),('RJ01 KK 7367','Car/Jeep','Chaitanya','0013 XXXX 9827'),('RJ05 SC 5673','Bus','Rohit','0008 XXXX 9873'),('RJ14 GR 1206','3 Wheeler','Aayush','0001 XXXX 1234'),('RJ14 RQ 7819','LCV','Pranjal','0002 XXXX 8762'),('RJ41 JR 6910','MAV','Bhumur','0007 XXXX 4374'),('RJ56 LA 2075','LCV','Satyam','0009 XXXX 4543'),('UP80 PA 1234','Truck','Devu','1001 XXXX 3682');
/*!40000 ALTER TABLE `details` ENABLE KEYS */;
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
