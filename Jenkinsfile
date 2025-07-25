pipeline {
    agent any

    stages {
        stage('Compile Java') {
            steps {
                echo '🔧 Compiling Java...'
                dir('src') {
                    bat 'javac HelloWorld.java'
                }
            }
        }

        stage('Run Java Program') {
            steps {
                echo '🚀 Running Java Program...'
                dir('src') {
                    bat 'java HelloWorld'
                }
            }
        }

        stage('Archive Class File') {
            steps {
                archiveArtifacts artifacts: 'src/*.class', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build Success!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}
