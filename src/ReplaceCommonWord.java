import java.util.Scanner;

public class ReplaceCommonWord {
    public static void main(String[] args) {

        //instantiate scanner object
        Scanner str = new Scanner(System.in);

        //declare variables
        String str1;
        String arr1[];

        do{
            //prompt user to enter data
            System.out.println("Enter your text or 'q' to quit: " );

            //scan what the user just entered
            str1 = str.nextLine();

            //split and populate values to an array
            arr1 = str1.split("\\s");

            //check if the user wants to quit
            if(!str1.equals("q") && !str1.equals("Q")){

                for(String ar : arr1){

                    //replace the string "the" with "BE"
                    if(ar.equals("the")){
                        ar = "BE";
                    }

                    //print the new string after replacement
                    System.out.print(ar + " ");
                }
                System.out.print("\n");
            }
        }while(!str1.equals("q") && !str1.equals("Q"));
    }
}
