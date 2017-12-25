import javax.swing.*;

public abstract class Table implements Method{

	JPanel contentPane;
    JTable table;
    String name;
    Object[][] data;

    
    @Override
    abstract public void load();

    @Override
    abstract public void notice();

    @Override
    abstract public void slide();

    @Override
    abstract public void switchView();

    @Override
    abstract public void lunch();

    @Override
    abstract public void contactbook();

    abstract public void addPane(JPanel contentPane);
  
    public JTable getTable() {
        return table;
    }


}
