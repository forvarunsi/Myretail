myRetail
myRetail Restful service

Technologies
JDK 1.8.0

Maven 4.0

SpringBoot 1.5.3.RELEASE


Application will start running on port 8088

Calling myretail api services
Performing GET request on http://localhost:8085/product/1 will return json object with product information and pricing information.


POST http://localhost:8085/product/create/

request body :

{"name": "The Big Lebowski (Blu-ray)", "productPrice": { "price": 1000.00, "currencyCode": "USD" } }

PUT http://localhost:8085/product/update/1

Request Body:-

{ "id": 1, "productPrice": { "price": 1000.00, "currencyCode": "USD" } }

Response :-

{ "id": 1, "name": "The Big Lebowski (Blu-ray)", "productPrice": { "price": 1000.00, "currencyCode": "USD" } }


GET http://localhost:8085/product/1

Response:-

{ "id": 13860428, "name": "The Big Lebowski (Blu-ray)", "productPrice": { "price": 1000, "currencyCode": "USD" } }

To perform PUT operation, send JSON object with updated price in request body, it will return JSON object with updated pricing information.

