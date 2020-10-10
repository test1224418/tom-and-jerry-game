package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WaitingRoom extends JPanel {
	private ClientWindow win;
	private Image img;
	private JTextField textFieldChating;
	private JTextField textFieldChatingLook;
	
	/**
	 * Create the panel.
	 */
	public WaitingRoom(ClientWindow win) {
		this.win = win;
		initialize();
	}
	
	private void initialize() {
		setLayout(new BorderLayout());		
		
		//<----panelÀÇ ½ÃÀÛ-->
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(0,0));
		panel.setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		
		JPanel panelBinLineStart = new JPanel();
		panelBinLineStart.setPreferredSize(new Dimension(300,0));
		panelBinLineStart.setBackground(Color.WHITE);
		add(panelBinLineStart, BorderLayout.LINE_START);
		
		JPanel panelBinLineEnd = new JPanel();
		panelBinLineEnd.setPreferredSize(new Dimension(300, 0));
		panelBinLineEnd.setBackground(Color.WHITE);
		add(panelBinLineEnd, BorderLayout.LINE_END);
		panel.setLayout(null);
		
		//<----------------panel1------------->
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 664, 116);
		panel.add(panel1,BorderLayout.NORTH);
		panel1.setLayout(null);

		JLabel labelRoomNumber = new JLabel("\uBC29 \uBC88\uD638");
		labelRoomNumber.setBounds(28, 32, 120, 60);
		labelRoomNumber.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		panel1.add(labelRoomNumber);
		
		JLabel labelRoomName = new JLabel("\uBC29\uC81C\uBAA9");
		labelRoomName.setBounds(172, 32, 267, 60);
		labelRoomName.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		panel1.add(labelRoomName);
		
		JButton btuuonRoomInfo = new JButton("\uBC29 \uC815\uBCF4");
		btuuonRoomInfo.setBounds(485, 32, 167, 60);
		btuuonRoomInfo.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		panel1.add(btuuonRoomInfo);
		
		//<----------------panel2------------->
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 30, 664, 630);
		panel.add(panel2,BorderLayout.CENTER);
		panel2.setLayout(null);
		
		//<----------------panel3------------->
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 20, 392, 615);
		panel2.add(panel3);
		panel3.setLayout(null);
		
		JPanel panelUserList = new JPanel();
		panelUserList.setBounds(0, 0, 392, 395);
		panel3.add(panelUserList);
		panelUserList.setLayout(null);
		
		JLabel labelUser2 = new JLabel("\uC720\uC8002");
		labelUser2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser2.setBackground(Color.WHITE);
		labelUser2.setForeground(Color.BLACK);
		labelUser2.setBounds(18, 64, 348, 46);
		panelUserList.add(labelUser2);
		
		JLabel labelUser3 = new JLabel("\uC720\uC8003");
		labelUser3.setForeground(Color.BLACK);
		labelUser3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser3.setBackground(Color.WHITE);
		labelUser3.setBounds(18, 119, 348, 46);
		panelUserList.add(labelUser3);
		
		JLabel labelUser4 = new JLabel("\uC720\uC8004");
		labelUser4.setForeground(Color.BLACK);
		labelUser4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser4.setBackground(Color.WHITE);
		labelUser4.setBounds(18, 174, 348, 46);
		panelUserList.add(labelUser4);
		
		JLabel labelUser5 = new JLabel("\uC720\uC8005");
		labelUser5.setForeground(Color.BLACK);
		labelUser5.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser5.setBackground(Color.WHITE);
		labelUser5.setBounds(18, 229, 348, 46);
		panelUserList.add(labelUser5);
		
		JLabel labelUser6 = new JLabel("\uC720\uC8006");
		labelUser6.setForeground(Color.BLACK);
		labelUser6.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser6.setBackground(Color.WHITE);
		labelUser6.setBounds(18, 284, 348, 46);
		panelUserList.add(labelUser6);
		
		JLabel labelUser7 = new JLabel("\uC720\uC8007");
		labelUser7.setForeground(Color.BLACK);
		labelUser7.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser7.setBackground(Color.WHITE);
		labelUser7.setBounds(18, 339, 348, 46);
		panelUserList.add(labelUser7);
		
		JLabel labelUser1 = new JLabel("\uC720\uC8001");
		labelUser1.setToolTipText("\r\n");
		labelUser1.setForeground(Color.BLACK);
		labelUser1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		labelUser1.setBackground(Color.WHITE);
		labelUser1.setBounds(18, 9, 348, 46);
		panelUserList.add(labelUser1);
		
		textFieldChating = new JTextField();
		textFieldChating.setText("\uCC44\uD305 \uC785\uB825");
		textFieldChating.setBounds(12, 577, 368, 28);
		panel3.add(textFieldChating);
		textFieldChating.setColumns(10);
		
		textFieldChatingLook = new JTextField();
		textFieldChatingLook.setBounds(10, 405, 370, 162);
		panel3.add(textFieldChatingLook);
		textFieldChatingLook.setColumns(10);
		
		
		//<----------------panel4------------->
		JPanel panel4 = new JPanel();
		panel4.setBounds(393, 10, 271, 630);
		panel2.add(panel4);
		panel4.setLayout(null);
		
		JPanel panelmapImage = new JPanel();
		panelmapImage.setBounds(12, 80, 247, 186);
		panel4.add(panelmapImage);
		panelmapImage.setLayout(null);
		
		JButton buttonMapImage = new JButton("");
		buttonMapImage.setIcon(new ImageIcon("C:\\git-save\\\uC5F0\uC2B5\\TomAndJerry - Copy.png"));
		buttonMapImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonMapImage.setBounds(0, 0, 247, 116);
		panelmapImage.add(buttonMapImage);
		
		JPanel panelRoomButton = new JPanel();
		panelRoomButton.setBounds(12, 485, 247, 137);
		panel4.add(panelRoomButton);
		panelRoomButton.setLayout(null);
		
		JButton buttonGameStart = new JButton("\uAC8C\uC784 \uC2DC\uC791");
		buttonGameStart.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 20));
		buttonGameStart.setBounds(12, 10, 223, 53);
		panelRoomButton.add(buttonGameStart);
		
		JButton buttonRoomExit = new JButton("\uB098\uAC00\uAE30");
		buttonRoomExit.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 20));
		buttonRoomExit.setBounds(12, 74, 223, 53);
		panelRoomButton.add(buttonRoomExit);
	}
}
