package Lesson2;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */

public class TasksForLesson2 {
    public static void main(String[] args) {

        int size = 4;

        String[][] arr = {
                {"35", "46", "4", "4",},
                {"22", "2", "11", "17"},
                {"2", "55", "6", "100"},
                {"35", "3", "123", "5"}
        };

        String[][] arr1 = {
                {"35", "46", "4", "4", "5"},
                {"22", "2", "11", "17"},
                {"2", "55", "6", "100"},
                {"35", "3", "123", "5"}
        };

        String[][] arr2 = {
                {"35", "46", "4", "4"},
                {"22", "2", "11", "17"},
                {"2", "m", "6", "100"},
                {"35", "3", "123", "5"}
        };

        try {
            System.out.println("Сумма всех элементов массива " + ArrayProcessing.arrayProcessing(arr, size) + "\n");
            System.out.println("Сумма всех элементов массива " + ArrayProcessing.arrayProcessing(arr1, size));
            System.out.println("Сумма всех элементов массива " + ArrayProcessing.arrayProcessing(arr2, size));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            //System.err.println(e);
        }
    }
}

