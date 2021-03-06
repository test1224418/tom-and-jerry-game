package gui;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpScreen extends JPanel {
	private ClientWindow win;
	private JPasswordField pwField, pwConfirmField;
	private JTextField idField, nicknameField, emailField, birthField3, telField2, telField3;
	private JLabel idLabel, pwLabel, nicknameLable, emailLabel, pwConfirmLabel, birthLabel, birthLabel1, birthLabel2, birthLabel3, lineLabel1, lineLabel2;
	private Choice birthField1, birthField2, telField1;
	private JButton submitBtn, cancelBtn;

	/**
	 * Create the panel.
	 */
	public SignUpScreen(ClientWindow win) {
		this.win = win;
		setLayout(new BorderLayout(0, 0));

		JLabel signUpTitle = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
		signUpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signUpTitle.setFont(new Font("HY�߰���", Font.PLAIN, 36));
		add(signUpTitle, BorderLayout.NORTH);
		
		JPanel inputForm = new JPanel();
		inputForm.setLayout(null);
		add(inputForm, BorderLayout.CENTER);
		
		idLabel = new JLabel("\uC544\uC774\uB514 : ");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		idLabel.setBounds(409, 75, 125, 18);
		inputForm.add(idLabel);
		
		idField = new JTextField();
		idField.setFont(new Font("����", Font.PLAIN, 18));
		idField.setBounds(545, 70, 200, 30);
		inputForm.add(idField);
		idField.setColumns(20);
		
		JButton idCheckBtn = new JButton("\uC911\uBCF5\uD655\uC778");
		idCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		idCheckBtn.setFont(new Font("HY�߰���", Font.PLAIN, 14));
		idCheckBtn.setBackground(Color.LIGHT_GRAY);
		idCheckBtn.setBounds(759, 65, 90, 40);
		inputForm.add(idCheckBtn);
		
		pwLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 : ");
		pwLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		pwLabel.setBounds(410, 125, 125, 18);
		inputForm.add(pwLabel);
		
		nicknameLable = new JLabel("\uB2C9\uB124\uC784 : ");
		nicknameLable.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLable.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		nicknameLable.setBounds(409, 225, 125, 18);
		inputForm.add(nicknameLable);
		
		emailLabel = new JLabel("\uC774\uBA54\uC77C : ");
		emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		emailLabel.setBounds(409, 275, 125, 18);
		inputForm.add(emailLabel);
		
		pwField = new JPasswordField();
		pwField.setFont(new Font("����", Font.PLAIN, 18));
		pwField.setBounds(545, 120, 200, 30);
		inputForm.add(pwField);
		
		pwConfirmLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778 : ");
		pwConfirmLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwConfirmLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		pwConfirmLabel.setBounds(345, 175, 188, 18);
		inputForm.add(pwConfirmLabel);
		
		pwConfirmField = new JPasswordField();
		pwConfirmField.setFont(new Font("����", Font.PLAIN, 18));
		pwConfirmField.setBounds(545, 170, 200, 30);
		inputForm.add(pwConfirmField);
		
		nicknameField = new JTextField();
		nicknameField.setFont(new Font("����", Font.PLAIN, 18));
		nicknameField.setColumns(20);
		nicknameField.setBounds(545, 220, 200, 30);
		inputForm.add(nicknameField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("����", Font.PLAIN, 18));
		emailField.setColumns(20);
		emailField.setBounds(545, 270, 200, 30);
		inputForm.add(emailField);
		
		birthLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C : ");
		birthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		birthLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		birthLabel.setBounds(409, 325, 125, 18);
		inputForm.add(birthLabel);
		
		birthField1 = new Choice();
		birthField1.setSize(80, 30);
		birthField1.setFont(new Font("Dialog", Font.PLAIN, 18));
		birthField1.setLocation(545, 320);
		inputForm.add(birthField1);
		for(int year=1960; year<=2020; year++)
			birthField1.add(String.valueOf(year));
		
		birthLabel1 = new JLabel("\uB144");
		birthLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		birthLabel1.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		birthLabel1.setBounds(635, 325, 30, 18);
		inputForm.add(birthLabel1);
		
		birthField2 = new Choice();
		birthField2.setFont(new Font("Dialog", Font.PLAIN, 18));
		birthField2.setBounds(675, 320, 60, 32);
		inputForm.add(birthField2);
		for(int month=1; month<=12; month++)
			birthField2.add(String.valueOf(month));

		birthLabel2 = new JLabel("\uC6D4");
		birthLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		birthLabel2.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		birthLabel2.setBounds(745, 325, 30, 18);
		inputForm.add(birthLabel2);
		
		JLabel telLabel = new JLabel("\uC804\uD654\uBC88\uD638 : ");
		telLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		telLabel.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		telLabel.setBounds(409, 375, 125, 18);
		inputForm.add(telLabel);
		
		birthField3 = new JTextField();
		birthField3.setHorizontalAlignment(SwingConstants.CENTER);
		birthField3.setFont(new Font("����", Font.PLAIN, 18));
		birthField3.setColumns(2);
		birthField3.setBounds(785, 320, 60, 32);
		inputForm.add(birthField3);
		
		birthLabel3 = new JLabel("\uC77C");
		birthLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		birthLabel3.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		birthLabel3.setBounds(855, 325, 28, 18);
		inputForm.add(birthLabel3);
		
		telField1 = new Choice();
		telField1.setFont(new Font("Dialog", Font.PLAIN, 18));
		telField1.setBounds(545, 370, 80, 32);
		inputForm.add(telField1);
		String[] telFirstList = {"010", "011", "016", "017", "019"};
		for(String telFirst : telFirstList)
			telField1.add(telFirst);
		
		lineLabel1 = new JLabel("-");
		lineLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lineLabel1.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		lineLabel1.setBounds(635, 375, 30, 18);
		inputForm.add(lineLabel1);

		telField2 = new JTextField();
		telField2.setHorizontalAlignment(SwingConstants.CENTER);
		telField2.setFont(new Font("����", Font.PLAIN, 18));
		telField2.setColumns(4);
		telField2.setBounds(675, 370, 60, 32);
		inputForm.add(telField2);

		lineLabel2 = new JLabel("-");
		lineLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lineLabel2.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		lineLabel2.setBounds(745, 375, 30, 18);
		inputForm.add(lineLabel2);
		
		telField3 = new JTextField();
		telField3.setHorizontalAlignment(SwingConstants.CENTER);
		telField3.setFont(new Font("����", Font.PLAIN, 18));
		telField3.setColumns(4);
		telField3.setBounds(785, 370, 60, 32);
		inputForm.add(telField3);
		
		submitBtn = new JButton("\uAC00\uC785");
		submitBtn.setBackground(Color.ORANGE);
		submitBtn.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		submitBtn.setBounds(492, 471, 150, 50);
		inputForm.add(submitBtn);
		
		cancelBtn = new JButton("\uCDE8\uC18C");
		cancelBtn.setBackground(Color.WHITE);
		cancelBtn.setFont(new Font("HY�߰���", Font.PLAIN, 20));
		cancelBtn.setBounds(656, 471, 150, 50);
		inputForm.add(cancelBtn);
		
	}
}

