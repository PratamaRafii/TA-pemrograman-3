/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class Index extends javax.swing.JFrame {
    //public Index index;
    public Connection con;
    public Statement stt;
    public PreparedStatement pst;
    private ResultSet rs;
    
    public Index() {
        initComponents();
        Update_table_User();
        Update_table();
        Update_table_arsitek();
        Update_table_elektro();
        Update_table_industri();
        Update_table_mesin();
        Update_table_sipil();
        koneksi();
        jurusan();
        formSearch.setVisible(false);
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan", "root", "");
            stt = con.createStatement();
            JOptionPane.showMessageDialog(null, "Berhasil Koneksi Database");
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Tidak Berhasil Koneksi ke Database");
        }*/
    }
    
    private void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan", "root", "");
            stt = con.createStatement();
            //JOptionPane.showMessageDialog(null, "Berhasil Koneksi Database");
            System.out.println("Berhasil Koneksi Database");
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Tidak Berhasil Koneksi ke Database");
        }
    }
    private void Update_table_User(){
        try{
            koneksi();
            //String query = "select id_buku,nama_buku,no_rak from buku where id_kategori = 4";
            String query = "select * from user";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelUser.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 4 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuIT.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table_arsitek(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 1 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuArsitek.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table_elektro(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 2 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuElektro.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table_industri(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 3 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuIndustri.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table_mesin(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 5 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuMesin.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void Update_table_sipil(){
        try{
            koneksi();
            String query = "select * from buku where id_kategori = 6 order by id_buku";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tabelBukuSipil.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    private void jurusan(){
        try{
            String query = "select * from kategori";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
                cmbKategori.addItem(rs.getString("id_kategori"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lbPerpus = new javax.swing.JLabel();
        lbUP = new javax.swing.JLabel();
        tabulasi = new javax.swing.JTabbedPane();
        DaftarUser = new javax.swing.JPanel();
        formRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtjurusan = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnpm = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cmbKelamin = new javax.swing.JComboBox();
        btnHaousUser = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        lbDaftarUser = new javax.swing.JLabel();
        DaftarBuku = new javax.swing.JPanel();
        lbDaftarBuku = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        txtNamaBuku = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPenulis = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        cmbKategori = new javax.swing.JComboBox();
        txtNoRak = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lbNoRak = new javax.swing.JLabel();
        lbKategori = new javax.swing.JLabel();
        lbDeskripsi = new javax.swing.JLabel();
        lbPenerbit = new javax.swing.JLabel();
        lbPenulis = new javax.swing.JLabel();
        lbNamaBuku = new javax.swing.JLabel();
        lbISBN = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        lbTmbahBuku = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        arsitek = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelBukuArsitek = new javax.swing.JTable();
        elektro = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelBukuElektro = new javax.swing.JTable();
        industri = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelBukuIndustri = new javax.swing.JTable();
        informatika = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelBukuIT = new javax.swing.JTable();
        Mesin = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelBukuMesin = new javax.swing.JTable();
        Sipil = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabelBukuSipil = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        formSearch = new javax.swing.JPanel();
        txtNamaBuku1 = new javax.swing.JTextField();
        txtISBN1 = new javax.swing.JTextField();
        txtPenulis1 = new javax.swing.JTextField();
        txtPenerbit1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDeskripsi1 = new javax.swing.JTextArea();
        txtNoRak1 = new javax.swing.JTextField();
        btnCancel1 = new javax.swing.JButton();
        lbNoRak1 = new javax.swing.JLabel();
        lbKategori1 = new javax.swing.JLabel();
        lbDeskripsi1 = new javax.swing.JLabel();
        lbPenerbit1 = new javax.swing.JLabel();
        lbPenulis1 = new javax.swing.JLabel();
        lbNamaBuku1 = new javax.swing.JLabel();
        lbISBN1 = new javax.swing.JLabel();
        lbTmbahBuku1 = new javax.swing.JLabel();
        txtKateg = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        logoSearch = new javax.swing.JLabel();
        txtSeacrh = new javax.swing.JTextField();
        lbKataKunci = new javax.swing.JLabel();
        lbSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpustakaan UP - Admin Panel");
        setResizable(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        lbPerpus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPerpus.setText("Perpustakaan");

        lbUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUP.setText("Universitas Pancasila");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPerpus)
                    .addComponent(lbUP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(lbPerpus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUP))
                    .addComponent(logo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabulasi.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("User Name");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Email");

        jLabel7.setText("Jurusan");

        jLabel8.setText("NPM");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjurusanActionPerformed(evt);
            }
        });

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel9.setText("Alamat");

        txtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnpmActionPerformed(evt);
            }
        });

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane4.setViewportView(txtalamat);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Register");

        cmbKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pria", "Wanita" }));

        btnHaousUser.setText("Delete");
        btnHaousUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaousUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formRegisterLayout = new javax.swing.GroupLayout(formRegister);
        formRegister.setLayout(formRegisterLayout);
        formRegisterLayout.setHorizontalGroup(
            formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegisterLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formRegisterLayout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHaousUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancel))
                    .addGroup(formRegisterLayout.createSequentialGroup()
                        .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtemail)
                            .addComponent(txtjurusan)
                            .addComponent(txtnpm)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtnama)
                            .addComponent(txtpassword)))
                    .addGroup(formRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(formRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(198, 198, 198))
        );
        formRegisterLayout.setVerticalGroup(
            formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btncancel)
                    .addComponent(btnHaousUser))
                .addContainerGap())
        );

        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUserMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelUser);

        lbDaftarUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbDaftarUser.setText("Daftar User");

        javax.swing.GroupLayout DaftarUserLayout = new javax.swing.GroupLayout(DaftarUser);
        DaftarUser.setLayout(DaftarUserLayout);
        DaftarUserLayout.setHorizontalGroup(
            DaftarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DaftarUserLayout.createSequentialGroup()
                .addGroup(DaftarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DaftarUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DaftarUserLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lbDaftarUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(formRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        DaftarUserLayout.setVerticalGroup(
            DaftarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DaftarUserLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(DaftarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DaftarUserLayout.createSequentialGroup()
                        .addComponent(lbDaftarUser)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabulasi.addTab("Daftar User", DaftarUser);

        lbDaftarBuku.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbDaftarBuku.setText("Daftar Buku Fakultas Teknik");

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        jScrollPane1.setViewportView(txtDeskripsi);

        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbNoRak.setText("No Rak");

        lbKategori.setText("Kategori");

        lbDeskripsi.setText("Deskripsi");

        lbPenerbit.setText("Penerbit");

        lbPenulis.setText("Penulis");

        lbNamaBuku.setText("Nama Buku");

        lbISBN.setText("ISBN");

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        lbTmbahBuku.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTmbahBuku.setText("Tambah Buku");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNoRak)
                            .addComponent(lbNamaBuku)
                            .addComponent(lbISBN)
                            .addComponent(lbPenulis)
                            .addComponent(lbPenerbit)
                            .addComponent(lbDeskripsi)
                            .addComponent(lbKategori))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoRak, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbKategori, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPenulis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTmbahBuku)
                .addGap(70, 70, 70))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTmbahBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbISBN))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNamaBuku))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPenulis))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPenerbit))
                .addGap(29, 29, 29)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDeskripsi))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKategori))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoRak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNoRak))
                .addGap(26, 26, 26)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnHapus)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tabelBukuArsitek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuArsitek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuArsitekMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tabelBukuArsitek);

        javax.swing.GroupLayout arsitekLayout = new javax.swing.GroupLayout(arsitek);
        arsitek.setLayout(arsitekLayout);
        arsitekLayout.setHorizontalGroup(
            arsitekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arsitekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        arsitekLayout.setVerticalGroup(
            arsitekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arsitekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arsitektur", arsitek);

        tabelBukuElektro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuElektro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuElektroMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabelBukuElektro);

        javax.swing.GroupLayout elektroLayout = new javax.swing.GroupLayout(elektro);
        elektro.setLayout(elektroLayout);
        elektroLayout.setHorizontalGroup(
            elektroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elektroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        elektroLayout.setVerticalGroup(
            elektroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elektroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Elektro", elektro);

        tabelBukuIndustri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuIndustri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuIndustriMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tabelBukuIndustri);

        javax.swing.GroupLayout industriLayout = new javax.swing.GroupLayout(industri);
        industri.setLayout(industriLayout);
        industriLayout.setHorizontalGroup(
            industriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(industriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        industriLayout.setVerticalGroup(
            industriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(industriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Industri", industri);

        tabelBukuIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuITMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelBukuIT);

        javax.swing.GroupLayout informatikaLayout = new javax.swing.GroupLayout(informatika);
        informatika.setLayout(informatikaLayout);
        informatikaLayout.setHorizontalGroup(
            informatikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informatikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        informatikaLayout.setVerticalGroup(
            informatikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informatikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informatika", informatika);

        tabelBukuMesin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuMesin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMesinMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tabelBukuMesin);

        javax.swing.GroupLayout MesinLayout = new javax.swing.GroupLayout(Mesin);
        Mesin.setLayout(MesinLayout);
        MesinLayout.setHorizontalGroup(
            MesinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MesinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        MesinLayout.setVerticalGroup(
            MesinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MesinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mesin", Mesin);

        tabelBukuSipil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title 1", "title 2", "title 3"
            }
        ));
        tabelBukuSipil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuSipilMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tabelBukuSipil);

        javax.swing.GroupLayout SipilLayout = new javax.swing.GroupLayout(Sipil);
        Sipil.setLayout(SipilLayout);
        SipilLayout.setHorizontalGroup(
            SipilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SipilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        SipilLayout.setVerticalGroup(
            SipilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SipilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sipil", Sipil);

        jLabel3.setText("Keterangan Kategori :");

        jLabel11.setText("Kategori 1 = Arsitektur");

        jLabel12.setText("Kategori 2 = Elektro");

        jLabel13.setText("Kategori 3 = Industri");

        jLabel14.setText("Kategori 4 = Informatika");

        jLabel15.setText("Kategori 5 = Mesin");

        jLabel16.setText("Kategori 6 = Sipil");

        javax.swing.GroupLayout DaftarBukuLayout = new javax.swing.GroupLayout(DaftarBuku);
        DaftarBuku.setLayout(DaftarBukuLayout);
        DaftarBukuLayout.setHorizontalGroup(
            DaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaftarBukuLayout.createSequentialGroup()
                .addGroup(DaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DaftarBukuLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbDaftarBuku))
                    .addGroup(DaftarBukuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DaftarBukuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(DaftarBukuLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(DaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        DaftarBukuLayout.setVerticalGroup(
            DaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaftarBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DaftarBukuLayout.createSequentialGroup()
                        .addComponent(lbDaftarBuku)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(form, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabulasi.addTab("Daftar Buku", DaftarBuku);

        txtDeskripsi1.setColumns(20);
        txtDeskripsi1.setRows(5);
        jScrollPane6.setViewportView(txtDeskripsi1);

        btnCancel1.setText("Cancel");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        lbNoRak1.setText("No Rak");

        lbKategori1.setText("Kategori");

        lbDeskripsi1.setText("Deskripsi");

        lbPenerbit1.setText("Penerbit");

        lbPenulis1.setText("Penulis");

        lbNamaBuku1.setText("Nama Buku");

        lbISBN1.setText("ISBN");

        lbTmbahBuku1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTmbahBuku1.setText("Hasil Pencarian");

        javax.swing.GroupLayout formSearchLayout = new javax.swing.GroupLayout(formSearch);
        formSearch.setLayout(formSearchLayout);
        formSearchLayout.setHorizontalGroup(
            formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formSearchLayout.createSequentialGroup()
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formSearchLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnCancel1))
                            .addGroup(formSearchLayout.createSequentialGroup()
                                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNoRak1)
                                    .addComponent(lbNamaBuku1)
                                    .addComponent(lbISBN1)
                                    .addComponent(lbPenulis1)
                                    .addComponent(lbPenerbit1)
                                    .addComponent(lbDeskripsi1)
                                    .addComponent(lbKategori1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNoRak1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(txtPenerbit1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPenulis1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNamaBuku1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtISBN1)
                                    .addComponent(txtKateg)))))
                    .addGroup(formSearchLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbTmbahBuku1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formSearchLayout.setVerticalGroup(
            formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTmbahBuku1)
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbISBN1))
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNamaBuku1))
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenulis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPenulis1))
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPenerbit1))
                .addGap(29, 29, 29)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDeskripsi1))
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKategori1)
                    .addComponent(txtKateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoRak1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNoRak1))
                .addGap(26, 26, 26)
                .addComponent(btnCancel1)
                .addContainerGap())
        );

        logoSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        txtSeacrh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSeacrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeacrhActionPerformed(evt);
            }
        });
        txtSeacrh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeacrhKeyReleased(evt);
            }
        });

        lbKataKunci.setText("Masukan Nama Buku");

        lbSearch.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbSearch.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbKataKunci)
                    .addComponent(lbSearch)
                    .addComponent(txtSeacrh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoSearch))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbKataKunci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeacrh, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(formSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabulasi.addTab("Search", search);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabulasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabulasi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeacrhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeacrhKeyReleased
        try{
            String sql = "select * from buku where nama_buku = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSeacrh.getText());

            rs=pst.executeQuery();
            if(rs.next()){
                formSearch.setVisible(true);
                String add1 = rs.getString("id_buku");
                txtISBN1.setText(add1);
                String add2 = rs.getString("nama_buku");
                txtNamaBuku1.setText(add2);
                String add3 = rs.getString("penulis");
                txtPenulis1.setText(add3);
                String add4 = rs.getString("penerbit");
                txtPenerbit1.setText(add4);
                String add5 = rs.getString("deskripsi");
                txtDeskripsi1.setText(add5);
                String add6 = rs.getString("no_rak");
                txtNoRak1.setText(add6);
                int add7 = rs.getInt("id_kategori");
                if(add7 == 1){
                    txtKateg.setText("Arsitektur");
                }else if(add7 == 2){
                    txtKateg.setText("Elektro");
                }else if(add7 == 3){
                    txtKateg.setText("Industri");
                }else if(add7 == 4){
                    txtKateg.setText("Informatika");
                }else if(add7 == 5){
                    txtKateg.setText("Mesin");
                }else if(add7 == 6){
                    txtKateg.setText("Sipil");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtSeacrhKeyReleased

    private void txtSeacrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeacrhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeacrhActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        txtISBN1.setText("");
        txtISBN1.requestFocus();
        txtNamaBuku1.setText("");
        txtNamaBuku1.requestFocus();
        txtPenulis1.setText("");
        txtPenulis1.requestFocus();
        txtPenerbit1.setText("");
        txtPenerbit1.requestFocus();
        txtDeskripsi1.setText("");
        txtDeskripsi1.requestFocus();
        txtKateg.setText("");
        txtKateg.requestFocus();
        txtNoRak1.setText("");
        txtNoRak1.requestFocus();
        formSearch.setVisible(false);
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void tabelBukuSipilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuSipilMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuSipil.getSelectedRow();
        txtISBN.setText(tabelBukuSipil.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuSipil.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuSipil.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuSipil.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuSipil.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuSipil.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuSipilMouseClicked

    private void tabelBukuMesinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMesinMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuMesin.getSelectedRow();
        txtISBN.setText(tabelBukuMesin.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuMesin.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuMesin.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuMesin.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuMesin.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuMesin.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuMesinMouseClicked

    private void tabelBukuITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuITMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuIT.getSelectedRow();
        txtISBN.setText(tabelBukuIT.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuIT.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuIT.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuIT.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuIT.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuIT.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuITMouseClicked

    private void tabelBukuIndustriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuIndustriMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuIndustri.getSelectedRow();
        txtISBN.setText(tabelBukuIndustri.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuIndustri.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuIndustri.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuIndustri.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuIndustri.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuIndustri.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuIndustriMouseClicked

    private void tabelBukuElektroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuElektroMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuElektro.getSelectedRow();
        txtISBN.setText(tabelBukuElektro.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuElektro.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuElektro.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuElektro.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuElektro.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuElektro.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuElektroMouseClicked

    private void tabelBukuArsitekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuArsitekMouseClicked
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSave.setEnabled(false);

        int row = tabelBukuArsitek.getSelectedRow();
        txtISBN.setText(tabelBukuArsitek.getModel().getValueAt(row, 0).toString());
        txtNamaBuku.setText(tabelBukuArsitek.getModel().getValueAt(row, 1).toString());
        txtPenulis.setText(tabelBukuArsitek.getModel().getValueAt(row, 2).toString());
        txtPenerbit.setText(tabelBukuArsitek.getModel().getValueAt(row, 3).toString());
        txtDeskripsi.setText(tabelBukuArsitek.getModel().getValueAt(row, 4).toString());
        txtNoRak.setText(tabelBukuArsitek.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelBukuArsitekMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String sql = "delete from buku where id_buku = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, txtISBN.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        Update_table_arsitek();
        Update_table_elektro();
        Update_table_industri();
        Update_table_mesin();
        Update_table_sipil();
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnHapus.setEnabled(false);
        txtISBN.setText("");
        txtISBN.requestFocus();
        txtNamaBuku.setText("");
        txtNamaBuku.requestFocus();
        txtPenulis.setText("");
        txtPenulis.requestFocus();
        txtPenerbit.setText("");
        txtPenerbit.requestFocus();
        txtDeskripsi.setText("");
        txtDeskripsi.requestFocus();
        cmbKategori.setSelectedItem("Pilih Kategori");
        cmbKategori.requestFocus();
        txtNoRak.setText("");
        txtNoRak.requestFocus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            String eISBN = txtISBN.getText();
            String eNmBuku = txtNamaBuku.getText();
            String ePenulis = txtPenulis.getText();
            String ePenerbit = txtPenerbit.getText();
            String eDeskripsi = txtDeskripsi.getText();
            String eNoRak = txtNoRak.getText();

            String sqlEdit = "update buku set id_buku = '"+eISBN+"', nama_buku = '"+eNmBuku+"', penulis = '"+ePenulis+"', penerbit = '"+ePenerbit+"', deskripsi = '"+eDeskripsi+"', no_rak = '"+eNoRak+"' where id_buku = '"+eISBN+"'";
            pst = con.prepareStatement(sqlEdit);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil di Update");

            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnHapus.setEnabled(false);
            txtISBN.setText("");
            txtISBN.requestFocus();
            txtNamaBuku.setText("");
            txtNamaBuku.requestFocus();
            txtPenulis.setText("");
            txtPenulis.requestFocus();
            txtPenerbit.setText("");
            txtPenerbit.requestFocus();
            txtDeskripsi.setText("");
            txtDeskripsi.requestFocus();
            cmbKategori.setSelectedItem("Pilih Kategori");
            cmbKategori.requestFocus();
            txtNoRak.setText("");
            txtNoRak.requestFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        Update_table_arsitek();
        Update_table_elektro();
        Update_table_industri();
        Update_table_mesin();
        Update_table_sipil();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            try{
                //cmbKategori.setSelectedIndex(4);

                //  String kateg = (String) cmbKategori.getSelectedItem();
                String sql = "Insert into buku (id_buku, nama_buku, penulis, penerbit, deskripsi, no_rak, id_kategori) values(?,?,?,?,?,?,"+cmbKategori.getSelectedItem().toString()+")";
                pst = con.prepareStatement(sql);
                pst.setString(1, txtISBN.getText());
                pst.setString(2, txtNamaBuku.getText());
                pst.setString(3, txtPenulis.getText());
                pst.setString(4, txtPenerbit.getText());
                pst.setString(5, txtDeskripsi.getText());
                pst.setString(6, txtNoRak.getText());
                //pst.setString(7, cmbKategori.getSelectedItem());

                pst.execute();
                JOptionPane.showMessageDialog(null,"Data berhasil di simpan");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data gagal disimpan di simpan");
            }
            Update_table();
            Update_table_arsitek();
            Update_table_elektro();
            Update_table_industri();
            Update_table_mesin();
            Update_table_sipil();
            //isbn
            try{
                int isbn = Integer.parseInt(
                    this.txtISBN.getText());
                System.out.println("ISBN : " + isbn);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "ISBN belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //nama buku
            try{
                String nmbuku = this.txtNamaBuku.getText();
                System.out.println("Nama Buku : " + nmbuku);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Nama Buku belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //penulis
            try{
                String penulis = this.txtPenulis.getText();
                System.out.println("Penulis : " + penulis);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Penulis belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //penerbit
            try{
                String penerbit = this.txtPenerbit.getText();
                System.out.println("Penerbit : " + penerbit);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Penerbit belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //deskripsi
            try{
                String deskripsi = this.txtDeskripsi.getText();
                System.out.println("Deskripsi Buku : " + deskripsi);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Deskripsi Buku belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //kategori
            try{
                String kateg = (String) cmbKategori.getSelectedItem();
                if(kateg == "Informatika"){
                    int id = 4;
                    System.out.println("Kategori Buku : " + id);
                }else{
                    int id = 2;
                    System.out.println("Kategori Buku : " + id);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Kategori Buku belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //no rak
            try{
                int norak = Integer.parseInt(
                    this.txtNoRak.getText());
                System.out.println("No. Rak Buku : " + norak);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "No. Rak belum diisi","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            System.out.println("===================================");
            txtISBN.setText("");
            txtISBN.requestFocus();
            txtNamaBuku.setText("");
            txtNamaBuku.requestFocus();
            txtPenulis.setText("");
            txtPenulis.requestFocus();
            txtPenerbit.setText("");
            txtPenerbit.requestFocus();
            txtDeskripsi.setText("");
            txtDeskripsi.requestFocus();
            cmbKategori.setSelectedItem("Pilih Kategori");
            cmbKategori.requestFocus();
            txtNoRak.setText("");
            txtNoRak.requestFocus();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Gagal Diinput", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtISBN.setText("");
        txtISBN.requestFocus();
        txtNamaBuku.setText("");
        txtNamaBuku.requestFocus();
        txtPenulis.setText("");
        txtPenulis.requestFocus();
        txtPenerbit.setText("");
        txtPenerbit.requestFocus();
        txtDeskripsi.setText("");
        txtDeskripsi.requestFocus();
        cmbKategori.setSelectedItem("Pilih Kategori");
        cmbKategori.requestFocus();
        txtNoRak.setText("");
        txtNoRak.requestFocus();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void tabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUserMouseClicked
        int row = tabelUser.getSelectedRow();
        txtusername.setText(tabelUser.getModel().getValueAt(row, 0).toString());
        txtnama.setText(tabelUser.getModel().getValueAt(row, 1).toString());
        txtpassword.setText(tabelUser.getModel().getValueAt(row, 2).toString());
        //cmbKelamin.setText(tabelUser.getModel().getValueAt(row, 3).toString());
        txtemail.setText(tabelUser.getModel().getValueAt(row, 4).toString());
        txtalamat.setText(tabelUser.getModel().getValueAt(row, 5).toString());
        txtjurusan.setText(tabelUser.getModel().getValueAt(row, 6).toString());
        txtnpm.setText(tabelUser.getModel().getValueAt(row, 7).toString());

    }//GEN-LAST:event_tabelUserMouseClicked

    private void btnHaousUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaousUserActionPerformed
        String sql = "delete from user where id_user = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, txtusername.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table_User();
        txtusername.setText("");
        txtusername.requestFocus();
        txtpassword.setText("");
        txtpassword.requestFocus();
        txtnama.setText("");
        txtnama.requestFocus();
        txtemail.setText("");
        txtemail.requestFocus();
        txtjurusan.setText("");
        txtjurusan.requestFocus();
        txtnpm.setText("");
        txtnpm.requestFocus();
        txtalamat.setText("");
        txtalamat.requestFocus();
    }//GEN-LAST:event_btnHaousUserActionPerformed

    private void txtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpmActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            String eUser = txtusername.getText();
            String eNama = txtnama.getText();
            String eEmail = txtemail.getText();
            String eJurusan = txtjurusan.getText();
            String eNpm = txtnpm.getText();
            String eAlamat = txtalamat.getText();

            String queryEdit = "update user set id_user = '"+eUser+"', password = '"+String.valueOf(txtpassword.getPassword())+"', nama_lengkap = '"+eNama+"', email = '"+eEmail+"', jurusan = '"+eJurusan+"', NPM = '"+eNpm+"', jenis_kelamin = '"+cmbKelamin.getSelectedItem().toString()+"' where id_user = '"+eUser+"'";
            pst = con.prepareStatement(queryEdit);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil di Update");

            txtusername.setText("");
            txtusername.requestFocus();
            txtpassword.setText("");
            txtpassword.requestFocus();
            txtnama.setText("");
            txtnama.requestFocus();
            txtemail.setText("");
            txtemail.requestFocus();
            txtjurusan.setText("");
            txtjurusan.requestFocus();
            txtnpm.setText("");
            txtnpm.requestFocus();
            txtalamat.setText("");
            txtalamat.requestFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table_User();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjurusanActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed

    }//GEN-LAST:event_txtusernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DaftarBuku;
    private javax.swing.JPanel DaftarUser;
    private javax.swing.JPanel Mesin;
    private javax.swing.JPanel Sipil;
    private javax.swing.JPanel arsitek;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHaousUser;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncancel;
    private javax.swing.JComboBox cmbKategori;
    private javax.swing.JComboBox cmbKelamin;
    private javax.swing.JPanel elektro;
    private javax.swing.JPanel form;
    private javax.swing.JPanel formRegister;
    private javax.swing.JPanel formSearch;
    private javax.swing.JPanel header;
    private javax.swing.JPanel industri;
    private javax.swing.JPanel informatika;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbDaftarBuku;
    private javax.swing.JLabel lbDaftarUser;
    private javax.swing.JLabel lbDeskripsi;
    private javax.swing.JLabel lbDeskripsi1;
    private javax.swing.JLabel lbISBN;
    private javax.swing.JLabel lbISBN1;
    private javax.swing.JLabel lbKataKunci;
    private javax.swing.JLabel lbKategori;
    private javax.swing.JLabel lbKategori1;
    private javax.swing.JLabel lbNamaBuku;
    private javax.swing.JLabel lbNamaBuku1;
    private javax.swing.JLabel lbNoRak;
    private javax.swing.JLabel lbNoRak1;
    private javax.swing.JLabel lbPenerbit;
    private javax.swing.JLabel lbPenerbit1;
    private javax.swing.JLabel lbPenulis;
    private javax.swing.JLabel lbPenulis1;
    private javax.swing.JLabel lbPerpus;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbTmbahBuku;
    private javax.swing.JLabel lbTmbahBuku1;
    private javax.swing.JLabel lbUP;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoSearch;
    private javax.swing.JPanel search;
    private javax.swing.JTable tabelBukuArsitek;
    private javax.swing.JTable tabelBukuElektro;
    private javax.swing.JTable tabelBukuIT;
    private javax.swing.JTable tabelBukuIndustri;
    private javax.swing.JTable tabelBukuMesin;
    private javax.swing.JTable tabelBukuSipil;
    private javax.swing.JTable tabelUser;
    private javax.swing.JTabbedPane tabulasi;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextArea txtDeskripsi1;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBN1;
    private javax.swing.JTextField txtKateg;
    private javax.swing.JTextField txtNamaBuku;
    private javax.swing.JTextField txtNamaBuku1;
    private javax.swing.JTextField txtNoRak;
    private javax.swing.JTextField txtNoRak1;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenerbit1;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextField txtPenulis1;
    private javax.swing.JTextField txtSeacrh;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnpm;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
