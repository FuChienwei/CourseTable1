import javax.swing.*;

public interface Method {

    abstract public void load();              //���J
    abstract public void notice();            //�q��
    abstract public void slide();             //�ư�
    abstract public void switchView();        //����/week/day/month   
    abstract public void lunch();             //���\
    abstract public void contactbook();       //�p��ï
    public JTable getTable();                 //���
	abstract void addPane(JPanel contentPane);//�줸��

}
