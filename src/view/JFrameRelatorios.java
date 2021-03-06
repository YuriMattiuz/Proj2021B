package view;
/**
 *
 * @author Yuri Mattiuz
 */
import controller.JasperController;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Movimento;
import model.Parcela;

public class JFrameRelatorios extends javax.swing.JDialog {

    public JFrameRelatorios() {
        initComponents();
        this.setModal(true);
        jDateChooserHoje.setDate(Date.from(Instant.now()));
        java.util.Date hoje = Date.from(Instant.now());
        jDateChooserDataInicial.setDate(hoje);
        jDateChooserDataFinal.setDate(hoje);
        jDateChooserDataInicial1.setDate(hoje);
        jDateChooserDataFinal1.setDate(hoje);
        listSituacaoCliente.clear();
        listAReceber.clear();
        listRecebimentos.clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryRecebimentos = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Movimento m order by m.idMovimento");
        listRecebimentos = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryRecebimentos.getResultList());
        querySituacaoCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Parcela p order by p.venda.idVenda");
        listSituacaoCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(querySituacaoCliente.getResultList());
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryAReceber = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Parcela p order by p.idParcela");
        listAReceber = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryAReceber.getResultList());
        jTabbedPaneRelatorios = new javax.swing.JTabbedPane();
        jPanelRecebimentos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelRecebimentosPeriodo = new javax.swing.JPanel();
        jButtonListarRecebimentos = new javax.swing.JButton();
        jLabelDataInicial = new javax.swing.JLabel();
        jLabelDataFinal = new javax.swing.JLabel();
        jPanelAReceber = new javax.swing.JPanel();
        jCheckBoxAReceber = new javax.swing.JCheckBox();
        jDateChooserDataInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabelLabelValor = new javax.swing.JLabel();
        jLabelSoma = new javax.swing.JLabel();
        jLabelLabelRS = new javax.swing.JLabel();
        jPanelPanelRecebimentos = new javax.swing.JPanel();
        jLabelLabelRecebimentos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRecebimentos = new javax.swing.JTable();
        jPanelSitua????oCliente = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLabelAtraso = new javax.swing.JLabel();
        jLabelParcelaAtraso = new javax.swing.JLabel();
        jLabelAtraso = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelLabelDevido = new javax.swing.JLabel();
        jLabelParcelaDevido = new javax.swing.JLabel();
        jLabelDevido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelValorPago = new javax.swing.JLabel();
        jLabelParcelaPago = new javax.swing.JLabel();
        jLabelValorPago = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonListarSituacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelFiltros = new javax.swing.JPanel();
        jCheckBoxPago = new javax.swing.JCheckBox();
        jCheckBoxDevido = new javax.swing.JCheckBox();
        jCheckBoxVencido = new javax.swing.JCheckBox();
        jDateChooserHoje = new com.toedter.calendar.JDateChooser();
        jPanelPanelSituacao = new javax.swing.JPanel();
        jLabelSituacaoCliente = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSituacaoCliente = new javax.swing.JTable();
        jPanelReceberPorPeriodo = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabelLabelValor1 = new javax.swing.JLabel();
        jLabelLabelRS1 = new javax.swing.JLabel();
        jLabelAReceber = new javax.swing.JLabel();
        jPanelPanelSituacao1 = new javax.swing.JPanel();
        jLabelSituacaoCliente1 = new javax.swing.JLabel();
        jPanelRecebimentosPeriodo1 = new javax.swing.JPanel();
        jButtonListarRecebimentos1 = new javax.swing.JButton();
        jLabelDataInicial1 = new javax.swing.JLabel();
        jLabelDataFinal1 = new javax.swing.JLabel();
        jPanelAReceber1 = new javax.swing.JPanel();
        jCheckBoxAReceber1 = new javax.swing.JCheckBox();
        jDateChooserDataInicial1 = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAReceber = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relat??rios");
        setMaximumSize(new java.awt.Dimension(852, 477));
        setMinimumSize(new java.awt.Dimension(852, 477));

        jTabbedPaneRelatorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPaneRelatorios.setMaximumSize(new java.awt.Dimension(846, 465));
        jTabbedPaneRelatorios.setMinimumSize(new java.awt.Dimension(846, 465));
        jTabbedPaneRelatorios.setPreferredSize(new java.awt.Dimension(846, 465));

        jPanelRecebimentos.setMaximumSize(new java.awt.Dimension(843, 431));
        jPanelRecebimentos.setMinimumSize(new java.awt.Dimension(843, 431));
        jPanelRecebimentos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelRecebimentosComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(41, 43, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(255, 419));
        jPanel3.setMinimumSize(new java.awt.Dimension(255, 419));
        jPanel3.setPreferredSize(new java.awt.Dimension(255, 419));

        jPanelRecebimentosPeriodo.setBackground(new java.awt.Color(41, 43, 211));
        jPanelRecebimentosPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRecebimentosPeriodo.setMaximumSize(new java.awt.Dimension(237, 141));
        jPanelRecebimentosPeriodo.setMinimumSize(new java.awt.Dimension(237, 141));
        jPanelRecebimentosPeriodo.setPreferredSize(new java.awt.Dimension(237, 141));

        jButtonListarRecebimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonListarRecebimentos.setText("Listar");
        jButtonListarRecebimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarRecebimentosActionPerformed(evt);
            }
        });

        jLabelDataInicial.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelDataInicial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataInicial.setText("Data Inicial");

        jLabelDataFinal.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelDataFinal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataFinal.setText("Data Final");

        jPanelAReceber.setBackground(new java.awt.Color(204, 204, 204));
        jPanelAReceber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxAReceber.setText("A Receber");

        javax.swing.GroupLayout jPanelAReceberLayout = new javax.swing.GroupLayout(jPanelAReceber);
        jPanelAReceber.setLayout(jPanelAReceberLayout);
        jPanelAReceberLayout.setHorizontalGroup(
            jPanelAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxAReceber)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelAReceberLayout.setVerticalGroup(
            jPanelAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRecebimentosPeriodoLayout = new javax.swing.GroupLayout(jPanelRecebimentosPeriodo);
        jPanelRecebimentosPeriodo.setLayout(jPanelRecebimentosPeriodoLayout);
        jPanelRecebimentosPeriodoLayout.setHorizontalGroup(
            jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecebimentosPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRecebimentosPeriodoLayout.createSequentialGroup()
                        .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelRecebimentosPeriodoLayout.createSequentialGroup()
                        .addComponent(jPanelAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelRecebimentosPeriodoLayout.setVerticalGroup(
            jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecebimentosPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecebimentosPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(41, 43, 211));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(238, 78));
        jPanel6.setMinimumSize(new java.awt.Dimension(238, 78));

        jLabelLabelValor.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelValor.setText("Valor Recebido:");

        jLabelSoma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSoma.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoma.setText("---");

        jLabelLabelRS.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelLabelRS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRS.setText("R$");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelLabelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoma)
                    .addComponent(jLabelLabelRS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPanelRecebimentos.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPanelRecebimentos.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLabelRecebimentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelLabelRecebimentos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRecebimentos.setText("RECEBIMENTOS POR PER??ODO");

        javax.swing.GroupLayout jPanelPanelRecebimentosLayout = new javax.swing.GroupLayout(jPanelPanelRecebimentos);
        jPanelPanelRecebimentos.setLayout(jPanelPanelRecebimentosLayout);
        jPanelPanelRecebimentosLayout.setHorizontalGroup(
            jPanelPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPanelRecebimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelRecebimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPanelRecebimentosLayout.setVerticalGroup(
            jPanelPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPanelRecebimentosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelRecebimentos)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRecebimentosPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPanelRecebimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPanelRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRecebimentosPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMaximumSize(new java.awt.Dimension(569, 419));
        jPanel13.setMinimumSize(new java.awt.Dimension(569, 419));
        jPanel13.setPreferredSize(new java.awt.Dimension(569, 419));

        jTableRecebimentos.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listRecebimentos, jTableRecebimentos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda.cliente.cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movData}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movMotivo}"));
        columnBinding.setColumnName("Motivo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movTipo}"));
        columnBinding.setColumnName("Tipo (Ent/Sai)");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movValor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableRecebimentos);
        if (jTableRecebimentos.getColumnModel().getColumnCount() > 0) {
            jTableRecebimentos.getColumnModel().getColumn(0).setResizable(false);
            jTableRecebimentos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableRecebimentos.getColumnModel().getColumn(1).setResizable(false);
            jTableRecebimentos.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableRecebimentos.getColumnModel().getColumn(2).setResizable(false);
            jTableRecebimentos.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableRecebimentos.getColumnModel().getColumn(3).setResizable(false);
            jTableRecebimentos.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableRecebimentos.getColumnModel().getColumn(4).setResizable(false);
            jTableRecebimentos.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelRecebimentosLayout = new javax.swing.GroupLayout(jPanelRecebimentos);
        jPanelRecebimentos.setLayout(jPanelRecebimentosLayout);
        jPanelRecebimentosLayout.setHorizontalGroup(
            jPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecebimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanelRecebimentosLayout.setVerticalGroup(
            jPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecebimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("Recebimentos por Per??odo", jPanelRecebimentos);

        jPanelSitua????oCliente.setMaximumSize(new java.awt.Dimension(843, 431));
        jPanelSitua????oCliente.setMinimumSize(new java.awt.Dimension(843, 431));
        jPanelSitua????oCliente.setPreferredSize(new java.awt.Dimension(843, 431));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(41, 43, 211));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(257, 42));
        jPanel2.setMinimumSize(new java.awt.Dimension(257, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(257, 42));

        jLabelLabelAtraso.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelAtraso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLabelAtraso.setText("Vencido:");

        jLabelParcelaAtraso.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelParcelaAtraso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelParcelaAtraso.setText("---");

        jLabelAtraso.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelAtraso.setForeground(new java.awt.Color(153, 0, 0));
        jLabelAtraso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAtraso.setText("---");
        jLabelAtraso.setMaximumSize(new java.awt.Dimension(120, 38));
        jLabelAtraso.setMinimumSize(new java.awt.Dimension(120, 38));
        jLabelAtraso.setPreferredSize(new java.awt.Dimension(120, 38));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelAtraso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelParcelaAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLabelAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelParcelaAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(41, 43, 211));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMaximumSize(new java.awt.Dimension(257, 42));
        jPanel5.setMinimumSize(new java.awt.Dimension(257, 42));
        jPanel5.setPreferredSize(new java.awt.Dimension(257, 42));

        jLabelLabelDevido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelLabelDevido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelDevido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLabelDevido.setText("A vencer:");

        jLabelParcelaDevido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelParcelaDevido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelParcelaDevido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelParcelaDevido.setText("---");

        jLabelDevido.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelDevido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDevido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDevido.setText("---");
        jLabelDevido.setMaximumSize(new java.awt.Dimension(120, 38));
        jLabelDevido.setMinimumSize(new java.awt.Dimension(120, 38));
        jLabelDevido.setPreferredSize(new java.awt.Dimension(120, 38));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelDevido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelParcelaDevido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDevido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelDevido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelParcelaDevido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelDevido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(257, 42));
        jPanel1.setMinimumSize(new java.awt.Dimension(257, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(257, 42));

        jLabelLabelValorPago.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelLabelValorPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelValorPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLabelValorPago.setText("Pago:");

        jLabelParcelaPago.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelParcelaPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelParcelaPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelParcelaPago.setText("---");

        jLabelValorPago.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelValorPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorPago.setText("---");
        jLabelValorPago.setMaximumSize(new java.awt.Dimension(120, 38));
        jLabelValorPago.setMinimumSize(new java.awt.Dimension(120, 38));
        jLabelValorPago.setPreferredSize(new java.awt.Dimension(120, 38));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelValorPago)
                .addGap(18, 18, 18)
                .addComponent(jLabelParcelaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelParcelaPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelLabelValorPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(41, 43, 211));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setForeground(new java.awt.Color(41, 43, 211));

        jTextFieldCodCliente.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCodCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldCodCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodClienteCaretUpdate(evt);
            }
        });

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabelCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("---");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(41, 43, 211));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonListarSituacao.setText("Listar");
        jButtonListarSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarSituacaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Refer??ncia:");

        jPanelFiltros.setBackground(new java.awt.Color(41, 43, 211));
        jPanelFiltros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxPago.setBackground(new java.awt.Color(41, 43, 211));
        jCheckBoxPago.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jCheckBoxPago.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPago.setText("Pago");
        jCheckBoxPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBoxPagoMouseReleased(evt);
            }
        });

        jCheckBoxDevido.setBackground(new java.awt.Color(41, 43, 211));
        jCheckBoxDevido.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jCheckBoxDevido.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxDevido.setText("A Vencer");

        jCheckBoxVencido.setBackground(new java.awt.Color(41, 43, 211));
        jCheckBoxVencido.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jCheckBoxVencido.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxVencido.setText("Vencido");
        jCheckBoxVencido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBoxVencidoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDevido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxVencido)
                .addContainerGap())
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPago)
                    .addComponent(jCheckBoxDevido)
                    .addComponent(jCheckBoxVencido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDateChooserHoje.setBackground(new java.awt.Color(41, 43, 211));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooserHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListarSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPanelSituacao.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPanelSituacao.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSituacaoCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelSituacaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSituacaoCliente.setText("SITUA????O DO CLIENTE");

        javax.swing.GroupLayout jPanelPanelSituacaoLayout = new javax.swing.GroupLayout(jPanelPanelSituacao);
        jPanelPanelSituacao.setLayout(jPanelPanelSituacaoLayout);
        jPanelPanelSituacaoLayout.setHorizontalGroup(
            jPanelPanelSituacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelSituacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSituacaoCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanelSituacaoLayout.setVerticalGroup(
            jPanelPanelSituacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelSituacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSituacaoCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPanelSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPanelSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableSituacaoCliente.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listSituacaoCliente, jTableSituacaoCliente);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda.idVenda}"));
        columnBinding.setColumnName("Venda");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parParcela}"));
        columnBinding.setColumnName("Parcela");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parValorInicial}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataVenc}"));
        columnBinding.setColumnName("Data Venc.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataPagto}"));
        columnBinding.setColumnName("Data Pagto.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parStatus}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTableSituacaoCliente);
        if (jTableSituacaoCliente.getColumnModel().getColumnCount() > 0) {
            jTableSituacaoCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTableSituacaoCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(1).setPreferredWidth(2);
            jTableSituacaoCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableSituacaoCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableSituacaoCliente.getColumnModel().getColumn(4).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTableSituacaoCliente.getColumnModel().getColumn(5).setResizable(false);
            jTableSituacaoCliente.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSitua????oClienteLayout = new javax.swing.GroupLayout(jPanelSitua????oCliente);
        jPanelSitua????oCliente.setLayout(jPanelSitua????oClienteLayout);
        jPanelSitua????oClienteLayout.setHorizontalGroup(
            jPanelSitua????oClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSitua????oClienteLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanelSitua????oClienteLayout.setVerticalGroup(
            jPanelSitua????oClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSitua????oClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSitua????oClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelSitua????oClienteLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("Situa????o do Cliente", jPanelSitua????oCliente);

        jPanelReceberPorPeriodo.setMaximumSize(new java.awt.Dimension(843, 431));
        jPanelReceberPorPeriodo.setMinimumSize(new java.awt.Dimension(843, 431));
        jPanelReceberPorPeriodo.setPreferredSize(new java.awt.Dimension(843, 431));
        jPanelReceberPorPeriodo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelReceberPorPeriodoComponentShown(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(41, 43, 211));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setMaximumSize(new java.awt.Dimension(255, 419));
        jPanel11.setMinimumSize(new java.awt.Dimension(255, 419));

        jPanel7.setBackground(new java.awt.Color(41, 43, 211));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setMaximumSize(new java.awt.Dimension(238, 78));
        jPanel7.setMinimumSize(new java.awt.Dimension(238, 78));
        jPanel7.setPreferredSize(new java.awt.Dimension(238, 78));

        jLabelLabelValor1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelValor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelValor1.setText("Valor a Receber:");

        jLabelLabelRS1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelLabelRS1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRS1.setText("R$");

        jLabelAReceber.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelAReceber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAReceber.setText("---");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelLabelRS1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelLabelValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelValor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelRS1)
                    .addComponent(jLabelAReceber))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelPanelSituacao1.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPanelSituacao1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSituacaoCliente1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelSituacaoCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSituacaoCliente1.setText("A RECEBER POR PER??ODO");

        javax.swing.GroupLayout jPanelPanelSituacao1Layout = new javax.swing.GroupLayout(jPanelPanelSituacao1);
        jPanelPanelSituacao1.setLayout(jPanelPanelSituacao1Layout);
        jPanelPanelSituacao1Layout.setHorizontalGroup(
            jPanelPanelSituacao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelSituacao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSituacaoCliente1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanelSituacao1Layout.setVerticalGroup(
            jPanelPanelSituacao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelSituacao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSituacaoCliente1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRecebimentosPeriodo1.setBackground(new java.awt.Color(41, 43, 211));
        jPanelRecebimentosPeriodo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRecebimentosPeriodo1.setMaximumSize(new java.awt.Dimension(237, 141));
        jPanelRecebimentosPeriodo1.setMinimumSize(new java.awt.Dimension(237, 141));

        jButtonListarRecebimentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonListarRecebimentos1.setText("Listar");
        jButtonListarRecebimentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarRecebimentos1ActionPerformed(evt);
            }
        });

        jLabelDataInicial1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelDataInicial1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataInicial1.setText("Data Inicial");

        jLabelDataFinal1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelDataFinal1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataFinal1.setText("Data Final");

        jPanelAReceber1.setBackground(new java.awt.Color(204, 204, 204));
        jPanelAReceber1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxAReceber1.setText("A Receber");

        javax.swing.GroupLayout jPanelAReceber1Layout = new javax.swing.GroupLayout(jPanelAReceber1);
        jPanelAReceber1.setLayout(jPanelAReceber1Layout);
        jPanelAReceber1Layout.setHorizontalGroup(
            jPanelAReceber1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAReceber1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxAReceber1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );
        jPanelAReceber1Layout.setVerticalGroup(
            jPanelAReceber1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxAReceber1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRecebimentosPeriodo1Layout = new javax.swing.GroupLayout(jPanelRecebimentosPeriodo1);
        jPanelRecebimentosPeriodo1.setLayout(jPanelRecebimentosPeriodo1Layout);
        jPanelRecebimentosPeriodo1Layout.setHorizontalGroup(
            jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecebimentosPeriodo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRecebimentosPeriodo1Layout.createSequentialGroup()
                        .addComponent(jPanelAReceber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarRecebimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRecebimentosPeriodo1Layout.createSequentialGroup()
                        .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDataInicial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDataInicial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDataFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelRecebimentosPeriodo1Layout.setVerticalGroup(
            jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecebimentosPeriodo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDataInicial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDataInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDataFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDataFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecebimentosPeriodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAReceber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarRecebimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPanelSituacao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jPanelRecebimentosPeriodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPanelSituacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRecebimentosPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setMaximumSize(new java.awt.Dimension(569, 419));
        jPanel12.setMinimumSize(new java.awt.Dimension(569, 419));
        jPanel12.setPreferredSize(new java.awt.Dimension(569, 419));

        jTableAReceber.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listAReceber, jTableAReceber);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda.cliente.cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda.idVenda}"));
        columnBinding.setColumnName("Venda");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parParcela}"));
        columnBinding.setColumnName("Parcela");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parValorInicial}"));
        columnBinding.setColumnName("Valor Inicial");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataVenc}"));
        columnBinding.setColumnName("Data Venc.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parStatus}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTableAReceber);
        if (jTableAReceber.getColumnModel().getColumnCount() > 0) {
            jTableAReceber.getColumnModel().getColumn(0).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableAReceber.getColumnModel().getColumn(1).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTableAReceber.getColumnModel().getColumn(2).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTableAReceber.getColumnModel().getColumn(3).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableAReceber.getColumnModel().getColumn(4).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableAReceber.getColumnModel().getColumn(5).setResizable(false);
            jTableAReceber.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelReceberPorPeriodoLayout = new javax.swing.GroupLayout(jPanelReceberPorPeriodo);
        jPanelReceberPorPeriodo.setLayout(jPanelReceberPorPeriodoLayout);
        jPanelReceberPorPeriodoLayout.setHorizontalGroup(
            jPanelReceberPorPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReceberPorPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelReceberPorPeriodoLayout.setVerticalGroup(
            jPanelReceberPorPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReceberPorPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReceberPorPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("A Receber por Per??odo", jPanelReceberPorPeriodo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelReceberPorPeriodoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelReceberPorPeriodoComponentShown
        jCheckBoxAReceber.setSelected(true);
        jCheckBoxAReceber1.setSelected(true);
    }//GEN-LAST:event_jPanelReceberPorPeriodoComponentShown

    private void jButtonListarRecebimentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarRecebimentos1ActionPerformed
        if(!jCheckBoxAReceber1.isSelected()){
            jCheckBoxAReceber.setSelected(false);
        }
        listarRecebimentos();
    }//GEN-LAST:event_jButtonListarRecebimentos1ActionPerformed

    private void jCheckBoxVencidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxVencidoMouseReleased
        if(jCheckBoxPago.isSelected())
        jCheckBoxPago.setSelected(false);
    }//GEN-LAST:event_jCheckBoxVencidoMouseReleased

    private void jCheckBoxPagoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPagoMouseReleased
        if(jCheckBoxVencido.isSelected())
        jCheckBoxVencido.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPagoMouseReleased

    private void jButtonListarSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarSituacaoActionPerformed
        jTabbedPaneRelatorios.setSelectedIndex(1);
        atualizaTabelaSituacao();
    }//GEN-LAST:event_jButtonListarSituacaoActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        JFrameBuscaCliente buscaCliente = new JFrameBuscaCliente();
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
        jTextFieldCodCliente.setText(buscaCliente.getCodCliente());
        jLabelCliente.setText(buscaCliente.getNomeCliente());
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jTextFieldCodClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteCaretUpdate
        jTabbedPaneRelatorios.setSelectedIndex(1);
        atualizaTabelaSituacao();
    }//GEN-LAST:event_jTextFieldCodClienteCaretUpdate

    private void jPanelRecebimentosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelRecebimentosComponentShown
        jCheckBoxAReceber.setSelected(false);
        jCheckBoxAReceber1.setSelected(false);
    }//GEN-LAST:event_jPanelRecebimentosComponentShown

    private void jButtonListarRecebimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarRecebimentosActionPerformed
        listarRecebimentos();
    }//GEN-LAST:event_jButtonListarRecebimentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            jTableRecebimentos.print(javax.swing.JTable.PrintMode.FIT_WIDTH,
                    new java.text.MessageFormat("RECEBIMENTOS"), // titulo da pagina
                    new java.text.MessageFormat("Page {0}"));
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar imprimir!\n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JasperController jc = new JasperController("SITUA????O DO CLIENTE", "SituacaoDoCliente");
        Map params = new HashMap();
        params.put("cliente", jLabelCliente.getText());
        jc.setParams(params);
        jc.setData(listSituacaoCliente);
        jc.print(); 
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            jTableAReceber.print(javax.swing.JTable.PrintMode.FIT_WIDTH,
                    new java.text.MessageFormat("A RECEBER"), // titulo da pagina
                    new java.text.MessageFormat("Page {0}"));
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar imprimir!\n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void listarRecebimentos(){
        DecimalFormat df = new DecimalFormat();
        java.util.Date dataInicial = (java.util.Date)jDateChooserDataInicial.getDate();
        java.util.Date dataFinal = (java.util.Date)jDateChooserDataFinal.getDate();
        java.util.Date dataInicial1 = (java.util.Date)jDateChooserDataInicial1.getDate();
        java.util.Date dataFinal1 = (java.util.Date)jDateChooserDataFinal1.getDate();
        
        SimpleDateFormat dtFormato = new SimpleDateFormat("yyyy-MM-dd");

        String ejbql;
        if(jCheckBoxAReceber.isSelected()){
            jCheckBoxAReceber1.setSelected(true);
            
            jTabbedPaneRelatorios.setSelectedIndex(2);
            ejbql = "select p from Parcela p join p.venda c where (p.parStatus = 'Ativo' and p.parDataVenc"
                    + " between '" + dtFormato.format(dataInicial1) + "' and '" + dtFormato.format(dataFinal1) + "')"
                    + " order by p.parDataVenc";
            queryAReceber = entityManager.createQuery(ejbql);
            listAReceber.clear();
            listAReceber.addAll(queryAReceber.getResultList());
            int linha = listAReceber.size() -1;
            if(listAReceber.size() > 0){
                jTableAReceber.scrollRectToVisible(jTableAReceber.getCellRect(linha, linha, true));
                double soma = 0;
                for(int i = 0 ; i < listAReceber.size() ; i++){
                    soma = soma + (Double.parseDouble((String.valueOf(jTableAReceber.getValueAt(i, 3)))));
                }
                jLabelAReceber.setText(String.valueOf(df.format(soma)));
            }else{
                jLabelAReceber.setText("0.00");
            }                
        }else{
            jCheckBoxAReceber1.setSelected(false);
            
            jTabbedPaneRelatorios.setSelectedIndex(0);
            ejbql = "from Movimento m where m.movData between '" + dtFormato.format(dataInicial) 
                +  "' and '" + dtFormato.format(dataFinal) + "'" + " order by m.movData";

            queryRecebimentos = entityManager.createQuery(ejbql);
            listRecebimentos.clear();
            listRecebimentos.addAll(queryRecebimentos.getResultList());
            int linha = listRecebimentos.size() -1;
            if(listRecebimentos.size() > 0){
                jTableRecebimentos.scrollRectToVisible(jTableRecebimentos.getCellRect(linha, linha, true));
                double soma = 0;
                for(int i = 0 ; i < listRecebimentos.size(); i++){
                    soma = soma + (Double.parseDouble((String.valueOf(jTableRecebimentos.getValueAt(i, 4)))));
                }
                jLabelSoma.setText(String.valueOf(df.format(soma)));
            }else{
                jLabelSoma.setText("0.00");
            }
        }
    }

    private void atualizaTabelaSituacao(){
        
        DecimalFormat df = new DecimalFormat();
        if(!jTextFieldCodCliente.getText().equals("")){ 
            java.util.Date dataHoje = (java.util.Date)jDateChooserHoje.getDate();
            SimpleDateFormat dtFormato = new SimpleDateFormat("yyyy-MM-dd");
            
            String ejbql = "";
            
            if(!jCheckBoxPago.isSelected() && (!jCheckBoxDevido.isSelected() && (!jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " order by p.parDataVenc";
            
            else if(jCheckBoxPago.isSelected() && (!jCheckBoxDevido.isSelected() && (!jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " and (p.parStatus = 'Recebido' and p.parDataPagto <= '" + dtFormato.format(dataHoje) + "') order by p.parDataVenc";
            
            else if(jCheckBoxPago.isSelected() && (jCheckBoxDevido.isSelected() && (!jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " and (p.parStatus = 'Recebido' or p.parStatus = 'Ativo') order by p.parDataVenc";  
            
            else if(!jCheckBoxPago.isSelected() && (jCheckBoxDevido.isSelected() && (jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " and (p.parStatus = 'Ativo') order by p.parDataVenc";
            
            else if(!jCheckBoxPago.isSelected() && (jCheckBoxDevido.isSelected() && (!jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " and (p.parStatus = 'Ativo' and p.parDataVenc > '" + dtFormato.format(dataHoje) + "') order by p.parDataVenc";
            
            else if(!jCheckBoxPago.isSelected() && (!jCheckBoxDevido.isSelected() && (jCheckBoxVencido.isSelected())))
                ejbql = "select p from Parcela p join p.venda c where c.cliente.idCliente = '" + jTextFieldCodCliente.getText() + "'"
                        + " and (p.parStatus = 'Ativo' and p.parDataVenc < '" + dtFormato.format(dataHoje) + "') order by p.parDataVenc";
            
            querySituacaoCliente = entityManager.createQuery(ejbql);
            listSituacaoCliente.clear();
            listSituacaoCliente.addAll(querySituacaoCliente.getResultList());
            int linha = listSituacaoCliente.size() -1;
            if(listSituacaoCliente.size() > 0){
                jTableSituacaoCliente.scrollRectToVisible(jTableSituacaoCliente.getCellRect(linha, linha, true));
                entityManager.clear();
                String ejbql2 = "from Cliente c ";
                String codigo = "";        
                    codigo = "c.idCliente";
                  int filtro = Integer.parseInt(jTextFieldCodCliente.getText());
                  if(filtro > -1){
                        ejbql2 += "where " + codigo + " = " + filtro;
                }
                ejbql2 +=" order by " + codigo;
                queryCliente = entityManager.createQuery(ejbql2);
                listCliente.clear();
                listCliente.addAll(queryCliente.getResultList());  
                if(!jTextFieldCodCliente.getText().equals("")){
                    jLabelCliente.setForeground(Color.black);
                    jLabelCliente.setText(listCliente.toString());
                    
                    double somapago = 0.00;
                    double somareceber = 0.00;
                    double somaatrasado = 0.00;
                    int parcelaspagas = 0;
                    int parcelasreceber = 0;
                    int parcelasatrasadas = 0;
                    
                    for(int i = 0 ; i < listSituacaoCliente.size() ; i++){
                        
                        if(String.valueOf(jTableSituacaoCliente.getValueAt(i, 5)).equals("Recebido")){
                            somapago = somapago + (Double.parseDouble((String.valueOf(jTableSituacaoCliente.getValueAt(i, 2)))));
                            parcelaspagas++;
                        
                        }else if(String.valueOf(jTableSituacaoCliente.getValueAt(i, 5)).equals("Ativo")){
                            somareceber = somareceber + (Double.parseDouble((String.valueOf(jTableSituacaoCliente.getValueAt(i, 2)))));
                            parcelasreceber++;
                        }
                    }
                    
                    SimpleDateFormat dataFormato = new SimpleDateFormat("yyyyMMdd");
                    for(int j = 0 ; j < listSituacaoCliente.size() ; j++){
                        try {
                            Date a = dataFormato.parse(String.valueOf(dataFormato.format(jTableSituacaoCliente.getValueAt(j,3))));
                            Date b = dataFormato.parse(String.valueOf(dataFormato.format(dataHoje)));
                            if(b.after(a) && (String.valueOf(jTableSituacaoCliente.getValueAt(j, 5)).equals("Ativo"))){
                                somaatrasado = somaatrasado + (Double.parseDouble((String.valueOf(jTableSituacaoCliente.getValueAt(j, 2)))));
                                parcelasatrasadas++;
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(JFrameRelatorios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                        
                    jLabelValorPago.setText(String.valueOf(df.format(somapago)));
                    jLabelParcelaPago.setText(String.valueOf(parcelaspagas));
                    jLabelDevido.setText(String.valueOf(df.format(somareceber - somaatrasado)));
                    jLabelParcelaDevido.setText(String.valueOf(parcelasreceber - parcelasatrasadas));
                    jLabelAtraso.setText(String.valueOf(df.format(somaatrasado)));
                    jLabelParcelaAtraso.setText(String.valueOf(parcelasatrasadas));
                    
                }
            }else{
                jLabelValorPago.setText("0.00");
                jLabelParcelaPago.setText("0");
                jLabelDevido.setText("0.00");
                jLabelParcelaDevido.setText("0");
                jLabelCliente.setForeground(Color.red);
                jLabelCliente.setText("Nenhuma parcela localizada");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonListarRecebimentos;
    private javax.swing.JButton jButtonListarRecebimentos1;
    private javax.swing.JButton jButtonListarSituacao;
    private javax.swing.JCheckBox jCheckBoxAReceber;
    private javax.swing.JCheckBox jCheckBoxAReceber1;
    private javax.swing.JCheckBox jCheckBoxDevido;
    private javax.swing.JCheckBox jCheckBoxPago;
    private javax.swing.JCheckBox jCheckBoxVencido;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal1;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial1;
    private com.toedter.calendar.JDateChooser jDateChooserHoje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAReceber;
    private javax.swing.JLabel jLabelAtraso;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDataFinal;
    private javax.swing.JLabel jLabelDataFinal1;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelDataInicial1;
    private javax.swing.JLabel jLabelDevido;
    private javax.swing.JLabel jLabelLabelAtraso;
    private javax.swing.JLabel jLabelLabelDevido;
    private javax.swing.JLabel jLabelLabelRS;
    private javax.swing.JLabel jLabelLabelRS1;
    private javax.swing.JLabel jLabelLabelRecebimentos;
    private javax.swing.JLabel jLabelLabelValor;
    private javax.swing.JLabel jLabelLabelValor1;
    private javax.swing.JLabel jLabelLabelValorPago;
    private javax.swing.JLabel jLabelParcelaAtraso;
    private javax.swing.JLabel jLabelParcelaDevido;
    private javax.swing.JLabel jLabelParcelaPago;
    private javax.swing.JLabel jLabelSituacaoCliente;
    private javax.swing.JLabel jLabelSituacaoCliente1;
    private javax.swing.JLabel jLabelSoma;
    private javax.swing.JLabel jLabelValorPago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAReceber;
    private javax.swing.JPanel jPanelAReceber1;
    private javax.swing.JPanel jPanelFiltros;
    private javax.swing.JPanel jPanelPanelRecebimentos;
    private javax.swing.JPanel jPanelPanelSituacao;
    private javax.swing.JPanel jPanelPanelSituacao1;
    private javax.swing.JPanel jPanelReceberPorPeriodo;
    private javax.swing.JPanel jPanelRecebimentos;
    private javax.swing.JPanel jPanelRecebimentosPeriodo;
    private javax.swing.JPanel jPanelRecebimentosPeriodo1;
    private javax.swing.JPanel jPanelSitua????oCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneRelatorios;
    private javax.swing.JTable jTableAReceber;
    private javax.swing.JTable jTableRecebimentos;
    private javax.swing.JTable jTableSituacaoCliente;
    private javax.swing.JTextField jTextFieldCodCliente;
    private java.util.List<Parcela> listAReceber;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Movimento> listRecebimentos;
    private java.util.List<Parcela> listSituacaoCliente;
    private javax.persistence.Query queryAReceber;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryRecebimentos;
    private javax.persistence.Query querySituacaoCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
