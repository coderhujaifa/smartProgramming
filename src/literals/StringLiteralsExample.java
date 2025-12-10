package literals;

public class StringLiteralsExample
{
    public static void main(String[] args)
    {
        // String Literal: A sequence of characters enclosed in double quotes
        String greeting = "Hello, World!"; // A simple string literal
        System.out.println("String Literal (greeting): " + greeting); // Output: Hello, World!

        // String Literal: An empty string
        String empty = ""; // An empty string
        System.out.println("String Literal (empty): '" + empty + "'"); // Output: ''

        // String with Escape Sequences
        String multiLineString = "Line1\nLine2"; // Using escape sequence \n for newline
        System.out.println("String with Escape Sequences (multiLineString): " + multiLineString);
        // Output:
        // Line1
        // Line2

        String quotedString = "He said, \"Hello!\""; // Using escape sequence \" for double quote
        System.out.println("String with Escape Sequences (quotedString): " + quotedString);
        // Output: He said, "Hello!"

        String tabbedString = "Item1\tItem2"; // Using escape sequence \t for tab
        System.out.println("String with Escape Sequences (tabbedString): " + tabbedString);
        // Output: Item1    Item2
    }
}