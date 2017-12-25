import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
		btnNewButton = new JButton("新增內容");
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
		choice.add("星期一");
		choice.add("星期二");
		choice.add("星期三");
		choice.add("星期四");
		choice.add("星期五");
		choice.add("星期六");
		
		contentPane.add(choice);
		
		choice_2 = new Choice();
		choice_2.setBounds(201, 21, 93, 21);
		choice_2.add("第一節");
		choice_2.add("第二節");
		choice_2.add("第三節");
		choice_2.add("第四節");
		choice_2.add("第五節");
		choice_2.add("第六節");
		choice_2.add("第七節");
		choice_2.add("第八節");
		choice_2.add("第九節");
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