package Lesson2;

public class MyArrayDataException extends MyException {

    public MyArrayDataException(int a, int b) {
        super(String.format("Приведение к int не возможно в элементе массива [%d, %d] %n", a, b));
    }
}
