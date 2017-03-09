#!/bin/bash
ROOT=../../
CLASSPATH=$ROOT/external/junit-4.12.jar:$ROOT/external/hamcrest-core-1.3.jar:.:$CLASSPATH
javac Project05Junit.java TestRunner.java -cp $CLASSPATH
java -cp $CLASSPATH TestRunner

