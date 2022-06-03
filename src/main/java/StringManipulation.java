import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {

         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

             System.out.println("Enter something: ");
             String input = scanner.nextLine();
             System.out.println("You entered " + input);
             System.out.println("Flipped is " + StringUtils.swapCase(input));
             System.out.println("Reversed is " + StringUtils.reverse(input));


            //a.
             System.out.println(StringUtils.isNumeric("123"));

             //b.
             System.out.println(StringUtils.swapCase("The dog has a BONE"));

             //c.
             System.out.println(StringUtils.reverse("bat"));


    }
}
