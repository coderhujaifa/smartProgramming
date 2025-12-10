package literals;

public class CharacterLiteralsExample
{
    public static void main(String[] args)
    {
        // Character Literal: A single character enclosed in single quotes
        char letter = 'A'; // Represents the character 'A'
        System.out.println("Character Literal (letter): " + letter); // Output: A

        // Character Literal: A digit as a character
        char digit = '7'; // Represents the character '7'
        System.out.println("Character Literal (digit): " + digit); // Output: 7

        // Character Literal: A special character
        char specialChar = '@'; // Represents the character '@'
        System.out.println("Character Literal (specialChar): " + specialChar); // Output: @

        // Using Escape Sequences for special characters
        char newlineChar = '\n'; // Represents a newline
        char tabChar = '\t'; // Represents a tab
        char singleQuoteChar = '\''; // Represents a single quote
        char backslashChar = '\\'; // Represents a backslash

        // Output using escape sequences
        System.out.println("Escape Sequence (newline):" + newlineChar + "This is after newline.");
        System.out.println("Escape Sequence (tab):" + tabChar + "This is after tab.");
        System.out.println("Escape Sequence (single quote): " + singleQuoteChar + "This is single quote.");
        System.out.println("Escape Sequence (backslash): " + backslashChar + "This is backslash.");
    }
}