package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class NewCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String string="";
	float val1,val2,val3=0;
	char opr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCalculator frame = new NewCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 101, 317, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=1/val1;
					string=""+val3;
					textField.setText(string);
					string="";
					val3=0;
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					val2=1/val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
				
				
				else
				{
					val2=Float.valueOf(string);
					val2=1/val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
			}
		});
		btnNewButton.setBounds(237, 0, 80, 48);
		panel.add(btnNewButton);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=val1*val1;
					string=""+val3;
					textField.setText(string);
					string="";
					val3=0;
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					val2=val2*val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
				
				
				else
				{
					val2=Float.valueOf(string);
					val2=val2*val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
			}
		});
		btnX.setBounds(158, 0, 80, 48);
		panel.add(btnX);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val2=Float.valueOf(textField.getText());
				val3=val3*val2/100;
				string=""+val3;
				textField.setText(string);
				val3=0;
			}
		});
		button_1.setBounds(0, 0, 80, 48);
		panel.add(button_1);
		
		JButton btnRoot = new JButton("ROOT");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=(float) Math.sqrt(val1);
					string=""+val3;
					textField.setText(string);
					string="";
					val3=0;
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					val2=(float) Math.sqrt(val2);
					string=""+val2;
					textField.setText(string);
					string="";
				}
				
				
				else
				{
					val2=Float.valueOf(string);
					val2=(float) Math.sqrt(val2);
					string=""+val2;
					textField.setText(string);
					string="";
				}
			}
		});
		btnRoot.setBounds(79, 0, 80, 48);
		panel.add(btnRoot);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string="";
				textField.setText(""+0);
				val2=0;
			}
		});
		btnCe.setBounds(0, 49, 80, 48);
		panel.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string="";
				textField.setText("0");
				val3=0;
			}
		});
		btnC.setBounds(79, 49, 80, 48);
		panel.add(btnC);
		
		JButton button_5 = new JButton("<-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()!=1)
				{
				string=textField.getText().substring(0, string.length()-1);
				textField.setText(string);
				}
				else
				{
					
					textField.setText(""+0);
					if(val3==0)
					{
						val1=0;
						val3=val1;
						string="";
					}
					else if(val2==0)
					{
						val2=0;
						string="";
					}
					else
					{
						val2=0;
						string="";
					}
				}
				
				
			}
		});
		button_5.setBounds(158, 49, 80, 48);
		panel.add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=val1;
					string="";
					opr='/';
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					division(val3, val2,opr);
					string="";
				}
				
				
				else
				{
					val2=Float.valueOf(string);
					division(val3,val2,opr);
					string="";
				}
			}
		});
		button_6.setBounds(237, 49, 80, 48);
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"7";
				textField.setText(string);
				
			}
		});
		button_7.setBounds(0, 97, 80, 48);
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"8";
				textField.setText(string);
				
			}
		});
		button_8.setBounds(79, 97, 80, 48);
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"9";
				textField.setText(string);
			}
		});
		button_9.setBounds(158, 97, 80, 48);
		panel.add(button_9);
		
		JButton btnX_1 = new JButton("X");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=val1;
					string="";
					opr='*';
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					multiplication(val3, val2,opr);
					string="";
				}
				else
				{
					val2=Float.valueOf(string);
					multiplication(val3,val2,opr);
					string="";
				}
			}
		});
		btnX_1.setBounds(237, 97, 80, 48);
		panel.add(btnX_1);
		
		JButton button_11 = new JButton("4");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"4";
				textField.setText(string);
			}
		});
		button_11.setBounds(0, 145, 80, 48);
		panel.add(button_11);
		
		JButton button_12 = new JButton("5");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"5";
				textField.setText(string);
			}
		});
		button_12.setBounds(79, 145, 80, 48);
		panel.add(button_12);
		
		JButton button_13 = new JButton("6");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"6";
				textField.setText(string);
			}
		});
		button_13.setBounds(158, 145, 80, 48);
		panel.add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=val1;
					string="";
					opr='-';
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					subtraction(val3, val2,opr);
					string="";
				}
				else
				{
					val2=Float.valueOf(string);
					subtraction(val3,val2,opr);
					string="";
				}
			}
		});
		button_14.setBounds(237, 145, 80, 48);
		panel.add(button_14);
		JButton button_15 = new JButton("1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"1";
				textField.setText(string);
			}
		});
		button_15.setBounds(0, 193, 80, 48);
		panel.add(button_15);
		JButton button_16 = new JButton("2");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"2";
				textField.setText(string);
				
			}
		});
		button_16.setBounds(79, 193, 80, 48);
		panel.add(button_16);
		
		JButton button_17 = new JButton("3");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"3";
				textField.setText(string);
			}
		});
		button_17.setBounds(158, 193, 80, 48);
		panel.add(button_17);
		
		JButton button_18 = new JButton("+");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=val1;
					string="";
					opr='+';
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					addition(val3,val2,opr);
					string="";
				}
				
				
				else
				{
					val2=Float.valueOf(string);
					addition(val3, val2, opr);
					string="";
				}
			}
		});
		button_18.setBounds(237, 193, 80, 48);
		panel.add(button_18);
		JButton button_19 = new JButton("+-");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val3==0)
				{
					val1=Float.valueOf(textField.getText());
					val3=-val1;
					string=""+val3;
					textField.setText(string);
					string="";
					val3=0;
				}
				else if(val2==0)
				{
					val2=Float.valueOf(string);
					val2=-val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
				else
				{
					val2=Float.valueOf(string);
					val2=-val2;
					string=""+val2;
					textField.setText(string);
					string="";
				}
			}
		});
		button_19.setBounds(0, 241, 80, 48);
		panel.add(button_19);
		
		JButton button_20 = new JButton("0");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+"0";
				textField.setText(string);
			}
		});
		button_20.setBounds(79, 241, 80, 48);
		panel.add(button_20);
		
		JButton button_21 = new JButton(".");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string=string+".";
				textField.setText(string);
			}
		});
		button_21.setBounds(158, 241, 80, 48);
		panel.add(button_21);
		
		JButton button_22 = new JButton("=");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (opr=='+')
				{
					val2=Float.valueOf(textField.getText());
					val3=val3+val2;
					string=""+val3;
					textField.setText(string);
				}
				else if (opr=='-')
				{
					val2=Float.valueOf(textField.getText());
					val3=val3-val2;
					string=""+val3;
					textField.setText(string);
				}
				else if (opr=='*')
				{
					val2=Float.valueOf(textField.getText());
					val3=val3*val2;
					string=""+val3;
					textField.setText(string);
				}
				else if (opr=='/')
				{
					val2=Float.valueOf(textField.getText());
					val3=val3/val2;
					string=""+val3;
					textField.setText(string);
				}
				val3=0;
			}
		});
		button_22.setBounds(237, 241, 80, 48);
		panel.add(button_22);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 317, 99);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 24));
		textField.setBounds(0, 0, 317, 98);
		textField.setText("0");
		panel_2.add(textField);
		textField.setColumns(10);
	}
	
	public void addition(float val1, float val2, char oprator)
	{
		if (oprator=='+')
		{
			val3=val1+val2;
			string=""+val3;
			textField.setText(string);
			opr='+';
		}
		else if (oprator=='-')
		{
			val3=val1-val2;
			string=""+val3;
			textField.setText(string);
			opr='+';
		}
		else if (oprator=='*')
		{
			val3=val1*val2;
			string=""+val3;
			textField.setText(string);
			opr='+';
		}
		else if (oprator=='/')
		{
			val3=val1/val2;
			string=""+val3;
			textField.setText(string);
			opr='+';
		}
	}
	public void subtraction(float val1, float val2, char oprator)
	{
		if (oprator=='+')
		{
			val3=val1+val2;
			string=""+val3;
			textField.setText(string);
			opr='-';
		}
		else if (oprator=='-')
		{
			val3=val1-val2;
			string=""+val3;
			textField.setText(string);
			opr='-';
		}
		else if (oprator=='*')
		{
			val3=val1*val2;
			string=""+val3;
			textField.setText(string);
			opr='-';
		}
		else if (oprator=='/')
		{
			val3=val1/val2;
			string=""+val3;
			textField.setText(string);
			opr='-';
		}
	}
	public void multiplication(float val1, float val2, char oprator)
	{
		if (oprator=='+')
		{
			val3=val1+val2;
			string=""+val3;
			textField.setText(string);
			opr='*';
		}
		else if (oprator=='-')
		{
			val3=val1-val2;
			string=""+val3;
			textField.setText(string);
			opr='*';
		}
		else if (oprator=='*')
		{
			val3=val1*val2;
			string=""+val3;
			textField.setText(string);
			opr='*';
		}
		else if (oprator=='/')
		{
			val3=val1/val2;
			string=""+val3;
			textField.setText(string);
			opr='*';
		}
	}
	public void division(float val1, float val2, char oprator)
	{
		if (oprator=='+')
		{
			val3=val1+val2;
			string=""+val3;
			textField.setText(string);
			opr='/';
		}
		else if (oprator=='-')
		{
			val3=val1-val2;
			string=""+val3;
			textField.setText(string);
			opr='/';
		}
		else if (oprator=='*')
		{
			val3=val1*val2;
			string=""+val3;
			textField.setText(string);
			opr='/';
		}
		else if (oprator=='/')
		{
			val3=val1/val2;
			string=""+val3;
			textField.setText(string);
			opr='/';
		}
	}
}
