

import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào chiều dài của mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài không quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phàn tử cho mảng :" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sách các phàn tử trong mảng : \n");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\n");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " ,có vị trí " + index);
    }
}
