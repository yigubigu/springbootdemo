a demo application to verify following:

#1 Difference between web and Jar

##1 For build executable jar file
  -- Start up: DemoApplication 
  -- Dependency: (the tomcat dependency should be removed)
  -- Packaging: jar
  
##2 For build web application
  -- Start up: DemoWebApplication
  -- Dependency: (the tomcat dependency should be provided)
  -- Packaging: war

#2 Externlize application.properties
   application.properties
   application-dev.properties
   application-demo.properties
    
     
   When run with jar, java -Dspring.profiles.active=dev xxx.jar
   When run with tomcat, generate setenv.bat or setenv.sh
   
   setenv.bat: set "JAVA_OPTS=%JAVA_OPTS% -Dspring.profiles.active=dev"
   setenv.sh:  JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=dev"
   
