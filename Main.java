import java.util.*;

class Main {
  public static void main(String[] args) {
    String[] dictionary = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon", "mango", "orange"};
    SpellChecker checker = new SpellChecker(dictionary);
    checker.print10();
    checker.printStartsWith("ab");
    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q"));
      if (checker.spellcheck(word))
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
    scan.close() //;
  }
}
