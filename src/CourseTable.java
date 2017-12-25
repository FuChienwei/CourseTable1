import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JTextField;

public class CourseTable extends JFrame {

	private JPanel contentPane;

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
					CourseTable frame = new CourseTable(new FCU("逢甲",new JTable()));
					CourseTable frame1 = new CourseTable(new NTU("台大",new JTable()));
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
	public CourseTable(Table t) {
		setTitle(t.name+"\u5927\u5B78\u8AB2\u8868");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 666);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		contentPane.add(t.getTable());
		
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
