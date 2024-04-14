# train-ticket-reservation-using-java

The Train Management System proposed in this project aims to address the challenges associated with manual management processes by leveraging the power of technology. By utilizing Java programming language along with JDBC (Java Database Connectivity), the system facilitates seamless interaction with a relational database, enabling efficient storage, retrieval, and manipulation of data related to trains-tickets, passengers, and reservations.

STEPS:
1.Download the src files given.
2.Download Jdk from google and jar files provided.
3.Now open Netbeans apache and open this src folder.
4.go in libraries and add jdk and other 2 Jar files.
5.NOTE: my code is according to the following database so kindly use the same to avoid errors.
>> create database TRAIN;
>> use TRAIN;
>> CREATE TABLE ticket (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    age INT,
    pickup VARCHAR(100),
    destination VARCHAR(100),
    date VARCHAR(100)
);
Implement the above in sql terminal or workbench.
6.Now in netbeans ,simply change the sql root password from the code in a few files where jdbc is used.
7.run the program on netbeans.(give inputs to be stored and check server).
>> to check the data in database:
>> SELECT *FROM ticket;
8.The program is successfully worked.


