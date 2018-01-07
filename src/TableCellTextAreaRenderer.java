import java.util.Date;

import javax.swing.*;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableCellTextAreaRenderer extends JTextArea implements TableCellRenderer{
	Date date=new Date();
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
	         table.setRowHeight(50);  
	         setFont(new Font("微軟正黑體", Font.PLAIN, 14));  
	         setText(value == null ? "" : value.toString());
	         if(row%2 == 0){  
	            setBackground(Color.decode("#E0FFFF"));  
	        }else if(row%2 == 1){  
	            setBackground(Color.decode("#FFFAFA")); 
	         }  
	         
	         int h=date.getHours();
	         if(h>=8 && h<=17){
	        	 if(row==h-7 && column==1){
	        		  setBackground(Color.decode("#FFFF00")); 
	        	 }
	         }
	       return this;   
	   }   
	 public TableCellTextAreaRenderer() {   
	       setLineWrap(true); 
	       setWrapStyleWord(true);
	   }

	  
}
