# Repository    
## By Ultimate Testers
------------------------------------------------------------------------
Project for IT-Högskolan's test automation course 2021(for Agile project )

Courtesy  ![alt petclinic-junit](git-res/infotiv.png) and ![alt petclinic-junit](git-res/iths.png) 

=========================================================================
## This Repository contains 

  -the backend  version of the Spring Pet clinic application  which provides only provides a REST API (the spring-petclinic-rest folder)

  -the front end application which is a client only. Use REST API from backend spring-petclinic-rest project You need start backend server before start frontend application.( the spring-petclinic-angular folder)

  -the Postman and Robot framework tests to test the API and the website for functionalities

- the jenkins files to be used for individual chosen functionalities (the jenkinsfilelist folder)


# Prerequisites for using this repository
    A system with the following specification
      
      Operating system 	-	  Windows 10
      
      RAM 			        -	  4 GB RAM 
      
      Browsers 		     -	      Google Chrome 
      
      Application for testing	Postman, Intellij(for robot tests) with plugins installed 
      
      All plugins like Chromedriver (installed) from https://chromedriver.chromium.org/  Please match the correct version matching your Google chrome version
 
 
 
# Steps to use  the Repo.
  Step 1. Fork the repo to your own github
  
  Step 2.  Now  you have a choice to use an IDE or terminal on you system.

  Step 3. Open the spring-petclinic-rest folder and follow the instrructions of the readme.md there.     ( Folder contents courtesy by Infotive)

  Step 4. Open the spring-petclinic-angular folder and follow the instrructions of the readme.md there.   ( Folder contents courtesy by Infotive)

  Step 5. once both the servers are up and running check the following links to check functionality

          API             http://localhost:9966/petclinic/swagger-ui.html            . It should work

          URL             now open new browser tab and open the following url     >> http://127.0.0.1:4200    . This will take you to http://127.0.0.1:4200/petclinic/
          
          Jeninks         http://localhost:8080/              (if running locally on 8080, else follow the specific link for your jenkins server.)

 Step 6. Now create the pipeline by following the  below steps.

         on the Dashboard after login click on new Item.

         provide a name for this new Item

         Choose to make it a PipeLine and click next
 

# Steps for using terminal on your system (to be done)
  Step 3. Make sure Git is installed on your system.

  Step 4. Run the following commands on the terminal 

            git clone https://github.com/fengzse/Team_A_Project.git	
            Follow the steps listed in the readme.md files in /spring-petclinic-angular/README.md
            and the steps listed in   /spring-petclinic-rest/README.md
            
            Then use a local jenkins or a remote jenkisn with relevant plugings installed for Postman , Robot , Junit and a  working email setup
            
 
# Steps for using IDE on your system (to be done)
 you can also use IDE like IntelliJ or Exclipse . Use VCS and connect the repository and then  use jenkins.
 
 
# Special feature of this repository

## Team_A_Project/tree/master/jenkinsfilelist    
  THis folder contains different jenkins files which can be used to do different types of test (individually or together with email confirmation or without.)
  Just remmeber to go thru the jenkins file code and use the correct path whensetting up the pipeline in Jenkins. 
  for eg   jenkinsfilelist/Jenkinsfile
          jenkinsfilelist/Jenkinsfilepostmanrobotemail
 
 It is not normal to rename the jenkins file. If you want to follow standard protocol, Use the Jenkinsfile and copy the entire code from the relevant file in the 
 Team_A_Project/tree/master/jenkinsfilelist     folder.
 

** Also we have our emails updated 
to: 'jenkins.iths.mailer@gmail.com, rajpalmanish@gmail.com, jayashree.bondre@iths.se, shubhangi.patil@iths.se, feng.zhu@iths.se, victor.hedstrom@iths.se, maria.shishkina@iths.se, elias.arezomande@iths.se',

make sure 

to: 'youremail@server.com, otheremailaddess',


            
# About team

 Ellias, Feng, Jayashree, Manish, Maria, Shubhangi, Victor

# About Repo (repo structure) and the data flow
We have made the following structure  



## Credits
All credit goes to [Spring Project](https://spring.io).
