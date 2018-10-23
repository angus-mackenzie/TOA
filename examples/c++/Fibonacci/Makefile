CC=g++
EX= -std=c++11
OBJECTS= Fib.o
TARGET=Fib

$(TARGET): $(OBJECTS)
	$(CC) $(OBJECTS) -o $(TARGET) $(EX)

%.o: %.cpp
	$(CC) -c $(EX) $<
	
clean:
	$(RM) Fib *.o *.~

run:
	./$(TARGET)