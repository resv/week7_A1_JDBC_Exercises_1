--------------------------------------------------------
--  File created - Sunday-August-12-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ITEM
--------------------------------------------------------

  CREATE TABLE "C##ADAMJDBC"."ITEM" 
   (	"ID" NUMBER(*,0), 
	"NAME" VARCHAR2(20 BYTE), 
	"QUANTITY_IN_STOCK" NUMBER(*,0), 
	"PRICE" NUMBER(10,2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##ADAMJDBC.ITEM
SET DEFINE OFF;
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (1,'Pen',5500,1);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (2,'Pencil',0,0.5);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (3,'Paper',0,8);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (4,'Post its',0,2);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (5,'Permanent Marker',0,5.5);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (6,'Pencil Sharpeners',0,3);
Insert into C##ADAMJDBC.ITEM (ID,NAME,QUANTITY_IN_STOCK,PRICE) values (7,'Pencil Case',0,2.5);
