/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 10.1.34-MariaDB : Database - bd_systeme_scolaire
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bd_systeme_scolaire` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bd_systeme_scolaire`;

/*Table structure for table `eleve` */

DROP TABLE IF EXISTS `eleve`;

CREATE TABLE `eleve` (
  `id_eleve` int(10) NOT NULL AUTO_INCREMENT,
  `matricule` varchar(15) NOT NULL,
  `nom` varchar(20) DEFAULT NULL,
  `prenom` varchar(20) NOT NULL,
  `sexe` varchar(8) DEFAULT NULL,
  `date_nais` varchar(10) DEFAULT NULL,
  `nationalite` varchar(20) DEFAULT NULL,
  `addresse` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `niveau` varchar(10) DEFAULT NULL,
  `filiere` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_eleve`,`matricule`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `eleve` */

insert  into `eleve`(`id_eleve`,`matricule`,`nom`,`prenom`,`sexe`,`date_nais`,`nationalite`,`addresse`,`age`,`niveau`,`filiere`) values (1,'15T2778','KUETE ','Brandol','Masculin','1998-01-06','Camerounais','Obili,Yaound',20,'Niveau 3','Informatique'),(2,'15V1247','TABOUA','Francklin','Masculin','1995-02-08','Camerounais','Olembe,Yaounde',24,'Niveau 4','Genie civil'),(3,'02uds12','LACTIO','Kevin','Masculin','1994-02-14','Camerounais','Obili,Yaounde',25,'Niveau 3','Analyse-Conception'),(4,'12T4571','ONAMBA','Deborah','Feminin','1993-07-23','Nigerienne','Oke,Lagos',27,'Niveau 5','Sciences economique'),(5,'18V2598','MELONG MELI','Junior','Masculin','12-12-1998','CAmerounais','Etoudi/Yaoundé',20,'','Mathématiques'),(6,'18Z4578','Tamo','Morel','Masculin','12-10-1996','Camerounais','Buéa',22,'','Mathématiques'),(7,'14X2778','Kuete','Brice','Masculin','14-02-1998','Camerounais','Bonaberi/Douala',20,'','Informatique');

/*Table structure for table `enseignant` */

DROP TABLE IF EXISTS `enseignant`;

CREATE TABLE `enseignant` (
  `id_Enseig` int(11) NOT NULL AUTO_INCREMENT,
  `matricule` varchar(10) NOT NULL,
  `nom` varchar(20) DEFAULT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  `sexe` varchar(8) DEFAULT NULL,
  `date_nais` varchar(10) DEFAULT NULL,
  `nationalite` varchar(25) DEFAULT NULL,
  `addresse` varchar(30) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `situationMat` varchar(10) DEFAULT NULL,
  `specialite` varchar(25) DEFAULT NULL,
  `grade` varchar(25) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `salaire` float DEFAULT NULL,
  PRIMARY KEY (`id_Enseig`,`matricule`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `enseignant` */

insert  into `enseignant`(`id_Enseig`,`matricule`,`nom`,`prenom`,`sexe`,`date_nais`,`nationalite`,`addresse`,`age`,`situationMat`,`specialite`,`grade`,`email`,`telephone`,`salaire`) values (1,'01EN10','KOUOKAM','Andre','Masculin','12-04-1955','Camerounais','Maetur/Bafoussam',63,'','Francais','Professeur','kouokam@yahoo.fr','655874521',80000),(2,'02EN20','Kankeu Fowe','Marcel','Masculin','25-04-1982','Camerounais','Toket/Bafoussam',36,'','Physique','Charge de cours','marcelfowe@yahoo.fr','697458541',100000),(3,'05EN58','ONANA','Veronique','Feminin','14-02-1981','Camerounaise','Bastos/Yaounde',37,'','Mathematique','Pleg','veroniqonana@gmail.com','658745123',102000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
