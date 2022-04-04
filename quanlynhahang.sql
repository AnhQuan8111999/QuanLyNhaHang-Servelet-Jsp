-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: qlnh
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;monan
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `combo`
--

DROP TABLE IF EXISTS `combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combo` (
  `id` int NOT NULL,
  `id_nhahang` int NOT NULL,
  `id_quanlycombo` int NOT NULL,
  `ten` varchar(45) NOT NULL,
  `loai` int NOT NULL,
  `gia` float NOT NULL,
  `mota` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_nhahang_idx` (`id_nhahang`),
  KEY `id_quanlycombo_idx` (`id_quanlycombo`),
  CONSTRAINT `id_nhahang` FOREIGN KEY (`id_nhahang`) REFERENCES `nhahang` (`id`),
  CONSTRAINT `id_quanlycombo` FOREIGN KEY (`id_quanlycombo`) REFERENCES `quanlycombo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combo`
--

LOCK TABLES `combo` WRITE;
/*!40000 ALTER TABLE `combo` DISABLE KEYS */;
INSERT INTO `combo` VALUES (1,1,1,'comboxyz',2,99000,'combo danh cho 4 nguoi');
/*!40000 ALTER TABLE `combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combomonan`
--

DROP TABLE IF EXISTS `combomonan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combomonan` (
  `id` int NOT NULL,
  `id_combo` int NOT NULL,
  `id_monan` int NOT NULL,
  `kieuphucvu` int NOT NULL,
  `trangthai` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_combo_idx` (`id_combo`),
  KEY `id_monan_idx` (`id_monan`),
  CONSTRAINT `id_combo` FOREIGN KEY (`id_combo`) REFERENCES `combo` (`id`),
  CONSTRAINT `id_monan` FOREIGN KEY (`id_monan`) REFERENCES `monan` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combomonan`
--

LOCK TABLES `combomonan` WRITE;
/*!40000 ALTER TABLE `combomonan` DISABLE KEYS */;
INSERT INTO `combomonan` VALUES (1,1,1,1,1),(2,1,2,1,1),(3,1,4,2,1),(4,1,6,2,1);
/*!40000 ALTER TABLE `combomonan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hovaten`
--

DROP TABLE IF EXISTS `hovaten`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hovaten` (
  `id` int NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `midname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hovaten`
--

LOCK TABLES `hovaten` WRITE;
/*!40000 ALTER TABLE `hovaten` DISABLE KEYS */;
INSERT INTO `hovaten` VALUES (1,'trinh','ngoc','anh'),(2,'nguyen','van','cuong');
/*!40000 ALTER TABLE `hovaten` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lienhe`
--

DROP TABLE IF EXISTS `lienhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lienhe` (
  `id` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `sdt` varchar(45) NOT NULL,
  `diachi` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lienhe`
--

LOCK TABLES `lienhe` WRITE;
/*!40000 ALTER TABLE `lienhe` DISABLE KEYS */;
INSERT INTO `lienhe` VALUES (1,'anh123@gmail.com','9376233xxx','Cau Giay Ha Noi'),(2,'cuongcntt@gmail.com','0373733xxx','Ha Dong Ha Noi');
/*!40000 ALTER TABLE `lienhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monan`
--

DROP TABLE IF EXISTS `monan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monan` (
  `id` int NOT NULL,
  `id_nhahang` int NOT NULL,
  `ten` varchar(45) NOT NULL,
  `loai` int NOT NULL,
  `gia` float NOT NULL,
  `mota` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_nhahang1_idx` (`id_nhahang`),
  CONSTRAINT `id_nhahang1` FOREIGN KEY (`id_nhahang`) REFERENCES `nhahang` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monan`
--

LOCK TABLES `monan` WRITE;
/*!40000 ALTER TABLE `monan` DISABLE KEYS */;
INSERT INTO `monan` VALUES (1,1,'Khoai tay chien',7,20000,'mon phu'),(2,1,'Xuc xich',7,10000,'mon phu'),(3,1,'Thit kho to',6,50000,'mon kho'),(4,1,'Canh chua ca loc',3,50000,'mon canh'),(5,1,'Bo la lot',1,30000,'mon nuong'),(6,1,'Thit ngan xao lan',2,50000,'mon xao'),(7,1,'Banh bao hap',4,15000,'mon hap');
/*!40000 ALTER TABLE `monan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhahang`
--

DROP TABLE IF EXISTS `nhahang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhahang` (
  `id` int NOT NULL,
  `ten` varchar(45) NOT NULL,
  `diachi` varchar(45) NOT NULL,
  `hotline` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhahang`
--

LOCK TABLES `nhahang` WRITE;
/*!40000 ALTER TABLE `nhahang` DISABLE KEYS */;
INSERT INTO `nhahang` VALUES (1,'Nha hang 5 sao','Mai Dich Cau Giay Ha Noi','0373777xxx');
/*!40000 ALTER TABLE `nhahang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quanlycombo`
--

DROP TABLE IF EXISTS `quanlycombo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quanlycombo` (
  `id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id_hovaten` int NOT NULL,
  `sex` varchar(45) NOT NULL,
  `dateofbirth` date NOT NULL,
  `id_lienhe` int NOT NULL,
  `ghichu` varchar(45) DEFAULT NULL,
  `vaitro` int DEFAULT NULL,
  `loaiquanly` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_hovaten_idx` (`id_hovaten`),
  KEY `id_lienhe_idx` (`id_lienhe`),
  CONSTRAINT `id_hovaten` FOREIGN KEY (`id_hovaten`) REFERENCES `hovaten` (`id`),
  CONSTRAINT `id_lienhe` FOREIGN KEY (`id_lienhe`) REFERENCES `lienhe` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quanlycombo`
--

LOCK TABLES `quanlycombo` WRITE;
/*!40000 ALTER TABLE `quanlycombo` DISABLE KEYS */;
INSERT INTO `quanlycombo` VALUES (1,'anhcntt','123',1,'nu','1998-10-07',1,'nhan vien quan ly combo',2,2),(2,'cuongcntt','123',2,'nam','1998-03-05',2,'nhan vien quan ly',1,NULL);
/*!40000 ALTER TABLE `quanlycombo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-26 22:11:39
