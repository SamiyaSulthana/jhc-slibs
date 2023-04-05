def call(user,ip){
sshagent(['TomcatDev']) {
                sh "scp -o StrictHostKeyChecking=no target/hr-api.war ${user}@${ip}:/opt/sammu/webapps/"
                    sh "ssh ${user}@${ip} /opt/sammu/bin/shutdown.sh"
                    sh "ssh ${user}@${ip} /opt/sammu/bin/startup.sh"
}
}
