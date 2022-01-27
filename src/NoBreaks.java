import java.util.Scanner;

public class NoBreaks {
    public static void main(String [] args){
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(("Enter 1, 2, or 3"));
        number = keyboard.nextInt();

        switch (number){
            case 1:
                System.out.println("you entred number one");
            case 2:
                System.out.println("you entred 2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("Tryck rätt");
        }//end switch
    }//End main
}//end class
