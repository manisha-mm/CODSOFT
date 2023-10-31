package QUIZZ;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class FourthQuestion extends JFrame implements ActionListener {
    JRadioButton RA, RB, RC, RD;
    JLabel questionLabel,scoreLabel;
    JButton ans;
    int score;

    FourthQuestion() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        questionLabel = new JLabel("What is the largest mammal on Earth?");
        questionLabel.setBounds(100, 150, 500, 50);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(questionLabel);
        RA = new JRadioButton("African Elephant");
        RA.setBounds(100, 200, 300, 50);
        RB = new JRadioButton("Blue Whale");
        RB.setBounds(100, 250, 300, 50);
        RC = new JRadioButton("Polar Bear");
        RC.setBounds(100, 300, 300, 50);
        RD = new JRadioButton("Giraffe");
        RD.setBounds(100, 350, 300, 50);
        this.add(RA);
        this.add(RB);
        this.add(RC);
        this.add(RD);
        ButtonGroup rb4 = new ButtonGroup();
        rb4.add(RA);
        rb4.add(RB);
        rb4.add(RC);
        rb4.add(RD);
        ans = new JButton("SUBMIT");
        ans.setBounds(100, 450, 300, 50);
        this.add(ans);
        ans.addActionListener(this);
		scoreLabel = new JLabel("Score: " + SharedScore.score);
        scoreLabel.setBounds(450, 20, 100, 30);
        this.add(scoreLabel);
        Timer timer = new Timer(30000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FifthQuestion ffq=new FifthQuestion();
            }
        });
        timer.setRepeats(false);
        timer.start();
        this.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        if (RA.isSelected() || RC.isSelected() || RD.isSelected()) {
            JOptionPane.showMessageDialog(this, "Your answer is wrong.The blue whale is the largest mammal on Earth and also the largest animal to have ever existed, capable of reaching lengths of over 100 feet.");
            this.dispose();
			   FifthQuestion ffq=new FifthQuestion();
        } else if (RB.isSelected()) {
        	SharedScore.score++;
            JOptionPane.showMessageDialog(this, "Your answer is true. The blue whale is the largest mammal on Earth and also the largest animal to have ever existed, capable of reaching lengths of over 100 feet.");
            scoreLabel.setText("Score: " + SharedScore.score);
            this.dispose();
			   FifthQuestion ffq=new FifthQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Select an option");
        }
        
    }
}
