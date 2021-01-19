package Lesson2;

public class MyArraySizeException extends MyException {
    public MyArraySizeException(int size) {
        super(String.format("Превышение размера массива, необходимый размер: %dx%d %n", size, size));
    }
}
