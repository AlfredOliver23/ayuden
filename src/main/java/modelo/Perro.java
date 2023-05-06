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
        int per_id,ref_id,Cra_id,Ctp_id,exp_id, orp_id;
        Date per_cum;
        String per_nom,per_des;
        InputStream per_fot;

        /**
         *
         * @param per_id int
         * @param ref_id int
         * @param Cra_id
         * @param Ctp_id
         * @param exp_id
         * @param orp_id
         * @param per_cum
         * @param per_nom String
         * @param per_des String
         * @param per_fot InputStream
         */
        public Perro(int per_id, int ref_id, int Cra_id, int Ctp_id, int exp_id, int orp_id, Date per_cum, String per_nom, String per_des, InputStream per_fot) {
            this.per_id = per_id;
            this.ref_id = ref_id;
            this.Cra_id = Cra_id;
            this.Ctp_id = Ctp_id;
            this.exp_id = exp_id;
            this.orp_id = orp_id;
            this.per_cum = per_cum;
            this.per_nom = per_nom;
            this.per_des = per_des;
            this.per_fot = per_fot;
        }

        public Perro() {

        }





        /*NO se que hace pero puus quita el eror*/

        public int getPer_id() {
            return per_id;
        }

        public void setPer_id(int per_id) {
            this.per_id = per_id;
        }

        public int getRef_id() {
            return ref_id;
        }

        public void setRef_id(int ref_id) {
            this.ref_id = ref_id;
        }

        public int getCra_id() {
            return Cra_id;
        }

        public void setCra_id(int Cra_id) {
            this.Cra_id = Cra_id;
        }

        public int getCtp_id() {
            return Ctp_id;
        }

        public void setCtp_id(int Ctp_id) {
            this.Ctp_id = Ctp_id;
        }

        public int getExp_id() {
            return exp_id;
        }

        public void setExp_id(int exp_id) {
            this.exp_id = exp_id;
        }

        public int getOrp_id() {
            return orp_id;
        }

        public void setOrp_id(int orp_id) {
            this.orp_id = orp_id;
        }

        public Date getPer_cum() {
            return per_cum;
        }

        public void setPer_cum(Date per_cum) {
            this.per_cum = per_cum;
        }

        public String getPer_nom() {
            return per_nom;
        }

        public void setPer_nom(String per_nom) {
            this.per_nom = per_nom;
        }

        public String getPer_des() {
            return per_des;
        }

        public void setPer_des(String per_des) {
            this.per_des = per_des;
        }

        public InputStream getPer_fot() {
            return per_fot;
        }

        public void setPer_fot(InputStream per_fot) {
            this.per_fot = per_fot;
        }



    }


