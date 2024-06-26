CREATE DATABASE  IF NOT EXISTS `reservas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `reservas`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: reservas
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pistas`
--

DROP TABLE IF EXISTS `pistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pistas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `codigo` varchar(10) NOT NULL,
  `tipo` enum('tenis','futbol','baloncesto','ping-pong') DEFAULT NULL,
  `precio` float NOT NULL DEFAULT '0',
  `id_polideportivo` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo` (`codigo`),
  KEY `id_polideportivo` (`id_polideportivo`),
  CONSTRAINT `pistas_ibfk_1` FOREIGN KEY (`id_polideportivo`) REFERENCES `polideportivos` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pistas`
--

LOCK TABLES `pistas` WRITE;
/*!40000 ALTER TABLE `pistas` DISABLE KEYS */;
INSERT INTO `pistas` VALUES (1,'NVAW5851','baloncesto',10,13),(2,'SKRB6837','tenis',10,4),(3,'OSDW1028','futbol',10,18),(4,'ISUM9115','baloncesto',10,27),(5,'RAUE1955','tenis',110,26),(6,'YLOC9758','tenis',110,3),(7,'VNPE8442','tenis',110,21),(8,'OEYW9491','futbol',0,11),(9,'KKSR8766','futbol',0,21),(10,'CEGB4252','futbol',0,28),(11,'MIFY5582','futbol',0,31),(12,'TJQD9919','baloncesto',0,16),(13,'OZRQ7865','tenis',110,22),(14,'LSNF7568','futbol',0,3),(15,'MUVF2634','baloncesto',0,2),(16,'OPTY1027','tenis',110,25),(17,'TKUX0465','baloncesto',0,15),(18,'TJKE8777','tenis',110,19),(19,'BNQA5990','tenis',110,14),(20,'JKIS1458','futbol',0,29),(21,'SPST7163','baloncesto',0,9),(22,'SWEE9627','tenis',110,1),(23,'WULM9254','ping-pong',0,27),(24,'KMRJ2670','ping-pong',0,26),(25,'PUQX9051','futbol',0,1),(26,'XOOO6935','baloncesto',0,4),(27,'RYLX1194','baloncesto',0,15),(28,'TGZD7855','futbol',0,23),(29,'OTAG0169','baloncesto',0,32),(30,'IAKJ5677','futbol',0,30),(31,'XLVU0059','futbol',0,31),(32,'DRYW8811','baloncesto',110,3),(33,'SVEJ2873','futbol',0,24),(34,'TQXA0519','baloncesto',0,10),(35,'ERWI4640','ping-pong',0,32),(36,'RSWG6120','ping-pong',0,28),(37,'APNE1149','ping-pong',0,4),(38,'UFYH1995','ping-pong',0,9),(39,'STJY1092','ping-pong',0,16),(40,'MKHF8324','ping-pong',0,27),(41,'WXMD6983','tenis',110,19),(42,'UTMF3647','baloncesto',0,17),(43,'HNCH9349','baloncesto',0,23),(44,'RCEI3846','baloncesto',0,15),(45,'TCSV5439','ping-pong',0,11),(46,'MOVI9959','baloncesto',0,17),(47,'DEXD8225','tenis',110,8),(48,'GYRZ9093','futbol',0,3),(49,'SCWQ8166','baloncesto',0,17),(50,'EIHT9322','ping-pong',0,17),(51,'YGOB8648','futbol',0,16),(52,'UVLL6678','futbol',0,14),(53,'HDVY3293','ping-pong',0,18),(54,'IWJT3772','tenis',110,27),(55,'IZFN4987','tenis',110,17),(56,'MCJK7836','tenis',110,6),(57,'KXZO0644','ping-pong',0,5),(58,'JROC6715','ping-pong',0,6),(59,'STNM8369','futbol',0,32),(60,'ETHE3225','futbol',0,19),(61,'IKWF0936','tenis',110,10),(62,'CMBN6909','baloncesto',0,6),(63,'NTZQ0385','tenis',110,28),(64,'IJYW3680','futbol',0,24),(65,'GYAX6819','ping-pong',0,27),(66,'CEGQ5643','futbol',0,9),(67,'JWIO2960','futbol',0,9),(68,'KHAA2434','baloncesto',0,10),(69,'CZQE7103','tenis',110,8),(70,'UZOU1013','ping-pong',0,10),(71,'BVNF4869','baloncesto',0,8),(72,'CXMA8426','tenis',110,3),(73,'MYBC2352','futbol',0,11),(74,'KMCF2985','ping-pong',0,17),(75,'FFJH7299','tenis',110,11),(76,'QULX2495','tenis',110,4),(77,'USIQ5683','ping-pong',0,15),(78,'MSXR3874','baloncesto',0,10),(79,'GCAM3362','tenis',110,6),(80,'MSRO0155','ping-pong',0,19),(81,'OJRJ1952','tenis',110,2),(82,'SDZC3780','tenis',110,10),(83,'ZLGZ0732','tenis',110,24),(84,'VOPF6988','futbol',0,1),(85,'JWAA6818','futbol',0,28),(86,'FYTB3376','baloncesto',0,10),(87,'XPOR6311','futbol',0,24),(88,'DHWH1743','tenis',110,7),(89,'SSCT6428','baloncesto',0,6),(90,'CZRE5697','ping-pong',0,7),(91,'DJMN9021','futbol',0,21),(92,'XIFV4529','baloncesto',0,2),(93,'FLZC4447','futbol',0,23),(94,'XWCA6969','futbol',0,31),(95,'YFRW6460','tenis',110,1),(96,'RRLK6971','futbol',0,8),(97,'SCOZ1469','futbol',0,12),(98,'NUYD1885','ping-pong',0,1),(99,'VCUU1800','tenis',110,14),(100,'MLUZ2097','tenis',110,6),(101,'SDBU9999','ping-pong',0,15),(102,'TVVO7958','baloncesto',0,14),(103,'YUCU6965','futbol',0,9),(104,'IFEQ1754','baloncesto',0,3),(105,'KCVK8721','tenis',110,23),(106,'VJPZ6661','baloncesto',0,31),(107,'NYCX6716','ping-pong',0,8),(108,'ECTQ0206','futbol',0,15),(109,'FITT8107','ping-pong',0,10),(110,'FTKY0794','tenis',110,29),(111,'OSGA2573','ping-pong',0,16),(112,'LMTV8553','ping-pong',0,31),(113,'XXAM6850','futbol',0,4),(114,'JYFS9994','tenis',110,25),(115,'VSJR4412','ping-pong',0,27),(116,'PVTW5974','baloncesto',0,28),(117,'NVHV4595','tenis',110,17),(118,'UJKA7251','tenis',110,26),(119,'ODWL1802','ping-pong',0,5),(120,'YNQZ9172','tenis',110,11),(121,'PNPG5263','ping-pong',0,6),(122,'RKAT8162','tenis',110,23),(123,'EVJJ4685','tenis',110,27),(124,'AWHO0252','futbol',0,11),(125,'VIAB3512','tenis',110,26),(126,'NAFK1829','futbol',0,21),(127,'USPT3296','tenis',110,10),(128,'IAAZ6453','ping-pong',0,2),(129,'CBHX7228','ping-pong',0,30),(130,'LKTV4744','tenis',110,14),(131,'LPUW5218','baloncesto',0,15),(132,'TSRQ1053','tenis',110,11),(133,'YAAZ0586','tenis',110,16),(134,'SQWB2553','baloncesto',0,26),(135,'BQNL5187','ping-pong',0,1),(136,'PWKE8873','futbol',0,18),(137,'PZAT9482','ping-pong',0,2),(138,'UJUM5112','tenis',110,1),(139,'SKQV6549','baloncesto',0,7),(140,'EUYU8891','tenis',110,22),(141,'CMTH5532','tenis',110,17),(142,'ARSL7828','baloncesto',0,32),(143,'LCVD2975','tenis',110,28),(144,'VERL7456','futbol',0,32),(145,'NNYS5349','futbol',0,6),(146,'OQDQ5273','ping-pong',0,5),(147,'GZLL8098','futbol',0,22),(148,'RPLX2191','ping-pong',0,3),(149,'TUSP9507','baloncesto',0,6),(150,'WQDO7235','baloncesto',0,5),(151,'TIUX0148','tenis',110,15),(152,'QIKZ3605','futbol',0,5),(153,'IDJO0763','futbol',0,28),(154,'QJBK3836','ping-pong',0,14),(155,'JMTH2810','baloncesto',0,16),(156,'DHQS9490','futbol',0,28),(157,'EONV8991','ping-pong',0,2),(158,'SUJU1016','futbol',0,13),(159,'RGFR4996','ping-pong',0,19),(160,'UPUN0617','baloncesto',0,27),(161,'VBGB5048','futbol',0,7),(162,'JVSJ2806','tenis',110,12),(163,'FKXS9506','baloncesto',0,20),(164,'RPFI0665','baloncesto',0,20),(165,'IRRM0485','futbol',0,14),(166,'EGIO2672','baloncesto',0,12),(167,'WPZW3069','baloncesto',0,11),(168,'BKIW0763','ping-pong',0,31),(169,'YUXH9242','ping-pong',0,15),(170,'ZEUY9211','tenis',110,8),(171,'EUFT7260','futbol',0,25),(172,'PYOF5789','futbol',0,17),(173,'SDCL5236','futbol',0,2),(174,'KWBQ2088','ping-pong',0,17),(175,'ZNLE2759','baloncesto',0,31),(176,'YNOQ5445','baloncesto',0,11),(177,'EMWH2993','futbol',0,30),(178,'DQZP1636','baloncesto',0,7),(179,'ALBB9418','ping-pong',0,2),(180,'KZVT0850','ping-pong',0,12),(181,'XZPE8797','tenis',110,3),(182,'TYLK5810','tenis',110,13),(183,'BLTI1591','tenis',110,28),(184,'LSUG9297','ping-pong',0,5),(185,'TSZW0054','futbol',0,14),(186,'GAIE3510','futbol',0,21),(187,'ZBXC8186','tenis',110,1),(188,'AETS5815','baloncesto',0,17),(189,'TFLR3327','ping-pong',0,8),(190,'WVOW5205','futbol',0,16),(191,'ZURE9669','baloncesto',0,26),(192,'ZSMT7981','tenis',110,10),(193,'ZRXB5080','futbol',0,27),(194,'MRRC5495','futbol',0,17),(195,'TJQU2476','tenis',110,15),(196,'BOAG0796','ping-pong',0,1),(197,'EBMT4445','tenis',110,7),(198,'TVQS0855','baloncesto',0,22),(199,'ZYKY5229','futbol',0,26),(200,'RMXR7604','futbol',0,10);
/*!40000 ALTER TABLE `pistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pistas_abiertas`
--

DROP TABLE IF EXISTS `pistas_abiertas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pistas_abiertas` (
  `id_pista` int(10) unsigned NOT NULL,
  `operativa` tinyint(1) NOT NULL DEFAULT '1',
  `fecha_ultima_reserva` datetime DEFAULT NULL,
  `proxima_revision` datetime NOT NULL,
  PRIMARY KEY (`id_pista`),
  KEY `id_pista` (`id_pista`),
  CONSTRAINT `pistas_abiertas_ibfk_1` FOREIGN KEY (`id_pista`) REFERENCES `pistas` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pistas_abiertas`
