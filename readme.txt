Hi there, in this project spring boot is used to create an inventory app.

H2 in memory database has been used.

There are 3 rest apis created for these 3 actions which are -> create items in an inventory, get all items from the inventory
and finally get item by name from the inventory!

Also, there are classes in the model package to support dto (Data Transfer Object), response, etc. in this project app.

Some annotation have been used in this spring boot project these are: - @Autowired, @Component, @Repository, @RestController
@RequestMapping, etc. these annotations are used to reduce the boiler-plate code in java (spring boot). Which made this project simpler
and more, easier to read and understand.

There is an entity class representing the Entity for the in-memory (H2) database!

And the interface ItemsRepository enables the outflow and inflow of the data from
and towards the h2 in-memory database.

The ItemService class within the package services is used to interact with the hibernate, which
further interacts with the in-memory h2 database to save data, retrieve data.

I will share postman collection in json format, along with this project setup!

I hope you enjoy this project while testing and running this in your own system.
