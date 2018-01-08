import javax.swing.*;

public interface Method {

    abstract public void load();              //載入
    abstract public void notice();            //通知 
	abstract void addComponent();            //延遲到子類別,新增元件ex:JButton
	
}
