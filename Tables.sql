
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


INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Argentina',  'Argentine Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Australia', 'Australian Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Bahrain', 'Botswana Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Botswana', 'Botswana Pula');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Brazil', 'Brazilian real');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Britain','British Pound');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Brunei', 'Bruneian Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Bulgaria', 'Bulgarian Lev');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Canada','Canadian Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Chile', 'Chilean Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('China', 'Chinese Yuan Renminbi');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Colombia', 'Colombian Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Croatia', 'Croatian Kuna');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Czech', 'Czech Koruna');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Denmark', 'Danish Krone');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Emirate', 'Emirati Dirham');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('European Region','Euro');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Hong Kong', 'Hong Kong Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Hungary' , 'Hungarian Forint');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Iceland', 'Icelandic Krona');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('India','Indian Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Indonesia', 'Indonesian Rupiah');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Iran', 'Iranian Rial');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Israel', 'Israeli Shekel');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Japan' , 'Japanese Yen');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Kazakhstan', 'Kazakhstani Tenge');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Kuwait' , 'Kuwaiti Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Libya', 'Libyan Dinar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Malaysia', 'Malaysian Ringgit');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Mauritius', 'Mauritian Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Mexico', 'Mexican Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Nepal', 'Nepalese Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('New Zealand', 'New Zealand Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Norwegia', 'Norwegian Krone');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Oman', 'Omani Rial');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Pakistan', 'Pakistani Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Philippines', 'Philippine Peso');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Poland',  'Polish Zloty');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Qatar',  'Qatari Riyal');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Romania', 'Romanian New Leu');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Russia','Russian Ruble');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Saudi Arabia', 'Saudi Arabian Riyal');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Singapore', 'Singapore Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('South Africa',  'South AfricanRand');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('South Korea', 'South KoreanWon');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Sri Lanka', 'Sri Lankan Rupee');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Sweden',  'Swedish Krona');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Switzerland', 'Swiss Franc');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Taiwan', 'Taiwan New Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Thailand', 'Thai Baht');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Trinidad', 'Trinidadian Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Turkey',  'Turkish Lira');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('United States',  'US Dollar');
INSERT INTO country_info(Country_name,country_currencyName) VALUES ('Venezuela', 'Venezuelan Bolivar');


