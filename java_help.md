javac example
java example
JAVA_HOME


;%JAVA_HOME%/bin

java
javac srcpath -d destpath
javac com/chartlab/testing/*.java -d out
be on top of build folder where u see -- com/chartlab/testing
jar cfv myjar.jar *

java com.chartlab.testing.priTest
java -cp myjar.jar com.chartlab.testing.Main
java -jar myjar.jar

java -cp "libs/*;out/artifacts/tutorial_jar/*" com.chartlab.testing.priTest 3 4
java -cp "libs/*" com.chartlab.testing.priTest 3 4