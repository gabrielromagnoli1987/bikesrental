# bikesrental

mvn -version : 3.3.9

Java version: 1.8.0_131



Install the project: mvn clean install

Run the tests: mvn test (or run it on the IDE)

Test Coverage was 66% on sonarqube with the JaCoCo plugin 
(it required to cover the getters and setters, i'll not do that just for the %, it has no sense) 
JaCoCo plugin installation: 
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=false

Scan the project with sonar:
mvn sonar:sonar


Used the composite pattern to resolve the logic for the total rentals price