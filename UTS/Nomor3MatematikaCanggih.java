//Nama  : Tiara Diba
//NIM   : 11200930000017
//Kelas : 2A SI'20
//Ujian Tengah Semester

package UTS;

public class Nomor3MatematikaCanggih {
    int Tambah;
    int Kali;
    int Modulus;
    
    void Pertambahan(int a, int b){
        Tambah = a + b;
        System.out.println("a + b = "+ Tambah);
    }
    
    int getTambah(){
        return Tambah;
    }
    
    void Perkalian(int a, int b){
        Kali = a * b;
        System.out.println("a * b = "+ Kali);
    }
    
     int getKali(){
        return Kali;
    }
     
     void Modulus(int a, int b){
         Modulus = a % b;
         System.out.println("a % b = "+ Modulus);
    }
     
     int getModulus(){
         return Modulus;
     }
}
