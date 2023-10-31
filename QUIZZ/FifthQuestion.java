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
public class FifthQuestion extends JFrame implements ActionListener{
    JRadioButton RAA, RBB, RCC, RDD;
    JLabel questionLabel,scoreLabel;
    JButton ans;
    int score;

    FifthQuestion() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        questionLabel = new JLabel("Who wrote the famous play Romeo and Juliet?");
        questionLabel.setBounds(100, 150, 500, 50);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(questionLabel);
        RAA = new JRadioButton("William Shakespeare");
        RAA.setBounds(100, 200, 300, 50);
        RBB = new JRadioButton("Charles Dickens");
        RBB.setBounds(100, 250, 300, 50);
        RCC = new JRadioButton("Jane Austen");
        RCC.setBounds(100, 300, 300, 50);
        RDD = new JRadioButton("Mark Twain");
        RDD.setBounds(100, 350, 300, 50);
        this.add(RAA);
        this.add(RBB);
        this.add(RCC);
        this.add(RDD);
        ButtonGroup rb5 = new ButtonGroup();
        rb5.add(RAA);
        rb5.add(RBB);
        rb5.add(RCC);
        rb5.add(RDD);
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
                new ScoreWindow(SharedScore.score);
            }
        });
        timer.setRepeats(false);
        timer.start();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (RBB.isSelected() || RCC.isSelected() || RDD.isSelected()) {
            JOptionPane.showMessageDialog(this, "Your answer is wrong. \"Romeo and Juliet\" is one of William Shakespeare's most well-known plays, depicting a tragic love story between the titular characters in Verona, Italy.");
            this.dispose();
            new ScoreWindow(SharedScore.score);
        } else if (RAA.isSelected()) {
        	SharedScore.score++;
            JOptionPane.showMessageDialog(this, "Your answer is true.  \"Romeo and Juliet\" is one of William Shakespeare's most well-known plays, depicting a tragic love story between the titular characters in Verona, Italy.");
            scoreLabel.setText("Score: " + SharedScore.score);
            this.dispose();
            new ScoreWindow(SharedScore.score);
        } else {
            JOptionPane.showMessageDialog(this, "Select an option");
        }
        
        
    }
}
