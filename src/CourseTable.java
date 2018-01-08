import java.awt.EventQueue;

import javax.swing.JFrame;


public class CourseTable extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FCU fcu=new FCU("³{¥Ò");
					fcu.make();
					
					NTU ntu=new NTU("¥x¤j");
					ntu.make();


				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}