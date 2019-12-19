CREATE DATABASE  IF NOT EXISTS `bookworm_db`;
USE `bookworm_db`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
	`id` int NOT NULL AUTO_INCREMENT,
    `google_id` varchar(45) DEFAULT NULL,
    `title` varchar(400) DEFAULT NULL,
	`published_date` varchar(45) DEFAULT NULL,
    `description` text DEFAULT NULL,
    `page_count` int DEFAULT NULL,
    `image` text DEFAULT NULL,
	`image_small` text DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `book`
--

--