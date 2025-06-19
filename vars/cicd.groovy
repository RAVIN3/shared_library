def gitDownload(repo)
{                   
  git "https://github.com/RAVIN3/repo.git"    
}

def buildArtifect()
{
  sh "mvn package"
}
def deployTomcat(jobname, ipaddress, contextpath)
{
  sh "scp  /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${iaddress}:/var/lib/tomcat10/webapps/${context}.war"
}
def testing(repo,jobname)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

def delivery(jobname, ipaddress, contextpath)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
}
