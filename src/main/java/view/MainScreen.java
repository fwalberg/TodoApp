package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCellRenderer;
import util.DeadLineColumnCellRederer;
import util.TaskTableModel;

public class MainScreen extends javax.swing.JFrame {
    
    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
    public MainScreen() {
        initComponents();
        
        initDataController();
        initComponentsModel();
        
        decorateTableTask();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTask = new javax.swing.JTable();
        JPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelSubTitle = new javax.swing.JLabel();
        JPanelProjects = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        jLabelProjectAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPanelProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTittle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();

        jTableTask.setFont(new java.awt.Font("TeX Gyre Adventor", 0, 14)); // NOI18N
        jTableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Concluída?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTask.setGridColor(java.awt.Color.white);
        jTableTask.setRowHeight(50);
        jTableTask.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jTableTask.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTask.setShowGrid(false);
        jTableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTaskMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTask);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        JPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));

        jLabelToolBarTitle.setFont(new java.awt.Font("TeX Gyre Adventor", 1, 36)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        jLabelToolBarTitle.setText("TodoApp");

        jLabelSubTitle.setFont(new java.awt.Font("TeX Gyre Adventor", 0, 18)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubTitle.setText("Anote tudo para não esquecer de nada!");

        javax.swing.GroupLayout JPanelToolBarLayout = new javax.swing.GroupLayout(JPanelToolBar);
        JPanelToolBar.setLayout(JPanelToolBarLayout);
        JPanelToolBarLayout.setHorizontalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelToolBarLayout.setVerticalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelToolBarTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelSubTitle)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        JPanelProjects.setBackground(java.awt.Color.white);
        JPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectTitle.setFont(new java.awt.Font("TeX Gyre Adventor", 1, 18)); // NOI18N
        jLabelProjectTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectTitle.setText("Projetos");

        jLabelProjectAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelProjectsLayout = new javax.swing.GroupLayout(JPanelProjects);
        JPanelProjects.setLayout(JPanelProjectsLayout);
        JPanelProjectsLayout.setHorizontalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelProjectsLayout.setVerticalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectsLayout.createSequentialGroup()
                        .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectsLayout.createSequentialGroup()
                        .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        jPanelTasks.setBackground(java.awt.Color.white);
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitle.setFont(new java.awt.Font("TeX Gyre Adventor", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTitle.setText("Tarefas");

        jLabelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelProjectList.setLayout(new java.awt.BorderLayout());

        jListProjects.setFont(new java.awt.Font("TeX Gyre Adventor", 0, 14)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPanelProjects.setViewportView(jListProjects);

        jPanelProjectList.add(jScrollPanelProjects, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(java.awt.Color.white);

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N
        jLabelEmptyListIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelEmptyListTittle.setFont(new java.awt.Font("TeX Gyre Adventor", 1, 14)); // NOI18N
        jLabelEmptyListTittle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTittle.setText("Nenhuma tarefa por aqui!!!  :D");

        jLabelEmptyListSubTitle.setFont(new java.awt.Font("Te X Gyre Heros", 1, 14)); // NOI18N
        jLabelEmptyListSubTitle.setForeground(new java.awt.Color(176, 193, 188));
        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Clique no botão Adicionar Tarefa \"+\" para criá-la");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmptyListTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabelEmptyListIcon)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListSubTitle)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectAddMouseClicked
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosed(WindowEvent e){
                
                loadProjects();
            }   
        });
      
    }//GEN-LAST:event_jLabelProjectAddMouseClicked

    private void jLabelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddMouseClicked
        
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);

        int projectIndex = jListProjects.getSelectedIndex();
        
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter() {
           
            @Override
            public void windowClosed(WindowEvent e){
                
                int projectIndex = jListProjects.getSelectedIndex();
                
                Project project = (Project) projectsModel.get(projectIndex);
                
                loadTasks(project.getId());
            }
        });
        
    }//GEN-LAST:event_jLabelAddMouseClicked

    private void jTableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaskMouseClicked
       
        int rowIndex = jTableTask.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTask.columnAtPoint(evt.getPoint());
        
        Task task = taskModel.getTasks().get(rowIndex);
        
        switch (columnIndex) {
            case 3 ->  {
                task = taskModel.getTasks().get(rowIndex);
                System.out.println(task);
                taskController.update(task);
            }
            case 4 -> {
                
            }
            case 5 -> {
                task = taskModel.getTasks().get(rowIndex);
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                
                loadTasks(project.getId());
            }
 
        }
    }//GEN-LAST:event_jTableTaskMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project)projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

    private void showJTableTasks(boolean hasTasks) {
        if(hasTasks) {
            if(jPanelEmptyList.isVisible()) {
                jPanelEmptyList.setVisible(false);
                jPanel5.remove(jPanelEmptyList);
            }
            
            jPanel5.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel5.getWidth(),jPanel5.getHeight());
        } else {
            if(jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanel5.remove(jScrollPaneTasks);
            }
            
            jPanel5.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel5.getWidth(),jPanel5.getHeight());
            
        }
    }
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelProjects;
    private javax.swing.JPanel JPanelToolBar;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTittle;
    private javax.swing.JLabel jLabelProjectAdd;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JScrollPane jScrollPanelProjects;
    private javax.swing.JTable jTableTask;
    // End of variables declaration//GEN-END:variables
    

// Customizando o header da table de tarefas.
    public void decorateTableTask() {
        jTableTask.getTableHeader().setFont(new Font("Segoi UI", Font.BOLD, 14));
        jTableTask.getTableHeader().setBackground(new Color(0,153,102));
        jTableTask.getTableHeader().setForeground(new Color(255,255,255));
        
        jTableTask.getColumnModel().getColumn(2).setCellRenderer(new DeadLineColumnCellRederer()); // altera o renderer padrão da celula para o model DeadLineColu...
        
        jTableTask.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("edit")); // --------""-----------
        
        jTableTask.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRenderer("delete"));
        
        // Adiciona uma ordenação automática nas colunas da tabela
        jTableTask.setAutoCreateRowSorter(true); //Ordena as colunas da tabela, por exemplo, ordem alfabetica.
        
        
    }
    
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTask.setModel(taskModel);
        
        if(!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);
            Project project = (Project)projectsModel.get(0);
            loadTasks(project.getId());
        }

    }
    
    public void loadTasks(int idProject) {
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        
        showJTableTasks(!tasks.isEmpty());
    }
    
    public void loadProjects() {
        List<Project> projects = projectController.getAll();
        
        projectsModel.clear(); 
        
        for( Project project : projects) {
            projectsModel.addElement(project);
        }
        
        jListProjects.setModel(projectsModel);
    }

}
