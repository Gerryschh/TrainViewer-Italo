DROP SCHEMA IF EXISTS trainViewerItalo;
CREATE SCHEMA trainViewerItalo;
USE trainViewerItalo;

DROP TABLE IF EXISTS country;
CREATE TABLE country (
  country_name VARCHAR(50) NOT NULL PRIMARY KEY,
  alpha2_code VARCHAR(2) NOT NULL

);

DROP TABLE IF EXISTS alias;
CREATE TABLE alias (
  alias_country VARCHAR(50) NOT NULL PRIMARY KEY,
  country_name VARCHAR(50) NOT NULL,
  approved BOOLEAN DEFAULT FALSE NOT NULL,
  algorithm VARCHAR(20) NOT NULL,
  FOREIGN KEY (country_name) REFERENCES country(country_name)
  		ON UPDATE CASCADE
  		ON DELETE CASCADE
);

DROP TABLE IF EXISTS alias_unknown;
CREATE TABLE alias_unknown (
	input VARCHAR(50) NOT NULL PRIMARY KEY
	);
	
DROP TABLE IF EXISTS train;
CREATE TABLE train (
  id_train INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  matricola_treno VARCHAR(10) NOT NULL,
  departure VARCHAR(50) NOT NULL,
  arrive VARCHAR(50) NOT NULL,
  FOREIGN KEY (departure) REFERENCES country(country_name) 
  		ON UPDATE CASCADE
  		ON DELETE CASCADE,
  	FOREIGN KEY (arrive) REFERENCES country(country_name) 
  		ON UPDATE CASCADE
  		ON DELETE CASCADE
);

DROP TABLE IF EXISTS userr;
CREATE TABLE userr (
  user_name VARCHAR(20) NOT NULL PRIMARY KEY,
  user_password VARCHAR(20) NOT NULL,
  user_mail VARCHAR(50) NOT NULL,
  isAdmin BOOLEAN DEFAULT FALSE NOT NULL
);