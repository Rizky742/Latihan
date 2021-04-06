/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author KIKI
 */
public class Rizky extends Siswa {
    public static void main(String[] args) {
    
        Siswa baru = new Siswa();
        Rayhan baru2 = new Rayhan();
        
        baru.setNama("Rizky");
        baru.getNama();
        baru.setAlamat("Jl. Arjuna 1 no 6");
        baru.getAlamat();
        baru.setUmur(16);
        baru.getAlamat();
        baru.setBerat(40);
        baru.getBerat();
        baru.setHp("073475345");
        baru.getHp();
        baru.setHobi("Main Game");
        baru.getHobi();
        
        System.out.println("Nama = "+baru.getNama());
        System.out.println("Umur = "+baru.getUmur());
        System.out.println("Alamat = "+baru.getAlamat());
        System.out.println("Berat = "+baru.getBerat());
        System.out.println("Hobi = "+baru.getHobi());
        System.out.println("No HP = "+baru.getHp());
        System.out.println("===============================");
        //=====================================//
        
        baru2.setNama("Rayhan");
        baru2.getNama();
        baru2.setAlamat("Jl. Pabean");
        baru2.getAlamat();
        baru2.setUmur(16);
        baru2.getAlamat();
        baru2.setBerat(60);
        baru2.getBerat();
        baru2.setHp("02342355");
        baru2.getHp();
        baru2.setHobi("Main Game");
        baru2.getHobi();
        
        System.out.println("Nama = "+baru2.getNama());
        System.out.println("Umur = "+baru2.getUmur());
        System.out.println("Alamat = "+baru2.getAlamat());
        System.out.println("Berat = "+baru2.getBerat());
        System.out.println("Hobi = "+baru2.getHobi());
        System.out.println("No HP = "+baru2.getHp());
        
        
    }
    
}
