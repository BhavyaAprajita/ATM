import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AtmFrame1 extends JFrame implements ActionListener {
	int bal= 1000, wd, dp;
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
	JLabel l1= new JLabel("Enter your card no");
	JLabel l2= new JLabel();
	JLabel l3= new JLabel();
	JLabel l4= new JLabel();
	JButton b1= new JButton("Submit cardno");
	JButton b2= new JButton();
	JButton b3= new JButton();
	JButton b4= new JButton();
	JButton b5= new JButton();
	JTextField t1= new JTextField(10);
	JTextField t2= new JTextField(10);
	JPasswordField ps1= new JPasswordField(10);

	AtmFrame1() {
		setLayout(new BorderLayout());
		p1.add(l1);
		p1.add(t1);
		p1.add(ps1);
		p1.add(b1);
		p1.add(l2);
		
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(l3);
		p3.add(t2);
		p3.add(b5);
		p3.add(l4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(p1,BorderLayout.NORTH);
		ps1.setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String msg= (String)ae.getActionCommand();
		if(msg.equals("Submit cardno")) {
			int a1= Integer.parseInt(t1.getText());
			if(a1==1234) {
				l1.setText("Enter your pin no");
				t1.setVisible(false);
				ps1.setVisible(true);
				b1.setText("Submit pinno");
				l2.setVisible(false);
			}
			else {
				l2.setText("Enter correct card no");
				l2.setVisible(true);
			}
		}
		
		if(msg.equals("Submit pinno")) {
			int a1= Integer.parseInt(ps1.getText());
			if(a1==12) {
				p1.setVisible(false);
				add(p2,BorderLayout.NORTH);
				p2.setVisible(true);
				b2.setText("Check Balance");
				b3.setText("Deposit");
				b4.setText("Withdraw");	
			}
			else {
				l2.setText("Enter correct pin no");
				l2.setVisible(true);
			}
		}

		if(msg.equals("Check Balance")) {	
			add(p3,BorderLayout.CENTER);
			l3.setText("Your balance is " +bal);
			t2.setVisible(false);
			b5.setVisible(false);
			l4.setVisible(false);	
		}
		if(msg.equals("Deposit")) {	
			add(p3,BorderLayout.CENTER);
			l3.setText("Enter the amount you want to deposit ");
			l3.setVisible(true);
			t2.setVisible(true);
			b5.setText("Deposit Money");
			b5.setVisible(true);
			t2.setText("");
			l4.setVisible(false);
		}
		if(msg.equals("Withdraw")) {	
			add(p3,BorderLayout.CENTER);
			l3.setText("Enter the amount you want to withdraw ");
			l3.setVisible(true);
			t2.setVisible(true);
			b5.setText("Withdraw Money");
			b5.setVisible(true);
			t2.setText("");	
			l4.setVisible(false);
		}
		if(msg.equals("Deposit Money")) {
			dp= Integer.parseInt(t2.getText());
			bal += dp;
			l4.setText("New balance "+bal);
			l4.setVisible(true);
			t2.setText("");
		}
		if(msg.equals("Withdraw Money")) {
			wd= Integer.parseInt(t2.getText());
			bal -= wd;
			l4.setText("New balance "+bal);
			l4.setVisible(true);
			t2.setText("");
		}


	}

	public static void main(String args[]) {
		AtmFrame1 r1= new AtmFrame1();
		r1.setVisible(true);
		r1.setSize(1400,700);
	}
}