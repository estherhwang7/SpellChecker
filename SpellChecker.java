import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!
      public SpellChecker(String[] dictionary) {
        this.dictionary = dictionary;
      }

      public void print10() {
        int limit = Math.min(10, dictionary.length);
        for (int i = 0; i < limit; i++) {
            System.out.print(dictionary[i] + " ");
        }
        System.out.println();
      }

      public boolean spellcheck(String word) {
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].equals(word)) {
                return true;
            }
        }
        return false;
      }
      
      public void printStartsWith(String firstLetters) {
        for (int i = 0; i < dictionary.length; i++) {
          if (dictionary[i].startsWith(firstLetters)) {
              System.out.println(dictionary[i]);
          }
        }
      }


      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }
      
    
   }