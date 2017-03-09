import org.junit.Test;
import java.io.*; //for InputStream, OutputStream, ByteArrayInputStream and ByteArrayOutputStream
//import TestProject;
import static org.junit.Assert.assertTrue;

public class Project05Junit {

   @Test
   public void testAResult() {
      Project05 project = new Project05();
      String input = "50\n20\n1\n0\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      //System.err.println(out.toString());
      assertTrue(out.toString().indexOf("That was amazing!") != -1);
      
   }
   @Test
   public void testOutOfRange() {
      Project05 project = new Project05();
      String input = "101\n-1\n1\n0\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      //System.err.println(out.toString());
      boolean outOfRange = out.toString().indexOf("out of range") != -1;
      assertTrue(outOfRange);
   }
  
}
