import java.util.Scanner;
import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        //int [] numStudents = new int[14];
        int[] numStudents = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String[] studentNames = {"Michael", "Jeremy", "Alexandra", "Megan", "Peter", "Saritha", "Sarah", "Stephanie", "Trina", "Nick", "Sean", "Lydia", "Lhea", "Marin"};
/*
Object map;
Map<String, Integer>  = new HashMap<String, Integer>();
map.("Michael", 1);
*/
        out.println("Welcome to out Java class.");


        for (int i = 0; i < numStudents.length; i++) {
            out.println();
            out.println("Which student would you like to learn more about? (enter a number 1-14:)  ");
            int userInput = scan.nextInt();
            numStudents[i] = userInput-1;//allows numStudents align with studentNames in loop.
            // System.out.printf("Student Name = %s  Jersey Number = %d \n",names[i], jerseyNum[i]);
            //System.out.println("AH, " + studentNames);

            out.printf("Ah, %s is an awesome student", studentNames[i]);

            //System.out.println(studentNames);


            if (userInput > 14) {
                out.println("Student does not exist. Please try again. (enter a number 1-14:)  ");
                userInput = scan.nextInt();
                numStudents[i] = userInput;


            }

            //create a method that will choose random faqs from a defined list

//random class 	nextInt(int bound)
            //Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
        }

       /* public static string studentInfo (String){
              String [] arr = {"A", "B", "C", "D"};
         Random random = new Random();

         // randomly selects an index from the arr
         int select = random.nextInt(arr.length);

         // prints out the value at the randomly selected index
         System.out.println("Random String selected: " + arr[select]);
             String 1 = "Test Info";
         Random random = new Random();

         // randomly selects an index from the arr
         String select = random.nextLine(String.length);

         // prints out the value at the randomly selected index
         System.out.println("Random String selected: " + arr[select]);
            String 1
            String 2
            String 3
            String 4
            String 5
            String 6
            String 7
            String 8
            String 9
            String 10


    }*/


    }
}
