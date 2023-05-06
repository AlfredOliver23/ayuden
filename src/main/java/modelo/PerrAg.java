package modelo;


import config.Conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class PerrAg {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List listar(){
        List<Perro>perros = new ArrayList();
        String sql = "select * from perro";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Perro p = new Perro();
                p.setPer_id(rs.getInt(1));
                p.setPer_nom(rs.getString(2));
                p.setCra_id(rs.getInt(3));
                p.setPer_cum(rs.getDate(4));
                p.setPer_fot(rs.getBinaryStream(5));
                p.setRef_id(rs.getInt(6));
                p.setPer_des(rs.getString(7));
                p.setExp_id(rs.getInt(8));
                p.setOrp_id(rs.getInt(9));
                perros.add(p);
                System.out.println("perro encontrado: " + perros.toString());
            }

        }catch (SQLException e){
            System.out.println("erro al ejecutar la consulta: " + e.getMessage());
        }
        return perros;
    }


    public void agregarImg(int per_id, HttpServletResponse response) {
        String sql = "select *from perro where per_id ="+ per_id;
        InputStream inputStream = null;
        OutputStream outputstream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputstream = response.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()) {
                inputStream= rs.getBinaryStream("Foto");
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputstream);
            int i = 0;
            while((i=bufferedInputStream.read())!= -1){
                bufferedOutputStream.write(i);
            }

        } catch (Exception e) {
        }
    }


}
