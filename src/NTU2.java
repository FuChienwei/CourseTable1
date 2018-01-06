import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class NTU2 extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane_1;
	private JTable table;
	private Date t;
	private int t1;
	private String day[]= {"星期一","星期二","星期三","星期四","星期五","星期六"};


	/**
	 * Create the frame.
	 */
	public NTU2(Date t, JTable ntuTable) {
		setTitle("今日課表");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1108, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.t=t;
		t1=t.getDay();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(54);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(6).setPreferredWidth(90);
		table.getColumnModel().getColumn(7).setPreferredWidth(90);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(9).setPreferredWidth(90);
		
		table.setValueAt(day[t1-1],1,0);
		for(int i=0;i<9;i++)
		{
			table.setValueAt(ntuTable.getValueAt(i+1,0)+" ",0,i+1);
			table.setValueAt(ntuTable.getValueAt(i+1,t1),1,i+1);
		}
		
		
		table.setBounds(10, 84, 1012, 127);
		contentPane.add(table);
		
		JButton btnup = new JButton("\u2191");
		btnup.setBounds(1030, 101, 62, 23);
		btnup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(t1!=6) {
						t1++;
						table.setValueAt(day[t1-1],1,0);
						for(int i=0;i<9;i++)
						{
							table.setValueAt(ntuTable.getValueAt(i+1,t1),1,i+1);
						}
					}
					else {}			
			}
		});
		contentPane.add(btnup);
		
		JButton btndown = new JButton("\u2193");
		btndown.setBounds(1030, 151, 62, 23);
		btndown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(t1!=1) {
						t1--;
						table.setValueAt(day[t1-1],1,0);
						for(int i=0;i<9;i++)
						{
							table.setValueAt(ntuTable.getValueAt(i+1,t1),1,i+1);
						}
					}
					else {}			
			}
		});
		contentPane.add(btndown);
		
		
		JLabel label = new JLabel("\u4ECA\u5929\u662F");
		label.setBounds(100, 28, 50, 15);
		contentPane.add(label);
	
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(160, 22, 70, 21);
		textPane.setText(day[t1-1]);
		contentPane.add(textPane);
		
		JLabel label_1 = new JLabel("\u73FE\u5728\u6642\u9593");
		label_1.setBounds(286, 28, 62, 15);
		contentPane.add(label_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setText(t.getHours()+":"+t.getMinutes()+":"+t.getSeconds());	
	
		

		textPane_1.setBounds(358, 22, 62, 21);
		contentPane.add(textPane_1);
		
	     table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer_1());
	}

}
