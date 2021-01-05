import java.util.*;
public class PigLatin{

  public static void main( String[]args ) {
    String line;
    Scanner n = new Scanner( System.in );
    while(n.hasNext()) {
      line = n.nextLine();
      System.out.println(pigLatinSimple(line));
    }
  }

  public static String pigLatinSimple(String s) {
    String line = "";
    Scanner p = new Scanner(s);
    while(p.hasNext()) {
      String pigword = "";
      String word = p.next();
      if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
        for(int i = 0; i < word.length(); i++) {
          pigword = pigword + word.substring(i, i+1);
        }
        pigword = pigword + "hay ";
      }
      else{
        for(int i = 1; i < word.length(); i++) {
          pigword = pigword + word.substring(i, i+1);
        }
        pigword = pigword + word.substring(0,1) + "ay ";
      }
      line = line + pigword;
    }
    return line;
  }

}
