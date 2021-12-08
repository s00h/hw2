import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        String arr [][] = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "2"},{"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = method(arr);
                System.out.println("Сумма всех элементов массива: " +result);
                }
            catch (MyArraySizeException e) {
                System.out.println("Размер превышен!");
            }
        }
catch (MyArrayDataException e) {
    System.out.println("Неправильный размер");
    System.out.println("Ошибка" + e.i + "*" + e.j);
}
    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length !=4) {
            throw new MyArraySizeException();
             }
        for (int i = 0; i < arr.length; i++ ) {
            if (arr.length !=4 ){
                throw new MyArraySizeException();
                   }
            for (int j = 0; j <arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
