/* 1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
 10 3 1 2
 2 3 2 2
 5 6 7 1
 300 3 1 0
 Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
 2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
 3. Ваши методы должны бросить исключения в случаях:
    Если размер матрицы, полученной из строки, не равен 4x4;
    Если в одной из ячеек полученной матрицы не число; (например символ или слово)
 4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
 5. * Написать собственные классы исключений для каждого из случаев*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class except {
private static String[][] twoArr;
    private static int count = 0;
    private static int sum = 0;

    public static void main(String[] args) {
        stringConversion("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");
    }
    public static void stringConversion(String s){
        s = s.replaceAll("[\n]", " ");
        String[] arr = s.split(" ");
        try {
        String[][] twoArr = new String[arr.length/4][arr.length/4];
        int[][] intArr = new int[arr.length / 4][arr.length / 4];
            for (int i = 0; i < arr.length / 4; i++) {
                for (int j = 0; j < arr.length / 4; j++) {
                    twoArr[i][j] = arr[count++];
                    intArr[i][j] = Integer.parseInt(twoArr[i][j]);
                    sum += intArr[i][j];
                }
            }
        } catch (NumberFormatException n){
            System.out.println("Строка должна содержать только цифры");
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Введите ровно 16 символов");
        }
        System.out.println("\nСумма поделенная на 2 равна " + sum/2);
    }
}