--

LOCK TABLES `pistas_abiertas` WRITE;
/*!40000 ALTER TABLE `pistas_abiertas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pistas_abiertas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pistas_cerradas`
--

DROP TABLE IF EXISTS `pistas_cerradas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pistas_cerradas` (
  `id_pista` int(10) unsigned NOT NULL,
  `fecha_clausura` date NOT NULL,
  `motivo` varchar(500) NOT NULL,
  PRIMARY KEY (`id_pista`),
  KEY `id_pista` (`id_pista`),
  CONSTRAINT `pistas_cerradas_ibfk_1` FOREIGN KEY (`id_pista`) REFERENCES `pistas` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pistas_cerradas`
--

LOCK TABLES `pistas_cerradas` WRITE;
/*!40000 ALTER TABLE `pistas_cerradas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pistas_cerradas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `polideportivos`
--

DROP TABLE IF EXISTS `polideportivos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `polideportivos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `extension` float DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `polideportivos`
--

LOCK TABLES `polideportivos` WRITE;
/*!40000 ALTER TABLE `polideportivos` DISABLE KEYS */;
INSERT INTO `polideportivos` VALUES (1,'BR','P.O. Box 215, 5931 Pellentesque Road','Zara',289),(2,'NA','Ap #934-3170 Fusce Rd.','Zaragoza',192),(3,'British Columbia','P.O. Box 485, 5090 Elit. Road','Zaragoza',480),(4,'Brandenburg','929-2153 Varius Road','Zaragoza',259),(5,'San José','803-9134 Odio. Rd.','Zaragoza',361),(6,'Brd','145-2997 Ultrices Ave','Zaragoza',399),(7,'Idaho','256-9131 Dui, Rd.','Zaragoza',231),(8,'SP','P.O. Box 416, 2887 Vulputate, Avenue','Zaragoza',415),(9,'AC','Ap #925-8557 Eu, Street','Zaragoza',235),(10,'SI','Ap #509-7693 Dapibus Street','Teruel',323),(11,'TA','451-4958 Amet Rd.','Huesca',479),(12,'Western Australia','Ap #409-6570 Curabitur Road','Huesca',213),(13,'NI','P.O. Box 167, 2006 Risus Rd.','Huesca',383),(14,'Connecticut','5668 Mauris, Road','Huesca',152),(15,'Provence-Alpes-Côte d\'Azur','5132 Mi St.','Huesca',397),(16,'Yukon','P.O. Box 947, 1703 Curabitur St.','Huesca',296),(17,'Nova Scotia','326-4329 Ac Av.','Huesca',411),(18,'Vienna','694-7588 Ornare. Av.','Huesca',206),(19,'La','P.O. Box 162, 7033 Habitant Rd.','Huesca',271),(20,'BA','P.O. Box 878, 3169 Justo St.','Huesca',172),(21,'Cartago','8704 Gravida. St.','Madrid',195),(22,'Morayshire','P.O. Box 585, 3356 Ipsum. Rd.','Huesca',207),(23,'Louisiana','124-2101 Pede, Rd.','Teruel',106),(24,'ES','207-6873 Id Road','Teruel',479),(25,'Franche-Comté','7460 Consectetuer St.','Teruel',120),(26,'Noord Brabant','P.O. Box 473, 8577 Neque. St.','Teruel',354),(27,'CA','649-1999 Nullam St.','Teruel',367),(28,'Minnesota','Ap #507-361 Pharetra, Av.','Teruel',348),(29,'Heredia','6419 Nec Road','Teruel',338),(30,'BY','5256 Et Av.','Teruel',278),(31,'SF','724-1228 Lacus Ave','Teruel',124),(32,'Manitoba','862-3322 Amet, Road','Teruel',353),(33,'Almozara','Avda. Ilustración','Zaragoza',250),(34,'Centro','Coso','Zaragoza',0),(200,'Centro2','Gran Vía','Zaragoza',0),(202,'Centro3','Coso','Zaragoza',0),(203,'Pabellón Royal','C/ 123','Zaragoza',NULL),(204,'Pabellón Royal2','C/ 123','Zaragoza',NULL);
/*!40000 ALTER TABLE `polideportivos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fecha_reserva` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_uso` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `precio` float DEFAULT '0',
  `id_pista` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pista` (`id_pista`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_pista`) REFERENCES `pistas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (2,'2013-03-14 23:42:12','2014-07-01 20:09:13',25,41),(3,'2013-02-04 21:30:18','2014-06-07 08:34:17',25,148),(4,'2013-07-06 16:05:00','2014-07-31 04:58:51',25,175),(6,'2013-12-17 13:04:25','2013-05-31 11:15:22',9,86),(7,'2013-03-21 00:13:22','2014-01-23 20:55:02',10,138),(8,'2014-11-16 12:44:31','2014-02-01 18:21:47',5,146),(9,'2014-07-24 06:16:48','2013-10-12 19:02:57',25,87),(10,'2013-05-18 11:32:43','2014-05-16 08:56:48',9,149),(12,'2013-02-16 02:45:09','2013-02-12 15:12:04',25,110),(13,'2014-08-24 05:47:56','2014-01-20 00:51:17',9,178),(14,'2013-03-25 20:59:40','2013-08-25 12:03:05',9,114),(15,'2013-03-28 01:25:39','2014-12-02 17:25:39',5,28),(16,'2014-02-08 18:40:40','2014-09-03 10:43:32',25,89),(18,'2013-02-16 06:43:28','2015-01-16 20:50:38',6,136),(19,'2014-12-07 09:36:59','2015-01-12 19:01:27',5,122),(22,'2014-06-29 23:31:52','2013-07-26 05:04:57',5,95),(23,'2014-08-25 11:36:52','2014-07-06 22:34:08',25,176),(24,'2014-06-25 04:11:04','2013-10-15 11:17:46',25,15),(27,'2014-05-14 15:16:13','2013-10-21 20:20:12',9,161),(29,'2014-07-30 01:54:06','2013-07-01 07:41:10',5,1),(31,'2013-05-11 15:38:54','2013-09-19 18:14:39',10,118),(32,'2013-12-04 10:01:16','2014-08-13 16:26:41',6,62),(33,'2013-05-01 21:30:09','2014-07-23 01:15:33',6,121),(34,'2013-09-26 00:28:15','2014-03-26 01:36:32',6,65),(35,'2014-03-03 14:29:14','2013-04-12 21:55:08',10,21),(36,'2014-07-11 09:49:14','2013-06-21 22:03:54',6,73),(37,'2014-08-05 10:35:21','2013-01-08 03:27:27',10,179),(39,'2013-03-10 03:54:19','2014-09-09 20:59:58',6,32),(41,'2013-02-05 03:49:00','2013-04-28 15:58:25',10,37),(42,'2013-09-28 21:40:35','2013-12-29 14:15:31',5,133),(46,'2013-03-14 12:37:19','2013-04-27 15:17:49',10,43),(47,'2013-04-06 06:31:37','2013-06-19 02:46:56',5,149),(48,'2014-12-30 08:46:41','2013-06-18 03:54:11',25,81),(49,'2013-10-12 12:43:20','2013-07-03 09:48:59',10,22),(50,'2014-05-18 18:06:59','2013-06-17 22:18:47',5,53),(51,'2013-02-20 08:17:49','2014-07-30 02:46:37',9,89),(52,'2014-05-31 18:07:16','2013-07-16 04:30:57',5,139),(53,'2014-09-03 10:06:52','2014-07-20 03:13:43',5,186),(54,'2013-05-25 14:17:04','2013-10-16 13:59:33',9,94),(55,'2014-03-11 15:13:48','2013-08-21 16:14:46',25,18),(56,'2013-11-18 01:58:36','2014-03-19 01:00:52',9,65),(57,'2013-03-30 01:24:39','2014-04-13 05:59:23',9,24),(58,'2013-07-29 03:40:27','2013-02-20 04:26:55',5,28),(59,'2014-10-19 10:57:20','2013-07-31 14:53:21',25,126),(61,'2014-02-15 11:01:50','2013-11-16 18:33:32',6,31),(62,'2014-01-13 08:39:40','2013-12-17 07:15:20',10,159),(63,'2013-12-31 01:28:43','2013-12-31 19:22:45',9,111),(64,'2013-03-09 15:52:49','2013-01-26 18:32:55',5,183),(65,'2014-09-10 12:14:19','2014-02-22 19:47:01',25,154),(66,'2013-02-23 07:04:58','2013-02-10 19:52:27',9,72),(67,'2014-05-19 02:22:49','2013-04-22 09:37:31',6,88),(68,'2014-03-17 09:20:32','2014-01-14 03:29:38',9,58),(70,'2014-03-05 23:26:41','2013-03-18 08:56:37',6,86),(71,'2014-10-14 01:50:45','2014-11-08 03:05:22',25,114),(73,'2014-01-20 10:13:26','2014-11-13 14:00:43',10,59),(74,'2014-08-30 03:46:22','2013-08-18 19:40:34',6,68),(76,'2013-09-17 13:18:44','2014-03-17 08:35:24',9,45),(77,'2013-08-03 04:49:26','2014-07-08 07:20:50',6,29),(78,'2014-11-12 03:45:42','2013-07-03 16:15:35',10,117),(80,'2013-07-22 21:24:45','2014-11-03 03:59:33',6,126),(82,'2013-01-29 23:25:04','2013-08-06 16:52:56',6,115),(83,'2013-11-27 11:23:02','2013-12-30 12:49:07',25,58),(84,'2013-03-03 05:35:49','2014-11-10 01:28:14',9,15),(85,'2014-11-16 18:07:09','2013-11-01 14:10:29',5,12),(86,'2013-05-03 22:28:45','2013-09-23 03:01:45',6,15),(87,'2014-03-12 18:32:32','2014-01-13 18:19:14',25,182),(89,'2014-12-10 16:39:41','2014-11-15 07:08:38',6,156),(90,'2013-12-14 23:41:49','2014-10-18 19:39:20',25,85),(91,'2013-07-12 14:02:01','2013-11-25 13:25:31',6,168),(92,'2013-08-06 00:33:35','2015-01-06 01:03:07',10,180),(93,'2014-11-23 16:39:29','2014-10-15 17:31:23',9,52),(94,'2013-01-27 13:26:16','2014-12-16 05:01:30',25,141),(95,'2013-04-30 05:07:12','2014-12-31 18:58:16',25,163),(96,'2014-04-26 12:31:39','2014-12-25 15:07:16',25,191),(97,'2013-04-21 08:25:36','2013-12-14 01:52:59',5,26),(99,'2013-08-18 17:54:18','2014-11-19 01:58:31',10,137),(100,'2013-12-29 11:34:50','2013-03-30 12:12:50',9,37),(102,'2014-09-13 14:05:18','2014-06-07 11:02:19',9,198),(103,'2013-01-05 18:33:47','2013-02-23 16:06:18',25,20),(104,'2013-07-09 08:32:08','2014-07-17 06:06:01',9,114),(105,'2013-11-22 16:21:07','2014-07-01 09:53:49',6,140),(106,'2014-04-13 21:41:17','2013-04-21 14:56:03',5,27),(107,'2013-09-29 14:03:36','2014-08-16 15:45:02',25,47),(108,'2014-08-16 02:19:01','2013-08-18 13:35:14',9,98),(109,'2013-02-04 05:52:26','2014-07-11 15:31:52',5,138),(110,'2013-08-05 09:23:57','2014-08-08 13:22:56',10,139),(111,'2013-10-20 23:52:57','2013-05-12 00:14:11',5,16),(112,'2013-11-03 20:23:36','2014-04-04 09:38:01',9,200),(113,'2014-06-22 19:16:16','2014-04-07 09:58:34',25,169),(114,'2014-10-01 00:40:25','2013-09-23 20:33:52',25,17),(115,'2014-10-08 16:05:11','2014-05-16 11:14:45',9,107),(116,'2014-05-18 19:59:47','2013-06-16 21:30:08',6,196),(117,'2013-03-11 07:44:29','2013-10-19 14:39:05',10,194),(118,'2013-11-30 04:16:23','2014-09-12 11:09:28',25,133),(119,'2013-12-07 02:26:17','2015-01-14 06:36:51',5,122),(120,'2013-02-25 13:55:02','2014-04-23 14:31:33',9,5),(121,'2014-11-09 18:10:59','2013-11-19 10:22:01',5,178),(122,'2015-01-03 23:50:11','2013-07-26 13:34:50',9,191),(123,'2013-09-29 13:48:50','2014-06-02 04:53:56',6,167),(124,'2013-03-09 18:35:42','2013-10-23 18:56:32',6,9),(126,'2014-12-05 03:57:51','2013-07-23 22:34:16',10,129),(128,'2014-11-07 06:20:06','2014-08-18 17:21:41',25,60),(129,'2014-09-08 08:24:06','2014-02-16 07:24:27',5,71),(131,'2014-08-26 03:42:13','2013-12-30 03:52:11',5,121),(133,'2014-12-04 16:12:10','2013-04-03 11:25:09',10,26),(134,'2013-01-10 05:42:17','2013-06-20 18:06:44',10,193),(136,'2013-12-06 17:14:17','2014-09-10 01:19:20',9,96),(137,'2013-09-16 23:04:44','2013-02-17 13:18:20',9,150),(138,'2013-06-22 17:40:45','2013-09-28 23:37:39',6,103),(139,'2014-05-18 03:18:22','2013-02-22 21:57:53',10,189),(140,'2015-01-07 02:56:13','2013-11-08 03:09:02',5,56),(141,'2013-08-13 02:21:51','2013-07-13 02:07:06',5,31),(143,'2013-07-09 12:05:56','2014-08-19 10:24:47',5,156),(144,'2014-08-21 14:08:35','2014-07-04 07:51:07',10,69),(145,'2014-11-15 07:22:26','2013-07-12 10:01:01',25,172),(146,'2013-03-01 16:10:15','2013-03-22 06:00:37',5,198),(147,'2015-01-05 22:07:44','2014-07-31 12:25:42',5,137),(148,'2013-05-29 04:23:28','2013-09-18 20:48:31',10,61),(149,'2013-02-23 07:46:07','2014-03-12 20:34:28',10,67),(150,'2014-03-28 13:59:24','2013-04-25 02:37:27',9,155),(151,'2013-07-11 12:13:14','2014-12-11 11:29:52',9,111),(152,'2014-11-23 06:43:11','2014-04-20 10:18:23',25,121),(153,'2015-01-10 23:16:03','2014-08-18 12:37:40',6,122),(154,'2013-07-14 20:38:47','2014-04-02 12:32:28',6,73),(155,'2013-11-16 20:19:52','2014-05-27 18:36:52',5,150),(156,'2014-11-30 22:44:34','2014-06-30 03:15:53',10,133),(158,'2014-03-06 06:06:40','2013-08-23 03:57:20',5,45),(159,'2015-01-17 02:23:00','2013-12-28 19:50:54',10,51),(160,'2013-10-28 15:18:36','2014-03-28 17:29:44',5,172),(161,'2013-05-18 07:54:14','2014-09-15 07:11:42',5,145),(162,'2014-08-28 14:39:50','2013-11-06 15:54:06',25,157),(163,'2013-01-22 12:45:29','2013-11-16 18:54:59',25,69),(164,'2013-01-14 11:17:30','2013-04-16 03:52:43',25,132),(165,'2014-07-05 18:53:42','2013-06-19 07:30:48',10,199),(166,'2013-01-04 21:43:34','2013-04-13 15:51:50',25,150),(167,'2013-04-27 15:46:51','2013-01-07 03:39:06',5,148),(168,'2013-01-12 18:20:10','2013-08-10 19:12:33',9,167),(169,'2014-09-29 03:56:57','2014-05-26 14:08:24',5,59),(171,'2014-05-10 08:21:30','2013-02-12 14:34:42',5,129),(172,'2013-06-09 10:08:55','2014-10-03 16:12:59',10,150),(173,'2013-01-28 09:04:28','2013-11-11 09:42:08',25,96),(174,'2014-12-30 20:39:22','2013-04-09 21:48:57',5,74),(175,'2014-06-12 12:23:09','2014-11-04 14:24:03',9,158),(176,'2014-07-22 02:36:20','2014-08-26 23:58:22',6,92),(177,'2013-08-24 14:50:41','2013-04-09 07:02:22',5,113),(178,'2013-08-01 07:00:34','2014-11-19 03:13:59',6,168),(179,'2013-03-15 15:42:34','2014-08-16 05:43:34',10,146),(180,'2013-12-28 02:36:09','2013-10-14 19:41:12',9,157),(181,'2014-03-25 18:34:13','2014-07-16 03:03:38',5,34),(183,'2014-12-07 04:24:35','2013-08-18 01:48:12',10,162),(184,'2013-02-22 04:03:16','2015-01-26 12:33:38',10,185),(185,'2014-02-05 19:09:45','2013-06-24 06:34:52',9,179),(186,'2014-06-14 17:34:09','2014-12-03 20:08:24',10,78),(188,'2015-01-22 00:21:44','2014-09-18 08:20:23',25,98),(189,'2014-11-22 00:01:42','2013-04-23 04:01:23',10,2),(190,'2013-12-15 21:19:16','2014-12-21 08:56:45',10,164),(191,'2014-12-24 15:48:08','2014-11-29 20:14:00',25,159),(192,'2013-03-29 00:09:01','2013-08-22 18:40:50',25,40),(193,'2013-01-22 05:17:03','2013-03-10 02:17:48',9,32),(194,'2014-06-13 15:21:47','2015-01-26 13:33:00',5,60),(195,'2014-12-24 09:34:33','2014-03-13 03:35:08',25,57),(196,'2013-01-29 21:22:56','2013-03-03 23:13:31',9,131),(197,'2013-05-22 10:54:21','2014-03-04 21:44:50',5,135),(198,'2013-06-25 12:51:58','2014-02-07 01:00:23',25,191),(199,'2013-05-15 14:46:12','2013-12-18 18:33:39',5,2),(200,'2013-12-13 14:17:57','2013-04-05 01:43:23',6,149);
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_reserva`
--

DROP TABLE IF EXISTS `usuario_reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_reserva` (
  `id_usuario` int(10) unsigned NOT NULL DEFAULT '0',
  `id_reserva` int(10) unsigned NOT NULL DEFAULT '0',
  `asiste` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_usuario`,`id_reserva`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_reserva` (`id_reserva`),
  CONSTRAINT `usuario_reserva_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `usuario_reserva_ibfk_2` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_reserva`
--

LOCK TABLES `usuario_reserva` WRITE;
/*!40000 ALTER TABLE `usuario_reserva` DISABLE KEYS */;
INSERT INTO `usuario_reserva` VALUES (1,6,1),(1,46,1),(1,54,0),(1,120,0),(2,34,1),(3,99,0),(4,48,0),(4,190,0),(5,34,0),(5,71,0),(5,87,0),(5,171,0),(6,124,0),(6,137,0),(6,179,0),(6,189,0),(8,114,0),(8,174,0),(9,3,0),(9,91,0),(9,149,0),(10,8,0),(10,108,0),(11,9,0),(11,29,0),(11,112,0),(12,13,0),(12,164,0),(13,93,0),(13,104,0),(13,162,0),(14,110,0),(14,118,0),(14,129,0),(15,34,0),(15,39,0),(15,59,0),(17,77,0),(17,179,0),(18,42,0),(18,155,0),(19,197,0),(20,18,0),(20,34,0),(20,140,0),(20,185,0),(21,15,0),(21,57,0),(21,118,0),(21,145,0),(21,164,0),(21,166,0),(22,6,0),(23,51,0),(23,65,0),(23,94,0),(23,104,0),(24,33,0),(24,49,0),(24,64,0),(24,96,0),(24,147,0),(25,27,0),(25,31,0),(25,33,0),(26,91,0),(26,115,0),(26,147,0),(27,175,0),(27,180,0),(28,52,0),(28,147,0),(28,162,0),(28,171,0),(29,62,0),(29,70,0),(29,113,0),(30,104,0),(30,134,0),(31,123,0),(31,138,0),(32,46,0),(32,86,0),(32,153,0),(32,156,0),(34,13,0),(34,54,0),(34,58,0),(35,37,0),(36,29,0),(37,139,0),(37,173,0),(39,183,0),(40,2,0),(41,3,0),(42,147,0),(42,153,0),(42,196,0),(42,197,0),(44,111,0),(46,124,0),(47,108,0),(47,111,0),(47,143,0),(48,94,0),(49,18,0),(49,47,0),(49,48,0),(49,86,0),(50,23,0),(51,66,0),(52,41,0),(52,113,0),(53,7,0),(53,85,0),(53,107,0),(54,6,0),(54,97,0),(54,113,0),(54,176,0),(54,192,0),(55,7,0),(55,46,0),(55,155,0),(55,172,0),(56,63,0),(56,134,0),(57,29,0),(57,151,0),(57,160,0),(58,22,0),(58,94,0),(59,67,0),(59,84,0),(59,108,0),(59,115,0),(59,117,0),(60,48,0),(60,49,0),(60,99,0),(61,77,0),(61,113,0),(61,118,0),(61,158,0),(62,174,0),(63,156,0),(64,12,0),(64,58,0),(65,63,0),(66,15,0),(66,54,0),(66,106,0),(67,74,0),(67,90,0),(67,161,0),(68,104,0),(68,129,0),(69,77,0),(70,117,0),(70,180,0),(71,99,0),(71,176,0),(71,180,0),(72,53,0),(72,134,0),(72,172,0),(73,36,0),(73,37,0),(73,83,0),(74,131,0),(74,151,0),(74,164,0),(75,148,0),(76,77,0),(77,61,0),(77,174,0),(78,97,0),(78,115,0),(79,39,0),(79,113,0),(79,167,0),(80,173,0),(81,197,0),(82,123,0),(82,156,0),(82,171,0),(83,47,0),(83,95,0),(83,104,0),(83,120,0),(83,141,0),(83,175,0),(83,189,0),(84,52,0),(85,102,0),(85,138,0),(85,148,0),(87,32,0),(87,197,0),(89,52,0),(89,122,0),(89,178,0),(90,134,0),(90,155,0),(91,36,0),(91,53,0),(91,103,0),(91,194,0),(92,161,0),(93,24,0),(93,32,0),(93,42,0),(93,62,0),(93,198,0),(94,116,0),(94,186,0),(94,188,0),(95,97,0),(95,190,0),(97,3,0),(97,64,0),(98,57,0),(98,192,0),(99,4,0),(99,192,0),(100,7,0);
/*!40000 ALTER TABLE `usuario_reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_usuario`
--

DROP TABLE IF EXISTS `usuario_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_usuario` (
  `id_usuario` int(10) unsigned NOT NULL,
  `id_amigo` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_amigo`),
  KEY `id_amigo` (`id_amigo`),
  CONSTRAINT `usuario_usuario_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `usuario_usuario_ibfk_2` FOREIGN KEY (`id_amigo`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_usuario`
--

LOCK TABLES `usuario_usuario` WRITE;
/*!40000 ALTER TABLE `usuario_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dni` char(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `descuento` float NOT NULL DEFAULT '0',
  `fecha_alta` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `dni` (`dni`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'WFPHMYMZ7','Medge','Franklin','purus.Maecenas.libero@inhendreritconsectetuer.edu','','2013-06-25',0,'0000-00-00'),(2,'IWFFOBHP1','María','DB','nunc.risus.varius@conubianostraper.net','','2014-10-20',0,'0000-00-00'),(3,'KOOOQQRH3','Kadeem','Palmer','ac.risus.Morbi@sedpede.co.uk','','2014-01-22',0,'0000-00-00'),(4,'AIXZNVWS0','Fletcher','Knox','nunc@atortor.ca','','2014-12-12',0,'0000-00-00'),(5,'YTZRLZHO3','Ima','Beard','vel@Namporttitorscelerisque.org','','2013-09-17',0,'0000-00-00'),(6,'LKFQCZQN3','Nombre','Roth','et.nunc@sagittisfelis.ca','','2015-01-12',0,'0000-00-00'),(7,'QJWQZQHJ9','Barry','Todd','magna.Lorem@Phasellus.edu','','2013-04-28',0,'0000-00-00'),(8,'TFXGIFSY2','Adam','Bryan','Donec@egetodioAliquam.com','','2014-04-30',0,'0000-00-00'),(9,'BAEXODHD3','Mechelle','Moran','consequat.purus@sit.edu','','2013-10-20',0,'0000-00-00'),(10,'WRDQJRTW6','Brock','Obrien','tincidunt.aliquam.arcu@eget.co.uk','','2014-07-02',0,'0000-00-00'),(11,'TPBHNPJJ3','Charissa','Stout','luctus.sit.amet@volutpatNulladignissim.ca','','2013-09-04',0,'0000-00-00'),(12,'JQMDWBEK8','Felipe','García','neque.sed.sem@Fuscefeugiat.edu','','2013-09-23',0,'0000-00-00'),(13,'SSDKCIPH4','Abel','Rios','Donec.porttitor@dolor.edu','','2013-03-16',0,'0000-00-00'),(14,'KKGLIPJO8','Hiram','Duffy','porta@amalesuada.net','','2014-04-02',0,'0000-00-00'),(15,'123654789','Felipe','García','Donec.nibh@etmagnisdis.net','','2013-12-04',0,'0000-00-00'),(16,'WFQZJRMQ8','Maris','Wilson','ligula.tortor@dictumultriciesligula.co.uk','','2014-07-27',0,'0000-00-00'),(17,'ASITBSEM2','Walker','Farley','ullamcorper@facilisisfacilisismagna.org','','2013-05-26',0,'0000-00-00'),(18,'IPJHZJRR1','Branden','Copeland','Pellentesque.ut@molestie.ca','','2014-03-06',0,'0000-00-00'),(19,'QNTVGRYI7','Wang','Patterson','vulputate.eu.odio@ipsumCurabiturconsequat.org','','2013-05-11',0,'0000-00-00'),(20,'WIDCMVYQ3','Chaim','Mills','dis@tellusSuspendissesed.net','','2014-11-28',0,'0000-00-00'),(21,'JCOEMOFK6','Norman','Stewart','a.purus@afeugiattellus.net','','2014-05-25',0,'0000-00-00'),(22,'EANLDCKY9','Wylie','Duran','lobortis@eratSednunc.edu','','2013-03-19',0,'0000-00-00'),(23,'DHOYCSHQ4','Curran','Peck','Class.aptent@Aliquameratvolutpat.org','','2014-06-08',0,'0000-00-00'),(24,'LVGUZXFQ1','Cherokee','Lindsey','Aliquam@sagittissemperNam.ca','','2013-12-27',0,'0000-00-00'),(25,'TUVNKPAK3','Logan','Carr','dictum.eu.eleifend@bibendum.edu','','2014-07-16',0,'0000-00-00'),(26,'EOHHKYIV5','Todd','Contreras','sit.amet.consectetuer@sapien.org','','2013-09-16',0,'0000-00-00'),(27,'QVIEMHUI7','Eaton','Mcclure','sit.amet@sed.net','','2014-09-11',0,'0000-00-00'),(28,'DEMUXVXN1','Nombre','Benjamin','eget.venenatis@eutemporerat.net','','2015-01-06',0,'0000-00-00'),(29,'LZSZGUPV3','Akeem','Sanchez','ipsum.porta.elit@aliquam.ca','','2014-10-22',0,'0000-00-00'),(30,'WBYYJYYE2','Raja','Cotton','Nunc.mauris.elit@consectetueripsumnunc.net','','2013-02-07',0,'0000-00-00'),(31,'WXVBCDFM0','Vincent','Levine','rutrum@Nuncmauris.org','','2013-05-08',0,'0000-00-00'),(32,'RQFQQQAS7','Wynter','Rodriguez','et.tristique@purusMaecenaslibero.ca','','2013-07-26',0,'0000-00-00'),(33,'XTXVGYFR9','Anika','Mcpherson','ac@velitAliquamnisl.edu','','2014-04-09',0,'0000-00-00'),(34,'IMHZJBAX8','Jordan','Hopper','Duis@nequeNullam.org','','2014-12-17',0,'0000-00-00'),(35,'YUKODMDP6','Yuli','Durham','nunc.interdum@dolorsit.ca','','2013-06-11',0,'0000-00-00'),(36,'CBLDGBSN1','Alec','Moses','Cum@interdumSed.ca','','2014-10-21',0,'0000-00-00'),(37,'YFYVYDWG8','Kaitlin','Cherry','dictum.eleifend.nunc@penatibuset.ca','','2013-07-29',0,'0000-00-00'),(38,'WKFNRJPW8','Prescott','Boyle','Sed.auctor.odio@semut.com','','2014-07-16',0,'0000-00-00'),(39,'YAFTFUHD2','Rogan','Ashley','ullamcorper.Duis.cursus@Sedneque.com','','2014-10-26',0,'0000-00-00'),(40,'DBMIEHAS3','James','Coffey','dolor@idrisus.edu','','2014-08-10',0,'0000-00-00'),(41,'VWVBQSWK6','Serena','Combs','pede@Sed.co.uk','','2014-07-04',0,'0000-00-00'),(42,'PRMAIYVS7','Mira','Donovan','accumsan@Utsagittislobortis.ca','','2013-11-08',0,'0000-00-00'),(43,'MUUCLKSD8','Aristotle','Vinson','ipsum.nunc.id@vehiculaaliquetlibero.co.uk','','2013-04-06',0,'0000-00-00'),(44,'QPHQFGHT4','Ginger','Clemons','diam.lorem.auctor@necluctus.edu','','2014-06-03',0,'0000-00-00'),(45,'OWBDLNHJ6','Kristen','Anderson','magna.Cras.convallis@nisi.net','','2013-09-01',0,'0000-00-00'),(46,'HRDBSQZH3','Tashya','Matthews','ac@neque.co.uk','','2013-11-24',0,'0000-00-00'),(47,'HTXDALSY5','Amity','Carson','dapibus.ligula.Aliquam@mauriselitdictum.ca','','2014-09-11',0,'0000-00-00'),(48,'NVOWSMIA4','Alden','Pollard','nunc@eleifendnon.org','','2013-05-23',0,'0000-00-00'),(49,'NHWHSDMA5','Jolene','Morrow','mattis@Integervitaenibh.net','','2013-04-02',0,'0000-00-00'),(50,'GVDKJEGK7','Harrison','Walls','scelerisque@Crassed.org','','2013-05-21',0,'0000-00-00'),(51,'FVBPMXLC6','Fay','Crane','porttitor@Quisqueornaretortor.org','','2014-01-04',0,'0000-00-00'),(52,'DWNGJQWA2','Lane','Sutton','Aenean.euismod@dolor.com','','2013-04-16',0,'0000-00-00'),(53,'QPGPOCYU3','Charde','Riggs','Morbi.neque.tellus@tempor.com','','2014-09-18',0,'0000-00-00'),(54,'XQTMDHYH3','William','Hutchinson','sit.amet.metus@tempor.edu','','2014-02-19',0,'0000-00-00'),(55,'BLBXPJCC1','Bryar','Joseph','convallis.in.cursus@eutelluseu.co.uk','','2013-03-09',0,'0000-00-00'),(56,'RZCALXCL8','Mason','Baker','sed.dui.Fusce@in.com','','2014-08-05',0,'0000-00-00'),(57,'EBEEBPTQ7','Ian','Bray','Sed@egestasSedpharetra.org','','2013-09-14',0,'0000-00-00'),(58,'ANNYTNEY5','Ray','Hunter','ipsum.dolor.sit@gravida.org','','2014-12-14',0,'0000-00-00'),(59,'YARUFPJL2','Keelie','Horn','quam.dignissim@neceuismodin.net','','2014-08-04',0,'0000-00-00'),(60,'WYXVOSNM1','Ariel','Avery','mauris.aliquam@ullamcorpervelit.net','','2014-02-17',0,'0000-00-00'),(61,'WEWTXYNX9','Lester','Cain','eget@sem.ca','','2013-04-18',0,'0000-00-00'),(62,'RDMZMEWR0','Victor','Clarke','conubia.nostra@molestie.com','','2014-12-16',0,'0000-00-00'),(63,'SBMYOZDN7','Faith','Martinez','orci.Donec@nuncnulla.edu','','2013-04-08',0,'0000-00-00'),(64,'ISELGBJC8','Gage','Snow','fermentum@pulvinar.edu','','2014-09-23',0,'0000-00-00'),(65,'IXUFCMRO8','Isaac','Koch','est@Integerurna.org','','2014-09-21',0,'0000-00-00'),(66,'LKTQNZES5','Abel','Casey','ante.Nunc@convallisest.ca','','2013-08-26',0,'0000-00-00'),(67,'YPVVKQJP6','Samantha','Dennis','justo@vitaeodio.com','','2013-08-06',0,'0000-00-00'),(68,'EGXEDNZQ9','Lacota','Norman','et.magnis@Ut.co.uk','','2014-01-21',0,'0000-00-00'),(69,'HMJSMXSE5','Demetrius','Armstrong','ultrices.Duis.volutpat@Donec.edu','','2013-05-09',0,'0000-00-00'),(70,'IZEMMKHY5','Timothy','Koch','ullamcorper@suscipitest.org','','2014-09-28',0,'0000-00-00'),(71,'SOCHEGRU8','Christian','Garrett','ipsum@vitaesodales.org','','2013-02-09',0,'0000-00-00'),(72,'NTNQLDLC0','Leilani','Rios','et.magnis@egestasFuscealiquet.org','','2013-07-24',0,'0000-00-00'),(73,'PDODJWMG3','Julian','Brooks','augue.Sed.molestie@interdumenimnon.edu','','2014-02-09',0,'0000-00-00'),(74,'MLBJWAZV6','Mona','Rich','netus.et@sem.edu','','2013-05-13',0,'0000-00-00'),(75,'IPQYBCDY1','Clare','Mathis','metus.urna.convallis@est.edu','','2013-04-04',0,'0000-00-00'),(76,'PJPLQYNW0','Baxter','Mccormick','consectetuer.rhoncus@nascetur.org','','2014-05-08',0,'0000-00-00'),(77,'AVRTLZVW5','Kaden','Luna','sagittis@enimEtiam.ca','','2014-01-14',0,'0000-00-00'),(78,'DPNMBHCO1','Xander','Langley','scelerisque.sed@enim.edu','','2014-10-09',0,'0000-00-00'),(79,'WKQWSRDL4','Basil','Gilmore','Sed.pharetra.felis@dui.org','','2013-09-09',0,'0000-00-00'),(80,'GUTTGAYK5','Tucker','Cochran','auctor.velit.Aliquam@molestie.org','','2013-10-17',0,'0000-00-00'),(81,'PAIQKBXU7','Patience','Barrett','ipsum.Phasellus.vitae@urna.net','','2013-09-22',0,'0000-00-00'),(82,'AYEPDZDS3','Ashton','Banks','tincidunt.vehicula@nonvestibulumnec.com','','2013-06-03',0,'0000-00-00'),(83,'HSULGUUO2','Brett','Olsen','suscipit.nonummy.Fusce@tempor.com','','2015-01-17',0,'0000-00-00'),(84,'IQONWLNZ6','Fuller','Fields','urna.justo.faucibus@Nullam.co.uk','','2014-09-23',0,'0000-00-00'),(85,'WIXBPQNF2','Brenna','Parsons','Nunc.laoreet.lectus@fringillaornareplacerat.com','','2013-02-07',0,'0000-00-00'),(86,'OJWUGFCN4','Gretchen','Hawkins','massa.Integer@mollis.org','','2013-09-23',0,'0000-00-00'),(87,'HWYFHKSB1','Gil','Fulton','rhoncus@cursusdiam.edu','','2013-03-10',0,'0000-00-00'),(88,'HKOWKLQF9','Katelyn','Sandoval','Phasellus.dolor.elit@sed.edu','','2014-11-21',0,'0000-00-00'),(89,'AOPRGBAG7','Ciaran','Burton','a.feugiat@tristique.org','','2013-08-26',0,'0000-00-00'),(90,'LZIEQRNW9','Jessamine','Chavez','vitae.sodales@perconubia.org','','2013-06-02',0,'0000-00-00'),(91,'LHSLIMWB5','Aretha','Barton','Vivamus@orciUtsagittis.com','','2014-04-04',0,'0000-00-00'),(92,'FCYBOBTZ1','Abigail','Castillo','gravida.Aliquam.tincidunt@eu.net','','2013-04-08',0,'0000-00-00'),(93,'QMBNHCAY7','Boris','Spears','metus.urna.convallis@luctus.co.uk','','2013-04-27',0,'0000-00-00'),(94,'ZILUWQEL3','Stephen','House','nisl.sem.consequat@ante.com','','2013-08-20',0,'0000-00-00'),(95,'XXMOGNUB2','Cherokee','Le','auctor@euismodin.edu','','2013-04-17',0,'0000-00-00'),(96,'ADMEIXMJ1','Suki','Gonzales','aliquet@maurisut.ca','','2014-03-09',0,'0000-00-00'),(97,'WKTYVQWK1','Stewart','Wiley','sem@nasceturridiculusmus.edu','','2013-03-18',0,'0000-00-00'),(98,'ZFXFECAX0','Bruce','Johnston','Maecenas.iaculis@velitQuisque.co.uk','','2013-07-03',0,'0000-00-00'),(99,'PHPYKOAJ5','Sylvester','Hardin','egestas.lacinia.Sed@tristiquealiquet.co.uk','','2014-08-25',0,'0000-00-00'),(100,'MLQUFGFQ6','Imelda','Vazquez','natoque@consectetuer.net','','2013-03-06',0,'0000-00-00');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-30 16:35:43