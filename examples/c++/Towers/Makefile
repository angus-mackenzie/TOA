#Angus Mackenzie
CC=g++
EX= -std=c++11
OBJECTS= towers.o
TARGET=example

$(TARGET): $(OBJECTS)
	$(CC) $(OBJECTS) -o $(TARGET) $(EX)

%.o: %.cpp
	$(CC) -c $(EX) $<
	
clean:
	$(RM) example *.o *.~

run:
	./$(TARGET)