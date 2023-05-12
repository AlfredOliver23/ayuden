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
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
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
                p.setPerro_id(rs.getInt(1));
                p.setPerro_nombre(rs.getString(2));
                p.setCatatipo_perro(rs.getInt(3));
                p.setCatatipo_perro(rs.getInt(4));
                p.setPerro_cumplea(rs.getDate(5));
                p.setRefug_id(rs.getInt(6));
                p.setPerro_IMG(rs.getBinaryStream(7));
                p.setOrigeperro_id(rs.getInt(8));
                p.setPerro_descripc(rs.getString(9));

                perros.add(p);
                System.out.println("perro encontrado: " + perros.toString());
            }

        }catch (SQLException e){
            System.out.println("error al ejecutar la consulta(perAG): " + e.getMessage());
        }
        return perros;
    }


    public void agregarImg(int Perro_id, HttpServletResponse response) {
        String sql = "select *from perro where per_id ="+ Perro_id;
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
                inputStream = rs.getBinaryStream("perro_IMG");

            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputstream);
            int i = 0;
            while((i=bufferedInputStream.read())!= -1){
                bufferedOutputStream.write(i);
            }

        } catch (Exception e) {
            System.out.println("nimodo" +e.getMessage());
        }
    }


}
