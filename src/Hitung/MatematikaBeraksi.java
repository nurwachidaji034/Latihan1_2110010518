package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika Aji = new Matematika(0, 58); // Ganti 23 dengan dua digit terakhir NPM Anda
        
        double hasilPenjumlahan = Aji.setPenjumlahan();
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        
        double hasilPengurangan = Aji.setPengurangan();
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        
        double hasilPerkalian = Aji.setPerkalian();
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        
        double hasilPembagian = Aji.setPembagian();
        System.out.println("Hasil Pembagian: " + hasilPembagian);
    }
}