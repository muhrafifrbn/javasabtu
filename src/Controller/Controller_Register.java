/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;
import View.RegisterForm;
import java.sql.SQLException;
import View.Register;
/**
 *
 * @author lenovot470s
 */
public interface Controller_Register {
    public void simpan(Register siswa) throws SQLException; 
    public void simpan2(RegisterForm siswa) throws SQLException; 
    public void sekolah(RegisterForm siswa) throws SQLException; 
}
