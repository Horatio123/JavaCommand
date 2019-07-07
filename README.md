# JenkinsTest

#SingleClassJar:
javac App.java
jar -cvmf manifest.txt App.jar App.class
java -jar App.jar

#MultiClassJar:
##run class:
javac *.java
java ShowStudent swimming riding
##run jar:
javac -d ../classes/ *.java
cd ..
jar -cvmf manifest.txt test.jar -C classes/ .
java -jar test.jar shooting driving
