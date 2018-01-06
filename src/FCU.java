import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FCU extends Table {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;
	private Choice choice,choice_2;
	private Date date;
    public FCU(String name, JTable table){
        super.name=name;
        super.table=table;
        load();
        notice();
    }


    @Override
    public void load() {
        data=new Object[][] {
                {"", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94", "\u661F\u671F\u516D"},
                {"\u7B2C\u4E00\u7BC0 \uFF088:10-9:00\uFF09", "", "\u5C08\u696D\u5916\u8A9E", "\u6578\u4F4D\u901A\u8A0A", null, null, null},
                {"\u7B2C\u4E8C\u7BC0\uFF089:10-10:00\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", "\u5C08\u696D\u5916\u8A9E", "\u6578\u4F4D\u901A\u8A0A", null, null, null},
                {"\u7B2C\u4E09\u7BC0\uFF0810:10-11:00\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", null, null, null, null, null},
                {"\u7B2C\u56DB\u7BC0\uFF0811:10-12:00\uFF09", "\u6578\u4F4D\u901A\u8A0A(\u5BE6)", "\u6578\u4F4D\u901A\u8A0A", null, null, null, null},
                {"\u7B2C\u4E94\u7BC0\uFF0812:10-13:00\uFF09", null, null, null, null, null, null},
                {"\u7B2C\u516D\u7BC0\uFF0813:10-14:00\uFF09", null, "\u73ED\u6703", null, null, null, null},
                {"\u7B2C\u4E03\u7BC0\uFF0814:10-15:00\uFF09", null, null, null, null, null, null},
                {"\u7B2C\u516B\u7BC0\uFF0815:10-16:00\uFF09", null, null, null, null, null, null},
                {"\u7B2C\u4E5D\u7BC0\uFF0816:10-17:00\uFF09", null, null, null, null, null, null},
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
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
        table.setBounds(10, 65, 702, 497);

        table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {   //暺���隞亙��ow頝olumn
				table.rowAtPoint(e.getPoint());
				table.columnAtPoint(e.getPoint());
				System.out.println(table.rowAtPoint(e.getPoint())+" "+table.columnAtPoint(e.getPoint()) );
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

    }

    @Override
    public void notice() {
    	Timer timer=new Timer();
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND));

    	timer.schedule(new TimerTask() {
			@Override
			public void run() {
					date=new Date();
					if(TimeToSection(date)==0) {}  //沒課的時候不做提醒
					else {
						if(table.getValueAt(TimeToSection(date), date.getDay())!=null) {
							System.out.println("星期"+date.getDay()+" "+date.getHours()+"點"+date.getMinutes()+"分"+date.getSeconds()+"秒");
							JOptionPane.showMessageDialog(new JFrame(),"現在時間:"+date.getHours()+"點"+date.getMinutes()+"分"+"\n10分鐘後要上課囉!!");
							//瘥���� 頝喳獢�� �������
						}
					}
			}
		},calendar.getTime(),1000);		//每1秒跑一次


    }
    public int TimeToSection(Date date) {
    	int sum=date.getHours()*60+date.getMinutes();   //sum=時*60+分   ,並對應在每堂課的前10分鐘
    	int sec = 0;
    	switch(sum) {
    	case 480:
    		sec= 1;
    	case 540:
    		sec= 2;
    	case 600:
    		sec= 3;
    	case 660:
    		sec= 4;
    	case 720:
    		sec= 5;
    	case 780:
    		sec= 6;
    	case 840:
    		sec= 7;
    	case 900:
    		sec= 8;
    	case 960:
    		sec=9;    	
    		}
		return sec;
		
    }

    @Override
    public void slide() {
    	//已經合併在switchView裡面 這裡可以考慮刪掉
    }

    @Override
    public void switchView() {
    	int t = date.getDay();
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FCU2 frame = new FCU2(t,table);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

    }

    @Override
    public void lunch() {
    	String[] lunch={"牛肉麵","蛋包飯","雞腿便當","排骨便當","炒飯","炒麵"};
    	Random r=new Random();
    	int num=r.nextInt(lunch.length);
    	int sum=date.getHours()*60+date.getMinutes();
    	if(num==2||num==3)
    	{
    		if(sum>=720&&sum<=750) {
    			JOptionPane.showMessageDialog(new JFrame(),"現在時間:"+date.getHours()+"點"+date.getMinutes()+"分\n你抽到  "+lunch[num]+"\n"+"現在人潮正多 不推薦購買便當\n請重新抽選!");}
    		else{
    			JOptionPane.showMessageDialog(new JFrame(),"現在時間:"+date.getHours()+"點"+date.getMinutes()+"分\n你抽到  "+lunch[num]+"\n"+"現在人潮正多 不推薦購買便當\n請重新抽選!");
    		}
    		
    	}
    	else
    	JOptionPane.showMessageDialog(new JFrame(),"現在時間:"+date.getHours()+"點"+date.getMinutes()+"分\n你抽到  "+lunch[num]);

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
		
		btnNewButton_1 = new JButton("今日課表");
		btnNewButton_1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				switchView();
			}
			
		});
		btnNewButton_1.setBounds(578, 584, 87, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("隨機午餐");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lunch();
				
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
		
	
		
		
	}


}