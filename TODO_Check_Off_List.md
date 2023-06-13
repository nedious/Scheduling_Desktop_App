Reference: [C195 Check-off list](https://srm--c.na127.visual.force.com/apex/coursearticle?Id=kA03x000000yIOLCA2)
 
 Check off the steps that you have completed. 

Part I: Assessment Overview, UML Design, Menu Wireframe, and Course Documentation

- [x]    Read the Performance Assessment Overview, Directions, and Evaluation method in the "Task View". 
- [ ]    Reach out to your Instructor for any questions about the Performance Assessment
     
- [x]    Watch the LinkedIn Learning course titled [Programming Foundations: Object-Oriented Design](https://www.linkedin.com/learning/programming-foundations-object-oriented-design-3/learn-object-oriented-design-principles?u=2045532) by Barron Stone and Olivia Chiu Stone, to learn about Object-Oriented Principles such as Classes, Abstraction, Encapsulation, Inheritance, Polymorphism, Class Relationships, and more. 
- [x]    Also, watch the LinkedIn Learning course titled [Programming Foundations: Databases](https://www.linkedin.com/learning/programming-foundations-databases-2015/welcome?u=2045532) by Simon Allardice to learn about Database Fundamentals such as Table Relationships, Normalization, Referential Integrity, and more
     
- [ ]    NEW: Watch the Establishing A Client-Side Database 
     1. **note** to access the MySQL Command Line Client on a Mac:
     2. open Terminal
     3. paste in: `/usr/local/mysql/bin/mysql -u root -p`
   - [ ]    [Part I](https://wgu.webex.com/webappng/sites/wgu/recording/c364f547fa5e1039877d0050568f9b64/playback) 
   - [ ]    [Part II](https://wgu.webex.com/webappng/sites/wgu/recording/cce7d3e7fa601039b99e005056816858/playback)
   - [ ]    [Part III](https://wgu.webex.com/webappng/sites/wgu/recording/0fd3ea5afa621039bbfb0050568114a0/playback)
   - [ ]    [Part IV](https://wgu.webex.com/webappng/sites/wgu/recording/9b8a01f9fcbe1039a7d900505681e613/playback) 
webinars to learn how to set up a MySQL database on your computer that replicates the Virtual Machine MySQL database so you can work from your Computer as well as the Virtual Machine. **Get the DML & DDL Script for Creating the Database / Tables and Populating the Tables** [Here!](https://westerngovernorsuniversity.sharepoint.com/sites/CISoftwareTeamResourcesRepo/Student%20Resources/Forms/AllItems.aspx?csf=1&web=1&e=RpaDHb&cid=84339e9b%2D0cb1%2D40d8%2Da4df%2D6b3249b0715c&RootFolder=%2Fsites%2FCISoftwareTeamResourcesRepo%2FStudent%20Resources%2FC195%20Code%20Repository%2FC195%5FQSG%2FC195%5FQSG%2FEstablishing%5Fa%5FClient%2DSide%5FDatabase&FolderCTID=0x0120003A10B552C00AC84098A6553E0FD6F792)
     
- [ ]    NEW: Watch the [Backing Up Database Table Data](https://wgu.webex.com/webappng/sites/wgu/recording/bc314ed7f9f21039aabb0050568f95d3/playback) webinar to learn how to export table data into a .csv file and then import the .csv file data back to a matching table
     
- [ ]    NEW: Watch the VM & Client File Transfer webinar to learn how to transfer files between your Computer and the Virtual Machine (VM) using Microsoft One Drive. 
    Note: If you get a 403 FORBIDDEN message when you launch One Drive, please Clear all Cache and Cookies from your Web Browser.

- [ ]    NEW: Watch the Version Control with IntelliJ and GitHub or Version Control with NetBeans and GitHub  webinar to learn how to integrate backup to GitHub from IntelliJ or NetBeans within the Virtual Machine (VM)
     
- [ ]    NEW: Watch the Connecting to the Database (IntelliJ) or Connecting to the Database (NetBeans) webinar to learn how to connect to the Database from IntelliJ or NetBeans within the Virtual Machine (VM)
     
- [ ]    NEW: Watch the Connecting to the Database (MySQL Workbench) webinar to learn how to connect to the Database from MySQL Workbench within the Virtual Machine (VM)
     
- [ ]    Watch the Getting You DBConnection Class Project Ready. This webinar recording is also available in Course Tips under the same title. Please note that the webinar shows connecting to an older database so the IP address, database name, and password differ from the VM database connections so please watch the webinars on Connecting to the Database (IntelliJ) or Connecting to the Database (NetBeans) first.
     
- [ ]    Watch the JDBC  API Webinar to learn how to use its implementations to work with MySQL from Java and perform CREATE, READ, UPDATE, and DELETE (CRUD) operations on data.
     
- [ ]    Examine the ERD
     
- [ ]    Optionally Sign up to lucidchart.com  to create UML Class Diagrams
     
- [ ]    Define POJO (Plain Old Java Object) classes that Map the ERD. The POJOs are used to Map rows from the database tables
     
- [ ]    Organize your project to include the packages; model, controller, dao, and helper. The model package will hold your POJOs. The controller package will hold Controller classes that contain Business Logic for your views. The dao package will hold Utility Classes that handle Database Access. And the helper package will hold helper classes that handle tasks such as Date / Time processing, List management, etc.
     
- [ ]    Place your view files (FXML documents) in the resources directory (if using a Maven JavaFX project) or in a view package
     
- [ ]    Optionally use lucidchart.com tools to draw your views. 
     
- [ ]    Contact your instructor for feedback on your Class definitions and View designs
     
- [ ]    Utilize the following Course Documentation: Common Fail Points for Software II, C195 Webinar Blast Recording Archive and Resource Map

 

Part II:

Software Requirements

- [ ]    Download and install JDK 17 by Oracle
     
- [ ]    Download and install NetBeans 12.0 IDE  or IntelliJ IDEA Communitiy Edition Version 2021.1.3 or Prior (IntelliJ is preferred.)
     
- [ ]    Download and install Scene Builder for Java 17
     
- [ ]    Download and install MySQL Workbench 6.3
     
- [ ]    Download and Install JavaFX 17 SDK
     
- [ ]    Watch the following webinars for JavaFXSDK NetBeans Setup,  JavaFXSDK IntelliJ Setup, and JavaDoc instructions: 
     
- [ ]    Contact your instructor if you need assistance installing any of the software

 

Part III: Menu Design

- [ ]    Watch the following Webinar recordings for JavaFX and Scene Builder training:
    JavaFX Basics, JavaFXML and Model-View-Controller, Scene Builder and UI Controls I, Scene Builder and UI Controls II, JavaFXML Event Handling I, and JavaFXML Event Handling II
     
- [ ]    Design the menus for your app in Scene Builder to match your Wireframe in Part I of the checklist. Contact your instructor for feedback on your menu designs
     

 

Part IV: Classes

- [ ]    In your IDE (Integrated Development Environment), define Classes and Functional Interfaces illustrated in your UML Class diagram and organize them using the Model-View-Controller (MVC) design architecture. Add a utility or utils package to hold classes for your; Database Connection, Query Execution, Collection (ObservarbleArrayList) Management, Functional Interfaces, and time conversion files. (Watch the C195 Organizing Your Code webinar recording). Defining DAO or Abstract classes with static methods that perform CRUD (Create Read Update Delete)  or INSERT, SELECT, UPDATE, and DELETE operations is highly recommended. For more info on the DAO pattern, visit this link: https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm and also watch the LinkedIn Learning course titled Learning JDBC by Frank P Moley III
     
- [ ]    Contact your instructor for feedback on your Class definitions and packaging
     

 

Part V: Coding

NOTE: If you created a JavaFX Project via Maven, please place your FXML and Resource Bundle properties files in the resources directory.

- [ ]    Log-in form: Watch the Localization and Resource Bundles Part I and Part II webinar recordings.
     
- [ ]    CRUD (Create Read Update Delete): Watch the JDBC Webinar to learn how to CREATE, READ, UPDATE, and DELETE data within Java using JDBC Interface Implementations.
     
- [ ]    Appointments: Use a TableView to display appointments. Contact your instructor if you need assistance.
     
- [ ]    Time Zones: Watch the Time Zones webinar recording.
     
- [ ]    Exceptions & Exception Handling: Watch the Exception Handling and Time Overlaps and Alerts and webinar recordings. Contact your instructor if you need assistance setting-up try/catch and throws clause exception handling, and checking for logical errors.
     
- [ ]    Lambda Expressions & Reports: Watch the Lambda Expressions Webinar recording. Contact your instructor if you need assistance integrating Lambdas with a Functional Interface to generate reports.
     
- [ ]    Alerts:  Watch the Time Overlaps and Alerts webinar.
     
- [ ]    Files I/O: Watch the File Input / Output webinar to learn how to read and write files in Java.

     

 

Part VI: Project Evaluation

- [ ]    Verify that your application meets Requirements A – F in the Directions document, the Rubric, and this checklist
