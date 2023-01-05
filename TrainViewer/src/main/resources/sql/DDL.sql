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
  mat_train VARCHAR(10) NOT NULL,
  departure VARCHAR(50) NOT NULL,
  arrival VARCHAR(50) NOT NULL,
  train_brand VARCHAR(50) NOT NULL,
  FOREIGN KEY (departure) REFERENCES country(country_name) 
  		ON UPDATE CASCADE
  		ON DELETE CASCADE,
  	FOREIGN KEY (arrival) REFERENCES country(country_name) 
  		ON UPDATE CASCADE
  		ON DELETE CASCADE
);

DROP TABLE IF EXISTS userr;
CREATE TABLE userr (
  user_mail VARCHAR(50) NOT NULL PRIMARY KEY,
  user_password VARCHAR(20) NOT NULL,
  user_name VARCHAR(20) NOT NULL,
  is_admin BOOLEAN DEFAULT FALSE NOT NULL
);