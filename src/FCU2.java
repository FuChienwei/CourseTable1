import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class FCU2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String day[]= {"星期一","星期二","星期三","星期四","星期五","星期六"};
	private int t1;

	public FCU2(int t, JTable fcuTable) {
		setTitle("今日課表");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 319, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		table = new JTable();
		table.setBounds(10, 41, 279, 631);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {"New column", "New column"}
			) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		
		t1=t;
		table.setValueAt(day[t-1],0,1);
		for(int i=0;i<9;i++)
		{
			table.setValueAt(fcuTable.getValueAt(i+1,0),i+1,0);
			table.setValueAt(fcuTable.getValueAt(i+1,t),i+1,1);
		}
		
		
		table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer_1());
		contentPane.add(table);
		
		//----------↓↓↓-----------------元件--------------↓↓↓----------------//
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(60, 10, 63, 21);
		textPane.setText(day[t-1]);
		

		
		JLabel label = new JLabel("\u4ECA\u5929\u662F");
		label.setBounds(10, 16, 57, 15);

		
		JButton btnLeft = new JButton("\u2190");
		btnLeft.setBounds(147, 8, 63, 23);
		btnLeft.setFont(new Font("新細明體", Font.PLAIN, 22));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1!=1) {
					t1--;
					table.setValueAt(day[t1-1],0,1);
					for(int i=0;i<9;i++)
					{
						table.setValueAt(fcuTable.getValueAt(i+1,t1),i+1,1);
					}
				}
				else {}
			}
		});
		
		
		JButton btnRight = new JButton("\u2192");
		btnRight.setBounds(220, 8, 63, 23);
		btnRight.setFont(new Font("新細明體", Font.PLAIN, 22));
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(t1!=6) {
						t1++;
						table.setValueAt(day[t1-1],0,1);
						for(int i=0;i<9;i++)
						{
							table.setValueAt(fcuTable.getValueAt(i+1,t1),i+1,1);
						}
					}
					else {}			
			}
		});

		
		contentPane.add(textPane);
		contentPane.add(label);
		contentPane.add(btnLeft);
		contentPane.add(btnRight);
    
	}
}
