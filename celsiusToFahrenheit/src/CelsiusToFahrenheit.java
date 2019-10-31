public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển độ F sang C");
            System.out.println("2. Chuyển độ C sang F");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("Chọn hình thức: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ C =  " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ F = " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
