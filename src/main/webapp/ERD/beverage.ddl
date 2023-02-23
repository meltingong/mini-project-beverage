/**********************************/
/* Table Name: admin */
/**********************************/
CREATE TABLE admin(
		admin_no                      		NUMBER(10)		 NULL ,
		admin_id                      		VARCHAR2(50)		 NOT NULL,
		admin_pw                      		VARCHAR2(50)		 NOT NULL,
		admin_name                    		VARCHAR2(10)		 NOT NULL
);

CREATE SEQUENCE admin_admin_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE admin is 'admin';
COMMENT ON COLUMN admin.admin_no is 'admin_no';
COMMENT ON COLUMN admin.admin_id is 'admin_id';
COMMENT ON COLUMN admin.admin_pw is 'admin_pw';
COMMENT ON COLUMN admin.admin_name is 'admin_name';


/**********************************/
/* Table Name: category */
/**********************************/
CREATE TABLE category(
		ca_no                         		NUMBER(10)		 NULL ,
		ca_name                       		VARCHAR2(100)		 NULL 
);

CREATE SEQUENCE category_ca_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE category is 'category';
COMMENT ON COLUMN category.ca_no is 'ca_no';
COMMENT ON COLUMN category.ca_name is 'ca_name';


/**********************************/
/* Table Name: ingredient */
/**********************************/
CREATE TABLE ingredient(
		i_no                          		NUMBER(10)		 NULL ,
		i_name                        		VARCHAR2(50)		 NULL ,
		i_detail                      		VARCHAR2(100)		 NULL 
);

CREATE SEQUENCE ingredient_i_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE ingredient is 'ingredient';
COMMENT ON COLUMN ingredient.i_no is 'i_no';
COMMENT ON COLUMN ingredient.i_name is 'i_name';
COMMENT ON COLUMN ingredient.i_detail is 'i_detail';


/**********************************/
/* Table Name: Beverage */
/**********************************/
CREATE TABLE Beverage(
		b_no                          		NUMBER(10)		 NULL ,
		b_name                        		VARCHAR2(50)		 NULL ,
		b_image                       		VARCHAR2(100)		 NULL ,
		ca_no                         		NUMBER(10)		 NULL ,
		i_no                          		NUMBER(10)		 NULL 
);

CREATE SEQUENCE Beverage_b_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Beverage is 'Beverage';
COMMENT ON COLUMN Beverage.b_no is 'b_no';
COMMENT ON COLUMN Beverage.b_name is 'b_name';
COMMENT ON COLUMN Beverage.b_image is 'b_image';
COMMENT ON COLUMN Beverage.ca_no is 'ca_no';
COMMENT ON COLUMN Beverage.i_no is 'i_no';



ALTER TABLE admin ADD CONSTRAINT IDX_admin_PK PRIMARY KEY (admin_no);

ALTER TABLE category ADD CONSTRAINT IDX_category_PK PRIMARY KEY (ca_no);

ALTER TABLE ingredient ADD CONSTRAINT IDX_ingredient_PK PRIMARY KEY (i_no);

ALTER TABLE Beverage ADD CONSTRAINT IDX_Beverage_PK PRIMARY KEY (b_no);
ALTER TABLE Beverage ADD CONSTRAINT IDX_Beverage_FK0 FOREIGN KEY (ca_no) REFERENCES category (ca_no);
ALTER TABLE Beverage ADD CONSTRAINT IDX_Beverage_FK1 FOREIGN KEY (i_no) REFERENCES ingredient (i_no);

