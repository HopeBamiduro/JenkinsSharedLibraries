def call (string mavengoal){
  if ("${mavengoal}" == "Build")
  {
    sh "mvn package"
  }
    elseif ("${mavengoal}" == "Code Quality")
    {
      sh "mvn sonar:sonar"
    }
      elseif ("${mavengoal}" == "Back up to Nexus")
          {
            sh "mvn deploy"
          }
}
       
