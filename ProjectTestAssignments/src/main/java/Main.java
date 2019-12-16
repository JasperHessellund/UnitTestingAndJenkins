import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sorting sorting = new Sorting();

        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter numbers that goes into the array(Cannot be below 0 or above 50): ");
        for (int i = 0; i <= 9; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Press 1 to sort ascending, otherwise the sorting will default to descending");
        switch (s.nextInt()){
            case 1:
                arr = sorting.sort(arr, true);
            break;
            default:
                arr = sorting.sort(arr, false);
            break;
        }

        for(int i: arr){
            System.out.println(i);
        }









    }

}
