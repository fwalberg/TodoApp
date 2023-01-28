package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

public class DeadLineColumnCellRederer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // componente a se retornado pel método.
        
        label.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        
        Task task;
        task = taskModel.getTasks().get(row);
        
        if(task.getDeadline().after(new Date())) {
            label.setBackground(new Color(144,238,144));
        } else {
            label.setBackground(new Color(255,127,80));
        }
        
        return label; 
    }

    
    
    
    
}
