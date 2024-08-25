-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: liberty_demo
-- ------------------------------------------------------
-- Server version	8.0.38

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
-- Table structure for table `addon_master`
--

DROP TABLE IF EXISTS `addon_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addon_master` (
  `addon_id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(765) DEFAULT NULL,
  `column_name_in_table` varchar(765) DEFAULT NULL,
  `label` varchar(765) DEFAULT NULL,
  `short_name` varchar(300) DEFAULT NULL,
  `status_id` int DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `is_electrical` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`addon_id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addon_master`
--

LOCK TABLES `addon_master` WRITE;
/*!40000 ALTER TABLE `addon_master` DISABLE KEYS */;
INSERT INTO `addon_master` VALUES (1,'Zero/Nil Depreciation','is_addon_nildep',NULL,'zero_depreciation',1,'2020-07-07 13:09:49','2023-10-27 15:06:26',0),(2,'Engine Protection','is_addon_engine_protect',NULL,'engine_protection',1,'2020-07-07 13:09:49','2023-10-27 15:06:26',0),(3,'Return to invoice','is_addon_rti',NULL,'return_to_invoice',1,'2020-07-07 13:09:49','2023-10-27 15:06:25',0),(4,'Consumables','is_addon_consumables',NULL,'consumables',1,'2020-07-07 13:09:49','2023-10-27 15:06:24',0),(5,'Key Protect','is_addon_key_replacement',NULL,'key_protect',1,'2020-07-07 13:09:49','2024-04-30 15:56:31',0),(6,'Tyre & wheel Rim protect','is_addon_tyre_cover',NULL,'tyre_protect',1,'2020-07-07 13:09:49','2024-05-31 18:39:06',0),(7,'Extra Towing','is_addon_addtowing',NULL,'extra_towing',2,'2020-07-07 13:09:58','2021-02-05 14:47:29',0),(8,'Silver',NULL,'Zero depreciation + Consumables + Engine Protection','',2,'2020-07-07 13:09:58','2023-05-03 15:09:03',0),(9,'Gold',NULL,'Silver + Return to invoice + Extra Towing','',2,'2020-07-07 13:09:58','2023-05-03 15:09:03',0),(10,'Platinum',NULL,'Gold + Tyre Protect','',2,'2020-07-07 13:09:58','2023-05-03 15:09:04',0),(11,'Sapphire',NULL,'Platinum + Key Protect','\r\n\r\n',2,'2020-07-07 13:10:36','2023-05-03 15:09:20',0),(12,'None',NULL,NULL,'',2,'2020-07-19 23:10:22','2023-05-03 15:09:20',0),(13,'NCB Protection','is_addon_ncb_protect',NULL,'addon_ncb_protect',1,'2022-08-21 23:31:37','2023-10-10 12:25:28',0),(14,'EMI Protection','is_addon_emicover',NULL,'addon_emicover',0,'2022-08-21 23:34:52','2024-06-06 16:10:47',0),(75,'EMERGENCY MEDICAL EXPENSE','EMERGENCY MEDICAL EXPENSE','EMERGENCY MEDICAL EXPENSE','addon_eme',2,'2023-10-05 12:47:47','2023-10-05 12:48:58',0),(76,'RSA','RSA','RSA','addon_rsa',2,'2023-10-05 12:48:56','2023-10-05 12:48:57',0),(79,'Driving Accessories Cover','is_addon_driving_accessories_cover',NULL,'addon_driving_accessories_cover',1,'2020-07-07 13:09:49','2024-05-15 18:01:20',0),(80,'EME Cover','is_addon_eme_cover',NULL,'addon_eme_cover',1,'2024-05-08 15:59:40','2024-06-06 15:58:35',0),(81,'Battery Cover','is_addon_battery_cover',NULL,'addon_battery_cover',1,'2024-05-08 16:01:52','2024-06-06 16:04:50',1),(82,'Emergency Assistance','is_addon_emergency_assistance',NULL,'addon_emergency_assistance',1,'2024-05-08 16:02:34','2024-06-13 11:59:02',0),(83,'Medical Assistance Coverage','is_medical_assistance_cover',NULL,'medical_assistance_cover',1,'2024-05-08 16:03:31','2024-06-06 16:04:51',0);
/*!40000 ALTER TABLE `addon_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_master`
--

DROP TABLE IF EXISTS `branch_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `BranchID` int NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `RegionID` int DEFAULT NULL,
  `ZoneID` int DEFAULT NULL,
  `BranchType` varchar(100) DEFAULT NULL,
  `Address` text,
  `ReportingBranchID` int DEFAULT NULL,
  `ContactNo` varchar(100) DEFAULT NULL,
  `MOM_ID` int DEFAULT NULL,
  `ContactPerson` varchar(100) DEFAULT NULL,
  `status` int DEFAULT '1',
  `B_S_Office` varchar(100) DEFAULT NULL,
  `CompAgencyID` varchar(100) DEFAULT NULL,
  `LocationLevel` varchar(100) DEFAULT NULL,
  `ZonalClass` varchar(100) DEFAULT NULL,
  `GCBranchId` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_master`
--

LOCK TABLES `branch_master` WRITE;
/*!40000 ALTER TABLE `branch_master` DISABLE KEYS */;
INSERT INTO `branch_master` VALUES (1,1103,'Thane',2598,4,'Branch Office','L.B.S MARG NEAR NAVNEET MOTORS, GOKUL NAGAR, PANCHPAKHADI THANE (W) ',2598,'0',3,NULL,1,'Branch Office',NULL,'Branch',NULL,400403),(2,1105,'Andheri ',1198,4,'Branch Office','null',1198,'0',5,NULL,1,'Area Office',NULL,'Branch',NULL,400402),(3,1107,'Ghatkopar',2598,4,'Branch Office','210, Sai Infotech, RP Mehta Marg, Patel Chowk~.~~.~',2598,'39981300',169,NULL,1,'Branch Office',NULL,'Branch',NULL,NULL),(4,1110,'Vashi',1198,4,'Branch Office','5th Floor, Devavreta Building, Sector - 17, Behind Vashi Plaza~.~~.~',1198,'391010',167,NULL,1,'Branch Office',NULL,'Branch',NULL,400404),(5,1115,'Goregoan',2598,4,'Branch Office','MEHRAULI-GURGAON ROAD',2598,'0',245,NULL,1,'Center Office',NULL,'Branch',NULL,NULL),(6,1199,'Mumbai I',1198,4,'Region Office','G. K. MARG, LOWER PAREL, ',9304,'0',7,NULL,1,'Regional Office',NULL,'Branch',NULL,400401),(7,1201,'Chennai I',1298,4,'Branch Office','G.N. CHETTY ROAD',1298,'0',8,NULL,1,'Branch Office',NULL,'Branch',NULL,500401),(8,1202,'Coimbatore',1298,4,'Branch Office','DB ROAD, R.S. PURAM',1298,'0',9,NULL,1,'Branch Office',NULL,'Branch',NULL,500402),(9,1204,'Madurai',1298,4,'Branch Office','79/2 BY PASS ROAD, ',1298,'0',11,NULL,1,'Center Office',NULL,'Branch',NULL,500403),(10,1205,'Trichy',1298,4,'Branch Office',' No.15 PLA, Kanagu Towers, II Floor, 15A, Thillai Nagar Main Road~.~~.~',1298,'3209941',79,NULL,1,'Center Office',NULL,'Branch',NULL,500405),(11,1304,'Gurgaon',1398,3,'Branch Office','null',1398,'0',15,NULL,1,'Area Office',NULL,'Branch',NULL,200201),(12,1307,'Jaipur',2698,2,'Branch Office','SARDAR PATEL MARG, C SCHEME,',2698,'0',18,NULL,1,'Branch Office',NULL,'Branch',NULL,400501),(13,1399,'Delhi I',1398,3,'Branch Office','56 JANPATH, CONNAUGHT PLACE',9301,'0',19,NULL,1,'Regional Office',NULL,'Branch',NULL,200101),(14,1401,'Bangalore I',1498,4,'Branch Office','OLD NO. 28 , NEW NO. 23, RICHMOND ROAD,',1498,'0',20,NULL,1,'Area Office',NULL,'Branch',NULL,500201),(15,1402,'Hubli',1498,4,'Branch Office','DESAI CROSS, DESHPANDE NAGAR',1498,'0',21,NULL,1,'Branch Office',NULL,'Branch',NULL,500202),(16,1403,'Mysore',1498,4,'Branch Office','1st Floor, Mysore Trade Centre, Opposte KSRTC Bus Stand~.~~.~',1498,'3018030',22,NULL,1,'Center Office',NULL,'Branch',NULL,500204),(17,1404,'Mangalore',1498,4,'Branch Office','BEARING DOOR NO 4-1-85/25, IIND FLOOR, INLAND AVENUE, MG ROAD,',1498,'0',23,NULL,1,'Center Office',NULL,'Branch',NULL,500203),(18,1501,'Kolkata I',1598,1,'Branch Office','24 PARK STREET',1598,'0',28,NULL,1,'Area Office',NULL,'Branch',NULL,301401),(19,1502,'Bhubaneshwar',2498,1,'Branch Office','MOUZA KHARVELA NAGAR ',2498,'0',29,NULL,1,'Branch Office',NULL,'Branch',NULL,301101),(20,1504,'Jamshedpur',1598,1,'Branch Office','Gayatri Enclave, 3rd Floor, K-Road, Bistupur, Jamshedpur',1598,'3204106',5,NULL,1,'Branch Office',NULL,'Branch',NULL,300501),(21,1505,'Guwahati ',1598,1,'Branch Office','G S ROAD , ABOVE KOTAK MAHINDRA BANK , BORA SERVICE ',1598,'0',32,NULL,1,'Branch Office',NULL,'Branch',NULL,300201),(22,1509,'Durgapur',1598,1,'Branch Office','Galaxy, 2nd Floor, Shahid Khudiram Sarani, City Centre~.~~.~',1598,'3061339',107,NULL,1,'Center Office',NULL,'Branch',NULL,301402),(23,1512,'Asansol',1598,1,'Branch Office','Reliance General Insurance Co. Ltd. 2nd Floor~.~Parbati Shopping Arcade G.T.Road (Mission More)    Asansol,~.~NULL',1598,'30274567',276,NULL,1,'Center Office',NULL,'Branch',NULL,301403),(24,1601,'Baroda',2798,3,'Branch Office','Reliance General Insurance Co. Ltd.~.~3rd Floor, Startrek Building, Opposite ABS Tower, Old Padra Road~.~Baroda',2798,'3922034',36,NULL,1,'Branch Office',NULL,'Branch',NULL,NULL),(25,1602,'Ahmedabad I',1698,3,'Branch Office','SWATIK CROSS ROAD, C.G ROAD ',1698,'0',37,NULL,1,'Area Office',NULL,'Branch',NULL,400201),(26,1603,'Surat',2798,3,'Branch Office','MAJURA GATE, RING ROAD ',2798,'0',38,NULL,1,'Area Office',NULL,'Branch',NULL,400202),(27,1604,'Rajkot',1698,3,'Branch Office','KALAWAD MAIN ROAD',1698,'0',39,NULL,1,'Center Office',NULL,'Branch',NULL,400203),(28,1607,'Gandhidham',1698,3,'Branch Office','BBZ, S41, 12B, Above Shikar Puri Street, Main Market~.~~.~',1698,'329189',112,NULL,1,'Branch Office',NULL,'Branch',NULL,400207),(29,1608,'Bharuch',2798,3,'Branch Office','3rd, Floor, Srirang Palace, Zadeshwar Road~.~~.~',2798,'308260',113,NULL,1,'Center Office',NULL,'Branch',NULL,400205),(30,1700,'MARGAO',1798,4,'Branch Office','PAJIFOND, MARGAO',1798,'0',46,NULL,1,'Center Office',NULL,'Branch',NULL,400101),(31,1701,'Pune',1798,4,'Branch Office','347A/347B, BOAT CLUB ROAD, ',1798,'0',41,NULL,1,'Area Office',NULL,'Branch',NULL,400301),(32,1702,'Solapur',1798,4,'Branch Office','Son Plaza, 2nd floor, Murarji Peth, Opposite Hotel Shiv Parvati, Subhash chowk, Lucky Chowk,~.~~.~',1798,'3205507',42,NULL,1,'Center Office',NULL,'Branch',NULL,400307),(33,1704,'Nashik',1798,4,'Branch Office','106-107-108, First Floor, Space Cosmos, Ashok Stambh~.~~.~',1798,'3018505',43,NULL,1,'Branch Office',NULL,'Branch',NULL,400306),(34,1705,'Nagpur',1798,4,'Branch Office','6th Floor, Landmark Building, Ramdas Peth, Wardha Road~.~~.~',1798,'3206194',44,NULL,1,'Branch Office',NULL,'Branch',NULL,400305),(35,1706,'Kolhapur',1798,4,'Branch Office','Gem Stone, Raobahadur Dajirao Vichare Complex, 517 A/2 E, Near Central S.T. Stand, New Shaupuri~.~~.~',1798,'3203254',45,NULL,1,'Center Office',NULL,'Branch',NULL,400304),(36,1707,'Goa',1798,4,'Branch Office','Fourth Floor, Mathias Plaza, 18th June Road, Panaji~.~~.~',1798,'3245530',46,NULL,1,'Center Office',NULL,'Branch',NULL,NULL),(37,1708,'Aurangabad',1798,4,'Branch Office','C-9 & C-10, 2nd Floor, ABC Complex, Adalat Road~.~~.~',1798,'3209692',47,NULL,1,'Branch Office',NULL,'Branch',NULL,400302),(38,1709,'Amravati',1798,4,'Branch Office','Vimco Tower, 2nd Floor, B Wing, Station Road, Above ICICI Bank~.~~.~',1798,'3058027',77,NULL,1,'Center Office',NULL,'Branch',NULL,400303),(39,1801,'Hyderabad I',1898,4,'Branch Office','RAJBHAVAN ROAD, SOMAJIGUDA,? ',1898,'0',49,NULL,1,'Area Office',NULL,'Branch',NULL,500101),(40,1803,'Vijayawada',2998,4,'Branch Office','SAI NAGAR, NEAR BENZ CIRCLE, VIJAYAWADA.',2998,'0',51,NULL,1,'Branch Office',NULL,'Branch',NULL,500103),(41,1808,'Kurnool',2998,4,'Branch Office','RELIANCE GENERAL INSURANCE COMPANY LIMITED, 4th floor,~.~4th floor, Alankar plaza ,park road kurnool - 518002~.~ Kurnool - 518002',2998,'39838550',176,NULL,1,'Center Office',NULL,'Branch',NULL,500104),(42,1811,'Tirupati',2998,4,'Branch Office','19-6-27,Vijaya Bharti Commercial Complex, D R Mahal Road~.~~.~',2998,'3982070',163,NULL,1,'Center Office',NULL,'Branch',NULL,500105),(43,1899,'Andhra Pradesh I',1898,4,'Region Office','C.B.M COMPOUND,',9304,'0',54,NULL,1,'Regional Office',NULL,'Branch',NULL,NULL),(44,1901,'Lucknow',1998,3,'Branch Office','RELINCE GENERAL INSURANCE COMPANY LTD~.~1st FLOOR , ROHIT HOUSE,SHAHNAZAF ROAD HAZRATGANJ,~.~LUCKNOW, UTTAR PRADESH',1998,'3918946',55,NULL,1,'Branch Office',NULL,'Branch',NULL,200701),(45,2001,'Ludhiana',2098,3,'Branch Office','7th Floor, Surya Tower, 108, The Mall~.~~.~',2098,'3018630',61,NULL,1,'Branch Office',NULL,'Branch',NULL,200504),(46,2002,'Jalandhar',2098,3,'Branch Office','261, LAJPAT NAGAR, GURU NANAK MISSION CHOWK,',2098,'0',62,NULL,1,'Branch Office',NULL,'Branch',NULL,200501),(47,2003,'Amritsar',2098,3,'Branch Office','S.C.O. 122, C-Block, Ranjit Avenue, Opposite Amritsar Improvement Trust Complex~.~~.~',2098,'3982610',63,NULL,1,'Branch Office',NULL,'Branch',NULL,200503),(48,2004,'Chandigarh',3098,3,'Branch Office','SECTOR ? 9 C, ',3098,'0',64,NULL,1,'Area Office',NULL,'Branch',NULL,200502),(49,2006,'Jammu',2098,3,'Branch Office','Reliance General Insurance Co. Ltd~.~5th Floor, Hotel TRG Building~.~Opp. Bahu Plaza, Rail Head Complex, Jammu',2098,'247318',131,NULL,1,'Branch Office',NULL,'Branch',NULL,200401),(50,2202,'Calicut',2298,4,'Branch Office','2nd Floor, Citadel Arcade, R.C Road, Opposite Tagore Centenary Hall~.~~.~',2298,'3209481',68,NULL,1,'Branch Office',NULL,'Branch',NULL,500303),(51,2203,'Trivandrum',2298,4,'Branch Office','3rd floor, 5th Level, Trans Towers, Vazthacadu~.~~.~',2298,'3918207',69,NULL,1,'Branch Office',NULL,'Branch',NULL,500302),(52,2299,'Kerala',2298,4,'Region Office','MG ROAD, RAVIPURAM,',9304,'0',70,NULL,1,'Regional Office',NULL,'Branch',NULL,NULL),(53,2301,'Bhopal',2398,1,'Branch Office','FF-16, Mansarovar Commercial Complex, Block C, Near Habibganj Railway Station, Hoshangabad Road~.~~.~',2398,'3918040',71,NULL,1,'Center Office',NULL,'Branch',NULL,400701),(54,2302,'Indore',2398,1,'Branch Office','301-302 Corporate House , 3rd Floor~.~Opposite Jhabua Tower,RNT Marg~.~Indore 452001',2398,'3917936',72,NULL,1,'Branch Office',NULL,'Branch',NULL,400702),(55,2303,'Raipur',2398,1,'Branch Office','PANDRI MAIN ROAD, PANDRI',2398,'0',73,NULL,1,'Branch Office',NULL,'Branch',NULL,400601),(56,2401,'Patna',2498,1,'Branch Office','301- 302 , 3rd Floor,Kaushalya Estate Dak Bunglow Chowraha,Bandar Bagicha.PATNA ~.~~.~',2498,NULL,136,NULL,1,'Branch Office',NULL,'Branch',NULL,300301),(57,2403,'Dhanbad',2498,1,'Branch Office','Commerce House 2(Ashoka Bazar Showroom)~.~1st floor, Shastri Nagar,~.~Dhanbad',2498,'39848776',193,NULL,1,'Center Office',NULL,'Branch',NULL,300503),(58,2405,'Ranchi',2498,1,'Branch Office','JD Corporate No 3, First Floor Opposite Mahavir Towers, Main Road~.~~.~',2498,'3200639',145,NULL,1,'Center Office',NULL,'Branch',NULL,300502),(59,2408,'Rourkela',2498,1,'Branch Office','\'TULASI COMPLEX,1ST FLOOR~.~PANPOSH ROAD,~.~ROURKELA',2498,'3200379',142,NULL,1,'Center Office',NULL,'Branch',NULL,301102),(60,2599,'Mumbai II',2598,4,'Region Office','MOHAN STUDIO COMPOUND, ANDHERI KURLA ROAD, ANDHERI EAST. ',9304,'0',269,NULL,1,'Regional Office',NULL,'Branch',NULL,NULL),(61,2603,'Udaipur',2698,3,'Branch Office','AIRPORT ROAD, ',2698,'0',173,NULL,1,'Branch Office',NULL,'Branch',NULL,400502),(62,2899,'Delhi II',2898,3,'Region Office','NETAJI SHUBHASH PALACE, PITAMPURA',9301,'0',271,NULL,1,'Regional Office',NULL,'Branch',NULL,200102),(63,2999,'Vishakapatnam',1898,4,'Branch Office','null',9304,'0',8,NULL,1,'Area Office',NULL,'Branch',NULL,500102),(64,9103,'Lucknow',1998,3,'Region Office','Eldeco co. Chamber 1~.~opp. kisaan mandi parishad~.~vibhuti khand, gomti nagar, Lucknow',9301,'3984468',290,NULL,1,'Regional Office',NULL,'Branch',NULL,200701),(65,9111,'Kochi',2298,4,'Region Office','null',9304,'0',298,NULL,1,'Regional Office',NULL,'Branch',NULL,500301),(66,9112,'Siliguri',1598,1,'Branch Office','38-B, Himalaya House,~.~8th. Floor, chowrangee Road, Kolkata~.~',1598,'30287548',28,NULL,1,'Area Office',NULL,'Branch',NULL,301404),(67,9113,'Agartala',1598,1,'Branch Office','Reliance General Insurance Co. Ltd , ~.~5th Floor,Anil Plaza, ~.~Besides IDBI Bank , G.S Road, Guwahati ',1598,'2464911',32,NULL,1,'Branch Office',NULL,'Branch',NULL,301301),(68,9114,'Bilaspur',2398,1,'Branch Office','FF-16, Mansarovar Commercial Complex, Block C, Near Habibganj Railway Station, Hoshangabad Road~.~~.~',2398,'3918040',71,NULL,1,'Center Office',NULL,'Branch',NULL,400602),(69,9115,'Shilong ',3198,1,'Region Office','abc~.~~.~',9303,'9999999999',273,NULL,1,'Regional Office',NULL,'Branch',NULL,300701),(70,9116,'TIRUNELVELI',1298,4,'Branch Office','Heavitree, Unit No.1,3rd Floor, No.23~.~Spur Tank Road, Chetpet~.~',9304,'0',12,'Branch Office',1,'Regional Office',NULL,'Branch',NULL,NULL),(71,10000,'VADODARA',1698,3,'Brach office','Reliance General Insurance Company Limited~.~4th Floor, Ajay Bungalow,Opposite HDFC Bank,~.~Mithakhali Six Roads,Navrangpura,Ahmedabad',1698,NULL,6,NULL,1,'Area Office',NULL,'Branch',NULL,400204),(72,10001,'Jodhpur',2698,3,'Branch Office',NULL,NULL,'2698',20,NULL,1,'Branch Office',NULL,'Branch',NULL,400503),(73,10002,'WARANGAL',3199,3,'Branch Office','WARANGAL',NULL,'3199',20,NULL,1,'Branch Office',NULL,'Branch',NULL,500501);
/*!40000 ALTER TABLE `branch_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaign_master`
--

DROP TABLE IF EXISTS `campaign_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `campaign_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `source_id` int DEFAULT NULL,
  `publisher_id` int DEFAULT NULL,
  `campaign_name` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaign_master`
--

LOCK TABLES `campaign_master` WRITE;
/*!40000 ALTER TABLE `campaign_master` DISABLE KEYS */;
INSERT INTO `campaign_master` VALUES (1,8,1,'Happy Diwali');
/*!40000 ALTER TABLE `campaign_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dispositions`
--

DROP TABLE IF EXISTS `dispositions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dispositions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `disposition_name` varchar(90) NOT NULL,
  `disposition_slug` varchar(90) NOT NULL,
  `status` varchar(90) NOT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispositions`
--

LOCK TABLES `dispositions` WRITE;
/*!40000 ALTER TABLE `dispositions` DISABLE KEYS */;
INSERT INTO `dispositions` VALUES (1,'Won','','1','2020-02-17 11:16:37'),(2,'Follow UP','','1','2020-02-17 11:16:41'),(3,'Non Contactable','','1','2020-02-17 11:16:44'),(4,'Not Eligible','','1','2020-02-17 11:16:48'),(5,'Not Interested','','1','2020-02-17 11:16:54'),(6,'RPC (Right Party Contact)','','1','2020-02-17 11:16:58'),(7,'Closed','','1','2020-02-17 11:17:02'),(8,'Lost','','1','2020-03-19 18:45:48');
/*!40000 ALTER TABLE `dispositions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insurance_vertical_master`
--

DROP TABLE IF EXISTS `insurance_vertical_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insurance_vertical_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance_vertical_master`
--

LOCK TABLES `insurance_vertical_master` WRITE;
/*!40000 ALTER TABLE `insurance_vertical_master` DISABLE KEYS */;
INSERT INTO `insurance_vertical_master` VALUES (1,'Private Car','private_car'),(2,'Two Wheeler','two_wheeler'),(3,'Health','health');
/*!40000 ALTER TABLE `insurance_vertical_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lead_details`
--

DROP TABLE IF EXISTS `lead_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lead_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_lead_id` varchar(111) NOT NULL,
  `insurance_vertical_id` int DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `last_updated_date_time` datetime DEFAULT NULL,
  `product_type_id` int DEFAULT NULL,
  `policy_type_id` int DEFAULT NULL,
  `policy_status` int DEFAULT '1',
  `last_insurance_copmany` varchar(150) DEFAULT NULL,
  `lead_disposition_id` int DEFAULT NULL,
  `lead_sub_disposition_id` int DEFAULT NULL,
  `lead_device` varchar(150) DEFAULT NULL,
  `manufacturing_month` int DEFAULT NULL,
  `ad_on_covers` varchar(150) DEFAULT NULL,
  `source_id` int DEFAULT NULL,
  `publisher_id` int DEFAULT NULL,
  `campaign_id` int DEFAULT NULL,
  `vertical_id` int DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lead_details`
--

LOCK TABLES `lead_details` WRITE;
/*!40000 ALTER TABLE `lead_details` DISABLE KEYS */;
INSERT INTO `lead_details` VALUES (1,'1',1,'GARGI',NULL,'MAYUR BHAVSAR','2024-07-20 12:00:00',1,2,1,'ICICI',2,2,'Mobil',4,'1,2,3,4,',1,1,1,1,1),(2,'2',1,'POOJA ',NULL,'KHANNA','2024-07-20 12:00:00',1,2,1,'ICICI',2,2,'Mobil',4,'1,2,3,4,',1,1,1,1,2);
/*!40000 ALTER TABLE `lead_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lead_vertical`
--

DROP TABLE IF EXISTS `lead_vertical`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lead_vertical` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lead_vertical`
--

LOCK TABLES `lead_vertical` WRITE;
/*!40000 ALTER TABLE `lead_vertical` DISABLE KEYS */;
INSERT INTO `lead_vertical` VALUES (1,'D2C','d2c'),(2,'Retail','retail');
/*!40000 ALTER TABLE `lead_vertical` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy_master`
--

DROP TABLE IF EXISTS `policy_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policy_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lead_id` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `tellecaller_user_id` int DEFAULT NULL COMMENT 'tellecaller_user_id come for user table',
  `policy_Number` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `product_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `biztype` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `policy_end_date` date DEFAULT NULL,
  `insured_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_address1` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_address2` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_address3` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_city` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_district` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customer_pincode` int DEFAULT NULL,
  `state` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `mobile1` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `mobile2` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `mobile3` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `emailId` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `sales_vertical_id` int DEFAULT NULL,
  `servicing_branch` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `sales_manager_code_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `sales_manager_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `diff_date_count` int DEFAULT NULL,
  `sales_manager_code` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `branch_add1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `branch_add2` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `branch_add3` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `branch_pincode` int DEFAULT NULL,
  `branch_locality` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `branch_city` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `Banch_telephone` int DEFAULT NULL,
  `location_code` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `agent_code` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `agent_code1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `agent_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `business_channeltype` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `renewal_noticedate` date DEFAULT NULL,
  `policy_start_date` date DEFAULT NULL,
  `renewalpolicy_start_date` date DEFAULT NULL,
  `regi_number1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `regi_no` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `yom` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `regi_date` date DEFAULT NULL,
  `age` int DEFAULT NULL,
  `special_model_age` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `age_bracket` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `engine_no` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `chassis_no` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `make` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `model` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `model_variant` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `body_type` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cubic_capacity` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `LCC_driver` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `fuel_type` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cover_type` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `rto_location` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zone` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `veh_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `trailer_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `sidecar_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `nonelectrical_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `renewal_nonelectrical_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `electrical_si` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `renewal_electrical_si` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cng_premium` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cng` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cng_inbuilt` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cng_si` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `renewal_cng_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `total_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `highend_model_idv` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `od_rate` float DEFAULT NULL,
  `basic_od` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lastyear_claim` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lastyear_ncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `renewal_ncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ncb_amount` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `od_prem_post_ncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `basic_od_without_cng_elect` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ncb_without_cng_elect` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `postncb_od_without_cng_elect` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `detariff_dis_lastyear` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `last_year_dis` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `detariff_loading` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `current_dis_grid_ncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `current_dis_grid_withoutncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `postncb_od_without_cng_electpostncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `premium_after_dis` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `nil_dept` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `passenger_assist` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `consumable_cover` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `engine_safe_cover` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `read_assistance` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `key_loss` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `total_od` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `basic_tp` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ttpd_premium` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `cng_tp_premium` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `pa_owner_driver` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `pa_to_unnamed` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `pa_driver_cleaner` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ll_to_paid_driver` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `pa_named_pass` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `total_tp` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `premium_before_tax` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `gst` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `total_premium_payable` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `premium_payable_withoutncb` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `financier_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `claim_amount_total` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `no_of_claim` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `depreciation_cover_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `consumable_cover_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `gap_value_cover_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `passanger_assist_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `roadside_assis_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `engine_safe_cover_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `key_loss_cover_ex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `key_loss_cover_si` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ncb_percent_prevyear` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `endorsement_no` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `days` int DEFAULT NULL,
  `veh_segment` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `newsales_manager_code` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `newsales_manager_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `new_rms_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `new_branch_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `new_vertical` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `category` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `applicable_dis_withncb` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `applicable_dis_withoutncb` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `post_withoutncb_od_without_cng_elect` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `premium_after_dis_withoutncb` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `total_od_withoutncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `premium_before_tax_withoutncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `gst_withoutncb` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `ncb_falsification` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `roadside_assis` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zerodepconsum_keyloss_roadsideassist_passengerassist` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zerodepconsum_enginesafe_keyloss_roadsideassist_passengerassist` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zerodepreciation_passengerassist` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zerodepreciation_passengerassist_consumable` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `zerodepreciation_passengerassist_consumable_roadsideassistance` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `bi_status` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `bi_leadid` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `bi_initiated_by` int DEFAULT NULL,
  `bi_sms_link_status` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `bi_created_on` datetime DEFAULT NULL,
  `is_bimessage_send` enum('0','1') CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT '0',
  `bi_initiated_on` datetime DEFAULT NULL,
  `bi_completed_on` datetime DEFAULT NULL,
  `dispositions_id` int DEFAULT NULL,
  `status` int DEFAULT '1',
  `sub_status_id` int DEFAULT NULL,
  `priority` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `sources` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `nc_status` int DEFAULT NULL,
  `created_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isRenewed` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL DEFAULT '0',
  `isReceived` int DEFAULT '0',
  `type_of_call` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT 'Outbound',
  `campaign` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `TyreProtectionCoveEX` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `LibertyCompleteAssistanceEX` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `is_smslink_created` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `lead_id` (`lead_id`),
  KEY `product_name` (`product_name`),
  KEY `insured_name` (`insured_name`),
  KEY `mobile1` (`mobile1`),
  KEY `emailId` (`emailId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy_master`
--

LOCK TABLES `policy_master` WRITE;
/*!40000 ALTER TABLE `policy_master` DISABLE KEYS */;
INSERT INTO `policy_master` VALUES (1,'30032020000',1,'201140020118100408902000','Private Car Package Policy','Renewal Business','2020-09-01','GARGI MAYUR BHAVSAR','A/1 SUKHSAGAR APPARTMENT','AZAD SOCIETY','AMBAWADI','','AHMEDABAD',380015,'GUJARAT','9869043056','8291027664','','pritish@indicosmic.com',2147483647,0,'AHMEDABAD','N0231965 || PRATIK  DABHI',' PRATIK  DABHI',-89,'N0272748','203 & 205, 2ND FLOOR, SHOPPERS PLAZA-IV,','C.G ROAD,','AHMEDABAD',380006,'','‎GUJARAT',79,'400201','IMD1001256','','KALPESH RAJESHBHAI OSWAL','','1970-01-01','2019-01-02','2020-02-01','GJ','GJ01RN2923','2015','2016-01-02',4,'','5','G4LAFM867299','MALA851CLFM380092','HYUNDAI','GRAND I10','GRAND I10 MAGNA 1.2 KAPPA VTVT','Saloon','1197','5','Petrol','Package Policy','AHMEDABAD','A','345600','0','0','0','311,040','0','0','0','No','No','0','0','311,040','',0.03283,'10,211','No','35','45','4595','5616','','','','60','','0','60.00','55.00','','2,247','2937','Passenger A','1065','','294','235','2,247','3221','','','375','100','0','50','0','3746','5,993','1,079','7,072','9842','','0','0','Depreciation Cover','Consumables Cover','','Passenger Assist','','','','','35','',365,'COMPACT','N0272748','Tabrej','Priyank Maroo','Ahmedabad','Li - Agency','Hot','60.00','55.00','5616','4,595','4,595','8341','1501','',NULL,'4826','6111','3232','4297','4591','Lead Created - Pending for acceptance','LB0008470',1,'Lead already exist','2020-04-06 02:35:55','0',NULL,NULL,2,17,2,NULL,'Upload',NULL,'2020-03-30 16:24:08','0',1,'Outbound',NULL,NULL,NULL,0),(2,'30032020001',1,'201120010118700409105000','Private Car Package Policy','Renewal Business','2021-01-03','POOJA KHANNA','AG-127 , SHALIMAR BAGH','NEW DELHI','','','NORTH WEST DELHI',110088,'DELHI','8097690206','8097690206','','mukesh@indicosmic.com',2147483647,0,'DELHI 1','N0347141 || HIMMAT LAL',' HIMMAT LAL',-87,'N0272748','OFFICE NO. 1016-1023, 10TH FLOOR,','DEVIKA TOWER, NEHRU PLACE,','DELHI',110019,'','NEW DELHI',11,'200101','IMD1000006','','UNICORN INSURANCE BROKERS PVT LTD','','1970-01-01','2019-01-04','2020-04-01','DL','DL09CAA4322','2012','2012-12-21',7,'','10','M945646','M495967','HYUNDAI','I20','I20 1.2 MAGNA','Saloon','1197','5','Petrol','Package Policy','DELHI','A','265721','0','0','0','239,149','0','0','0','No','No','0','0','239,149','',0.03447,'8,243','No','50','50','4122','4122','','','','55','','0','55.00','50.00','','1,855','NA','','NA','','294','NA','1,855','3221','','','375','200','0','50','0','3846','5,701','1,026','6,727','9401','','0','0','','','','','','','','','50','',365,'COMPACT','N0272748',NULL,'Priyank Maroo','Delhi 1','Li - Retail Broking','Hot','55.00','50.00','4122','4,121','4,121','7967','1434','',NULL,'NA','NA','NA','NA','NA','Lead Created - Pending for acceptance','LB0008449',14,'Message Sent Successfully','2020-04-03 12:27:38','0',NULL,NULL,1,16,1,NULL,'Upload',NULL,'2020-03-30 16:24:08','0',0,'Outbound',NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `policy_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy_type_master`
--

DROP TABLE IF EXISTS `policy_type_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policy_type_master` (
  `policy_type_id` int unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(150) DEFAULT NULL,
  `label` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`policy_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy_type_master`
--

LOCK TABLES `policy_type_master` WRITE;
/*!40000 ALTER TABLE `policy_type_master` DISABLE KEYS */;
INSERT INTO `policy_type_master` VALUES (1,'new','NEW'),(2,'renewal','RENEW');
/*!40000 ALTER TABLE `policy_type_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_type`
--

DROP TABLE IF EXISTS `product_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_type` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(100) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `lable_code` varchar(100) DEFAULT NULL,
  `alias_product_type_id` int DEFAULT NULL,
  `group_code` varchar(20) DEFAULT NULL,
  `seller_off_group_code` varchar(25) DEFAULT NULL,
  `sub_group_code` varchar(100) DEFAULT NULL,
  `group_lable` varchar(20) DEFAULT NULL,
  `is_motor_vehicle` tinyint(1) DEFAULT '0',
  `home_sort_order` int DEFAULT '1000',
  `quattation_sort_order` int DEFAULT '1000',
  `url` varchar(255) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `icon_image` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `product_type_image` varchar(255) DEFAULT NULL,
  `is_active` tinyint DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_type`
--

LOCK TABLES `product_type` WRITE;
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
INSERT INTO `product_type` VALUES (1,'private_car','Private Car Insurance','',NULL,'private_car','motor','private_car','Car',1,1,1,'private_car/lead-list','',NULL,'assets/img/welcome/car-insurance.png','car/isuzu-img.jpg',1),(2,'bike','Two-wheeler Insurance','',NULL,'bike','motor','bike','Bike',1,2,2,'twowheeler/lead-list','',NULL,'assets/img/welcome/two-wheeler-insurance.png','car/bike.jpg',1),(3,'commercial_taxi_public','Commercial Taxi Public','taxi',1,'commercial','motor','commercial','Commercial',1,3,3,'quotation/commercial-taxi','fa fa-taxi','assets/images/commercial-icons/white/taxi-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(4,'commercial_truck_public','Commercial Truck Public','truck(gccv)-Public',NULL,'commercial','motor','commercial','Commercial',1,4,4,'quotation/commercial-truck','fa fa-truck','assets/images/commercial-icons/white/truck-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(5,'commercial_truck_private','Commercial Truck Private','truck(gccv)',4,'commercial','motor','commercial','Commercial',1,5,5,'quotation/commercial-truck','fa fa-truck','assets/images/commercial-icons/white/truck-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(6,'commercial_bus_public','Commercial Bus','bus(pccv)',NULL,'commercial','motor','commercial','Commercial',1,6,6,'quotation/commercial-bus','fa fa-bus','assets/images/commercial-icons/white/bus-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(7,'commercial_threewheeler_pccv_public','Commercial Threewheeler PCCV','3 wheeler(pccv) 6-17 seater ',NULL,'commercial','motor','three_wheeler','Commercial',1,7,7,'quotation/commercial-3PCCV','fa fa-taxi','assets/images/commercial-icons/white/rickshaw-pccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(8,'commercial_threewheeler_gccv_public ','Commercial Threewheeler GCCV Public','',NULL,'commercial','motor','three_wheeler','Commercial',1,10,10,'quotation/commercial-threewheeler-gccv-private','','assets/images/commercial-icons/white/rickshaw-gccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(9,'commercial_threewheeler_ecart_gccv_public','Commercial Threewheeler Ecart GCCV Public','ecart rickshow(gccv)',NULL,'commercial','motor','three_wheeler','Commercial',1,8,8,'quotation/commercial-ecart-gccv','fa fa-taxi','assets/images/commercial-icons/white/rickshaw-gccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(10,'commercial_threewheeler_gccv_private','Commercial Threewheeler GCCV Private','3 wheeler (gccv)',8,'commercial','motor','three_wheeler','Commercial',1,9,9,'quotation/commercial-3GCCV','fa fa-taxi','assets/images/commercial-icons/white/rickshaw-gccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(11,'commercial_threewheeler_ecart_gccv_private','Commercial Threewheeler Ecart GCCV Private','',9,'commercial','motor','three_wheeler','Commercial',1,11,11,'quotation/commercial-threewheeler-ecart-gccv-private','','assets/images/commercial-icons/white/rickshaw-gccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(12,'commercial_rickshaw_pccv_public','Commercial Rickshaw PCCV Public','rickshow(pccv) 3-6 seater',NULL,'commercial','motor','three_wheeler','Commercial',1,12,12,'quotation/commercial-rickshaw','fa fa-taxi','assets/images/commercial-icons/white/rickshaw-pccv-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(13,'commercial_rickshaw_ecart_pccv_public','Commercial Rickshaw Ecart PCCV Public','ecart rickshow(pccv)',NULL,'commercial','motor','three_wheeler','Commercial',1,13,13,'quotation/commercial-ecart-pccv','fa fa-taxi','assets/images/commercial-icons/white/rickshaw-ecart-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(15,'commercial_miscd_public','Commercial Misc D Public','misc-d',NULL,'commercial','motor','commercial','Commercial',1,1000,1000,'quotation/commercial-miscd','fa fa-truck','assets/images/commercial-icons/white/tractor-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(16,'commercial_trailer_public','Commercial Trailer Private','',NULL,'commercial','motor','','Commercial',0,1000,1000,'quotation/commercial-rickshaw-ecart-pccv','','assets/images/commercial-icons/white/rickshaw-ecart-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(17,'commercial_trailer_private','Commercial Trailer Public','',16,'commercial','motor','commercial','Commercial',1,15,15,'quotation/commercial-trailer','','assets/images/commercial-icons/white/tractor-icon.png','home/icons/commercial-new.png','car/isuzu-img.jpg',0),(18,'commercial_two_wheeler_pcc_public','Commercial Twowheeler PCC Public','',NULL,'commercial','motor','','Commercial',0,1000,1000,'quotation/commercial-rickshaw-ecart-pccv','','assets/images/commercial-icons/white/rickshaw-ecart-icon.png','home/icons/commercial-new.png','car/auto.jpg',0),(19,'travel','Travel Insurance','',NULL,'travel','travel','','Travel',0,17,17,'quotation/travel','',NULL,'home/icons/travel.png',NULL,0),(20,'homeinsurance','Home Insurance','',NULL,'home','home','','',0,19,19,'comingsoon','',NULL,'assets/img/welcome/home-content-insurance.png',NULL,1),(21,'lifeinsurance','Life Insurance','',NULL,'life','life','','Life',0,18,18,'quotation/lifeinsurance','',NULL,'home/icons/life.png',NULL,0),(22,'healthinsurance','Health Insurance','',NULL,'health',NULL,'','Health',0,16,16,'health/lead-list','',NULL,'assets/img/welcome/health-insurance.png',NULL,1),(25,'Health Lead','Health Lead',NULL,NULL,'health',NULL,NULL,NULL,0,1000,1000,'health/lead-list',NULL,NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher_master`
--

DROP TABLE IF EXISTS `publisher_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `source_id` int DEFAULT NULL,
  `publisher_name` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher_master`
--

LOCK TABLES `publisher_master` WRITE;
/*!40000 ALTER TABLE `publisher_master` DISABLE KEYS */;
INSERT INTO `publisher_master` VALUES (1,8,'Facebook');
/*!40000 ALTER TABLE `publisher_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `menu_id` varchar(100) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Admin','18,12,13,15,14,16,4,21,7,10,24,11,25','2018-12-11 08:00:00','2018-12-11 08:00:00'),(2,'Team Leader','1,5,14,11,7,4,24','2018-05-19 10:00:00','2018-12-11 08:00:00'),(3,'Auditor','1,20,11','2018-12-11 10:00:00','2018-12-11 08:00:00'),(4,'Tele Caller','1,2,5,19,11,10,22','2018-12-11 08:00:00','2018-12-11 08:00:00'),(5,'Sales Manager','21,5,7,9,10,11,4,16,1','2018-12-11 08:00:00','2018-12-11 08:00:00');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `source_master`
--

DROP TABLE IF EXISTS `source_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `source_master` (
  `id` int NOT NULL AUTO_INCREMENT,
  `source_name` varchar(100) NOT NULL,
  `status` varchar(10) DEFAULT 'Active',
  `created_on` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `source_master`
--

LOCK TABLES `source_master` WRITE;
/*!40000 ALTER TABLE `source_master` DISABLE KEYS */;
INSERT INTO `source_master` VALUES (1,'Upload','Active','2020-06-18 10:31:18'),(2,'DWH','Active','2020-06-18 10:31:18'),(3,'Customer Portal','Active','2020-06-18 10:31:18'),(4,'Inbound','Active','2020-06-18 10:31:18'),(5,'Chatbot','Active','2020-06-18 10:31:18'),(6,'Whatsapp','Active','2020-06-18 10:31:18'),(7,'IXIGO','Active','2020-07-22 13:51:10'),(8,'Social','Active','2024-07-23 00:00:00');
/*!40000 ALTER TABLE `source_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(25) DEFAULT NULL,
  `lable` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (1,'Open Lead','Open Lead'),(2,'assign_to_sm','Assign To SM'),(3,'save','Save Proposal'),(5,'failed','Failed'),(6,'approved','Approved'),(7,'quote_forward','Save Proposal'),(8,'closed','cancel policy'),(9,'buy_clicked','buy_clicked'),(10,'getquote','getquote'),(11,'cancel_proposal','cancel proposal'),(12,'policy_sold','policy sold'),(13,'breakin','breakin'),(14,'breakin_save','breakin_save'),(15,'policy_type_clicked','policy_type_clicked'),(16,'check_received','Check Received'),(17,'assign_to_tellecaller','Assign To Tellecaller');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_dispositions`
--

DROP TABLE IF EXISTS `sub_dispositions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_dispositions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dispositions_id` int NOT NULL,
  `label` varchar(90) DEFAULT NULL,
  `name` text,
  PRIMARY KEY (`id`),
  KEY `dispositions_id` (`dispositions_id`),
  CONSTRAINT `sub_dispositions_ibfk_1` FOREIGN KEY (`dispositions_id`) REFERENCES `dispositions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_dispositions`
--

LOCK TABLES `sub_dispositions` WRITE;
/*!40000 ALTER TABLE `sub_dispositions` DISABLE KEYS */;
INSERT INTO `sub_dispositions` VALUES (1,1,'Premium received','<div class=\'row\'> \r\n<div id=\'disposition_datetime_box\' class=\'col-md-12\'>\r\n<div class=\'row\'>                                                \r\n<div class=\'col-md-6 lead-info\'>\r\n<div class=\'form-group mb-0\'>\r\n<input type=\'text\' class=\'form-control policy_number\' placeholder=\'Policy Number\' name=\'policy_number\' onkeyup=\'validate_policy_number()\'>   \r\n</div>\r\n<div class=\'errorStatus_policy_number errorStatus\'></div>                                              \r\n</div>\r\n<div class=\'col-md-6 lead-info\'>\r\n<div class=\'form-group mb-0\'>\r\n<input type=\'text\' class=\'form-control payableamount\' placeholder=\'Price\' name=\'payableamount\' onkeyup=\'validate_payableamount()\'>    \r\n</div>  \r\n<div class=\'errorStatus_payableamount errorStatus\'></div>                                                  \r\n</div>\r\n</div>\r\n</div>\r\n</div>'),(2,2,'Abandoned',''),(3,2,'Alt Number Taken','<div class=\'row\'> \r\n<div id=\'disposition_datetime_box\' class=\'col-md-12\'>\r\n<div class=\'row\'>                                                \r\n<div class=\'col-md-12 lead-info\'>\r\n<div class=\'form-group mb-0\'>\r\n<input type=\'text\' class=\'form-control mobile_number2\' placeholder=\'Mobile Number \' name=\'mobile_number2\'>   \r\n</div>\r\n<div class=\'errorStatus_mobile_number2 errorStatus\'></div>                                                  \r\n</div>\r\n                                                 \r\n</div>\r\n</div>\r\n</div>\r\n</div>'),(4,2,'Call back','<div class=\"row\"> <div id=\"disposition_datetime_box\" class=\"col-md-12\">\r\n    <div class=\"row\">                                                \r\n	<div class=\"col-md-6 lead-info\">\r\n	    <div class=\"form-group mb-0\">\r\n		<div class=\"cal-icon\">\r\n		    <input type=\"text\" class=\"form-control datetimepicker checkpick_date\" placeholder=\"Date\" name=\"call_back_date\">   \r\n		</div>  \r\n	    </div>  \r\n	    <div class=\'errorStatus_call_back_date errorStatus\'></div>\r\n	</div>\r\n	<div class=\"col-md-6 lead-info\">\r\n	    <div class=\"form-group mb-0\">\r\n		<div class=\"cal-icon time-icon\">\r\n		    <input type=\"text\" class=\"form-control datetimepicker-time checkpick_time\" placeholder=\"Time\" name=\"call_back_time\">    \r\n		</div>  \r\n	    </div> \r\n	    <div class=\'errorStatus_call_back_time errorStatus\'></div>\r\n	</div>\r\n    </div>\r\n</div></div>'),(5,2,'Call Back By TL','<div class=\"row\"> <div id=\"disposition_datetime_box\" class=\"col-md-12\">\r\n                                            <div class=\"row\">                                                \r\n                                                <div class=\"col-md-6 lead-info\">\r\n                                                    <div class=\"form-group mb-0\">\r\n                                                        <div class=\"cal-icon\">\r\n                                                            <input type=\"text\" class=\"form-control datetimepicker checkpick_date\" placeholder=\"Date\" name=\"call_back_date\">   \r\n                                                        </div>  \r\n                                                    </div>   \r\n						    <div class=\'errorStatus_call_back_date errorStatus\'></div>                                                \r\n                                                </div>\r\n                                                <div class=\"col-md-6 lead-info\">\r\n                                                    <div class=\"form-group mb-0\">\r\n                                                        <div class=\"cal-icon time-icon\">\r\n                                                            <input type=\"text\" class=\"form-control datetimepicker-time checkpick_time\" placeholder=\"Time\" name=\"call_back_time\">    \r\n                                                        </div>  \r\n                                                    </div>  \r\n						    <div class=\'errorStatus_call_back_time errorStatus\'></div>\r\n                                                </div>\r\n                                            </div>\r\n                                        </div></div>'),(6,2,'Cheque Pick up','<div class=\"row\"><div class=\"card-body\" data-select2-id=\"78\">\r\n                                        <hr class=\"mt-0 mb-2\">\r\n                                        <div class=\"row align-items-center\">\r\n                                            \r\n                                            <div class=\"col-md-12 lead-info form-inline\">\r\n                                                <div class=\"custom-control custom-radio my-1 mr-sm-4\">\r\n                                                    <input type=\"radio\" class=\"custom-control-input\" name=\"chequepick-address\" id=\"chequepick_address1\" value=\'chequepick_address1\' checked=\"\" onclick=\"validate_address()\">\r\n                                                    <label class=\"custom-control-label\" for=\"chequepick_address1\">Primary Address</label>\r\n                                                </div>\r\n                                                <div class=\"custom-control custom-radio my-1 mr-sm-4\">\r\n                                                    <input type=\"radio\" class=\"custom-control-input\" name=\"chequepick-address\" id=\"chequepick_address2\" value=\'chequepick_address2\' onclick=\"validate_address()\">\r\n                                                    <label class=\"custom-control-label\" for=\"chequepick_address2\">Custom Address</label>\r\n                                                </div>\r\n                                            </div>\r\n                                            <div id=\"chequepick_address2_form\" class=\"col-md-12\" style=\"display: none;\">\r\n                                                <div class=\"row\">\r\n                                                    <div class=\"col-md-12 lead-info\">\r\n                                                        <div class=\"form-group mb-0\">\r\n                                                            <input type=\"text\" name=\"customer_address_1\" class=\"form-control customer_address_1\" placeholder=\"Enter Address Line 1\">\r\n                                                        </div>\r\n							<div class=\'errorStatus_customer_address_1 errorStatus\' id=\'errorStatus_customer_address_1\'></div>\r\n                                                    </div>\r\n\r\n                                                    <div class=\"col-md-12 lead-info\">\r\n                                                        <div class=\"form-group mb-0\">\r\n                                                            <input type=\"text\" name=\"customer_address_2\" class=\"form-control customer_address_2\" placeholder=\"Enter Address Line 2\">\r\n                                                        </div>\r\n							<div class=\'errorStatus_customer_address_2 errorStatus\' id=\'errorStatus_customer_address_2\'></div>\r\n                                                    </div>  \r\n						    \r\n                                                  \r\n                                                    <div class=\"col-md-6 lead-info\">\r\n                                                        <div class=\"form-group mb-0\">\r\n                                                            <select class=\"form-control input-sm customer_state\" data-select2-id=\"6\" tabindex=\"-1\" aria-hidden=\"true\" name=\"customer_state\">\r\n                                                                <option value=\"\" data-select2-id=\"8\">Select State</option>\r\n                                                                <option value=\"Andhra Pradesh\" data-select2-id=\"90\">Andhra Pradesh</option>\r\n                                                                <option value=\"Arunachal Pradesh\" data-select2-id=\"91\">Arunachal Pradesh</option>\r\n                                                                <option value=\"Assam\" data-select2-id=\"92\">Assam</option>\r\n                                                                <option value=\"Bihar\" data-select2-id=\"93\">Bihar</option>\r\n                                                                <option value=\"Chandigarh\" data-select2-id=\"94\">Chandigarh</option>\r\n                                                                <option value=\"Chhattisgarh\" data-select2-id=\"95\">Chhattisgarh</option>\r\n                                                                <option value=\"Dadra and Nagar Haveli\" data-select2-id=\"96\">Dadra and Nagar Haveli</option>\r\n                                                                <option value=\"Daman and Diu\" data-select2-id=\"97\">Daman and Diu</option>\r\n                                                                <option value=\"Delhi\" data-select2-id=\"98\">Delhi</option>\r\n                                                                <option value=\"Goa\" data-select2-id=\"99\">Goa</option>\r\n                                                                <option value=\"Gujarat\" data-select2-id=\"100\">Gujarat</option>\r\n                                                                <option value=\"Haryana\" data-select2-id=\"101\">Haryana</option>\r\n                                                                <option value=\"Himachal Pradesh\" data-select2-id=\"102\">Himachal Pradesh</option>\r\n                                                                <option value=\"Jammu and Kashmir\" data-select2-id=\"103\">Jammu and Kashmir</option>\r\n                                                                <option value=\"Jharkhand\" data-select2-id=\"104\">Jharkhand</option>\r\n                                                                <option value=\"Karnataka\" data-select2-id=\"105\">Karnataka</option>\r\n                                                                <option value=\"Kerala\" data-select2-id=\"106\">Kerala</option>\r\n                                                                <option value=\"Lakshadweep\" data-select2-id=\"107\">Lakshadweep</option>\r\n                                                                <option value=\"Madhya Pradesh\" data-select2-id=\"108\">Madhya Pradesh</option>\r\n                                                                <option value=\"Maharashtra\" data-select2-id=\"109\">Maharashtra</option>\r\n                                                                <option value=\"Manipur\" data-select2-id=\"110\">Manipur</option>\r\n                                                                <option value=\"Meghalaya\" data-select2-id=\"111\">Meghalaya</option>\r\n                                                                <option value=\"Mizoram\" data-select2-id=\"112\">Mizoram</option>\r\n                                                                <option value=\"Nagaland\" data-select2-id=\"113\">Nagaland</option>\r\n                                                                <option value=\"Orissa\" data-select2-id=\"114\">Orissa</option>\r\n                                                                <option value=\"Pondicherry\" data-select2-id=\"115\">Pondicherry</option>\r\n                                                                <option value=\"Punjab\" data-select2-id=\"116\">Punjab</option>\r\n                                                                <option value=\"Rajasthan\" data-select2-id=\"117\">Rajasthan</option>\r\n                                                                <option value=\"Sikkim\" data-select2-id=\"118\">Sikkim</option>\r\n                                                                <option value=\"Tamil Nadu\" data-select2-id=\"119\">Tamil Nadu</option>\r\n                                                                <option value=\"Tripura\" data-select2-id=\"120\">Tripura</option>\r\n                                                                <option value=\"Uttaranchal\" data-select2-id=\"121\">Uttaranchal</option>\r\n                                                                <option value=\"Uttar Pradesh\" data-select2-id=\"122\">Uttar Pradesh</option>\r\n                                                                <option value=\"West Bengal\" data-select2-id=\"123\">West Bengal</option>\r\n                                                            </select>\r\n                                                        </div>\r\n							<div class=\'errorStatus_customer_state errorStatus\'></div>\r\n                                                    </div>\r\n                                                    <div class=\"col-md-6 lead-info\">\r\n                                                        <div class=\"form-group mb-0\">\r\n                                                            <select class=\"form-control input-sm customer_city\"  name=\"customer_city\">\r\n                                                                <option value=\"\" data-select2-id=\"11\"> Select City</option>\r\n                                                                <option value=\"Mumbai\" data-select2-id=\"84\">Mumbai</option>\r\n                                                                <option value=\"Pune\" data-select2-id=\"85\">Pune</option>\r\n                                                                <option value=\"Nagpur\" data-select2-id=\"86\">Nashik</option>\r\n                                                                <option value=\"Nagpur\" data-select2-id=\"87\">Nagpur</option>\r\n                                                            </select>\r\n                                                        </div>\r\n							<div class=\'errorStatus_customer_city errorStatus\'></div>\r\n                                                    </div>\r\n                                                    <div class=\"col-md-12 lead-info\">\r\n                                                        <div class=\"form-group mb-0\">\r\n                                                            <input type=\"text\" name=\"customer_pincode\" class=\"form-control customer_pincode\" placeholder=\"Enter Pincode\">\r\n                                                        </div>\r\n							<div class=\'errorStatus_customer_pincode errorStatus\'></div>\r\n                                                    </div>\r\n                                                </div>\r\n                                            </div>\r\n                                            <div class=\"col-md-6 lead-info\">\r\n                                                <div class=\"form-group mb-0\">\r\n                                                    <div class=\"cal-icon\">\r\n                                                        <input type=\"text\" class=\"form-control datetimepicker checkpick_date date_call_back\" placeholder=\"Date\" name=\"call_back_date\">    						\r\n                                                    </div>  \r\n                                                </div> \r\n						<div class=\'errorStatus_call_back_date errorStatus\'></div>\r\n                                            </div>\r\n                                            <div class=\"col-md-6 lead-info\">\r\n                                                <div class=\"cal-icon time-icon\">\r\n													<input type=\"text\" class=\"form-control datetimepicker-time checkpick_time time_call_back\" placeholder=\"Time\" name=\"call_back_time\">\r\n												</div>  \r\n                                                <div class=\'errorStatus_call_back_time errorStatus\'></div>                                                 \r\n                                            </div>\r\n                                         \r\n                                        </div>\r\n                                    </div>\r\n                                    </div>'),(7,2,'Customer hung up',''),(8,2,'Customer Not Available',''),(9,2,'Customer Want Discount',''),(10,2,'Customer Want To Increase IDV',''),(11,2,'Inspection',''),(12,2,'Not Sure To Renewed With From',''),(13,2,'Payu Link Send',''),(14,2,'Policy Holder not available in business hours',''),(15,2,'Policy Holder out of station',''),(16,2,'Promise to Pay',''),(17,2,'Renewed With showroom',''),(18,2,'Want To Renew from  LGI Branch',''),(19,3,'Engage',''),(20,3,'Not Reachable',''),(21,3,'Ringing',''),(22,3,'Stale',''),(23,3,'Switched Off',''),(24,3,'Test Call',''),(25,3,'Number not in service',''),(26,3,'Call disconnected',''),(27,5,'Decline Case',''),(28,5,'Vehicle Sold',''),(29,5,'Abusive Call',''),(30,5,'Agent Contact Number',''),(31,5,'Already Renewed',''),(32,5,'Customer not interested',''),(33,5,'Do not call',''),(34,5,'Lost - Better Offer',''),(35,5,'Lost - Not Happy With Service',''),(36,5,'Lost - Renewed with other Company',''),(37,5,'Renewed with our Company',''),(38,5,'Want To Renewed With Agent',''),(39,5,'Lost- claim issue',''),(40,6,'Language barrier',''),(41,7,'Policy already renewed',''),(42,8,'Discount Issue',''),(43,8,'Claim Issue',''),(44,8,'LR Issue',''),(45,8,'Vehicle Sold',''),(46,8,'Not Contactable',''),(47,8,'Payout Issue',''),(48,8,'Channel closed/not doing business with us',''),(49,8,'Other',''),(51,4,'Declined Case',NULL),(52,4,'Vehicle Sold',NULL);
/*!40000 ALTER TABLE `sub_dispositions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `vertical_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=311 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES (1,1,1),(2,16,1),(3,33,1),(4,37,1),(5,48,1),(6,49,1),(7,50,1),(8,52,1),(9,57,1),(10,59,1),(11,77,1),(12,78,1),(13,79,1),(14,80,1),(15,81,1),(16,82,1),(17,83,1),(18,84,1),(19,85,1),(20,86,1),(21,87,1),(22,88,1),(23,89,1),(24,90,1),(25,91,1),(26,92,1),(27,93,1),(28,94,1),(29,95,1),(30,96,1),(31,97,1),(32,98,1),(33,99,1),(34,100,1),(35,101,1),(36,102,1),(37,103,1),(38,104,1),(39,105,1),(40,106,1),(41,107,1),(42,108,1),(43,109,1),(44,110,1),(45,111,1),(46,112,1),(47,113,1),(48,114,1),(49,115,1),(50,116,1),(51,117,1),(52,118,1),(53,119,1),(54,120,1),(55,121,1),(56,122,1),(57,123,1),(58,124,1),(59,125,1),(60,126,1),(61,127,1),(62,128,1),(63,129,1),(64,130,1),(65,131,1),(66,132,1),(67,133,1),(68,134,1),(69,135,1),(70,136,1),(71,137,1),(72,138,1),(73,139,1),(74,140,1),(75,141,1),(76,142,1),(77,143,1),(78,144,1),(79,145,1),(80,146,1),(81,147,1),(82,148,1),(83,149,1),(84,150,1),(85,151,1),(86,152,1),(87,153,1),(88,154,1),(89,155,1),(90,156,1),(91,157,1),(92,158,1),(93,159,1),(94,160,1),(95,161,1),(96,162,1),(97,163,1),(98,164,1),(99,165,1),(100,166,1),(101,167,1),(102,168,1),(103,169,1),(104,170,1),(105,171,1),(106,172,1),(107,173,1),(108,174,1),(109,175,1),(110,176,1),(111,177,1),(112,178,1),(113,179,1),(114,180,1),(115,181,1),(116,182,1),(117,183,1),(118,184,1),(119,185,1),(120,186,1),(121,187,1),(122,188,1),(123,189,1),(124,190,1),(125,191,1),(126,192,1),(127,193,1),(128,194,1),(129,195,1),(130,196,1),(131,197,1),(132,198,1),(133,199,1),(134,200,1),(135,201,1),(136,202,1),(137,203,1),(138,204,1),(139,205,1),(140,206,1),(141,207,1),(142,208,1),(143,209,1),(144,210,1),(145,211,1),(146,212,1),(147,213,1),(148,214,1),(149,215,1),(150,216,1),(151,217,1),(152,218,1),(153,219,1),(154,220,1),(155,221,1),(156,222,1),(157,223,1),(158,224,1),(159,225,1),(160,226,1),(161,227,1),(162,228,1),(163,229,1),(164,230,1),(165,231,1),(166,232,1),(167,233,1),(168,234,1),(169,235,1),(170,236,1),(171,237,1),(172,238,1),(173,239,1),(174,240,1),(175,241,1),(176,242,1),(177,243,1),(178,244,1),(179,245,1),(180,246,1),(181,247,1),(182,248,1),(183,249,1),(184,250,1),(185,251,1),(186,252,1),(187,253,1),(188,254,1),(189,255,1),(190,256,1),(191,257,1),(192,258,1),(193,259,1),(194,260,1),(195,261,1),(196,262,1),(197,263,1),(198,264,1),(199,265,1),(200,266,1),(201,267,1),(202,268,1),(203,269,1),(204,270,1),(205,271,1),(206,272,1),(207,273,1),(208,274,1),(209,275,1),(210,276,1),(211,277,1),(212,278,1),(213,279,1),(214,280,1),(215,281,1),(216,282,1),(217,283,1),(218,284,1),(219,285,1),(220,286,1),(221,287,1),(222,288,1),(223,289,1),(224,290,1),(225,291,1),(226,292,1),(227,293,1),(228,294,1),(229,295,1),(230,296,1),(231,297,1),(232,298,1),(233,299,1),(234,300,1),(235,301,1),(236,302,1),(237,303,1),(238,304,1),(239,305,1),(240,306,1),(241,307,1),(242,308,1),(243,309,1),(244,310,1),(245,311,1),(246,312,1),(247,313,1),(248,314,1),(249,315,1),(250,316,1),(251,317,1),(252,318,1),(253,319,1),(254,320,1),(255,321,1),(256,322,1),(257,323,1),(258,324,1),(259,325,1),(260,326,1),(261,327,1),(262,328,1),(263,329,1),(264,330,1),(265,331,1),(266,332,1),(267,338,1),(268,339,1),(269,340,1),(270,341,1),(271,342,1),(272,345,1),(273,346,1),(274,347,1),(275,15,1),(276,26,1),(277,29,1),(278,34,1),(279,38,1),(280,41,1),(281,44,1),(282,47,1),(283,53,1),(284,343,1),(285,25,1),(286,35,1),(287,39,1),(288,54,1),(289,60,1),(290,344,1),(291,17,1),(292,18,1),(293,27,1),(294,28,1),(295,30,1),(296,31,1),(297,32,1),(298,42,1),(299,43,1),(300,45,1),(301,46,1),(302,51,1),(303,55,1),(304,58,1),(305,14,1),(306,36,1),(307,40,1),(308,56,1),(309,61,1),(310,62,1);
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_code` varchar(10) DEFAULT NULL,
  `code` varchar(255) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `otp` varchar(4) DEFAULT NULL,
  `otp_valid_upto` datetime DEFAULT NULL,
  `login_attempts` int DEFAULT '0',
  `lock_upto` datetime DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `mobile_no` varchar(15) NOT NULL,
  `name` varchar(100) NOT NULL,
  `role_id` int NOT NULL DEFAULT '2',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `is_active` varchar(100) NOT NULL DEFAULT '1',
  `is_deleted` int NOT NULL DEFAULT '0',
  `deleted_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ROLE_ID` (`role_id`),
  CONSTRAINT `FK_ROLE_ID` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=348 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,NULL,'N0262177','Radhika','kumari.jayashree@indicosmic.com','fbac1cd222247ace59d8952fbbe7b0a4','7007','2023-09-05 18:19:11',0,NULL,'kumari.jayashree@indicosmic.com','','',1,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(14,NULL,'N0272748','Tabrej','kumari.jayashree@indicosmic.com','8a82fa6143de68112d715e69c67bf0e1','9367','2023-08-17 16:25:41',1,NULL,'kumari.jayashree@indicosmic.com','','',5,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(15,NULL,'N1516173','Nilesh','kumari.jayashree@indicosmic.com','a553cf3fcf3ab43d94e4f1844ef9e6f8','7997','2023-08-16 18:36:11',0,NULL,'Nilesh.Pathak@libertyinsurance.in','','',2,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(16,NULL,'N0349091','0_old','kumari.jayashree@indicosmic.com','75d23af433e0cea4c0e45a56dba18b30','9469','2024-06-25 14:52:00',0,NULL,'kumari.jayashree@indicosmic.com','9869043056','',1,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(17,'0101','N1500199','Gaurang Patel','kumari.jayashree@indicosmic.com','','9208','2023-08-16 18:49:32',0,NULL,'kumari.jayashree@indicosmic.com','','',4,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(18,NULL,'O1001234','Amit','kumari.jayashree@indicosmic.com','fbac1cd222247ace59d8952fbbe7b0a4','1460','2023-10-10 15:12:34',0,NULL,'amitdeep@indicosmic.com','','',4,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(25,NULL,'12345','Auditor','','','3541','2021-02-03 13:38:31',0,NULL,'mukesh@indicosmic.com','','',3,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(26,NULL,'N0347133','Bharat Rai','','','9029','2022-02-07 22:47:44',0,NULL,'bharat.rai@libertyinsurance.in','','',2,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(27,NULL,'N1512567','Amol Gaikwad','kumari.jayashree@indicosmic.com','','2501','2023-10-10 16:54:40',0,NULL,'amol.gaikwad@libertyinsurance.in','','',4,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(28,NULL,'N1111112','TestTest','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'testing@test.com','','',4,'1999-12-31 18:30:00','1999-12-31 18:30:00','1',0,'1999-12-31 18:30:00'),(29,NULL,'PA000000','Pandurang Aglave','','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',2,NULL,NULL,'1',0,NULL),(30,NULL,'T767676760','TestTele','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',4,NULL,NULL,'1',0,NULL),(31,NULL,'123456','Test Anu','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'testingindi1@gmail.com','','',4,NULL,NULL,'1',0,NULL),(32,NULL,'N022337848','Testjen','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'jentestingindi123@gmail.com','','',4,NULL,NULL,'1',0,NULL),(33,NULL,'T767676761','TestAdmin','','','9910','2021-07-24 22:42:21',0,NULL,'testindigiib@gmail.com','','',1,NULL,NULL,'1',0,NULL),(34,NULL,'6789678900','testjen1','','',NULL,NULL,NULL,NULL,'jentestingindi123@gmail.com','','',2,NULL,NULL,'1',0,NULL),(35,NULL,'567899','testjen2','','',NULL,NULL,NULL,NULL,'jentestingindi123@gmail.com','','',3,NULL,NULL,'1',0,NULL),(36,NULL,'6789900','testjen3','','',NULL,NULL,NULL,NULL,'jentestingindi123@gmail.com','','',5,NULL,NULL,'1',0,NULL),(37,NULL,'np890765','testjen4','','',NULL,NULL,NULL,NULL,'jentestingindi123@gmail.com','','',1,NULL,NULL,'1',0,NULL),(38,NULL,'T767676762','TestTeamLead','','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',2,NULL,NULL,'1',0,NULL),(39,NULL,'T767676763','TestAuditor','','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',3,NULL,NULL,'1',0,NULL),(40,NULL,'T767676764','TestSalesManager','','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',5,NULL,NULL,'1',0,NULL),(41,NULL,'N15002923','team22','','',NULL,NULL,NULL,NULL,'team22@gmail.com','','',2,NULL,NULL,'1',0,NULL),(42,NULL,'N15002999','dinesh','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'kldpsngh700@gmail.com','','',4,NULL,NULL,'1',0,NULL),(43,NULL,'N15002989','testing','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'kldpsngh700@gmail.com','','',4,NULL,NULL,'1',0,NULL),(44,NULL,'N150029967','mahesh','','',NULL,NULL,NULL,NULL,'kldpsngh700@gmail.com','','',2,NULL,NULL,'1',0,NULL),(45,NULL,'T767676765','Testms1','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',4,NULL,NULL,'1',0,NULL),(46,NULL,'202020','TestID','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',4,NULL,NULL,'1',0,NULL),(47,NULL,'202021','Test ID 2','','',NULL,NULL,NULL,NULL,'testindigiib@gmail.com','','',2,NULL,NULL,'1',0,NULL),(48,NULL,'','dadadad','','','7914','2023-09-13 12:15:30',0,NULL,'dsd@fsfsf.com','','',1,NULL,NULL,'1',0,NULL),(49,NULL,'','dadadad','','',NULL,NULL,NULL,NULL,'dsd@fsfsf.com','','',1,NULL,NULL,'1',0,NULL),(50,NULL,'T767676766','HealthAdmin','','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',1,NULL,NULL,'1',0,NULL),(51,NULL,'35871799571','fafasfs','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'rhaeh2EE.COM','','',4,NULL,NULL,'0',0,NULL),(52,NULL,'T767676770','test111','','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',1,NULL,NULL,'1',0,NULL),(53,NULL,'T767676771','test112','','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',2,NULL,NULL,'1',0,NULL),(54,NULL,'T767676772','test113','','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',3,NULL,NULL,'1',0,NULL),(55,NULL,'T767676773','test113','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',4,NULL,NULL,'1',0,NULL),(56,NULL,'T767676774','test113','','',NULL,NULL,NULL,NULL,'moutushi.sen@mysolutionnow.com','','',5,NULL,NULL,'1',0,NULL),(57,NULL,'P123456','Pritish','','',NULL,NULL,NULL,NULL,'pritish@gmail.com','','',1,NULL,NULL,'1',0,NULL),(58,NULL,'B123456','Bipin','kumari.jayashree@indicosmic.com','',NULL,NULL,NULL,NULL,'bipin@gmail.com','','',4,NULL,NULL,'1',0,NULL),(59,NULL,'N6789456','Testuser','','',NULL,NULL,0,NULL,'testuser@gmail.com','','',1,NULL,NULL,'1',0,NULL),(60,NULL,'N6780873806','TestAuditor','','',NULL,NULL,0,NULL,'testaudit@gmail.com','','',3,NULL,NULL,'1',0,NULL),(61,NULL,'N0331408','Sunil Sant','','','7316','2021-07-24 14:35:14',0,NULL,'','','',5,NULL,NULL,'1',0,NULL),(62,NULL,'N0278968','Somasundaram J','','','9185','2021-10-09 12:14:43',0,NULL,'','','',5,NULL,NULL,'1',0,NULL),(77,NULL,'N0350373','Ahsan Manzar','','','7629','2020-10-22 22:24:52',0,NULL,'','','',1,'2020-10-22 09:42:48','2020-10-22 09:42:48','1',0,NULL),(78,NULL,'N0338219','Ramanjaneyulu DV','','','2034','2020-10-22 21:18:29',0,NULL,'','','',1,'2020-10-22 09:42:48','2020-10-22 09:42:48','1',0,NULL),(79,NULL,'N0355209','Santosh Jadhav','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:46','2020-10-23 00:33:46','1',0,NULL),(80,NULL,'N0346729','Srinivas Nekkanti','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:46','2020-10-23 00:33:46','1',0,NULL),(81,NULL,'N0261898','Vijayendra Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:46','2020-10-23 00:33:46','1',0,NULL),(82,NULL,'N0303795','Pabitra Chakraborty','','','6962','2021-09-01 16:14:19',0,NULL,'','','',1,'2020-10-23 00:33:46','2020-10-23 00:33:46','1',0,NULL),(83,NULL,'N0319395','Vikas Raghuvanshi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:46','2020-10-23 00:33:46','1',0,NULL),(84,NULL,'N0360625','Dharmesh Shah','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(85,NULL,'N0295080','Malkeet Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(86,NULL,'N1500225','Birendra Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(87,NULL,'N1511324','Sandip Kumar Paswan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(88,NULL,'N1513862','Amit Gupta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(89,NULL,'N1531346','Suresh Jadhav','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(90,NULL,'N0347136','Sunil Kamble','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(91,NULL,'N0261900','Suresh Joshi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(92,NULL,'N0348252','Sangameshwaran Jeganathan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(93,NULL,'N0367711','Nilesh Sadawarte','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(94,NULL,'N0265055','Sumit Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(95,NULL,'N0304089','Sharadkumar Srivastava','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(96,NULL,'N0277770','Sumit Wable','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(97,NULL,'N0346679','Rama Giridhar T','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(98,NULL,'N0350376','Shankar R','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(99,NULL,'N0366166','Dilipkumar Tiwari','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(100,NULL,'N0319837','Debanjan Chatterjee','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(101,NULL,'N0329961','Dharmendra Choudhary','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(102,NULL,'N1506162','Pushkar Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(103,NULL,'N0364204','Prashant Acharya','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(104,NULL,'N0353191','Saraskumar Gour','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(105,NULL,'N0343732','Alok Jain','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(106,NULL,'N0348581','Tusher Roy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(107,NULL,'N0331024','Manwinder Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(108,NULL,'N0276320','Nabajyoti Das','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(109,NULL,'N0345833','Ajay Mehta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(110,NULL,'N0295216','Balasubramanian T','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(111,NULL,'N1500213','Rajesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(112,NULL,'N1510249','Desh Deepak Srivastava','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(113,NULL,'N1516611','Manish choudhary','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(114,NULL,'N1519753','Yogesh Tandulwadkar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(115,NULL,'N0346732','Vivek Murugesan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(116,NULL,'N0367580','Sumit Bothara','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(117,NULL,'N0260067','Prasanth Prem','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(118,NULL,'N0277024','Krishnendu Mukherjee','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(119,NULL,'N0339018','Kunal Shukla','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:47','2020-10-23 00:33:47','1',0,NULL),(120,NULL,'N0357797','Gaurav Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(121,NULL,'N0294521','Ankit kumar Gupta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(122,NULL,'N0257527','Kamal Gupta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(123,NULL,'N0245153','Amit Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(124,NULL,'N0349095','Joginder Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(125,NULL,'N1500171','Sanjay Kumar Nandan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(126,NULL,'N1508264','Devi Prasad Rath','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(127,NULL,'N1513595','Yogesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(128,NULL,'N1515447','Kabir Ahmed Barbhuiya','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(129,NULL,'N1522564','Shashidhar A M','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(130,NULL,'N1524453','Pravin Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(131,NULL,'N0338119','Ashutosh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(132,NULL,'N0258436','Devender Singla','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(133,NULL,'N0244591','Ashish S Dogra','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(134,NULL,'N0297070','Harmeet Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(135,NULL,'N0306578','Anurag Bondre','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(136,NULL,'N0292534','Vikash Shankar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(137,NULL,'N0353679','Sudeep Roy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(138,NULL,'N0291562','Vivek Upadhyay','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(139,NULL,'N1504875','Khem Raj','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(140,NULL,'N1504678','J Dhanasekar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(141,NULL,'N1508210','Aniket Salunkhe','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(142,NULL,'N1511122','Mukesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(143,NULL,'N1520044','Pranab Sarkar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(144,NULL,'N1523956','Ramakant Prabhale','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(145,NULL,'N1526545','Pranjit  Saikia','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(146,NULL,'N1529433','Sam Sathesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(147,NULL,'N1529427','Subhajit Nandy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(148,NULL,'N1533555','Sandip Dey','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(149,NULL,'N1532337','Abhijit Thete','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(150,NULL,'N0231670','Satish T J','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(151,NULL,'N0278541','Farid Ahmed','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(152,NULL,'N0358942','Madhurjya Bharali','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(153,NULL,'N0330676','Ritesh Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(154,NULL,'N0260758','Sandeep Shri Krishan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:48','2020-10-23 00:33:48','1',0,NULL),(155,NULL,'N0338541','Azhar Syed','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(156,NULL,'N0259677','Lijo Joseph','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(157,NULL,'N0328997','Satyanand Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(158,NULL,'N0306963','Amit Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(159,NULL,'N0291773','Raman Kumar Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(160,NULL,'N0358274','Rahul Borah','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(161,NULL,'N0306632','Mohammed Khadermiya','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(162,NULL,'N0245056','Priyank Maroo','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(163,NULL,'N0263192','Sunil Sindhu','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(164,NULL,'N0260439','Jaseela Ranjith','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(165,NULL,'N1500184','Bikash Brahmachari','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(166,NULL,'N0346734','SanjivaKumar Srivastava','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(167,NULL,'N1528526','Sarfaraz Vhora','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(168,NULL,'N1530594','Amitabha Chatterjee','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(169,NULL,'N1530220','Kunal Mangeshkar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(170,NULL,'N0341557','Deepak Bhatt','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(171,NULL,'N0246483','Vikram Singh Rao','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(172,NULL,'N0346733','Ashish Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(173,NULL,'N0283426','Vikrant Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(174,NULL,'N0348068','Ritika Sambyal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(175,NULL,'N0270318','Praveenchand SV','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(176,NULL,'N1502645','Jitendra pratap Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(177,NULL,'N1512243','Varinder Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(178,NULL,'N1523750','Atul Chaudhari','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(179,NULL,'N1527665','Shivanand Nagamoti','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(180,NULL,'N0261901','Nareshkumar Kacham','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(181,NULL,'N0286656','Balakrishnan E','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(182,NULL,'N0295921','Ganesh Pedhadiya','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(183,NULL,'N0338730','Amitkumar Barot','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(184,NULL,'N0358941','Saurav Talukdar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(185,NULL,'N0294617','Satish Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(186,NULL,'N0272548','NemaliReddy Putluri','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(187,NULL,'N0365022','Raymond Shanpru','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(188,NULL,'N1500219','Sangram Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(189,NULL,'N1507339','Nirnimesh Anand','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(190,NULL,'N1508260','Tarun Kumar Das','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(191,NULL,'N1524213','Praveen Yellutla','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:49','2020-10-23 00:33:49','1',0,NULL),(192,NULL,'N1534349','Dipanwita Bose','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(193,NULL,'N0343543','Kumaraswamy NR','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(194,NULL,'N0257524','Pavan Kumar Chittluri','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(195,NULL,'N0273896','Kaushik Mitra','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(196,NULL,'N0257522','Saarik Pramanik','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(197,NULL,'N0343542','Kushal Kalita','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(198,NULL,'N0260442','Pratap Paranjape','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(199,NULL,'N0292606','Sanjay Bendwal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(200,NULL,'N0290688','Vijay Dixit','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(201,NULL,'N1500005','Nitin Khyade','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(202,NULL,'N1502058','Arun Ahuja','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(203,NULL,'N1509711','Pappu Solankar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(204,NULL,'N1516178','Niraj Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(205,NULL,'N1516937','Thamizh Selvan E','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(206,NULL,'N1522897','Suraj Hajare','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(207,NULL,'N1522221','Prashant Nagmote','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(208,NULL,'N1533936','Anup Kumar Mondal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(209,NULL,'N1534304','Sourav Dey','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(210,NULL,'N0296844','Rakesh Sudan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(211,NULL,'N0310221','Morris Joseph','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(212,NULL,'N0337727','Rahul Nair','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(213,NULL,'N1501274','Senthil Velavan V','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(214,NULL,'N1502647','Ganesh Shirsat','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(215,NULL,'N1501183','Sanjib Sarkar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(216,NULL,'N1501276','Pankaj Joshi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(217,NULL,'N1508262','Brimbel A Simon','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(218,NULL,'N1513128','G Senthil Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(219,NULL,'N1513783','Niteesh John','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(220,NULL,'N1518739','Kishor Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(221,NULL,'N1518376','Deepak Kumar Mishra','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(222,NULL,'N0362075','Kishore T','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(223,NULL,'N0320942','Sathiyanarayanan R','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(224,NULL,'N0229533','Arvind V','','','3133','2020-10-23 12:52:54',0,NULL,'','','',1,'2020-10-23 00:33:50','2020-10-23 00:33:50','1',0,NULL),(225,NULL,'N0261896','Naushad PA','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(226,NULL,'N0361301','Naveenkumar Valupadasu','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(227,NULL,'N0232395','Ravinder Reddy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(228,NULL,'N0303845','Manish Chhabra','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(229,NULL,'N0338116','Pusp Jamla','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(230,NULL,'N0325549','Pankaj Upadhyay','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(231,NULL,'N1506167','Shashi Ranjan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(232,NULL,'N1503044','Irfankhan Luhar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(233,NULL,'N1506639','Manish Gupta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(234,NULL,'N1506958','Anand Kumar Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(235,NULL,'N1512000','Vinit Tawani','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(236,NULL,'N1512779','Mandeep Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(237,NULL,'N1521642','Vibhash Srivastava','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(238,NULL,'N1520293','Vijayan R','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(239,NULL,'N1519697','Sagar Bhade','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(240,NULL,'N0310350','Roken Chettri','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(241,NULL,'N0246490','Mukesh Sinha','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(242,NULL,'N0230888','T. Jayaprakash Reddy','','','2873','2020-10-23 12:30:53',0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(243,NULL,'N0360997','Rahul Shukla','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(244,NULL,'N0328537','Mohit Swani','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(245,NULL,'N0352314','Dinesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(246,NULL,'N0230571','Vinay P','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(247,NULL,'N0352111','Saminathan R','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(248,NULL,'N0255546','Satish Padmanabhan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(249,NULL,'N0366165','Pranab Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(250,NULL,'N0312312','Navajyoti Kalita','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(251,NULL,'N0354944','Devnarayan Dubey','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(252,NULL,'N0362549','Sourav Das','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(253,NULL,'N1500010','Anurudh Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(254,NULL,'N1500207','Nandkumar Gamepatil','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(255,NULL,'N1506954','Sachin Mali','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(256,NULL,'N1508266','Satya Ojha','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(257,NULL,'N1503125','Sushant Jogdand','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(258,NULL,'N0330750','Bimal Das','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(259,NULL,'N0328801','Vaibhav Nigam','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(260,NULL,'N0315900','Sonu Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(261,NULL,'N0305616','Dayaneswaran K','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:51','2020-10-23 00:33:51','1',0,NULL),(262,NULL,'N0243880','Somraj Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(263,NULL,'N0278963','Sunil Kumar Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(264,NULL,'N0322716','Tanmay Singhal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(265,NULL,'N0230866','Ashvin Khandhadia','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(266,NULL,'N1501437','Debashis Dutta','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(267,NULL,'N1501912','Pravin Gore','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(268,NULL,'N1507082','Suheel Nabi Kanth','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(269,NULL,'N1506160','Pandurang Jogdand','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(270,NULL,'N1514270','Vikrant Joshi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(271,NULL,'N1514832','Kanakagiri Mallikarjuna','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(272,NULL,'N1516373','Amol Dhavade','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(273,NULL,'N1521794','Sathya R','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(274,NULL,'N1523894','N R Darshan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(275,NULL,'N1527552','Vishal Sinha','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(276,NULL,'N0361887','Manish Chadha','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(277,NULL,'N0318509','Sartaj Shaikh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(278,NULL,'N0291875','Kashyap Kapoor','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(279,NULL,'N0284354','Sunil Panchal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(280,NULL,'N1508124','Manoj Kumar TP','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(281,NULL,'N1509456','Anil Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(282,NULL,'N1508881','Sandip Roy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(283,NULL,'N1518491','Valmiki Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(284,NULL,'N0319564','Binay kumar Karn','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(285,NULL,'N1524649','Abhijeet Naruka','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(286,NULL,'N0337647','Lekhendrajit Singh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(287,NULL,'N0329300','Vidyasagar Duggireddy','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(288,NULL,'N0368018','Syediftikhar Haque','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(289,NULL,'N0282940','Ram Niranjan','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(290,NULL,'N1502639','Deepak Shivange','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(291,NULL,'N1508143','Sanju Kumar Sahu','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(292,NULL,'N1514241','Tapas Ghosh','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:52','2020-10-23 00:33:52','1',0,NULL),(293,NULL,'N1512002','Mohammad Riyazuddin','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(294,NULL,'N1525830','Pramod Minajagi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(295,NULL,'N1527065','Rohit Jain','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(296,NULL,'N1531755','Reshmi Nair','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(297,NULL,'N0267468','Muthuraman S','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(298,NULL,'N0366836','Vivek Sawal','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(299,NULL,'N0367241','Kiran Rao','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(300,NULL,'N0278542','Amit Narula','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(301,NULL,'N0277025','Manish Gera','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(302,NULL,'N0286990','Shailender Singh','','','2668','2022-01-29 09:50:27',0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(303,NULL,'N0328640','Ajay Sharma','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(304,NULL,'N0229930','Nitin Thakur','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(305,NULL,'N1500180','Bijukumaranpillai V','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(306,NULL,'N1506535','Pawan Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(307,NULL,'N1510221','Rakesh Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(308,NULL,'N1523619','Navneet Sahu','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(309,NULL,'N1525536','Prabhjot Kaur','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(310,NULL,'N1527758','Vinod V P','','','3700','2020-10-23 12:17:43',0,NULL,'','','',1,'2020-10-23 00:33:53','2020-10-23 00:33:53','1',0,NULL),(311,NULL,'N1510799','M Naveen Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(312,NULL,'N0236563','Anshal Jain','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(313,NULL,'N0253629','Bikram Chakrabarti','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(314,NULL,'N0278329','Sushanta Kumar Swain','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(315,NULL,'N1525603','Kaushik Bhattacharjee','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(316,NULL,'N0229539','Anurag Kumar','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(317,NULL,'N0229545','Manish Kotian','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(318,NULL,'N1504685','Rajavali H M','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(319,NULL,'N0304129','Kalyan Kundu','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:04','2020-10-23 00:57:04','1',0,NULL),(320,NULL,'N0362550','Rajesh Nagasampagi','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:05','2020-10-23 00:57:05','1',0,NULL),(321,NULL,'N0294767','Rejith P','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:05','2020-10-23 00:57:05','1',0,NULL),(322,NULL,'N0360228','Tilok Barman','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:05','2020-10-23 00:57:05','1',0,NULL),(323,NULL,'N1511998','Krishna Gumaste','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:05','2020-10-23 00:57:05','1',0,NULL),(324,NULL,'N1517027','Muzzammil  C','','',NULL,NULL,0,NULL,'','','',1,'2020-10-23 00:57:05','2020-10-23 00:57:05','1',0,NULL),(325,NULL,'N1558488','Chetan Kensur','','',NULL,NULL,0,NULL,'jayshree12305@gmail.com','','',1,NULL,NULL,'0',0,NULL),(326,NULL,'N0262170','testing','','','2594','2022-06-14 11:25:40',0,NULL,'','','',1,NULL,NULL,'1',0,NULL),(327,NULL,'N1608059','Gulzar','','','2342','2023-09-13 17:22:04',0,NULL,'test@lgi.libertyinsurance.in','','',1,NULL,NULL,'1',0,NULL),(328,NULL,'kjk','kjhj','','',NULL,NULL,0,NULL,'jhkj','','',1,NULL,NULL,'1',0,NULL),(329,NULL,'jjjhjhj','jjhjhk','','',NULL,NULL,0,NULL,'test@','','',1,NULL,NULL,'1',0,NULL),(330,NULL,'jjk','lklk','','',NULL,NULL,0,NULL,'llkkjlk','','',1,NULL,NULL,'1',0,NULL),(331,NULL,'b','a','','',NULL,NULL,0,NULL,']','','',1,NULL,NULL,'1',0,NULL),(332,NULL,'sa','fd','','',NULL,NULL,0,NULL,']','','',1,NULL,NULL,'1',0,NULL),(338,NULL,'098765','kljikjlkjkl','','',NULL,NULL,0,NULL,']','','',1,NULL,NULL,'1',0,NULL),(339,NULL,'jh','jhg','','',NULL,NULL,0,NULL,'jhjh','','',1,NULL,NULL,'1',0,NULL),(340,NULL,'kjh','lkijh','','',NULL,NULL,0,NULL,'test))','','',1,NULL,NULL,'1',0,NULL),(341,NULL,'fdfdffdfd','jayshree','','',NULL,NULL,0,NULL,'dfdf','','',1,NULL,NULL,'1',0,NULL),(342,NULL,'N16080590','ddsd','','',NULL,NULL,0,NULL,'admin_master@opnrsa.com','','',1,NULL,NULL,'1',0,NULL),(343,NULL,'N160805990876543','rtrytrdfgd@#','','',NULL,NULL,0,NULL,'9876098765trgfvbnm,','','',2,NULL,NULL,'1',0,NULL),(344,NULL,'N160805909876543w','4$','','',NULL,NULL,0,NULL,'admin_master@opnrsa.com','','',3,NULL,NULL,'1',0,NULL),(345,NULL,'N1608059076','jayshree','','',NULL,NULL,0,NULL,'jayshree12305@gmail.com','','',1,NULL,NULL,'1',0,NULL),(346,NULL,'N1643946','jayshree()','','',NULL,NULL,0,NULL,'11111','','',1,NULL,NULL,'1',0,NULL),(347,NULL,'l','kj','','',NULL,NULL,0,NULL,',','','',1,NULL,NULL,'1',0,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-23 18:37:14
