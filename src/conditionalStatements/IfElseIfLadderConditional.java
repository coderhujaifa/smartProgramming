package conditionalStatements;

public class IfElseIfLadderConditional 
{
    public static void main(String[] args)
    {
        int marks = 50;

        // Determine the grade based on marks
        if (marks >= 90)
        {
            System.out.println("Grade: A");
        }
        else if (marks >= 75)
        {
            System.out.println("Grade: B");
        }
        else if (marks >= 50)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}