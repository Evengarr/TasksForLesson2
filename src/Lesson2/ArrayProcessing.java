package Lesson2;

public class ArrayProcessing {
    public static int arrayProcessing(String[][] arr, int size)
            throws MyArrayDataException {
        int summ = 0;
        try {
            if (arr.length != size) throw new MyArraySizeException(size);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException(size);
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        summ += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException exc) {
                        //System.err.println(exc);
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        } catch (MyArraySizeException e) {
            System.err.println(e);
        }finally {

        }
        return summ;
    }
}
