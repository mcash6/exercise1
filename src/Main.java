//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your City?");
        String city = input.nextLine();

        System.out.println("What is your Zip Code?");
        String zipCode = input.nextLine();

        int[] dailyHighs = {32,25,27,40,45};
        double total=0;
        for(int i=0; i<5; i++){
            total += dailyHighs[i];
        }

        System.out.println("City: "+ city);
        System.out.println("Zip Code: "+ zipCode);
        System.out.println("Average High Temperature: "+ total /dailyHighs.length);

    }
}