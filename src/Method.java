import javax.swing.*;

public interface Method {

    abstract public void load();         //載入
    abstract public void notice();       //通知
    abstract public void slide();        //滑動
    abstract public void switchView();   //視圖/week/day/month
    abstract public void lunch();        //中餐
    abstract public void contactbook();  //聯絡簿
    public JTable getTable();

}
