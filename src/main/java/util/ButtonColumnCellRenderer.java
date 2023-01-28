package util;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

public class ButtonColumnCellRenderer extends DefaultTableCellRenderer {
    
    private String buttonType;
    
    public ButtonColumnCellRenderer(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        JLabel label = (JLabel) 
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // componente a se retornado pel método.
        
        label.setHorizontalAlignment(CENTER); // Centraliza a label na celula
        
        label.setIcon(new ImageIcon(getClass().
                getResource("/" + buttonType + ".png")));
   
//        TaskTableModel taskModel = (TaskTableModel) table.getModel();
//        
//        Task task;
//        task = taskModel.getTasks().get(row);
//        
//        if(task.getDeadline().after(new Date())) {
//            label.setBackground(new Color(144,238,144));
//        } else {
//            label.setBackground(new Color(255,127,80));
//        }
        
        return label; 
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    
}
