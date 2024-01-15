import java.util.Scanner;

public class AverageOfNumbersDivisibleBy12 {

    public static void main(String []args){

        int i=1, number, total = 0, divider = 0, average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();
        while (i<=number){
            if (i %3==0 && i%4==0){
                total += i;
                divider++;
                average = total / divider;
            }

            i++;
        }
        System.out.println("Average: "+ average);
    }
}
