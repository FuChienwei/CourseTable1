import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Font;
import javax.swing.JTextPane;

public class NTUlunch extends JFrame {

	private JPanel contentPane;
	private JTextField money;
	private JTextPane Food;
	private String[] lunch={"雞腿便當","炒飯","炒麵","義式料理","定食8","牛肉麵"};
	private int[] cost= {90,60,60,150,180,120};
	private int i=1;
	/**
	 * Create the frame.
	 */
	public NTUlunch() {
		setTitle("\u6C7A\u5B9A\u98DF\u7269");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		money = new JTextField();
		money.setBounds(165, 23, 96, 21);
		contentPane.add(money);
		money.setColumns(10);
		
		JLabel label = new JLabel("\u8ACB\u8F38\u5165\u60A8\u7684\u9810\u7B97");
		label.setBounds(43, 26, 112, 15);
		contentPane.add(label);
		
		JButton btnRam = new JButton("\u62BD\u9078");
		btnRam.setBounds(294, 22, 103, 23);
		contentPane.add(btnRam);
		btnRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m=Integer.parseInt(money.getText());
				while(i==1) {
					Random r=new Random();
			    	int num=r.nextInt(lunch.length);
			    	if(cost[num]<=m)
			    	{
			    		Food.setText("吃 "+lunch[num]);
			    		i=0;
			    	}
			    	else if(m<60)
			    	{
			    		Food.setText("你的錢不夠吃飯\n可以多帶些錢嗎?");
			    		i=0;
			    	}
			    
				}
				i=1;
					
		}});
		
		Food = new JTextPane();
		Food.setEditable(false);
		Food.setFont(new Font("新細明體", Font.PLAIN, 28));
		Food.setBackground(SystemColor.info);
		Food.setBounds(30, 77, 259, 135);
		contentPane.add(Food);
		
		JButton btnClose = new JButton("\u73FE\u5728\u51FA\u9580\u8CB7");
		btnClose.setBounds(294, 213, 112, 23);
		contentPane.add(btnClose);
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
	}
}
