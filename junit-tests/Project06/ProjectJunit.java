import org.junit.Test;
import java.io.*; //for InputStream, OutputStream, ByteArrayInputStream and ByteArrayOutputStream
//import TestProject;
import static org.junit.Assert.*;

public class ProjectJunit {

   @Test
   public void quitsOnBlankLine() {
      //System.err.println("");
      Project project = new Project();
      String input = "\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      //System.err.println(out.toString());      
   }
   @Test
   public void detectInvalidUPC() throws Exception {
      //System.err.println("In out of Range");
      Project project = new Project();
      String input = "036000291453\n\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      //System.err.println(out.toString());
      boolean invalid = out.toString().indexOf("not valid") != -1 || out.toString().indexOf("invalid") != -1 || out.toString().indexOf("not a valid") != -1;
      if(!invalid){
        int c = out.toString().lastIndexOf(":");
        fail("\n" +  out.toString().substring(c+3, out.toString().length()) );
      }
   }
   @Test
   public void detectValidUPC() throws Exception {
      //System.err.println("In out of Range");
      Project project = new Project();
      String input = "036000291452\n\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      System.err.println(out.toString());
      boolean invalid = out.toString().indexOf("is valid") == -1 && out.toString().indexOf("is a valid") == -1;
      if(invalid){
        int c = out.toString().lastIndexOf(":");
        fail("\n" + out.toString().substring(c+3, out.toString().length()));
      }
   }
   @Test
   public void detectWrongLength() throws Exception {
      //System.err.println("In out of Range");
      Project project = new Project();
      String input = "03600029145\n\n";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      project.main(new String[0]);
      //System.err.println(out.toString());
      boolean detectedWrongLength = out.toString().indexOf("check") == -1 && out.toString().indexOf("digits") == -1;
      if(detectedWrongLength){
        int c = out.toString().lastIndexOf(":");
        fail("\n" + out.toString().substring(c+1, out.toString().length() ));
      }
   }
}
