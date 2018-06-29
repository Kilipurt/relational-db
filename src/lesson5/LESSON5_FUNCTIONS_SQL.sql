SELECT PRODUCT_NAME, SUM(PRICE) FROM ORDERS
GROUP BY PRODUCT_NAME;

SELECT PRODUCT_NAME, AVG(PRICE) FROM ORDERS
GROUP BY PRODUCT_NAME;

SELECT PRODUCT_NAME, PRICE FROM ORDERS
ORDER BY PRODUCT_NAME ASC;

SELECT PRODUCT_NAME, PRICE FROM ORDERS
ORDER BY PRODUCT_NAME DESC;

SELECT * FROM ORDERS
ORDER BY PRICE ASC;

SELECT SUM(PRICE) FROM ORDERS;
--ORDER BY PRODUCT_NAME;

SELECT COUNT(*) FROM ORDERS;

SELECT COUNT(*) FROM ORDERS
WHERE PRICE > 100;

SELECT * FROM ORDERS
WHERE EXISTS (SELECT * FROM PRODUCTS WHERE NAME = ORDERS.PRODUCT_NAME);

SELECT * FROM ORDERS
WHERE EXISTS (SELECT * FROM PRODUCTS WHERE NAME = ORDERS.PRODUCT_NAME AND COST_PRICE > ORDERS.PRICE);

SELECT * FROM ORDERS WHERE PRICE BETWEEN 1 AND 100;

SELECT * FROM ORDERS WHERE DATE_ORDDERED BETWEEN TO_TIMESTAMP('2017/01/01 00:00:00', 'yyyy/mm/dd hh24:mi:ss') AND TO_TIMESTAMP('2017/12/10 23:00:00', 'yyyy/mm/dd hh24:mi:ss');

SELECT * FROM ORDERS WHERE PRODUCT_NAME LIKE '%toy%';