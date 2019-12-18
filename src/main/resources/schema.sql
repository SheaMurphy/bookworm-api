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

 INSERT INTO `book` VALUES
 	(1,'axwKsXldFvkC','Animal Farm','2010','This book offers a beautiful series of stories reflecting transitions of life, emotional maturation and its gifts. Every time we grow to a new understanding, we die a little to the old, so life becomes many deaths, the closing of many doors.The wise person is one who walks through each new doorway to a new life, letting the old one close behind without regret, or despair, or clinging hold.Whatever your problem may be, know that the same one has been met and conquered by someone, with bravery and with understanding. Facing the problem and overcoming it will make you a better, happier person because by that effort, you will release your Imprisoned Splendor.', 114, 'http://books.google.com/books/content?id=ML3_9m6LVhAC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api', 'http://books.google.com/books/content?id=ML3_9m6LVhAC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api'),
     (2,'mbaEAgAAQBAJ','Brain Mystery Light and Dark','2006-06-07','Brain Mystery Light and Dark examines scientific models of how the brain becomes conscious and argues that the spiritual dimension of life is compatible with the main scientific theories. Keyes shows us that the belief in the unity of mind and brain does not necessarily undermine aesthetic, religious, and ethical beliefs.', 184, 'http://books.google.com/books/content?id=RBlADwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api', 'http://books.google.com/books/content?id=RBlADwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api'),
     (3,'ML3_9m6LVhAC','Close the Door Softly As You Go','1982-01-01','This book offers a beautiful series of stories reflecting transitions of life, emotional maturation and its gifts. Every time we grow to a new understanding, we die a little to the old, so life becomes many deaths, the closing of many doors.The wise person is one who walks through each new doorway to a new life, letting the old one close behind without regret, or despair, or clinging hold.Whatever your problem may be, know that the same one has been met and conquered by someone, with bravery and with understanding. Facing the problem and overcoming it will make you a better, happier person because by that effort, you will release your Imprisoned Splendor.', 880, 'http://books.google.com/books/content?id=ML3_9m6LVhAC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api', 'http://books.google.com/books/content?id=ML3_9m6LVhAC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api');
