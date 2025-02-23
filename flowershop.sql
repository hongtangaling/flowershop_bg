-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: flowershop
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `tbl_car`
--

DROP TABLE IF EXISTS `tbl_car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_car` (
  `cid` varchar(20) NOT NULL,
  `total` varchar(20) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `num` varchar(10) NOT NULL,
  `uid` varchar(20) NOT NULL,
  `fid` varchar(20) NOT NULL,
  `pic` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_car`
--

LOCK TABLES `tbl_car` WRITE;
/*!40000 ALTER TABLE `tbl_car` DISABLE KEYS */;
INSERT INTO `tbl_car` VALUES ('20230209080304c21673','168','招财猫永生花水晶球玻璃罩小夜灯','1','114515','0000023','goods23.jpg'),('202302090803118f58b8','298','花好月圆永生花台灯/送老师长辈定制款','1','114515','0000024','goods24.jpg'),('20230211123022da704f','152','你是唯一','1','202302f02801','0000002','goods2.jpg'),('20230212054845a045d2','229','亲爱的/情人节网红款/19枝','1','114515','0000001','goods1.jpg'),('20230212054921e33bd6','179','母爱','1','114515','0000015','goods15.jpg'),('20230213045642079c22','228','韩式系列/一路向阳','1','202302f02801','0000011','goods11.jpg'),('2023021304575317763f','699','一见倾心/镜面爱心永生花礼盒-挚爱红','1','202302f02801','0000021','goods21.jpg'),('20230215104710e03ef4','152','你是唯一','1','114515','0000002','goods2.jpg'),('202303030902300db467','229','亲爱的/情人节网红款/19枝','1','114516','0000001','goods1.jpg'),('20230506105954d9b835','298','一鹿(路)有你永生花小夜灯','1','2023057e4829','0000022','goods22.jpg');
/*!40000 ALTER TABLE `tbl_car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_flower`
--

DROP TABLE IF EXISTS `tbl_flower`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_flower` (
  `sid` varchar(20) NOT NULL,
  `pid` varchar(20) NOT NULL,
  `fid` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `materials` varchar(200) NOT NULL,
  `Flowerlang` varchar(200) NOT NULL,
  `Pack` varchar(200) NOT NULL,
  `sell` varchar(10) NOT NULL,
  `describes` varchar(200) NOT NULL,
  `kinds` varchar(10) NOT NULL,
  `pic` varchar(200) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_flower`
--

LOCK TABLES `tbl_flower` WRITE;
/*!40000 ALTER TABLE `tbl_flower` DISABLE KEYS */;
INSERT INTO `tbl_flower` VALUES ('000000','114515','0000001','亲爱的/情人节网红款/19枝',' 红玫瑰卡罗拉19枝','亲爱的，爱上你，从那天起，甜蜜的很轻易','守护爱情防水牛皮纸（亲爱的1张）热恋1张，浪漫唯爱1张，白色牛奶棉3张，2张白色人造纸，1条白色烫金丝带','229','红玫瑰19枝','爱情','goods1.jpg'),('000000','114515','0000002','你是唯一',' 卡罗拉红玫瑰11枝、白色满天星3枝、尤加利10枝','人间蹉跎，你是唯一值得','红/金色鎏金纸5张、白色雪梨纸2张、酒红色罗纹烫金丝带2米','152','卡罗拉红玫瑰11枝','爱情','goods2.jpg'),('000000','114515','0000003','深情挚爱/33枝','卡罗拉玫瑰33枝','许你三生三世，可伴朝朝暮暮','红色风华纸3大张、 白色小号英文插画纸（You are my love）4张、白色雪梨纸1张、酒红色罗纹烫金丝带2米','229','[情人节新品] 红玫瑰19枝','爱情','goods3.jpg'),('000000','114515','0000004','韩式系列/绽放','香槟玫瑰3枝、向日葵3枝、橙色多头玫瑰2枝、尤加利叶5枝',' 元气满满，永远向着太阳','蜜瓜/奶茶色欧雅纸4张、香槟色雪梨纸2张、浅粉色罗纹玫瑰金丝带2米','198 ','向日葵+香槟玫瑰+多头玫瑰','爱情','goods4.jpg'),('000000','114515','0000005','我心有你/情人节限定款',' 红玫瑰卡罗拉13枝搭配成心形；白玫瑰26枝围绕','天上有云，林间有雾，我心有你','贝斯特银色抱抱桶大号（20cm直径），白色烫金丝带蝴蝶结，鱼尾纱丝带蝴蝶结','381','红玫瑰13枝、白玫瑰26枝','爱情','goods5.jpg'),('000000','114515','0000006','爱你/红玫瑰香水百合小号',' 卡罗拉红玫瑰11枝、白色香水百合2枝、尤加利叶10枝',' 永远爱你，百年好合',' 黑色雾面纸7张、白色雪梨纸2张、酒红色罗纹烫金丝带2米','206','卡罗拉红玫瑰11枝、白色香水百合2枝、尤加利叶10枝','爱情','goods6.jpg'),('000000','114515','0000007','用心爱你','  33枝戴安娜粉玫瑰、66枝卡罗拉红玫瑰、10枝满天星',' 不管时空怎么转变，世界怎么改变，你的爱总在我心间。','粉色opp雾面纸6张、酒红色缎带2米','229','99枝：33枝粉玫瑰＋66枝卡罗拉红玫瑰','爱情','goods7.jpg'),('000000','114515','0000008','星辰大海/52枝',' 52枝碎冰蓝玫瑰（坦尼克白玫瑰，使用密西根碎冰蓝边缘喷淡蓝色工艺处理）',' 送给你的希望是星辰和大海',' 茵蓝/白 欧雅纸10张，密西根碎冰蓝37#喷漆（注意：只喷边缘淡蓝色），英文纸Pretty flowers studio，4张，牛奶棉白色3张，烫金罗纹缎带浅蓝色2米，鱼尾丝带白色1米','400','碎冰蓝玫瑰52枝','爱情','goods8.jpg'),('000000','114515','0000011','韩式系列/一路向阳','韩式花束系列：向日葵3枝、香槟玫瑰9枝、橙色多头玫5枝、黄色或橙色腊梅5枝、大叶尤加利5枝（腊梅花期为11-4月初，其他季节用跳舞兰或其他黄色线状花材代替）','以秋色和暖阳为设计主题，打造全新韩式系列，在凛冽冬日，你的爱就像一束阳光，照进了我的心中！','姜黄色双面牛皮纸8张、白色雪梨纸1大张、浅粉色罗纹玫瑰金丝带2米','228','向日葵3枝、香槟玫瑰9枝、橙色多头玫5枝、黄色腊梅5枝、大叶尤加利5枝','长辈','goods11.jpg'),('000000','114515','0000012','韩式系列/温柔以待','韩式花束系列：粉色康乃馨13枝，戴安娜粉玫瑰5枝、3头以上粉色洋桔梗5枝、浅紫紫罗兰5枝（紫罗兰花期为12-4月，其他月份用浅紫色金鱼草/浅紫色桔梗/浅紫色风铃花等相似线状花材替代）、尤加利10枝','温柔的人，都是人间宝藏','嫣粉/玫粉色欧雅纸8张、白色雪梨纸2大张、浅粉色罗纹玫瑰金丝带2米','239','粉色康乃馨13枝，戴安娜玫瑰5枝、粉色洋桔梗5枝、浅紫紫罗兰5枝、尤加利10枝','长辈','goods12.jpg'),('000000','114515','0000013','真挚祝福',' 红色康乃馨33枝、香槟玫瑰9枝、向日葵3枝、尤加利叶5枝','一生中有很多祝福，最真挚的祝福送给你',' 红/金色鎏金纸6张、香槟色雪梨纸2张、酒红色罗纹烫金丝带2米','339','红康乃馨33枝、香槟玫瑰9枝、向日葵3枝','长辈','goods13.jpg'),('000000','114515','0000014','恩情无限',' 粉色康乃馨11枝，粉色多头香水百合2枝，栀子叶10枝','我想在阳光下满身花香，我想在阳光下沐浴清新，我想在清新里感受每一天的好时光..','白色雪梨纸，米白色平面纸，粉色吊花压纹纸 银灰色缎带','196','粉色康乃馨11枝，百合2枝','长辈','goods14.jpg'),('000000','114515','0000015','母爱','  玫红色康乃馨9枝、粉色多头康乃馨10枝',' 这一生的浪漫与宠溺，记得给母亲留一份','樱粉色雪梨纸3张、香芋紫人造纸2张、粉色opp雾面纸3张、白蓝罗纹带1米','179','玫红色康乃馨9枝、粉色多头康乃馨10枝','长辈','goods15.jpg'),('000000','114515','0000016','圆满','  粉百合2枝、卡罗拉红玫瑰9枝、叶上花10枝、红色康乃馨15枝、粉色洋桔梗5枝','载着寓意希望的鲜花驶向快乐幸福的彼岸……用途：祝福、感谢、探望、访友','长方形有柄花篮一个（花篮款式以各城市实际出货为准）','296','粉百合2枝、卡罗拉红玫瑰9枝、红色康乃馨15枝','长辈','goods16.jpg'),('000000','114515','0000017','健康长久','  红色康乃馨99枝、红多头康乃馨10枝、栀子叶15枝',' 时光时光慢些吧，不想让你再变老啦~我愿用我一切，换你岁月长留','红/金色鎏金纸7张、樱粉色雪梨纸3张、酒红色罗纹烫金丝带2米','496','红色康乃馨99枝、红多头康乃馨10枝','长辈','goods17.jpg'),('000000','114515','0000018','韩式系列/乘风破浪','  向日葵3枝、橙色康乃馨19枝、香槟玫瑰11枝、橙色（或黄色）腊梅2枝（腊梅属于季节性花材，缺货则用跳舞兰或者橙色多头玫瑰等类似花材代替）、尤加利5枝','但愿你在人生每个年龄段，都有乘风破浪的勇气，活出最美的自己',' 红/金色鎏金纸5张、香槟色雪梨纸3张、浅粉色罗纹玫瑰金丝带2米','359','向日葵3枝、橙色康乃馨19枝、香槟玫瑰11枝、橙色腊梅2枝','长辈','goods18.jpg'),('000000','114515','0000021','一见倾心/镜面爱心永生花礼盒-挚爱红','  花材：60枝左右永生红玫瑰（由于玫瑰自然生长大小稍有差异，所以使用玫瑰数量会略有差异，请知悉）尺寸：长35*宽35*高15cm','无',' 礼盒','699','精品大号镜面心形红玫瑰永生花','朋友','goods21.jpg'),('000000','114515','0000022','一鹿(路)有你永生花小夜灯','哥伦比亚进口玫瑰、绣球，苔藓，满天星等、小鹿公仔，经花艺师手工精制而成','无','精致永生花礼盒','298','永生花礼盒','朋友','goods22.jpg'),('000000','114515','0000023','招财猫永生花水晶球玻璃罩小夜灯',' 产品型号：水晶球玻璃罩','无','精致永生花礼盒（因发空运无法配备电池，需自行准备三节7号电池）','168','招财猫永生花水晶球小夜灯','朋友','goods23.jpg'),('000000','114515','0000024','花好月圆永生花台灯/送老师长辈定制款','花材：进口多色永生康乃馨、永生花玫瑰、双色永生绣球、尤加利果、松果、八角花','无',' 礼盒装','298','精选进口多色永生康乃馨台灯','朋友','goods24.jpg'),('000000','114515','0000025','迪奥520999双口红款永生花礼盒/红','厄瓜多尔进口永生红玫1朵(直径6-7CM)、红色小玫瑰2朵、进口红色永生玫瑰1朵、红色小果子','无','蓝色高档定制礼盒带化妆镜','999','迪奥520+999双口红定制礼盒，寓意我爱你久久久！','朋友','goods25.jpg'),('000000','114515','0000026','磁悬浮永生花灯/蓝牙音箱款','材质：PC环保材质+五金烤漆底座+透明PET圆球','无','无','399','磁悬浮创意永生花台灯，带蓝牙','朋友','goods26.jpg'),('000000','114515','0000027','永生花满月艺术台灯/朦胧粉','进口哥伦比亚优质永生花园玫瑰3朵，搭配绣球等永生花材，手工精制而成。','无',' 礼盒包装','398','永生花台灯','朋友','goods27.jpg'),('000000','114515','0000028','永生花加湿器/浪漫粉','粉心奥斯丁，3-4cm樱花粉玫瑰，塔状2号浅粉木绣球，2~3cm樱花粉玫瑰，玫红色米花，','无','精致礼盒','199','缺水自动断电保护 家居艺术美观大方实用礼物','朋友','goods27.jpg'),('000000','114515','20230209033733832f51','原神の小花','浓缩树脂','愿风神忽悠你','圣遗物の匣','999','原神の小花，买到赚到，op节限定','爱情','abb0d5d3-acfa-440c-8388-f1df6779082a.png'),('000000','114515','2023021111500911d47c','波奇','132','12312','12312','213','123123123','爱情','19d8b09c-31a8-42b8-bdee-795b76db5041.jpg'),('000000','114515','20230211121317222eb8','2312312','虹夏','1231','312312','312312','123312','朋友','b424f9eb-3696-414d-a5de-05711ef8ffe4.bmp'),('000000','114515','2023021112133228624b','12312','12312','12312','123123','1231','1231231231','爱情','e8e8d7cf-a3dc-42e8-97e1-2eaff35369cf.bmp'),('000000','114515','20230211121346ba1585','1321231','231231','12312','12312','12312','123123','爱情','d443bd6e-1a36-41e0-8674-1e50f8e52cf6.bmp'),('000000','114515','20230211121356d052a8','1231','12312','12312','1231','12312','12312','爱情','7fe97aa5-27b3-43df-8a2c-78e626221acd.bmp'),('000000','114515','20230211121405848081','12312','21312','12312','12312312','12312','12','爱情','2861138f-0b99-4dd4-81f0-ed46eaae06a5.bmp'),('000000','114515','2023021310013333a4c4','123','13123','123','123123','123123','1231','朋友','bf6aeb3d-6297-4c69-aafe-f51a39260213.jpg');
/*!40000 ALTER TABLE `tbl_flower` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_flower_ju`
--

DROP TABLE IF EXISTS `tbl_flower_ju`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_flower_ju` (
  `sid` varchar(20) NOT NULL,
  `pid` varchar(20) NOT NULL,
  `fid` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `materials` varchar(200) NOT NULL,
  `Flowerlang` varchar(200) NOT NULL,
  `Pack` varchar(200) NOT NULL,
  `sell` varchar(10) NOT NULL,
  `kinds` varchar(10) NOT NULL,
  `describes` varchar(200) NOT NULL,
  `pic` varchar(200) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_flower_ju`
--

LOCK TABLES `tbl_flower_ju` WRITE;
/*!40000 ALTER TABLE `tbl_flower_ju` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_flower_ju` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_order`
--

DROP TABLE IF EXISTS `tbl_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_order` (
  `fid` varchar(20) NOT NULL,
  `uid` varchar(20) NOT NULL,
  `pid` varchar(20) NOT NULL,
  `oid` varchar(50) NOT NULL,
  `name` varchar(20) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `totle` varchar(10) NOT NULL,
  `orderTime` varchar(50) NOT NULL,
  `statics` varchar(10) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `message` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_order`
--

LOCK TABLES `tbl_order` WRITE;
/*!40000 ALTER TABLE `tbl_order` DISABLE KEYS */;
INSERT INTO `tbl_order` VALUES ('0000003','202302360a96','114515','2023020807331564e092','璇璇','3123','12312312','229','2023-02-08 07:33','运输中','深情挚爱/33枝','你好'),('0000008','202302360a96','114515','20230208073432c62815','张三','114514','湖南','400','2023-02-08 07:34','已到货','星辰大海/52枝','节日快乐'),('0000011','202302360a96','114515','20230208073511a7b446','刘大爷','112432435','湖南衡阳','228','2023-02-08 07:35','已下单','韩式系列/一路向阳','生日快乐'),('0000023','114515','114515','202302090807375ba9eb','李田所妈妈','114514','下北泽','840','2023-02-09 08:07','已下单','招财猫永生花水晶球玻璃罩小夜灯','生日快乐'),('0000003','202302f02801','114515','20230211104134f3716e','后藤一里','2413647','下北泽','687','2023-02-11 10:41','运输中','深情挚爱/33枝','妹妹生日快乐'),('0000003','202302f02801','114515','20230211105342c0d720','妈妈','21324323','下北泽','229','2023-02-11 10:53','运输中','深情挚爱/33枝','节日快乐'),('0000011','202302f02801','114515','20230211105418e1c568','爸爸','21323412','下北泽','228','2023-02-11 10:54','已到货','韩式系列/一路向阳','节日快乐'),('0000002','202302f02801','114515','20230211122947c1813b','老公','21312','新日暮里','152','2023-02-11 12:29','运输中','你是唯一','老公生日快乐'),('0000011','114515','114515','2023021510475298a9b9','老师','213124','下北泽','228','2023-02-15 10:47','已下单','韩式系列/一路向阳','2312435'),('0000011','114514','114515','202302200430423c1656','张三','114514','下北泽','228','2023-02-20 04:30','已到货','韩式系列/一路向阳','节日快乐'),('0000022','2023057e4829','114515','2023050611050287f8e9','老婆','114514','下北泽','596','2023-05-06 11:05','运输中','一鹿(路)有你永生花小夜灯','纪念日快快乐');
/*!40000 ALTER TABLE `tbl_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_store`
--

DROP TABLE IF EXISTS `tbl_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_store` (
  `sid` varchar(20) NOT NULL,
  `pid` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `pic` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_store`
--

LOCK TABLES `tbl_store` WRITE;
/*!40000 ALTER TABLE `tbl_store` DISABLE KEYS */;
INSERT INTO `tbl_store` VALUES ('000000','114515','林檎之家','cfcd75db-04c1-4397-936e-b66873dbff7f.png'),('202302100204277a70a4','202302360a96','花园','2080cc77-99a4-4270-83ca-5740f8df60d7.jpg');
/*!40000 ALTER TABLE `tbl_store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_store_ju`
--

DROP TABLE IF EXISTS `tbl_store_ju`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_store_ju` (
  `sid` varchar(20) NOT NULL,
  `pid` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `pic` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_store_ju`
--

LOCK TABLES `tbl_store_ju` WRITE;
/*!40000 ALTER TABLE `tbl_store_ju` DISABLE KEYS */;
INSERT INTO `tbl_store_ju` VALUES ('202302131010265fa1d7','20230221ce3c','虹夏的小屋','91165a57-f91c-42e8-bad6-ac57f88a9827.png');
/*!40000 ALTER TABLE `tbl_store_ju` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tag_change`
--

DROP TABLE IF EXISTS `tbl_tag_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tag_change` (
  `cgid` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(20) NOT NULL,
  `Tag` varchar(5) NOT NULL,
  `infor` varchar(200) NOT NULL,
  PRIMARY KEY (`cgid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tag_change`
--

LOCK TABLES `tbl_tag_change` WRITE;
/*!40000 ALTER TABLE `tbl_tag_change` DISABLE KEYS */;
INSERT INTO `tbl_tag_change` VALUES (7,'20230221ce3c','2','想开花店');
/*!40000 ALTER TABLE `tbl_tag_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_user` (
  `uid` varchar(20) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Tag` varchar(5) NOT NULL,
  `pic` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('114514','15151411455','李田所之母','8888','3','23ebaa57-fb12-49b1-a943-34bc68833f66.png'),('114515','15151411455','李田所之父','9999','2','b052535d-c58c-4020-b4f8-8194d5923868.jpg'),('114516','15151411455','李田所','123321132','3','p3.jpg'),('202003110101','13455667787','陈劲坤','88888888','1','618d8054-eaeb-482b-9b3f-9f8fc2261370.bmp'),('202302030245571c87e8','15151411455','张三','123321132','1',NULL),('202302040810341f3f0c','15655578890','刘xx','114514','3',NULL),('2023020408113032dc91','15655578890','田xx','114514','3',NULL),('20230221ce3c','14566778899','下北泽的虹夏','hongxia','3',NULL),('202302360a96','15655578890','张xx','114514','2','6c86e46e-b029-4d15-85d7-d97e2e9babca.png'),('202302a5ece7','15678990045','刘xx','8888','3',NULL),('202302f02801','89775654','后藤二里的姐姐','88888888','3','225c9c66-dc47-460a-b46c-4cc54e77144c.jpg'),('2023057e4829','15633445533','王二','123321132','3','0f713317-f62d-4643-accf-6e3e1c68826f.bmp');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-06 23:27:08
