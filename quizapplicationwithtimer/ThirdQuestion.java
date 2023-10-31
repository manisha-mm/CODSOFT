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
public class ThirdQuestion extends JFrame implements ActionListener{
    JRadioButton rA, rB, rC, rD;
    JLabel questionLabel,scoreLabel;
    JButton ans;
    int score;

    ThirdQuestion() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        questionLabel = new JLabel("Which element is represented by the chemical symbol 'Na'?");
        questionLabel.setBounds(100, 150, 500, 50);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(questionLabel);
        rA = new JRadioButton("Sodium");
        rA.setBounds(100, 200, 300, 50);
        rB = new JRadioButton("Silver");
        rB.setBounds(100, 250, 300, 50);
        rC = new JRadioButton("Silicon");
        rC.setBounds(100, 300, 300, 50);
        rD = new JRadioButton("Sulfur");
        rD.setBounds(100, 350, 300, 50);
        this.add(rA);
        this.add(rB);
        this.add(rC);
        this.add(rD);
        ButtonGroup rb3 = new ButtonGroup();
        rb3.add(rA);
        rb3.add(rB);
        rb3.add(rC);
        rb3.add(rD);
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
                FourthQuestion fq=new FourthQuestion();
            }
        });
        timer.setRepeats(false);
        timer.start();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rB.isSelected() || rC.isSelected() || rD.isSelected()) {
            JOptionPane.showMessageDialog(this, "Your answer is wrong.Sodium is the element represented by the chemical symbol 'Na'. It has an atomic number of 11 and is a highly reactive metal.");
            this.dispose();
			   FourthQuestion fq=new FourthQuestion();
        } else if (rA.isSelected()) {
        	SharedScore.score++;
            JOptionPane.showMessageDialog(this, "Your answer is true. Sodium is the element represented by the chemical symbol 'Na'. It has an atomic number of 11 and is a highly reactive metal.");
            scoreLabel.setText("Score: " + SharedScore.score);
            this.dispose();
            FourthQuestion fq=new FourthQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Select an option");
        }
        
    }
}
