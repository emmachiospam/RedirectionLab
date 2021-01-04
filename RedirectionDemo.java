import java.util.*;
public class RedirectionDemo{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      String line;
      while(n.hasNext()) {
        line = n.next();
        System.out.println(line);
      }
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
