public class MinArray {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }


        return index;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 2, 6, 9};
        int index = minValue(arr);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + arr[index]);
    }
}
