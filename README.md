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

Staff View before Zebra purchase
![image](https://user-images.githubusercontent.com/43852724/104601865-a9cd5a00-5672-11eb-9a52-66f344450c5c.png)
![image](https://user-images.githubusercontent.com/43852724/104602028-dc775280-5672-11eb-9506-4dbf2be2595e.png)
Staff View after Zebra purchase
![image](https://user-images.githubusercontent.com/43852724/104602152-00d32f00-5673-11eb-955b-c002427b92fa.png)
from the above images you can see how both a receipt was generated (receipt and a linkTable to show what they bought) and that buying stock reduces the amount in storage.



# Staff view 
allows staff to view all the receipts, all items, and staff information 
the staff have to login to see this information
the passwords for staff are stored in a SHA256 hashed format 
the input password is hashed to see if it matches
staff can also add new staff, and items to the csv file where the data is kept

![image](https://user-images.githubusercontent.com/43852724/104603069-f9f8ec00-5673-11eb-94a3-076b7b8411c3.png)
![image](https://user-images.githubusercontent.com/43852724/104603179-11d07000-5674-11eb-8283-532517837a7c.png)
![image](https://user-images.githubusercontent.com/43852724/104603268-24e34000-5674-11eb-8d6b-beda756efca5.png)
![image](https://user-images.githubusercontent.com/43852724/104603334-33c9f280-5674-11eb-9071-17af1c33e2a7.png)
