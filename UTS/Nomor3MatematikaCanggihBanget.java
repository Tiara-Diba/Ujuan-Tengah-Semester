//Nama  : Tiara Diba
//NIM   : 11200930000017
//Kelas : 2A SI'20
//Ujian Tengah Semester
package UTS;

public class Nomor3MatematikaCanggihBanget extends Nomor3MatematikaCanggih {
      int TambahEmpat;
    void pertambahanEmpat(int a, int b, int c, int d){
        TambahEmpat = a+b+c+d;
        System.out.println("a + b + c + d = " + TambahEmpat);
    }
    int getTambahEmpat(){
    return TambahEmpat;
    }
}
