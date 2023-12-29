node {

   stage ('Checkout') {
    git branch: 'main', credentialsId: 'github', url: 'https://github.com/Akashcm731/new-java-project.git'
  }

  stage ('Test') {
    echo 'This is Push Stage'
  }
  
  stage ('Build') {
        sh 'mvn clean install'
       }
  
  stage ('Deploy') {
    sh 'sudo cp target/*.jar /opt/tomcat/webapps'
  }
}
  
