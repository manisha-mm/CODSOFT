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
public class SecondQuestion extends JFrame implements ActionListener {
    JRadioButton radiobuttonA, radiobuttonB, radiobuttonC, radiobuttonD;
    JLabel questionLabel,scoreLabel;
    JButton ans;
    int score;

    SecondQuestion() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        questionLabel = new JLabel("What is the largest planet in our solar system?");
        questionLabel.setBounds(100, 150, 500, 50);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(questionLabel);
        radiobuttonA = new JRadioButton("Mars");
        radiobuttonA.setBounds(100, 200, 300, 50);
        radiobuttonB = new JRadioButton("Saturn");
        radiobuttonB.setBounds(100, 250, 300, 50);
        radiobuttonC = new JRadioButton("Jupiter");
        radiobuttonC.setBounds(100, 300, 300, 50);
        radiobuttonD = new JRadioButton("Earth");
        radiobuttonD.setBounds(100, 350, 300, 50);
        this.add(radiobuttonA);
        this.add(radiobuttonB);
        this.add(radiobuttonC);
        this.add(radiobuttonD);
        ButtonGroup rb2 = new ButtonGroup();
        rb2.add(radiobuttonA);
        rb2.add(radiobuttonB);
        rb2.add(radiobuttonC);
        rb2.add(radiobuttonD);
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
                ThirdQuestion tq=new ThirdQuestion();
            }
        });
        timer.setRepeats(false);
        timer.start();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (radiobuttonA.isSelected() || radiobuttonB.isSelected() || radiobuttonD.isSelected()) {
            JOptionPane.showMessageDialog(this, "Your answer is wrong.Jupiter is the largest planet in our solar system.");
            this.dispose();
			   ThirdQuestion tq=new ThirdQuestion();
        } else if (radiobuttonC.isSelected()) {
        	SharedScore.score++;
            JOptionPane.showMessageDialog(this, "Your answer is true. Jupiter is the largest planet in our solar system.");
            scoreLabel.setText("Score: " + SharedScore.score);
            this.dispose();
			   ThirdQuestion tq=new ThirdQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Select an option");
        }
}

}
