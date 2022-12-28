DROP SCHEMA IF EXISTS trainViewer;
CREATE SCHEMA trainViewer;
USE trainViewer;

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
  FOREIGN KEY (country_name) REFERENCES country(country_name)
  		ON UPDATE CASCADE
  		ON DELETE CASCADE
);

DROP TABLE IF EXISTS alias_unknown;
CREATE TABLE alias_unknown (
	input VARCHAR(50) NOT NULL PRIMARY KEY
	);