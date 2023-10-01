DROP TABLE IF EXISTS `inflation`;

CREATE TABLE `inflation` (
  `year` int NOT NULL,
  `inflation` float NOT NULL DEFAULT '0',
  `average_floor_price` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`year`)
);


DROP TABLE IF EXISTS `house`;

CREATE TABLE `house` (
  `id` int NOT NULL AUTO_INCREMENT,
  `street` char(255) NOT NULL,
  `number` int NOT NULL,
  `construction_year` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `address` (`street`,`number`)
) ;


DROP TABLE IF EXISTS `apartment`;

CREATE TABLE `apartment` (
  `number` int NOT NULL,
  `area` int NOT NULL,
  `house` int NOT NULL,
  `owner` int NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
  ) ;

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` text,
  `birthdate` date DEFAULT NULL,
  `residence` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);


DROP TABLE IF EXISTS `trade`;

CREATE TABLE `trade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apartment` int NOT NULL,
  `seller` int NOT NULL,
  `price` decimal(15,2) NOT NULL,
  `completed_on` date NOT NULL,
  PRIMARY KEY (`id`)
) ;

DROP view IF EXISTS `vw_trade`;

Create view vw_trade
AS
select
	a.id as trade_id,
	a.apartment,
    b.number,
    b.area,
    b.house,
    b.owner,
    a.seller,
    c.name,
    c.birthdate,
    a.price,
    a.completed_on
from  trade a
join  apartment b
on 	  a.apartment = b.id
join  person c
on	a.seller = c.id;