import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NTU extends Table {


    public NTU(String name, JTable table){
        super.name=name;
        super.table=table;
        load();
        notice();
    }

    @Override
    public void load() {
    	data=new Object[][] {
            {"", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94", "\u661F\u671F\u516D"},
            {"\u7B2C\u4E00\u7BC0 \uFF088:10-9:00\uFF09",  null, null, null, null, null, null},
            {"\u7B2C\u4E8C\u7BC0\uFF089:10-10:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u4E09\u7BC0\uFF0810:10-11:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u56DB\u7BC0\uFF0811:10-12:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u4E94\u7BC0\uFF0812:10-13:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u516D\u7BC0\uFF0813:10-14:00\uFF09", null,null, null, null, null, null},
            {"\u7B2C\u4E03\u7BC0\uFF0814:10-15:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u516B\u7BC0\uFF0815:10-16:00\uFF09", null, null, null, null, null, null},
            {"\u7B2C\u4E5D\u7BC0\uFF0816:10-17:00\uFF09", null, null, null, null, null, null},
    };


    table.setColumnSelectionAllowed(true);
    table.setCellSelectionEnabled(true);

        table.setModel(new DefaultTableModel(
                data,
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
        table.setBounds(10, 65, 702, 497);



    }

    @Override
    public void notice() {
    	new SendEmail();
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
		// TODO Auto-generated method stub
		
	}
}
