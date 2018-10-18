
CREATE TABLE exchange_rates1(
   Currency_name      VARCHAR(21) NOT NULL PRIMARY KEY
  ,toUSD_rate       NUMERIC(11,6) NOT NULL
  ,fromUSD_rate   NUMERIC(8,6) NOT NULL
);

CREATE TABLE user_info(
   username      VARCHAR(21) NOT NULL PRIMARY KEY
  ,password       VARCHAR(8) NOT NULL
  ,nativeCountry VARCHAR(21) NOT NULL 
  , lastConversion VARCHAR(21) NOT NULL
  
);

CREATE TABLE country_info(
   Country_name VARCHAR(21) NOT NULL PRIMARY KEY
   ,country_currencyName VARCHAR(21) NOT NULL
);


INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Argentina',  'Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Australia', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Bahrain', 'Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Botswana', 'Pula');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Brazil', 'real');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Britain','Pound');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Brunei', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Bulgaria', 'Lev');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Canada','Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Chile', 'Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('China', 'Yuan Renminbi');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Colombia', 'Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Croatia', 'Kuna');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Czech', 'Koruna');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Denmark', 'Krone');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Emirate', 'Dirham');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('European Region','Euro');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Hong Kong', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Hungary' , 'Forint');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Iceland', 'Krona');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('India','Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Indonesia', 'Rupiah');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Iran', 'Rial');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Israel', 'Shekel');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Japan' , 'Yen');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Kazakhstan', 'Tenge');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Kuwait' , 'Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Libya', 'Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Malaysia', 'Ringgit');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Mauritius', 'Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Mexico', 'Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Nepal', 'Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('New Zealand', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Norwegia', 'Krone');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Oman', 'Rial');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Pakistan', 'Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Philippines', 'Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Poland',  'Zloty');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Qatar',  'Riyal');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Romania', 'New Leu');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Russia','Ruble');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Saudi Arabia', 'Riyal');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Singapore', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('South Africa',  'Rand');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('South Korea', 'Won');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Sri Lanka', 'Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Sweden',  'Krona');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Switzerland', 'Franc');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Taiwan', 'New Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Thailand', 'Baht');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Trinidad', 'Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Turkey',  'Lira');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Venezuela', 'Bolivar');


