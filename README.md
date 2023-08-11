# This repository hosts the code base for the Swagger Ui integration with Spring boot application
# Prerequstics
  Java SE 17
  Postgres database
  JRE 17
  Spring STS tool( you can use any development tool)
# Install java
  Refer to the Oracle website to install
  https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

# Configure PATH and JAVA HOME
  Update the Windows system environment variable as below
  JAVA_HOME=C:\Program Files\Java\jdk-17\bin (Update with your local install dir)
  PATH=C:\Program Files\Java\jdk-17\bin
 # Install the Postgres
   https://www.postgresql.org/download/ 
   Download and install the Postgres database
 # Create the Schema
   I have created the VeenaTravel schema under the Postgres database( You can create your own schema)
   create the user table based on the model class
 # Run the application
   run using the STS or create the maven build to run the jar file

   http://localhost:3000
   Upon run the above URL in browser, we can get the swagger UI and execute the API 
   
