import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableCellTextAreaRenderer extends JTextArea implements TableCellRenderer,MouseListener {

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
	       return this;   
	   }   
	 public TableCellTextAreaRenderer() {   
	       setLineWrap(true); 
	       setWrapStyleWord(true); 
	   }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxxxx");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxxxx");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxxxx");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxxxx");
	}
	
	  
}
