--INSERT
INSERT INTO PRODUCTS
VALUES(101, 't-shirt', '001', 10);

INSERT INTO PRODUCTS
VALUES(102, 'test2', '002', 20);

INSERT INTO PRODUCTS
VALUES(103, 'test3', '003', 30);

INSERT INTO PRODUCTS
VALUES(104, 't-shirt', '004', 40);

INSERT INTO PRODUCTS
VALUES(105, 'toy123', '005', 50);

INSERT INTO PRODUCTS
VALUES(106, 'test6', '006', 60);

INSERT INTO PRODUCTS
VALUES(107, 'test7', '007', 70);

INSERT INTO PRODUCTS
VALUES(108, 'test8', '008', 80);

INSERT INTO PRODUCTS
VALUES(109, 'test9', '009', 90);

INSERT INTO PRODUCTS
VALUES(1006, 'test10', 'someManufacturer', 100);

--SELECT
SELECT * FROM PRODUCTS WHERE NAME = 'toy123' AND COST_PRICE = 50;
SELECT * FROM PRODUCTS WHERE ID = 1005 OR COST_PRICE < 50;
SELECT * FROM PRODUCTS WHERE ID > 1005 AND MANUFACTURE_NAME = 'someManufacturer';
SELECT * FROM PRODUCTS;

--UPDATE
UPDATE PRODUCTS SET MANUFACTURE_NAME = 'china' WHERE NAME = 't-shirt';

--DELETE
DELETE FROM PRODUCTS WHERE ID < 1050;