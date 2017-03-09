import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;
public class TestRunner {
   public static void main(String[] args) {
      PrintStream stdout = System.out;
      Result result = JUnitCore.runClasses(TestJunit.class);
		  System.setOut(stdout);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		  
      System.out.println(result.wasSuccessful());
   }
}
