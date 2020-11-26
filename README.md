# i3_Assessment
Software Development Assessment for i3.

# OVERVIEW
All the requested functionality was added to the project except a running total. I was unfortunately unable to get the running total to work. The project consists of a login/registration page. You can register with your details and starting balance. Thereafter you will immediately be redirected to your dashboard. The same will happen upon login. To log into your profile make use of the username you used in registration.

You will be greeted with a dashboard with a top navigation bar. You can navigate between your home screen and transaction screen. On the home screen you will be able to see your 3 most recent transactions and your current account balance. There will also be the option to create a new transaction on the home screen.

On the transaction screen you will see a list of all your transactions in date order from most recent to the oldest transaction. As mentioned the running total could unfortunately not be included. Each transaction will display as a card. On the card you will se all the details of the transaction including, id, date, value, dollar value, and description.
Below the list of transactions you will have the option to export all your transactions to a .csv file.

# HOW TO IMPROVE PERFORMANCE WITH 10K USERS?
The first major improvement that can be made when more users are concurrently using the system is migration to a more improved and sophisticated database. The H2 database is not a commercial database and does not perform well when the size of the database increases. The more records and processes it needs to handle the slower it becomes. It would be better to make use of a database like SQL Server or MySQL. They are dedicated databases running on servers with the ability to handle a larger number of concurrent users. In addition to using a more commercial database it would also be beneficial to implement cursors, functions, and procedures in the database. This will allow for quicker and easier access to the data in the database as the need for lengthy queries will be reduced. Finally, another improvement that could be considered is the use of caching. Data from the database can be cached for later use. This will allow for a more immediate response to the user as they request frequently accessed data from the database cache.

# ADDITIONAL INFO ON SETUP
For this project I made use of Apache Netbeans IDE 12.1 as my IDE. IntelliJ unfortunately did not have support for Grails development in the free community edition. Only the ultimate edition supports grails development.

I used Grails Version 2.5.0 in Netbeans along with Groovy Version 3.0.6

# HOW TO SETUP
To set up the IDE for Groovy and Grails development you need to install a Netbeans plugin via Netbeans to allow for that.
This can be done by doing the following:
1. Click on tools on the top of the screen
2. Click on Plugins on the drop down
3. Click on the available plugins tab
4. Search for Groovy in the searh box
5. Once found check the checkbox next to it
6. Finally click install and Netbeans will perform the installation

Once these steps are done Netbeans will almost be ready for Groovy and grails development
All that is left to do, is the following:
1. Click on tools on the top of the screen
2. Click on Options on the drop down
3. Click on the Miscellaneous tab
4. Click on the Groovy tab in the Miscellaneous page
5. Specify the location of the Groovy documentation in the given area
6. Specify the installation location of Grails

Groovy documentation path example: C:\Groovy Documentation\groovy-3.0.6\html
Grails path example: C:\Grails\grails-2.5.0

The Groovy required for Netbeans is only the documentation. It is not necessary to download the SDK Groovy Bundle

The reason why I used the older version of grails:
For some reason the version of Grails I used was the only one compatible with my JDK version. I used jdk1.8.0_111
When using other JDK versions and newer versions of Grails the project would not run at all. This combination of JDK version and Grails version was the first one that worked so I stuck with it.

Once all of these steps above are completed the project should hopefully run without any problems.
