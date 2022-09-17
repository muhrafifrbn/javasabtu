/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.Controller_Register;
import View.Register;
import java.sql.SQLException;
import Koneksi.koneksi;
import View.RegisterForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovot470s
 */
public class Model_Register implements Controller_Register{

    @Override
    public void simpan(Register siswa) throws SQLException {
        try {
            Connection con = koneksi.getcon();
            String sql = "INSERT INTO register VALUES (?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, siswa.txtNama.getText());
            prepare.setString(2, siswa.txtPass.getText());
            prepare.setString(3, siswa.txtEmail.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void simpan2(RegisterForm siswa) throws SQLException {
        Integer nomerTelepon = Integer.valueOf(siswa.txtPhoneNumber.getText());
       try {
            Connection con = koneksi.getcon();
            String sql = "INSERT INTO register VALUES (?,?,?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, siswa.txtNama.getText());
            prepare.setString(2, siswa.txtlastname.getText());
            prepare.setString(3, siswa.txtPass.getText());
            prepare.setString(4, siswa.txtEmail.getText());
            prepare.setInt(5, nomerTelepon);
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void sekolah(RegisterForm siswa) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
