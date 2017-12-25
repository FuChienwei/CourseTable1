import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JTextField;

public class Table extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
					Table frame1=new Table();
					frame.setVisible(true);
					frame1.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table() {
		setTitle("XX\u5927\u5B78\u8AB2\u8868");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
	
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94", "\u661F\u671F\u516D"},
				{"\u7B2C\u4E00\u7BC0\uFF08Time\uFF09", "", "\u5C08\u696D\u5916\u8A9E", "\u6578\u4F4D\u901A\u8A0A", null, null, null},
				{"\u7B2C\u4E8C\u7BC0\uFF08Time\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", "\u5C08\u696D\u5916\u8A9E", "\u6578\u4F4D\u901A\u8A0A", null, null, null},
				{"\u7B2C\u4E09\u7BC0\uFF08Time\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", null, null, null, null, null},
				{"\u7B2C\u56DB\u7BC0\uFF08Time\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", "\u6578\u4F4D\u901A\u8A0A", null, null, null, null},
				{"\u7B2C\u4E94\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u516D\u7BC0\uFF08Time\uFF09", null, "\u73ED\u6703", null, null, null, null},
				{"\u7B2C\u4E03\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u516B\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u4E5D\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
		table.setBounds(10, 65, 702, 497);
		
	
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("確定修改");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		btnNewButton.setBounds(481, 21, 87, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("確定修改");
		btnNewButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btnNewButton_1.setBounds(578, 584, 87, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(311, 584, 87, 23);
		contentPane.add(btnNewButton_2);
		
		Choice choice = new Choice();
		choice.setBounds(58, 21, 93, 21);
		choice.add("星期一");
		choice.add("星期二");
		choice.add("星期三");
		choice.add("星期四");
		choice.add("星期五");
		choice.add("星期六");
		contentPane.add(choice);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(201, 21, 93, 21);
		contentPane.add(choice_2);
		
		textField = new JTextField();
		textField.setBounds(58, 585, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(336, 22, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
