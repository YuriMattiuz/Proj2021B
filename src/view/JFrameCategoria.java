package view;
/**
 *
 * @author Yuri Mattiuz
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Categoria;

public class JFrameCategoria extends javax.swing.JDialog {

    public JFrameCategoria() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaTabela();
        atualizaControles();
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryCategoria = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Categoria c order by c.catCategoria");
        listCategoria = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCategoria.getResultList());
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanelPesquisa = new javax.swing.JPanel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelLabelCodigo = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelCodCategoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cad Categoria");
        setMaximumSize(new java.awt.Dimension(705, 339));
        setMinimumSize(new java.awt.Dimension(705, 339));
        setPreferredSize(new java.awt.Dimension(705, 339));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(526, 169));
        jPanel3.setMinimumSize(new java.awt.Dimension(526, 169));
        jPanel3.setPreferredSize(new java.awt.Dimension(526, 169));

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCategoria, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCategoria}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${catCategoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableDadosMouseReleased(evt);
            }
        });
        jScrollPaneTabela.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(280);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        jPanelPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setMaximumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setMinimumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setPreferredSize(new java.awt.Dimension(526, 43));

        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboBoxPesquisaStatus.setFocusable(false);

        jTextFieldCampoPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCampoPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCampoPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.setFocusable(false);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisaOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonPesquisaOK.setFocusable(false);
        jButtonPesquisaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaOKActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite no campo:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione a descrição:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione o tipo:");

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.Alignment.LEADING, 0, 193, Short.MAX_VALUE)
                            .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanelBarraEstado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(310, 19));

        jLabelLabelEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelEstado.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("---");

        javax.swing.GroupLayout jPanelBarraEstadoLayout = new javax.swing.GroupLayout(jPanelBarraEstado);
        jPanelBarraEstado.setLayout(jPanelBarraEstadoLayout);
        jPanelBarraEstadoLayout.setHorizontalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEstado))
        );

        jPanelBarraMensagem.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(375, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(375, 19));

        jLabelLabelMensagem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelMensagem.setText("Mensagem:");

        jLabelMensagem.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMensagem.setText("---");

        javax.swing.GroupLayout jPanelBarraMensagemLayout = new javax.swing.GroupLayout(jPanelBarraMensagem);
        jPanelBarraMensagem.setLayout(jPanelBarraMensagemLayout);
        jPanelBarraMensagemLayout.setHorizontalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelMensagem)
                .addGap(110, 110, 110)
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createSequentialGroup()
                .addGroup(jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMensagem))
                .addGap(111, 111, 111))
        );

        jPanelSuperior.setBackground(new java.awt.Color(41, 43, 211));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSuperior.setMaximumSize(new java.awt.Dimension(526, 46));
        jPanelSuperior.setMinimumSize(new java.awt.Dimension(526, 46));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(526, 46));

        jLabelLabelCodigo.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelCodigo.setText("Código:");

        jTextFieldDescricao.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldDescricao.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jTextFieldDescricao.setToolTipText("peças, acessórios, vestuário...");
        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldDescricao.setMaximumSize(new java.awt.Dimension(12, 30));
        jTextFieldDescricao.setSelectedTextColor(new java.awt.Color(41, 43, 211));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.catCategoria}"), jTextFieldDescricao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelCodCategoria.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelCodCategoria.setForeground(new java.awt.Color(255, 255, 255));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCategoria}"), jLabelCodCategoria, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nova Categoria");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabelLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCodCategoria))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelCodigo)
                    .addComponent(jLabelCodCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar uma nova categoria");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo-over2.png"))); // NOI18N
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Gravar a nova categoria no banco de dados");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar-over2.png"))); // NOI18N
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar a operação atual");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar-over2.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar dados do cadastro da categoria");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAlterar.setFocusPainted(false);
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setMaximumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar-over2.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir relatórios de categorias cadastradas");
        jButtonImprimir.setBorderPainted(false);
        jButtonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonImprimir.setEnabled(false);
        jButtonImprimir.setFocusPainted(false);
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimir.setMaximumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setMinimumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setPreferredSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir-over2.png"))); // NOI18N

        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da tela de Cadastro de Categorias");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setMinimumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setPreferredSize(new java.awt.Dimension(78, 37));
        jButtonSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair-over2.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir o cadastro da categoria");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir-over2.png"))); // NOI18N
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(474, 474, 474)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(738, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Categoria...");
        jTextFieldDescricao.requestFocus();
        listCategoria.add(new Categoria());
        int linha = listCategoria.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private int validaCampos(){
        if(jTextFieldDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição!");
            jTextFieldDescricao.requestFocus();
            jTextFieldDescricao.setBackground(Color.CYAN);
            return 0;
        }
        return 1;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Categoria cat = listCategoria.get(linhaSelecionada);
            try {
               entityManager.getTransaction().begin();
               entityManager.persist(cat);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados da Categoria alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Categoria cadastrada com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a categoria não foi cadastrada!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, a categoria não foi cadastrada!");
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
            }
            jTableDados.setEnabled(true);
            jTextFieldCampoPesquisa.setEnabled(true);
            jLabelEstado.setText("Início");
            limparCampos();
            atualizaTabela();
            statusInicial(true);
            controlePesquisa(true);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void Cancelar(){
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        jTableDados.clearSelection();
        atualizaTabela();
        controlePesquisa(true);
        atualizaControles();
        jTableDados.setEnabled(true);
        jTextFieldCampoPesquisa.setEnabled(true);
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldDescricao.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                Cancelar();
            }
        } else {
            Cancelar();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldDescricao.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados da categoria...");
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a categoria? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Categoria cat = listCategoria.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    entityManager.remove(cat);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Categoria excluída com sucesso!");
                } catch (Exception e) {
                    if (e.getMessage().contains("chave estrangeira")){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, a "
                            + "categoria não foi excluída!\nErro: Categoria está associada a um ou mais produtos");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, a "
                            + "categoria não foi excluída!\nErro: " + e);
                    }                   
                    jLabelMensagem.setText("Ocorreu um erro, a categoria não foi "
                            + "excluída!");
                    if(!entityManager.getTransaction().isActive())
                        entityManager.getTransaction().begin();
                    entityManager.getTransaction().rollback();
                }
            }
            jTableDados.clearSelection();
            limparCampos();
            atualizaTabela();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        if(!jTextFieldDescricao.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o programa? Os dados não salvos serão perdidos!");
            if (confirmaSaida == 0) //sim
                dispose();
        }else
            dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        controlePesquisa(true);
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased

    private void jButtonPesquisaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaOKActionPerformed
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jButtonPesquisaOKActionPerformed

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && (!jLabelEstado.getText().equals("Inserção"))))){
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR a operação atual!");
    }//GEN-LAST:event_jTableDadosMouseReleased

    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaActionPerformed
        if(jComboBoxTipoPesquisa.getSelectedIndex() == 0){
            jTextFieldCampoPesquisa.setText("");
        }
        atualizaTabela();
    }//GEN-LAST:event_jComboBoxTipoPesquisaActionPerformed
    
   
    private void statusInicial(boolean status){
        jTextFieldDescricao.setEnabled(!status);
    }
    
    
    private void limparCampos(){
        jTextFieldDescricao.setText("");
        jTextFieldDescricao.setBackground(Color.WHITE);
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        jComboBoxPesquisaStatus.setEnabled(status);
        jComboBoxTipoPesquisa.setEnabled(status);
        jButtonAlterar.setEnabled(status);
        jButtonExcluir.setEnabled(status);
    }
    
    /**
     * função que atualiza a tabela dados conforme as operações são efetuadas no 
     * formulário de cadastro
     */
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Categoria c ";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Descrição")){
            campoPesquisa = "c.catCategoria";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "c.idCategoria";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + campoPesquisa + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + campoPesquisa;
        queryCategoria = entityManager.createQuery(ejbql);
        listCategoria.clear();
        listCategoria.addAll(queryCategoria.getResultList());
        int linha = listCategoria.size() - 1;
        if(listCategoria.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Categoria não cadastrada no sistema!");
        }
        if(listCategoria.size() == 1){
            jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        }else
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodCategoria;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCodigo;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldDescricao;
    private java.util.List<Categoria> listCategoria;
    private javax.persistence.Query queryCategoria;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}