import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class FCU extends Table {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;
	private Choice choice,choice_2;
    public FCU(String name, JTable table){
        super.name=name;
        super.table=table;
        load();
        //notice();
    }


    @Override
    public void load() {
        data=new Object[][] {
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
        };

        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setModel(new DefaultTableModel(
                data,
                new String[] {
                        "New column", "New column", "New column", "New column", "New column", "New column", "New column"
                }
 ) {
        		 boolean[] columnEditables = new boolean[] { false, false, false,false,false,false,false };
         			public boolean isCellEditable(int row, int column) {
         				return columnEditables[column];
         			}
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
        table.setBounds(10, 65, 702, 497);

    }

    @Override
    public void notice() {
    	Timer timer=new Timer();
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND));

    	timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Date date=new Date();
				System.out.println(date.getMinutes()+" "+date.getSeconds());
				JOptionPane.showMessageDialog(new JFrame(),"123");
				//比對時間 跳出框框 到時再討論
			}
		},calendar.getTime(),60000);		//  開始時間 , 每一分鐘做一次


    }

    @Override
    public void slide() {

    }

    @Override
    public void switchView() {

    }

    @Override
    public void lunch() {

    }

    @Override
    public void contactbook() {

    }


	@Override
	public void addPane(JPanel contentPane) {
		btnNewButton = new JButton("�s�W���e");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Column=choice.getSelectedIndex();
				int Row=choice_2.getSelectedIndex();
				Object Text=textField.getText();
				table.setValueAt(Text, Row+1, Column+1);
			}
		});
		
		btnNewButton.setBounds(481, 21, 87, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("123");
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
		
		choice = new Choice();
		choice.setBounds(58, 21, 93, 21);
		choice.add("�P���@");
		choice.add("�P���G");
		choice.add("�P���T");
		choice.add("�P���|");
		choice.add("�P����");
		choice.add("�P����");
		
		contentPane.add(choice);
		
		choice_2 = new Choice();
		choice_2.setBounds(201, 21, 93, 21);
		choice_2.add("�Ĥ@�`");
		choice_2.add("�ĤG�`");
		choice_2.add("�ĤT�`");
		choice_2.add("�ĥ|�`");
		choice_2.add("�Ĥ��`");
		choice_2.add("�Ĥ��`");
		choice_2.add("�ĤC�`");
		choice_2.add("�ĤK�`");
		choice_2.add("�ĤE�`");
		contentPane.add(choice_2);
		
		textField = new JTextField();
		textField.setBounds(336, 22, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 585, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
	}


}