import org.junit.Test;
import java.io.*; //for InputStream, OutputStream, ByteArrayInputStream and ByteArrayOutputStream
//import TestProject;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   @Test
   public void testAdd() {
      TestProject testProject = new TestProject();
      String input = "add 5";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      testProject.main(new String[0]);
      String str = "Junit is working fine";
      assertEquals(input, out.toString());
      
   }
}
