import java.util.*;
public class PigLatin{

  public static void main( String[]args ) {
    String line;
    Scanner n = new Scanner( System.in );
    while(n.hasNext()) {
      line = n.nextLine();
      System.out.println(pigLatin(line));
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

  public static String pigLatin(String s) {
    String[] duo = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl",
              "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String line = "";
    Scanner p = new Scanner(s);
    while(p.hasNext()) {
      String word = p.next();
      String pigword = "";
      for(int i = 0; i < duo.length; i++) {
        String beg = duo[i];
        if(word.length() >= 2 && (word.substring(0,2)).equals(beg)) {
          for(int j = 2; j < word.length(); j++) {
              pigword = pigword + word.substring(j, j+1);
          }
          pigword = pigword + word.substring(0,2) + "ay ";
          i = duo.length;
        }
        else if((word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') && i == duo.length - 1) {
          for(int j = 0; j < word.length(); j++) {
              pigword = pigword + word.substring(j, j+1);
          }
          pigword = pigword + "hay ";
        }
        else{
          if(i == duo.length - 1) {
            for(int j = 1; j < word.length(); j++) {
                pigword = pigword + word.substring(j, j+1);
            }
            pigword = pigword + word.substring(0,1) + "ay ";
          }
        }
      }
      line = line + pigword;
    }
    return line;
  }

}
