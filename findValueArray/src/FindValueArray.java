import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh : ");
        String inName = scanner.nextLine();

        boolean isExit = false;
        for (int i=0 ; i<students.length ; i++){
            if (students[i].equals(inName)){
                System.out.println("Vị trí của học sinh "+inName+" trong danh sách là "+(i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println(inName+" không có trong danh sách");
        }
    }
}
