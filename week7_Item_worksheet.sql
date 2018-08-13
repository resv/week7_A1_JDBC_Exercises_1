CREATE TABLE Item (id int, name varchar2(20), quantity_in_stock int, price number(10,2));

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (1,'Pen',10,1.00);

UPDATE ITEM set quantity_in_stock='900' where id='0'; 

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (2,'Pencil',30,.50);

UPDATE ITEM set quantity_in_stock='0' where id='6'; 

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (3,'Paper',5000,8.00);

UPDATE ITEM set quantity_in_stock='5000' where id='3'; 

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (4,'Postits',3000,2.00);

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (4,'Permanent Marker', 1500 ,5.50);

UPDATE ITEM set id='5' where price='5.5'; 

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (6,'Pencil Sharpeners', 900 ,3.00);

INSERT INTO ITEM (id, name, quantity_in_stock, price)
VALUES (7,'Pencil Case', 6000 ,2.50);

select * from item;

SELECT * FROM ITEM
WHERE ID=3;

commit;

SELECT * FROM ITEM
WHERE PRICE > 2;


UPDATE ITEM set quantity_in_stock='0' where id='4'; 
UPDATE ITEM set quantity_in_stock='0' where id='7'; 
UPDATE ITEM set quantity_in_stock='0' where id='5'; 
UPDATE ITEM set quantity_in_stock='0' where id='2'; 
UPDATE ITEM set quantity_in_stock='0' where id='3'; 