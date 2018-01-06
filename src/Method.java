import javax.swing.*;

public interface Method {

    abstract public void load();              //載入
    abstract public void notice();            //通知 
    abstract public void switchView();        //視圖/week/day/month   
    abstract public void lunch();             //中餐
    public JTable getTable();                 //抓表
	abstract void addPane(JPanel contentPane);//抓元件

}
