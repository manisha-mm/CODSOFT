package QUIZZ;

import javax.swing.JOptionPane;
public class quiz {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("ENTER YOUR NAME");
	        JOptionPane.showMessageDialog(null,"WELCOME TO THE QUIZ "+ name+" .YOU WILL ONLY GET 30 SECONDS FOR EACH QUESTION");
	        IMP imp=new IMP();
	        }
    
}
