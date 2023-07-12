# watch-shop-rest-api

Main watch shop functionality.

Tested.

Prerequisite:
-
- JDK 11 or higher
- Maven 4.0.0

Program main functional:
-
getAllProducts: `api/v1/products`

getProductsSortedByPrice: `api/v1/products/sort/price`

getProductSortedByColor: `api/v1/products/sort/color`

getProductSortedByDateOfReceipt: `api/v1/products/sort/dateOfReceipt`

getTotalCost: `api/v1/products/totalCost`

addWatch: `api/v1/products/watch`

example JSON:

{
	"price": 144.5,
	"color": "Dark-Metal-Green",
	"dateOfReceipt": "2023-02-01",
	"brand": "rolex"
}

addClock: `api/v1/products/clock`

example JSON:

{
	"price": 75.5,
	"color": "Silver",
	"dateOfReceipt": "2023-03-02",
	"brand": "royal"
}
