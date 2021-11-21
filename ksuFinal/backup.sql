-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: expenses
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `AUTHOR_NUM` decimal(2,0) NOT NULL,
  `AUTHOR_LAST` char(12) DEFAULT NULL,
  `AUTHOR_FIRST` char(10) DEFAULT NULL,
  PRIMARY KEY (`AUTHOR_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Morrison','Toni'),(2,'Solotaroff','Paul'),(3,'Vintage','Vernor'),(4,'Francis','Dick'),(5,'Straub','Peter'),(6,'King','Stephen'),(7,'Pratt','Philip'),(8,'Chase','Truddi'),(9,'Collins','Bradley'),(10,'Heller','Joseph'),(11,'Wills','Gary'),(12,'Hofstadter','Douglas R.'),(13,'Lee','Harper'),(14,'Ambrose','Stephen E.'),(15,'Rowling','J.K.'),(16,'Salinger','J.D.'),(17,'Heaney','Seamus'),(18,'Camus','Albert'),(19,'Collins, Jr.','Bradley'),(20,'Steinbeck','John'),(21,'Castelman','Riva'),(22,'Owen','Barbara'),(23,'O\'Rourke','Randy'),(24,'Kidder','Tracy'),(25,'Schleining','Lon');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `BOOK_CODE` char(4) NOT NULL,
  `TITLE` char(40) DEFAULT NULL,
  `PUBLISHER_CODE` char(3) DEFAULT NULL,
  `TYPE` char(3) DEFAULT NULL,
  `PRICE` decimal(4,2) DEFAULT NULL,
  `PAPERBACK` char(1) DEFAULT NULL,
  PRIMARY KEY (`BOOK_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('0180','A Deepness in the Sky','TB','SFI',7.19,'Y'),('0189','Magic Terror','FA','HOR',7.99,'Y'),('0200','The Stranger','VB','FIC',8.00,'Y'),('0378','Venice','SS','ART',24.50,'N'),('079X','Second Wind','PU','MYS',24.95,'N'),('0808','The Edge','JP','MYS',6.99,'Y'),('1351','Dreamcatcher: A Novel','SC','HOR',19.60,'N'),('1382','Treasure Chests','TA','ART',24.46,'N'),('138X','Beloved','PL','FIC',12.95,'Y'),('2226','Harry Potter and the Prisoner of Azkaban','ST','SFI',13.96,'N'),('2281','Van Gogh and Gauguin','WP','ART',21.00,'N'),('2766','Of Mice and Men','PE','FIC',6.95,'Y'),('2908','Electric Light','FS','POE',14.00,'N'),('3350','Group: Six People in Search of a Life','BP','PSY',10.40,'Y'),('3743','Nine Stories','LB','FIC',5.99,'Y'),('3906','The Soul of a New Machine','BY','SCI',11.16,'Y'),('5163','Travels with Charley','PE','TRA',7.95,'Y'),('5790','Catch-22','SC','FIC',12.00,'Y'),('6128','Jazz','PL','FIC',12.95,'Y'),('6328','Band of Brothers','TO','HIS',9.60,'Y'),('669X','A Guide to SQL','CT','CMP',37.95,'Y'),('6908','Franny and Zooey','LB','FIC',5.99,'Y'),('7405','East of Eden','PE','FIC',12.95,'Y'),('7443','Harry Potter and the Goblet of Fire','ST','SFI',18.16,'N'),('7559','The Fall','VB','FIC',8.00,'Y'),('8092','Godel, Escher, Bach','BA','PHI',14.00,'Y'),('8720','When Rabbit Howls','JP','PSY',6.29,'Y'),('9611','Black House','RH','HOR',18.81,'N'),('9627','Song of Solomon','PL','FIC',14.00,'Y'),('9701','The Grapes of Wrath','PE','FIC',13.00,'Y'),('9882','Slay Ride','JP','MYS',6.99,'Y'),('9883','The Catcher in the Rye','LB','FIC',5.99,'Y'),('9931','To Kill a Mockingbird','HC','FIC',18.00,'N');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch` (
  `BRANCH_NUM` decimal(2,0) NOT NULL,
  `BRANCH_NAME` char(50) DEFAULT NULL,
  `BRANCH_LOCATION` char(50) DEFAULT NULL,
  `NUM_EMPLOYEES` decimal(2,0) DEFAULT NULL,
  PRIMARY KEY (`BRANCH_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (1,'Henry Downtown','16 Riverview',10),(2,'Henry On The Hill','1289 Bedford',6),(3,'Henry Brentwood','Brentwood Mall',15),(4,'Henry Eastshore','Eastshore Mall',9);
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branchtable`
--

DROP TABLE IF EXISTS `branchtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branchtable` (
  `branchID` int NOT NULL AUTO_INCREMENT,
  `branchName` varchar(45) DEFAULT NULL,
  UNIQUE KEY `branchID_UNIQUE` (`branchID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branchtable`
--

LOCK TABLES `branchtable` WRITE;
/*!40000 ALTER TABLE `branchtable` DISABLE KEYS */;
INSERT INTO `branchtable` VALUES (1,'Juna'),(2,'Marfori'),(3,'Bangkal');
/*!40000 ALTER TABLE `branchtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorytable`
--

DROP TABLE IF EXISTS `categorytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorytable` (
  `categoryID` int NOT NULL AUTO_INCREMENT,
  `categoryName` text,
  PRIMARY KEY (`categoryID`),
  UNIQUE KEY `categoryID_UNIQUE` (`categoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorytable`
--

LOCK TABLES `categorytable` WRITE;
/*!40000 ALTER TABLE `categorytable` DISABLE KEYS */;
INSERT INTO `categorytable` VALUES (1,'Meat'),(2,'Vegetables'),(3,'Drinks');
/*!40000 ALTER TABLE `categorytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `BOOK_CODE` char(4) NOT NULL,
  `BRANCH_NUM` decimal(2,0) NOT NULL,
  `ON_HAND` decimal(2,0) DEFAULT NULL,
  PRIMARY KEY (`BOOK_CODE`,`BRANCH_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES ('0180',1,2),('0189',2,2),('0200',1,1),('0200',2,3),('0378',3,2),('079X',2,1),('079X',3,2),('079X',4,3),('0808',2,1),('1351',2,4),('1351',3,2),('1382',2,1),('138X',2,3),('2226',1,3),('2226',3,2),('2226',4,1),('2281',4,3),('2766',3,2),('2908',1,3),('2908',4,1),('3350',1,2),('3743',2,1),('3906',2,1),('3906',3,2),('5163',1,1),('5790',4,2),('6128',2,4),('6128',3,3),('6328',2,2),('669X',1,1),('6908',2,2),('7405',3,2),('7443',4,1),('7559',2,2),('8092',3,1),('8720',1,3),('9611',1,2),('9627',3,5),('9627',4,2),('9701',1,2),('9701',2,1),('9701',3,3),('9701',4,2),('9882',3,3),('9883',2,3),('9883',4,2),('9931',1,2);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventoryinfo`
--

DROP TABLE IF EXISTS `inventoryinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventoryinfo` (
  `num` int NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `contactNum` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventoryinfo`
--

LOCK TABLES `inventoryinfo` WRITE;
/*!40000 ALTER TABLE `inventoryinfo` DISABLE KEYS */;
INSERT INTO `inventoryinfo` VALUES (0,'KSU Inventory','Matina','Davao','09273173194');
/*!40000 ALTER TABLE `inventoryinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttable`
--

DROP TABLE IF EXISTS `producttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producttable` (
  `productID` int NOT NULL AUTO_INCREMENT,
  `productName` text,
  `productQuantity` int DEFAULT NULL,
  `Unit` text,
  `prodMinq` int DEFAULT NULL,
  `Active` text,
  `Sub` text,
  `standardPrice` float DEFAULT NULL,
  `dateFrom` varchar(45) DEFAULT NULL,
  `dateTo` varchar(45) DEFAULT NULL,
  `subsub` text,
  PRIMARY KEY (`productID`),
  UNIQUE KEY `productID_UNIQUE` (`productID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttable`
--

LOCK TABLES `producttable` WRITE;
/*!40000 ALTER TABLE `producttable` DISABLE KEYS */;
INSERT INTO `producttable` VALUES (1,'Coke',271,'pcs',20,'TRUE','Drinks',2332,'2021-07-14','2021-10-14','frozen'),(2,'Sprite',9,'pcs',15,'TRUE','Drinks',2666.33,'2021-07-14','2021-10-14','frozen'),(3,'Royal',574,'pcs',10,'TRUE','Drinks',7.83333,'2021-06-24','2021-09-24','frozen'),(4,'Cabbage',25,'pcs',12,'TRUE','Vegetables',40,'2021-08-21','2021-11-21','non-frozen'),(5,'Carrot',0,'pcs',12,'TRUE','Vegetables',0,'0','0','non-frozen');
/*!40000 ALTER TABLE `producttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttrans`
--

DROP TABLE IF EXISTS `producttrans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producttrans` (
  `TransactionNo` int NOT NULL AUTO_INCREMENT,
  `prodID` int DEFAULT NULL,
  `Name` text,
  `Sub` text,
  `subsub` text,
  `Quantity` int DEFAULT NULL,
  `Unit` text,
  `Price` double DEFAULT NULL,
  `SuppBranch` text,
  `Date` text,
  `Action` text,
  `Transby` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TransactionNo`),
  UNIQUE KEY `TransactionNo_UNIQUE` (`TransactionNo`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttrans`
--

LOCK TABLES `producttrans` WRITE;
/*!40000 ALTER TABLE `producttrans` DISABLE KEYS */;
INSERT INTO `producttrans` VALUES (1,1,'Sprite','Drinks','frozen',4,'pcs',432,'NCCC','2021-07-09','deposit','Viver Bungag'),(2,2,'Coke','Drinks','frozen',3,'pcs',3,'Gmall','2021-07-09','deposit','Viver Bungag'),(3,3,'Sprite','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Viver Bungag'),(4,1,'Coke','Drinks','frozen',3,'pcs',3,'Bangkal','2021-07-09','withdraw','Viver Bungag'),(5,3,'Sprite','Drinks','frozen',3,'pcs',3,'Juna','2021-07-09','withdraw','Viver Bungag'),(6,1,'Royal','Drinks','frozen',3,'pcs',32,'NCCC','2021-07-09','deposit','Viver Bungag'),(7,3,'Sprite','Drinks','frozen',3,'pcs',3453,'NCCC','2021-07-23','deposit','Viver Bungag'),(8,3,'Coke','Drinks','frozen',6,'pcs',2332,'SM','2021-07-23','deposit','Viver Bungag'),(9,3,'Coke','Drinks','frozen',6,'pcs',2332,'SM','2021-07-23','deposit','Admin Admin'),(10,3,'Sprite','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-23','deposit','Admin Admin'),(11,3,'Sprite','Drinks','frozen',3,'pcs',4543,'SM','2021-07-23','deposit','Admin Admin'),(12,3,'Coke','Drinks','frozen',3,'pcs',3,'SM','2021-07-09','deposit','Admin Admin'),(13,3,'Royal','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(14,3,'Sprite','Drinks','frozen',3,'pcs',3,'SM','2021-07-09','deposit','Admin Admin'),(15,3,'Coke','Drinks','frozen',3,'pcs',1232,'NCCC','2021-07-09','deposit','Admin Admin'),(16,3,'Royal','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Viver Bungag'),(17,3,'Sprite','Drinks','frozen',3,'pcs',1231,'NCCC','2021-07-09','deposit','Viver Bungag'),(18,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Viver Bungag'),(19,3,'Royal','Drinks','frozen',3,'pcs',3,'SM','2021-07-09','deposit','Viver Bungag'),(20,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(21,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(22,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(23,3,'Royal','Drinks','frozen',3,'pcs',3,'Gmall','2021-07-09','deposit','Admin Admin'),(24,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(25,3,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(26,3,'Royal','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Admin Admin'),(27,3,'Coke','Drinks','frozen',3,'pcs',3,'SM','2021-07-09','deposit','Admin Admin'),(28,3,'Sprite','Drinks','frozen',3,'pcs',543,'NCCC','2021-07-09','deposit','Viver Bungag'),(29,3,'Coke','Drinks','frozen',3,'pcs',3,'Marfori','2021-07-09','withdraw','Viver Bungag'),(30,3,'Sprite','Drinks','frozen',3,'pcs',345,'Gmall','2021-07-09','deposit','Viver Bungag'),(31,1,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Viver Bungag'),(32,1,'Coke','Drinks','frozen',3,'pcs',543,'SM','2021-07-09','deposit','Viver Bungag'),(33,3,'Coke','Drinks','frozen',3,'pcs',3,'Gmall','2021-07-09','deposit','Viver Bungag'),(34,2,'Coke','Drinks','frozen',3,'pcs',3,'NCCC','2021-07-09','deposit','Viver Bungag'),(39,1,'Coke','Drinks','frozen',-23,'pcs',1,'Bangkal','2021-08-15','withdraw','Admin Admin'),(40,1,'Coke','Drinks','frozen',-5,'pcs',1,'Juna','2021-08-15','withdraw','Admin Admin'),(41,1,'Coke','Drinks','frozen',-3,'pcs',1,'Juna','2021-08-15','withdraw','Admin Admin'),(42,1,'Coke','Drinks','frozen',-3,'pcs',1,'Juna','2021-08-15','withdraw','Admin Admin'),(43,1,'Coke','Drinks','frozen',-1,'pcs',1,'Juna','2021-08-15','withdraw','Admin Admin'),(45,2,'Sprite','Drinks','frozen',-80,'pcs',1146.43,'Juna','2021-09-24','withdraw','Admin Admin'),(47,4,'Cabbage','Vegetables','non-frozen',10,'pcs',40,'Gmall','2021-10-14','deposit','Admin Admin'),(48,4,'Cabbage','Vegetables','non-frozen',-5,'pcs',0,'Juna','2021-10-14','withdraw','Admin Admin');
/*!40000 ALTER TABLE `producttrans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher` (
  `PUBLISHER_CODE` char(3) NOT NULL,
  `PUBLISHER_NAME` char(25) DEFAULT NULL,
  `CITY` char(20) DEFAULT NULL,
  PRIMARY KEY (`PUBLISHER_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES ('AH','Arkham House','Sauk City WI'),('AP','Arcade Publishing','New York'),('BA','Basic Books','Boulder CO'),('BP','Berkley Publishing','Boston'),('BY','Back Bay Books','New York'),('CT','Course Technology','Boston'),('FA','Fawcett Books','New York'),('FS','Farrar Straus and Giroux','New York'),('HC','HarperCollins Publishers','New York'),('JP','Jove Publications','New York'),('JT','Jeremy P. Tarcher','Los Angeles'),('LB','Lb Books','New York'),('MP','McPherson and Co.','Kingston'),('PE','Penguin USA','New York'),('PL','Plume','New York'),('PU','Putnam Publishing Group','New York'),('RH','Random House','New York'),('SB','Schoken Books','New York'),('SC','Scribner','New York'),('SS','Simon and Schuster','New York'),('ST','Scholastic Trade','New York'),('TA','Taunton Press','Newtown CT'),('TB','Tor Books','New York'),('TH','Thames and Hudson','New York'),('TO','Touchstone Books','Westport CT'),('VB','Vintage Books','New York'),('WN','W.W. Norton','New York'),('WP','Westview Press','Boulder CO');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategorytable`
--

DROP TABLE IF EXISTS `subcategorytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subcategorytable` (
  `subCategoryID` int NOT NULL AUTO_INCREMENT,
  `subCategoryName` text,
  PRIMARY KEY (`subCategoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategorytable`
--

LOCK TABLES `subcategorytable` WRITE;
/*!40000 ALTER TABLE `subcategorytable` DISABLE KEYS */;
INSERT INTO `subcategorytable` VALUES (1,'frozen'),(2,'non-frozen');
/*!40000 ALTER TABLE `subcategorytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliertable`
--

DROP TABLE IF EXISTS `suppliertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliertable` (
  `supplierID` int NOT NULL AUTO_INCREMENT,
  `supplierName` text,
  PRIMARY KEY (`supplierID`),
  UNIQUE KEY `supplierID_UNIQUE` (`supplierID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliertable`
--

LOCK TABLES `suppliertable` WRITE;
/*!40000 ALTER TABLE `suppliertable` DISABLE KEYS */;
INSERT INTO `suppliertable` VALUES (1,'SM'),(2,'Gmall'),(4,'NCCC');
/*!40000 ALTER TABLE `suppliertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unittable`
--

DROP TABLE IF EXISTS `unittable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unittable` (
  `unitID` int NOT NULL AUTO_INCREMENT,
  `Unit` text,
  PRIMARY KEY (`unitID`),
  UNIQUE KEY `unitID_UNIQUE` (`unitID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unittable`
--

LOCK TABLES `unittable` WRITE;
/*!40000 ALTER TABLE `unittable` DISABLE KEYS */;
INSERT INTO `unittable` VALUES (1,'pcs'),(2,'kl');
/*!40000 ALTER TABLE `unittable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertable`
--

DROP TABLE IF EXISTS `usertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usertable` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `Firstname` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin,
  `Lastname` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin,
  `Username` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin,
  `Password` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin,
  `Admin` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT 'FALSE',
  `Active` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT 'TRUE',
  PRIMARY KEY (`userID`),
  UNIQUE KEY `userID_UNIQUE` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertable`
--

LOCK TABLES `usertable` WRITE;
/*!40000 ALTER TABLE `usertable` DISABLE KEYS */;
INSERT INTO `usertable` VALUES (1,'george','lala','jdiaso','dada','FALSE','TRUE'),(2,'john','pepes','jp','pipi','FALSE','TRUE'),(3,'Patrick','Matayabas','Jpm','123','FALSE','TRUE'),(4,'Patrick','Matayabas','Jpm','123','FALSE','TRUE'),(5,'Patrick','Matayabas','Jpm','123','FALSE','TRUE'),(6,'Viver','Bungag','viv','123','FALSE','TRUE'),(7,'Admin','Admin','Admin','Admin','TRUE','TRUE');
/*!40000 ALTER TABLE `usertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wrote`
--

DROP TABLE IF EXISTS `wrote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wrote` (
  `BOOK_CODE` char(4) NOT NULL,
  `AUTHOR_NUM` decimal(2,0) NOT NULL,
  `SEQUENCE` decimal(1,0) DEFAULT NULL,
  PRIMARY KEY (`BOOK_CODE`,`AUTHOR_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wrote`
--

LOCK TABLES `wrote` WRITE;
/*!40000 ALTER TABLE `wrote` DISABLE KEYS */;
INSERT INTO `wrote` VALUES ('0180',3,1),('0189',5,1),('0200',18,1),('0378',11,1),('079X',4,1),('0808',4,1),('1351',6,1),('1382',23,2),('1382',25,1),('138X',1,1),('2226',15,1),('2281',9,2),('2281',19,1),('2766',20,1),('2908',17,1),('3350',2,1),('3743',16,1),('3906',24,1),('5163',20,1),('5790',10,1),('6128',1,1),('6328',14,1),('669X',7,1),('6908',16,1),('7405',20,1),('7443',15,1),('7559',18,1),('8092',12,1),('8720',8,1),('9611',5,2),('9611',6,1),('9627',1,1),('9701',20,1),('9882',4,1),('9883',16,1),('9931',13,1);
/*!40000 ALTER TABLE `wrote` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-21 20:20:38
