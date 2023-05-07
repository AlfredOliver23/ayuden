package modelo;

import java.io.InputStream;
import java.sql.Date;



    /**
     *
     * @author user
     */
/*/y si creamos un nuevo catalogo que englobe que es cada uno
//osea perro Grande{senior, cachoro, adulto}Mediano{y asi}
//ID expediente medico, refugio, perro, catalogo raza, tipo de perro int, si es rescatado o que rollo origen
/ string, nombre y su descripcion como a perro bonito perro panzon
/date cuando atraparon al perre vergue
9  parametros que debemos tener
*/

    public class Perro {


        int perro_id;
        String perro_nombre;
        int catraza_id;
        int catatipo_perro;
        Date perro_cumplea;
        int refug_id;
        InputStream perro_IMG;
        int origeperro_id;
        String perro_descripc;

        public Perro(int perro_id, String perro_nombre, int catraza_id, int catatipo_perro, Date perro_cumplea, int refug_id, InputStream perro_IMG, int origeperro_id, String perro_descripc) {
            this.perro_id = perro_id;
            this.perro_nombre = perro_nombre;
            this.catraza_id = catraza_id;
            this.catatipo_perro = catatipo_perro;
            this.perro_cumplea = perro_cumplea;
            this.refug_id = refug_id;
            this.perro_IMG = perro_IMG;
            this.origeperro_id = origeperro_id;
            this.perro_descripc = perro_descripc;
        }

        public Perro() {

        }

        public int getPerro_id() {
            return perro_id;
        }

        public void setPerro_id(int perro_id) {
            this.perro_id = perro_id;
        }

        public String getPerro_nombre() {
            return perro_nombre;
        }

        public void setPerro_nombre(String perro_nombre) {
            this.perro_nombre = perro_nombre;
        }

        public int getCatraza_id() {
            return catraza_id;
        }

        public void setCatraza_id(int catraza_id) {
            this.catraza_id = catraza_id;
        }

        public int getCatatipo_perro() {
            return catatipo_perro;
        }

        public void setCatatipo_perro(int catatipo_perro) {
            this.catatipo_perro = catatipo_perro;
        }

        public Date getPerro_cumplea() {
            return perro_cumplea;
        }

        public void setPerro_cumplea(Date perro_cumplea) {
            this.perro_cumplea = perro_cumplea;
        }

        public int getRefug_id() {
            return refug_id;
        }

        public void setRefug_id(int refug_id) {
            this.refug_id = refug_id;
        }

        public InputStream getPerro_IMG() {
            return perro_IMG;
        }

        public void setPerro_IMG(InputStream perro_IMG) {
            this.perro_IMG = perro_IMG;
        }

        public int getOrigeperro_id() {
            return origeperro_id;
        }

        public void setOrigeperro_id(int origeperro_id) {
            this.origeperro_id = origeperro_id;
        }

        public String getPerro_descripc() {
            return perro_descripc;
        }

        public void setPerro_descripc(String perro_descripc) {
            this.perro_descripc = perro_descripc;
        }

    }







