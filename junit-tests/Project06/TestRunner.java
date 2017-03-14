import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;
public class TestRunner {
   public static void main(String[] args) throws Exception {
      InputStream stdin = System.in;
      PrintStream stdout = System.out;
      Result result = JUnitCore.runClasses(ProjectJunit.class);
		  System.setOut(stdout);
		  System.setIn(stdin);
		  PrintWriter outputFile = new PrintWriter("score.txt");
      outputFile.print(10 - 1*result.getFailureCount());
      outputFile.print(' ');
      for (Failure failure : result.getFailures()) {
         outputFile.println(failure.toString());
      }
      outputFile.close();
   }
}
