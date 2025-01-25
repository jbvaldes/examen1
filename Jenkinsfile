pipeline {
    agent any

    stages {
        stage('Preparación') {
            steps {
                echo 'Clonando el repositorio...'
                git 'https://github.com/tu-usuario/BancoPlatinum.git'
            }
        }

        stage('Construcción') {
            steps {
                echo 'Compilando el proyecto con Maven...'
                sh 'mvn clean install'
            }
        }

        stage('Pruebas') {
            steps {
                echo 'Ejecutando pruebas unitarias...'
                sh 'mvn test'
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Despliegue') {
            steps {
                echo 'Desplegando la aplicación en Tomcat...'
                sh 'sudo cp target/CtaCorriente-1.0-SNAPSHOT.war /var/lib/tomcat9/webapps/'
                sh 'sudo systemctl restart tomcat9'
            }
        }
    }

    post {
        success {
            echo 'Pipeline ejecutado con éxito.'
        }
        failure {
            echo 'Pipeline falló. Revisar los logs para más detalles.'
        }
    }
}
