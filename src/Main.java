import java.util.Scanner;

public class Main{
    //The main function is the first function called by the runtime system and ultimately your code must be connected to this call in order to be executed by the program.
    public static void main(String[]  args){
        int studentAge = 15;
        double studentGPA = 3.45;
    
        boolean hasPerfectAttendace = true;
        String thisIsString = "Temporary";

        char studentFirstInitial = thisIsString.charAt(0);
        char studentLastInitial = thisIsString.charAt(0);        

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(thisIsString);

        System.out.println(studentFirstInitial + " " + studentLastInitial + " has a GPA of " + studentGPA);


        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentGPA);

    }
}

