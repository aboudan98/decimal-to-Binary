import java.util.*;

public class Binary {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[]args){
     System.out.println("Lab 8 written by Amr K Aboudan"); 

     
     boolean keepGoing = true;
     while(keepGoing){
        System.out.print("Enter a positive integer: ");
        if(console.hasNextInt()){
           int num = console.nextInt();
            if(num >0){
                System.out.print(num + " decimal is equal to ");
                printBinaryArray(convertToBinary(num));
                System.out.println(" binary");
                System.out.print("Do you want to continue (yes or no)? ");
                String cont = console.next();
                if (cont.equals("yes")){
                }
                else if(cont.equals("no")) {
                    keepGoing = false;
                    System.out.println("You answered no.  Have a nice day.");
                }
                else{
                    System.out.println("I assumed you want to continue");
                }
            }
            else{

                System.out.println("Not positive; try again.");
            }
            
        } 
        else {
            String trash = console.next( );
            System.out.println("Not an integer; try again.");
        }        
     }
    }
    public static int[] convertToBinary(int decimal){
        int temp = decimal;
        int length =0;
        

        while(temp != 0){
            temp = temp/2;
            length++;
        }
        int[] x = new int[length];
        int index = 0;
        while(decimal != 0){
            if (decimal % 2 == 0) {
                x[index] = 0;
            }
            else{
                x[index] = 1;
            }
            decimal = decimal/2;
            index++;
        }
        
        return(x);
    }
    public static void printBinaryArray(int[] binary){
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
          }

    }
}