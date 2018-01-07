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
 

    	//設定課表可不可以直接編輯
    	
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setModel(new DefaultTableModel(data,
                new String[] {
                        "New column", "New column", "New column", "New column", "New column", "New column", "New column"
                }
        			) {
        		 boolean[] columnEditables = new boolean[] { false, false, false,false,false,false,false };
         			public boolean isCellEditable(int row, int column) {
         				return columnEditables[column];
         			}
        });
        
        //設定課表寬高間距
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
        table.setBounds(10, 65, 702, 497);
        
        
  	//載入必修課程
    	
    	table.setValueAt("數位通訊(實)", 2, 1);
    	table.setValueAt("數位通訊(實)", 3, 1);
    	table.setValueAt("數位通訊(實)", 4, 1);
    	table.setValueAt("專業外語", 1, 2);
    	table.setValueAt("專業外語", 2, 2);
    	table.setValueAt("數位通訊", 4, 2);
    	table.setValueAt("班會", 6, 2);
    	table.setValueAt("數位通訊", 1, 3);
    	table.setValueAt("數位通訊", 2, 3);

        
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
    public void switchView() {
    	int t = date.getDay();
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FCU2 frame = new FCU2(1,table);
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
	public void addPane(JPanel contentPane) {
		btnNewButton = new JButton("新增內容");
		btnNewButton.setBounds(481, 21, 87, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Column=choice.getSelectedIndex();
				int Row=choice_2.getSelectedIndex();
				Object Text=textField.getText();
				table.setValueAt(Text, Row+1, Column+1);
			}
		});

		
		btnNewButton_1 = new JButton("今日課表");
		btnNewButton_1.setBounds(578, 584, 87, 23);
		btnNewButton_1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				switchView();
			}
			
		});
	
		
		btnNewButton_2 = new JButton("隨機午餐");
		btnNewButton_2.setBounds(311, 584, 87, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lunch();
				
			}
		});
		
		
		choice = new Choice();
		choice.setBounds(58, 21, 93, 21);
		choice.add("星期一");
		choice.add("星期二");
		choice.add("星期三");
		choice.add("星期四");
		choice.add("星期五");
		choice.add("星期六");
		
		
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
		
		
		textField = new JTextField();
		textField.setBounds(336, 22, 96, 21);
		textField.setColumns(10);
		
		
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(choice);
		contentPane.add(choice_2);
		contentPane.add(textField);
	
	}

}