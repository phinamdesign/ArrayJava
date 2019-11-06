import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập vào chiều cao : ");
        height = scanner.nextDouble();
        System.out.println("Nhập vào cân nặng : ");
        weight = scanner.nextDouble();
        bmi = weight/(Math.pow(height,2));

        System.out.printf("%-20s%s", "bmi", "Nhận xét\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Béo");
        else
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
    }
}
