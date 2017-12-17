import java.awt.Component;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableCellTextAreaRenderer extends JTextArea implements TableCellRenderer {

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
	         table.setRowHeight(60);   
	         
	         setFont(new Font("微软雅黑", Font.PLAIN, 15));  
	         setText(value == null ? "" : value.toString());   
	         if(row%2 == 0){  
	            setBackground(Color.decode("#E0FFFF"));  
	        }else if(row%2 == 1){  
	            setBackground(Color.decode("#FFFAFA")); 
	         }  
	       return this;   
	   }   
	 public TableCellTextAreaRenderer() {   
	       setLineWrap(true); 
	       setWrapStyleWord(true); 
	   }   
	  
}
