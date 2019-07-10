# JenkinsTest

## SingleClassJar:
javac App.java <br>
jar -cvmf manifest.txt App.jar App.class <br>
java -jar App.jar
## MultiClassJar:
### run class:
javac *.java <br>
java ShowStudent swimming riding<br>
### run jar:
javac -d ../classes/ *.java<br>
cd ..<br>
jar -cvmf manifest.txt test.jar -C classes/ .<br>
java -jar test.jar shooting driving<br>
