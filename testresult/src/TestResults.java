import javax.swing.JOptionPane;
public class TestResults {
    public static void main(String[] args){
      int testScore;
      String input;

      input = JOptionPane.showInputDialog("enter your numeric " + "enter test score and you found out your grade");
      testScore = Integer.parseInt(input);

      //display grade in a if else loop
        if (testScore <60)
            JOptionPane.showInternalMessageDialog(null, "you failed");
        else if (testScore <70)
            JOptionPane.showInternalMessageDialog(null, "you get D");
        else if (testScore <80)
            JOptionPane.showInternalMessageDialog(null, "you get c");
        else if (testScore <90)
            JOptionPane.showInternalMessageDialog(null, "you get c");
        else if (testScore <100)
            JOptionPane.showInternalMessageDialog(null, "b+");
        else
            JOptionPane.showInternalMessageDialog(null, "A");
        System.exit(0);

    }//end main
}//end claass

