import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;

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
		setBounds(100, 100, 652, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94"},
				{"\u7B2C\u4E00\u7BC0\uFF08Time\uFF09", "(\u8AB2\u7A0B)(\u8001\u5E2B)(\u6559\u5BA4)", null, null, null, null},
				{"\u7B2C\u4E8C\u7BC0\uFF08Time\uFF09", "", null, null, null, null},
				{"\u7B2C\u4E09\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u56DB\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u4E94\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u516D\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u4E03\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u516B\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
				{"\u7B2C\u4E5D\u7BC0\uFF08Time\uFF09", null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.getColumnModel().getColumn(2).setPreferredWidth(94);
		table.getColumnModel().getColumn(3).setPreferredWidth(93);
		table.getColumnModel().getColumn(4).setPreferredWidth(91);
		table.getColumnModel().getColumn(5).setPreferredWidth(91);
		table.setBounds(7, 2, 622, 444);
		contentPane.add(table);
	}
}
