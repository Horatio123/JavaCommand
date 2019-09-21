# JenkinsTest

## SingleClassJar:
```
javac App.java
jar -cvmf manifest.txt App.jar App.class
java -jar App.jar
```
## MultiClassJar:
### run class:
```
javac *.java
java ShowStudent swimming riding
```
### run jar:
```
javac -d ../classes/ *.java
cd ..
jar -cvmf manifest.txt test.jar -C classes/ .
java -jar test.jar shooting driving
```

## java within package
exp: class QuickFindUF in package baimahu
```
javac QuickFindUF.java
cd ..
java baimahu.QuickFindUF
```
