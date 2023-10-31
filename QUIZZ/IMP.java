package QUIZZ;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class IMP extends JFrame implements ActionListener{
    JRadioButton radiobutton,radiobutton1,radiobutton2,radiobutton3;
	JLabel questionLabel,scoreLabel;
	JButton ans;
	int score = 0;
	IMP()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		questionLabel = new JLabel("Which gas is most abundant in the Earth's atmosphere?");
        questionLabel.setBounds(100, 150, 500, 50); 
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(questionLabel);
		radiobutton=new JRadioButton("Oxygen");
		radiobutton.setBounds(100,200,300,50);
		radiobutton1=new JRadioButton("Carbon Dioxide");
		radiobutton1.setBounds(100,250,300,50);
		radiobutton2=new JRadioButton("Nitrogen");
		radiobutton2.setBounds(100,300,300,50);
		radiobutton3=new JRadioButton("Hydrogen");
		radiobutton3.setBounds(100,350,300,50);
		this.add(radiobutton);
		this.add(radiobutton1);
		this.add(radiobutton2);
		this.add(radiobutton3);
		ButtonGroup rb=new ButtonGroup();
		rb.add(radiobutton);
		rb.add(radiobutton1);
		rb.add(radiobutton2);
		rb.add(radiobutton3);
		ans=new JButton("SUBMIT");
		ans.setBounds(100,450,300,50);
		this.add(ans);
		ans.addActionListener(this);
		scoreLabel = new JLabel("Score: " + SharedScore.score);
        scoreLabel.setBounds(450, 20, 100, 30);
        this.add(scoreLabel);
        Timer timer = new Timer(30000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                SecondQuestion sq = new SecondQuestion();
            }
        });
        timer.setRepeats(false);
        timer.start();
        this.setVisible(true); 
    }
	
	public void actionPerformed(ActionEvent e)
	{
		 if(radiobutton2.isSelected())
		{
			SharedScore.score++;
			JOptionPane.showMessageDialog(this,"Your answer is true."
					+ " Nitrogen makes up approximately 78% of the Earth's atmosphere, while oxygen is the second most abundant gas, accounting for about 21%.\r\n"
					+ "");
			scoreLabel.setText("Score: " + SharedScore.score);
			this.dispose();
			   SecondQuestion sq = new SecondQuestion();
		}
		else if(radiobutton.isSelected()||radiobutton1.isSelected()|| radiobutton3.isSelected())
		{
			JOptionPane.showMessageDialog(this,"Your answer is wrong."+ " Nitrogen makes up approximately 78% of the Earth's atmosphere, while oxygen is the second most abundant gas, accounting for about 21%.\r\n"
					+ "");
			this.dispose();
			   SecondQuestion sq = new SecondQuestion();
		}
		else {
			JOptionPane.showMessageDialog(this,"Select an option");
		}
		 
	
    }
}
