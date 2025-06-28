//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= input.nextLine();
        String low= str.toLowerCase();
        String noSpace= low.replaceAll("[^a-z]", "");

        char[] a= noSpace.toCharArray();

        System.out.println("The array is:" + Arrays.toString(a));

        boolean IsPal= true;

        for(int i=0; i< a.length/2; i++){
            if(a[i]!= a[a.length-1-i]){
                IsPal= false;
                break;
            }
        }

        if(IsPal){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not a palindrome!");
        }

    }
}


