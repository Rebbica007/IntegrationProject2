
public class SwitchDemo {    
  public static void grading(char grade){
    grade = ('A');
    grade = ('B');
    grade = ('C');
    grade = ('D');
    grade = ('F');
  int success;
 switch (grade) {
   case 'A':
       System.out.println("Congradulations!");
       success = 1;
       break;
   case 'B':
       System.out.println("You almost had an A");
       success = 1;
       break;
   case 'C':
      System.out.println("Okay you need help");
      success = 1;
      break;
   case 'D':
   case 'F':
      System.out.println("Go to a tutor");
      success = 0;
      break;
   default:
      System.out.println("Invalid grade");
      success = -1;
      break;
 }
 passTheClass(success);
}

public static void passTheClass(int success) {
  switch (success) {
    case -1:
        System.out.println("No result");
        break;
    case 0:
      System.out.println("FAIL");
      break;
    case 1:
      System.out.println("PASS");
      break;
    default: 
      System.out.println("Unknown");
      break;
  }
}
}
