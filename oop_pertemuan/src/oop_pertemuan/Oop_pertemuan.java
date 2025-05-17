/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_pertemuan;
 import java.sql.Statement;
 import java.sql.ResultSet;
import java.sql.SQLException;

         

/**
 *
 * @author Reza syarwani
 * TGL 17 Mei 2025
 */
public class Oop_pertemuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi dbk = new dbkoneksi();
        
        Statement stm = dbk.koneksi().createStatement();
        String sql ="SELECT * FROM mhs";
        ResultSet rs = stm.executeQuery(sql);
        
        
        while(rs.next()){
            System.out.println("Nama : " + rs.getString("NAMA"));
             System.out.println("Nama : " + rs.getString("NIM"));
              System.out.println("Nama : " + rs.getString("PRODI"));
        }
    }
    
}
