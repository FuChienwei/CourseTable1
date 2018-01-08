import javax.swing.*;
import javax.swing.border.EmptyBorder;

public abstract class Table extends JFrame implements Method{

	JPanel contentPane;
    JTable table;
    Object[][] 	data;
    String name;
    
    public Table(String name){
    	this.name=name;
    }
    
    final void make(){                //初始化
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
        
		setTitle(name+"\u5927\u5B78\u8AB2\u8868");             //繼承JFrame 最原始的外框
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 666);
		
        contentPane=new JPanel();                              //一個JPanel 拿來放置JTable和其他元件
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
        table=new JTable();                                    //課表
        contentPane.add(table);
        
    	load();
    	notice();
    	addComponent();
    	setVisible(true);
    }

    
    @Override
    abstract public void load();

    @Override
    abstract public void notice();


    abstract public void addComponent();  

}
