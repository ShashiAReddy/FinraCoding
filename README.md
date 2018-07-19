# Finra Order Placement
# Project architecture and software design document:

I created the the entity classes in the location: \order-placement\src\main\java\com\findra\orderplacement\entity
	The following entities were created:
		Customer, 
		Inventory, 
		Order, 
		Product

Corresponding Repository was created for data access from database and bean will be injected during runtime by Spring Data JPA
	The following entities were created: \order-placement\src\main\java\com\findra\orderplacement\repository
		CustomerRepository, 
		InventoryRepository, 
		OrderRepository, 
		ProductRepository

Corresponding Services was created for email, payment, inventory
	The following service were created: \order-placement\src\main\java\com\findra\orderplacement\service
		EmailService,
		InventoryService,
		PaymentProcessingService
		
# Rest endpoints were opened to do submit orders:
	\order-placement\src\main\java\com\findra\orderplacement\rest\controller

# Work to be completed:
Datasource configuration is not completed
Services  needs to be updated
Unit Test has to be completed
Data model have to be updated
Liquibase script has to be written (to create the tables)


# Building the apps:
-> Go to parent folder and run "mvn clean install -DskipTests"; build should be success
-> The app is not runnable yet, we need the datasource configuration to be finalized 
