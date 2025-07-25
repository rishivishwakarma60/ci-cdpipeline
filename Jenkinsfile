pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/rishivishwakarma60/ci-cdpipeline.git'
            }
        }

        stage('Compile Java') {
            steps {
                echo '🔧 Compiling all Java files...'
                dir('src') {
                    bat 'javac *.java'
                }
            }
        }

        stage('Run Java Programs') {
            steps {
                echo '🚀 Running all Java classes with main method...'
                dir('src') {
                    bat '''
                    for %%f in (*.class) do (
                        echo Running: %%~nf
                        java %%~nf
                    )
                    '''
                }
            }
        }

        stage('Archive Class Files') {
            steps {
                archiveArtifacts artifacts: 'src/*.class', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ All Java programs executed!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
