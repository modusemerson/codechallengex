# Content

1.Bug report
2.API description
3.Automation project (JaspersoftAutomationLocal)


# Requirements to run automation project

1. install java 8
2. install maven 3.6.3
3. Set MAVEN_HOME and JAVA_HOME variables
4. If you use linux or mac to run these tests make sure you give rights (sudo chmod 777) tot he drivers folder:$\JaspersoftAutomationLocal\Drivers



# Instructions to run the tests

1. Clone the repo
2. Navigate to the folder: $\JaspersoftAutomationLocal
3. Note that by default the Operative system is windows and the browser is chrome, below command is to run tests in chrome and using windows
4. Run command: mvn clean
5. Run command: mvn -Dbrowser=chrome -Dos=windows --fail-at-end clean test
6. For the above command you could alsoe use: -Dos (windows or linux or mac) -Dbrowser (chrome or firefox) note all should be in lowercase
7. You can check for results in terminal or you could also check a html report at: $\JaspersoftAutomationLocal\target\surefire-reports\Jasper_Tests_Report.html
