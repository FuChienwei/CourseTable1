import java.awt.Component;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableCellTextAreaRenderer_1 extends JTextArea implements TableCellRenderer{

	@Override
	 public Component getTableCellRendererComponent(JTable table, Object value,   
	           boolean isSelected, boolean hasFocus, int row, int column) {   
	     
	       int maxPreferredHeight = 0;   
	       for (int i = 0; i < table.getColumnCount(); i++) {   
	           setText("  " + table.getValueAt(row, i));   
	           setSize(table.getColumnModel().getColumn(column).getWidth(), 0);   
	  
	           maxPreferredHeight = Math.max(maxPreferredHeight, getPreferredSize().height);   
	       }   
	         
	       if (table.getRowHeight(row) != maxPreferredHeight)  
	         table.setRowHeight(63);  
	         setFont(new Font("·L³n¥¿¶ÂÅé", Font.PLAIN, 14));  
	         setText(value == null ? "" : value.toString());
	         if(row%2 == 0){  
	            setBackground(Color.decode("#E0FFFF"));  
	        }else if(row%2 == 1){  
	            setBackground(Color.decode("#FFFAFA")); 
	         }  
	       return this;   
	   }   
	 public TableCellTextAreaRenderer_1() {   
	       setLineWrap(true); 
	       setWrapStyleWord(true);
	   }

	  
}
