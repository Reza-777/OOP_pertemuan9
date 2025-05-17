
package oop_pertemuan;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Reza syarwani
 * TGL 17 Mei 2025
 */
public class dbkoneksi {
    static String BD_DRIVER="com.mysql.cj.jdbc.Driver";
    static String BD_HOST="jdbc:mysql://localhost:3306/mahasiswa";
    static String BD_USER="root";
    static String BD_PASSWORD="";
    
    
     Connection koneksi (){
         try{
           Class.forName(BD_DRIVER);
            return DriverManager.getConnection(BD_HOST, BD_USER, BD_PASSWORD);
             
         }catch (ClassNotFoundException | SQLException err){
            System.out.println("gagal koneksi ke DBMS MySQL");
         }
         return null;
    
    
    }
}
