import javax.swing.*;

public class NTU extends Table {


    public NTU(String name, JTable table){
        super.name=name;
        super.table=table;
        load();
    }

    @Override
    public void load() {
        data=new Object[][]{};

    }

    @Override
    public void notice() {

    }

    @Override
    public void slide() {

    }

    @Override
    public void switchView() {

    }

    @Override
    public void lunch() {

    }

    @Override
    public void contactbook() {

    }
}
