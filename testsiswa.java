/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radya
 */
public class testsiswa {
     
    public static void main(String[] args) {
        // TODO code application logic here
    encapsiswa siswa = new encapsiswa();
    siswa.setnama("M.Radya");
    siswa.setumur(16);
    siswa.setalamat("Mataram");
        
        System.out.println("nama: "+siswa.getnama()+","+ " alamat "+siswa.getalamat()+","+ " berumur "+siswa.getumur()+ " tahun");
    }

    
}
