# car-api
Spring Boot Api 

How to Run Open application propertien in resource change database name and databse user 

Post Method
===================================
#localhost:8081/car/add


Request : { "carName": "Tesla", "type": "Electric", "number": "B 0012 FED", "coloe": "black" }

Get Method
===================================

#Get All Car

#localhost:8081/getcar

#Get Car With Id

#localhost:8081/getcar/id?id=carId

#Put Method

Update Method
===================================

#localhost:8081/updatecar

Request : {"id": 1, "carName": "Tesla", "type": "Electric", "number": "B 0012 FED", "coloe": "black" }

Delete Method
===================================
#localhost:8081/deletecar?id=1


