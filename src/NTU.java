import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NTU extends Table {
	private JButton btnNewButton,btnNewButton_2;
	private JLabel lblNewLabel;
	private Date date=new Date();
	
    public NTU(String name){
    	super(name);
    }

    @Override
    public void load() {
    	
    table.setColumnSelectionAllowed(true);
    table.setCellSelectionEnabled(true);
    table.setBounds(10, 65, 702, 497);
    table.setModel(new DefaultTableModel(data,
                new String[] {"New column", "New column", "New column", "New column", "New column", "New column", "New column"})
        {
        		 boolean[] columnEditables = new boolean[] { false,true,true,true,true,true,true };
         			public boolean isCellEditable(int row, int column) {
         				return columnEditables[column];
         			}
        });
        
    table.getColumnModel().getColumn(0).setPreferredWidth(120);
    table.getColumnModel().getColumn(1).setPreferredWidth(100);
    table.getColumnModel().getColumn(2).setPreferredWidth(100);
    table.getColumnModel().getColumn(3).setPreferredWidth(100);
    table.getColumnModel().getColumn(4).setPreferredWidth(100);
    table.getColumnModel().getColumn(5).setPreferredWidth(100);
    table.getColumnModel().getColumn(6).setPreferredWidth(100);
    table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
    
    
    table.setValueAt("�]�Ⱥ޲z", 2, 5);
	table.setValueAt("�]�Ⱥ޲z", 3, 5);
	table.setValueAt("�]�Ⱥ޲z", 4, 5);
	table.setValueAt("��y��k", 7, 4);
	table.setValueAt("��y��k", 8, 4);
	table.setValueAt("��y��k", 9, 4);
	table.setValueAt("�T���z��", 2, 3);
	table.setValueAt("�T���z��", 3, 3);
	table.setValueAt("�T���z��", 4, 3);
	table.setValueAt("�f���Ȧ��", 6, 2);
	table.setValueAt("�f���Ȧ��", 7, 2);
	table.setValueAt("�f���Ȧ��", 8, 2);
	table.setValueAt("���½Ķ", 3, 1);
	table.setValueAt("���½Ķ", 4, 1);

     
    }

    @Override
    public void notice() {
    	//new SendEmail();  //�Ȯɵ��� ���M�@���H�H
    }


	@Override
	public void addComponent() {
		
		btnNewButton= new JButton("����Ҫ�");
		btnNewButton.setBounds(578, 584, 87, 23);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NTU2 frame = new NTU2(date,table);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}	
		});
		
		
		btnNewButton_2 = new JButton("�Y��");
		btnNewButton_2.setBounds(311, 584, 87, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NTUlunch frame1 = new NTUlunch();
							frame1.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});	
			}
		});

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(322, 30, 100, 15);
		lblNewLabel.setText("�H��w�H�X!!");
		
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblNewLabel);
	}
}
