import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;
import javax.swing.JTextArea;

public class Table extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
				{"\u7B2C\u4E00\u7BC0\uFF08Time\uFF09", "課程"+"\n"+"老師"+"\n"+"教室", null, null, null, null, null},
				{"\u7B2C\u4E8C\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u4E09\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u56DB\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u4E94\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
				{"\u7B2C\u516D\u7BC0\uFF08Time\uFF09", null, null, null, null, null, null},
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
		table.setBounds(10, 10, 702, 610);
		contentPane.add(table);
	}
	
}
