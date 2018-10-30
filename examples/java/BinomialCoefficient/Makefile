#Angus Mackenzie
#30 October 2018
JCC = javac
JFLAGS = -g

default: Bin.class

# compile the class
Bin.class: Bin.java
	$(JCC) $(JFLAGS) Bin.java

# run the class
run:
	java Bin

#To clean the directory
clean:
	$(RM) *.class