SELECT year, price,product_name
FROM Sales 
INNER JOIN Product
ON Sales.product_id = Product.product_id;
