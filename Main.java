import java.util.Scanner;
/**
 * Find out what animal the user is describing
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // asks the user if the animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String feathersAnswer = input.nextLine();

    if(feathersAnswer.equals("yes")){
      System.out.println("Does the animal swim? (yes/no)");
      String swimsAnswer = input.nextLine();

      // determine the type of bird
      if(swimsAnswer.equals("yes")){
        System.out.println("This is a duck");
      } else if(swimsAnswer.equals("no")){
        System.out.println("This is a hen");
      }

      // if the user answered no
    } else {
      System.out.println("Does the animal have legs? (yes/no)");
      String legsAnswer = input.nextLine();

      // determine the animal
      if(legsAnswer.equals("yes")){
        System.out.println("This is a lizard");
      } else if(legsAnswer.equals("no")){
        System.out.println("This is a snake");
      }



    }

  }
}
