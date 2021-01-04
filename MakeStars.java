import java.util.*;
public class MakeStars{

  public static void main( String[]args ) {
    String line;
    Scanner n = new Scanner( System.in );
    while(n.hasNext()) {
      String starword = "";
      line = n.nextLine();
      Scanner p = new Scanner(line);
      while(p.hasNext()) {
        String word = p.next();
          for(int i = 0; i < word.length(); i++) {
            starword = starword + "*";
          }
        starword = starword + " ";
      }
      System.out.println(starword);
    }
  }

}
