package QUIZZ;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class ScoreWindow extends JFrame{
    public ScoreWindow(int finalScore) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(600, 600);
        JLabel scoreLabel = new JLabel("Your final score is: " + finalScore +"/5");
        scoreLabel.setBounds(50, 50, 300, 30);
        this.add(scoreLabel);
        this.setVisible(true);
    }
}
