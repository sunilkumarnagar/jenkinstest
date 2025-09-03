pipeline {
    agent any

    tools {
        maven 'Maven' // Make sure this matches your Jenkins Maven tool name
    }

    environment {
        WAR_FILE = 'target/jenkinstest.war' // Adjust based on your project
        TOMCAT_USER = 'root'
        TOMCAT_PASS = 'root'
        TOMCAT_URL  = 'http://localhost:8081/manager/text'
        CONTEXT_PATH = '/myapp'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building the WAR file...'
                bat 'mvn clean install' // Use 'sh' if you're on Linux
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to Tomcat...'
                bat """
                    curl -u %TOMCAT_USER%:%TOMCAT_PASS% ^
                    -T %WAR_FILE% ^
                    "%TOMCAT_URL%/deploy?path=%CONTEXT_PATH%&update=true"
                """
            }
        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }
        failure {
            echo 'Deployment failed.'
        }
    }
}
