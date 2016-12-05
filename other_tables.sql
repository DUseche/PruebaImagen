CREATE TABLE IMAGENES(
	name varchar(50) NOT NULL,
	imagen blob NOT NULL,
	CONSTRAINT name_pk PRIMARY KEY (name)
)ENGINE=InnoDB  ;