### comp2000 
## Kiosk Project
*produce a Java standalone software application*

## Navigation
When the application is opened you will start at the homescreen, where you can choose whether you want to access staf or customer view
Start at homescreen, can navigate to either the customer view (bigger as mostly used by customers) or the staff view

# Customer View
allows items to be "scanned in" and keep a running total of the price
When the customer purchases an item a receipt will be generated and stored in a csv file, the quantity of items reduced will also be shown in the database
the customer clicks on the "Add Item" button which adds it to their "shopping cart" and totals up the price (displayed at the bottom)
the customer clicks on the "Checkout" button to finish and pay - this also removes the stock from the database / CSV file

# Staff view 
allows staff to view all the receipts, all items, and staff information 
the staff have to login to see this information
the passwords for staff are stored in a SHA256 hashed format 
the input password is hashed to see if it matches
staff can also add new staff, and items to the csv file where the data is kept
