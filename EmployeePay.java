import java.util.*;
import java.io.*;
public class EmployeePay {
     public static void main(String[] args) throws IOException

    {

        File employee = new File("Quiz.txt");

        Scanner quizfile = new Scanner(employee);

        String name = quizfile.nextLine();

        double hours = quizfile.nextDouble();

        double rate = quizfile.nextDouble();

        double sales = quizfile.nextDouble();

        double bonus, topay;

	if (sales > (hours * 200))

	{

	  bonus = (sales - (hours * 200)) * 0.1;

	}

	else

	{

	  bonus = 0;

	}

	topay = (hours * rate) + bonus;	

        System.out.println(name + " must be paid $" + topay + " this week.");

        quizfile.close();

    }

}

