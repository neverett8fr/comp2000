# comp2000 Kiosk Project

Start at homescreen, can navigate to either the customer view (bigger as mostly used by customers) or the staff view

Customer view - allows items to be "scanned in" and keep a running total of the price
When the customer purchases an item a receipt will be generated and stored in a csv file, the quantity of items reduced will also be shown in the database

Staff view - allows staff to view all the receipts, all items, and staff information -- the staff have to login to see this information
the passwords for staff are stored in a SHA256 hashed format - the input password is hashed to see if it matches
staff can also add new staff, and items to the csv file where the data is kept
