import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String x = "Hello World!";

        //sol 1
        System.out.println(new StringBuilder(x).reverse().toString());

        //sol 2
        String y = "";
        for(int i = x.length()-1; i >= 0; i--){
            y += x.substring(i, i+1);
        }
        System.out.println(y);

        //sol 3
        List<String> chars = new ArrayList<>();
        for(int i = 0; i < x.length(); i++){
            chars.add(String.valueOf(x.charAt(i)));
        }
        for(int i = chars.size()-1; i >= 0; i--){
            System.out.print(chars.get(i));
        }

        Scanner scan = new Scanner(System.in);

        boolean cont = true;
        while(cont){
            System.out.println("\nPlease enter a number: ");
            int answer = Integer.parseInt(scan.nextLine());
            if(answer % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(answer % 3 == 0){
                System.out.println("Fizz");
            }else if(answer % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(answer);
            }
            System.out.println("Would you like to continue? (Y)es / (N)o");
            String reply = scan.nextLine();
            if(reply.toLowerCase().equals("yes") || reply.toLowerCase().equals("y")){
                cont = true;
            }else if(reply.toLowerCase().equals("no") || reply.toLowerCase().equals("n")){
                System.out.println("Have a good day");
                cont = false;
            }else{
                System.out.println("Please enter a valid number!!!");
            }
        }
    }
}