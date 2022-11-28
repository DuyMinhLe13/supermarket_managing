-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: supermarket
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admintbl`
--

DROP TABLE IF EXISTS `admintbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admintbl` (
  `Id` int NOT NULL,
  `AdminName` varchar(10) NOT NULL,
  `AdminPass` varchar(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admintbl`
--

LOCK TABLES `admintbl` WRITE;
/*!40000 ALTER TABLE `admintbl` DISABLE KEYS */;
INSERT INTO `admintbl` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `admintbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorytbl`
--

DROP TABLE IF EXISTS `categorytbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorytbl` (
  `name` varchar(20) NOT NULL,
  `description` varchar(30) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorytbl`
--

LOCK TABLES `categorytbl` WRITE;
/*!40000 ALTER TABLE `categorytbl` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `categorytbl` VALUES ('beverage','All drinks'),('cleaning','for hygiene'),('fashion','clothes, hat,...'),('game','game in play station'),('meat','excelent meat'),('vegetable','not meat');
=======
INSERT INTO `categorytbl` VALUES ('beverage','All drinks'),('clean','for hygiene'),('fashion','clothes, hat,...'),('game','game in play station'),('meat','excelent meat'),('vegetable','not meat');
>>>>>>> 1bd4629 (first commit)
/*!40000 ALTER TABLE `categorytbl` ENABLE KEYS */;
UNLOCK TABLES;

--
<<<<<<< HEAD
=======
-- Table structure for table `import_bill`
--

DROP TABLE IF EXISTS `import_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `import_bill` (
  `bill_id` int NOT NULL,
  `sk_acc` varchar(20) NOT NULL,
  `prod_name` varchar(20) NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`bill_id`,`sk_acc`,`prod_name`),
  KEY `sk_acc` (`sk_acc`),
  KEY `prod_name` (`prod_name`),
  CONSTRAINT `import_bill_ibfk_1` FOREIGN KEY (`sk_acc`) REFERENCES `storekeepertbl` (`account`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `import_bill_ibfk_2` FOREIGN KEY (`prod_name`) REFERENCES `producttbl` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `import_bill`
--

LOCK TABLES `import_bill` WRITE;
/*!40000 ALTER TABLE `import_bill` DISABLE KEYS */;
INSERT INTO `import_bill` VALUES (0,'thao','diamond',5),(0,'thao','gucci bag',3),(0,'thao','louiv bag',5),(1,'nguyen','carrot',30),(1,'nguyen','omo',15),(1,'nguyen','onion',20);
/*!40000 ALTER TABLE `import_bill` ENABLE KEYS */;
UNLOCK TABLES;

--
>>>>>>> 1bd4629 (first commit)
-- Table structure for table `producttbl`
--

DROP TABLE IF EXISTS `producttbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producttbl` (
  `name` varchar(20) NOT NULL,
  `quantity` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`name`),
  KEY `category` (`category`),
  CONSTRAINT `producttbl_ibfk_1` FOREIGN KEY (`category`) REFERENCES `categorytbl` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttbl`
--

LOCK TABLES `producttbl` WRITE;
/*!40000 ALTER TABLE `producttbl` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `producttbl` VALUES ('ariel',139790,20,'cleaning'),('carrot',43800,10,'vegetable'),('diamond',95,9696,'fashion'),('god of war 5',93399,90,'game'),('gucci bag',798,5000,'fashion'),('kobe beef',498,5999,'meat'),('lol',20,100,'game'),('omo',140800,30,'cleaning'),('onion',490000,5,'vegetable'),('resident evil 8',119599,80,'game'),('wagyu beef',1398,8000,'meat');
=======
INSERT INTO `producttbl` VALUES ('ariel',139790,20,'clean'),('carrot',43830,10,'vegetable'),('diamond',100,9696,'fashion'),('god of war 5',93399,90,'game'),('gucci bag',787,5000,'fashion'),('kobe beef',496,5999,'meat'),('kotex',0,30,'clean'),('louiv bag',34,5000,'fashion'),('omo',140813,30,'clean'),('onion',490020,5,'vegetable'),('resident evil 8',119599,80,'game'),('wagyu beef',1395,8000,'meat');
>>>>>>> 1bd4629 (first commit)
/*!40000 ALTER TABLE `producttbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seller_bill`
--

DROP TABLE IF EXISTS `seller_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seller_bill` (
  `bill_id` int NOT NULL,
  `seller_acc` varchar(20) NOT NULL,
  `prod_name` varchar(20) NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`bill_id`,`seller_acc`,`prod_name`),
  KEY `seller_acc` (`seller_acc`),
  KEY `prod_name` (`prod_name`),
  CONSTRAINT `seller_bill_ibfk_1` FOREIGN KEY (`seller_acc`) REFERENCES `sellertbl` (`account`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `seller_bill_ibfk_2` FOREIGN KEY (`prod_name`) REFERENCES `producttbl` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seller_bill`
--

LOCK TABLES `seller_bill` WRITE;
/*!40000 ALTER TABLE `seller_bill` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `seller_bill` VALUES (0,'thuy','gucci bag',2),(1,'khang','god of war 5',1),(1,'khang','resident evil 8',1),(2,'long','kobe beef',2),(2,'long','wagyu beef',2),(3,'long','ariel',10),(3,'long','diamond',5);
=======
INSERT INTO `seller_bill` VALUES (0,'thuy','gucci bag',2),(1,'khang','god of war 5',1),(1,'khang','resident evil 8',1),(2,'long','kobe beef',2),(2,'long','wagyu beef',2),(3,'long','ariel',10),(3,'long','diamond',5),(4,'khang','gucci bag',2),(4,'khang','kobe beef',2),(4,'khang','omo',2),(5,'long','wagyu beef',3),(6,'long','gucci bag',12);
>>>>>>> 1bd4629 (first commit)
/*!40000 ALTER TABLE `seller_bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellertbl`
--

DROP TABLE IF EXISTS `sellertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellertbl` (
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellertbl`
--

LOCK TABLES `sellertbl` WRITE;
/*!40000 ALTER TABLE `sellertbl` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `sellertbl` VALUES ('dung','dung69','Female'),('khang','2222','Male'),('long','long123','Male'),('thuy','ilove69','Female'),('trung','54321','Male'),('Vinh','vinhtt','Male');
/*!40000 ALTER TABLE `sellertbl` ENABLE KEYS */;
UNLOCK TABLES;
=======
INSERT INTO `sellertbl` VALUES ('dung','dung96','Female'),('khang','2222','Male'),('long','long123','Male'),('thuy','ilove69','Female'),('trung','12345','Male'),('Vinh','vinhtt','Male');
/*!40000 ALTER TABLE `sellertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storekeepertbl`
--

DROP TABLE IF EXISTS `storekeepertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `storekeepertbl` (
  `account` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storekeepertbl`
--

LOCK TABLES `storekeepertbl` WRITE;
/*!40000 ALTER TABLE `storekeepertbl` DISABLE KEYS */;
INSERT INTO `storekeepertbl` VALUES ('anh','anhyeu','Female'),('nguyen','456nguyen','Female'),('thang','thao','Male'),('thao','thao123','Female');
/*!40000 ALTER TABLE `storekeepertbl` ENABLE KEYS */;
UNLOCK TABLES;
>>>>>>> 1bd4629 (first commit)
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

<<<<<<< HEAD
-- Dump completed on 2022-11-13 16:26:46
=======
-- Dump completed on 2022-11-28 15:22:07
>>>>>>> 1bd4629 (first commit)
