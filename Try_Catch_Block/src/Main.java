import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defining the array with 10 element

        int[] customArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Get the index number from user
        Scanner input = new Scanner(System.in);


        while (true) { //While loop used for keep the code running for repeated entery

            System.out.print("Lütfen index numarasını giriniz: ");


            try { // tris if the input is in bounds of array
                int arrayIndex = input.nextInt();
                 System.out.println("Girdiğiniz indisteki eleman: " + customArray[arrayIndex]);
            } catch (IndexOutOfBoundsException e) { // if not catches
                System.out.println("Girdiğiniz değer 0 ile 9 arasında olmalıdır. " + e.getMessage());
            } catch (Exception e){// if input is not number cathches.
                System.out.println("Sadece sayı giriniz harf veya kelime girmeyin.");

            }

        }


    }
}
