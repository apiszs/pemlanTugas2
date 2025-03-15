import java.util.Scanner;
import tugaspraktikumpemlan.tugas2.Student;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sigma = new Scanner(System.in);

        // memasukkan jumlah siswa sesuai input user
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = sigma.nextInt();
        Student[] siswa = new Student[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data siswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sigma.next();

            System.out.print("Alamat: ");
            String alamat = sigma.next();

            System.out.print("Umur: ");
            int umur = sigma.nextInt();

            System.out.print("Nilai Matematika: ");
            double math = sigma.nextDouble();

            System.out.print("Nilai Sains: ");
            double science = sigma.nextDouble();

            System.out.print("Nilai Inggris: ");
            double english = sigma.nextDouble();

            // menggunakan konstruktor dengan parameter lengkap untuk memasukkan nilai untuk siswa lainnya
            siswa[i] = new Student(nama, alamat, umur, math, science, english);
        }

        // menampilkan data siswa
        System.out.println("\nData Siswa:");
        for (Student s : siswa) {
            System.out.println("===================");
            s.displayMessage();
        }

        // menampilkan jumlah objek siswa yang telah dibuat
        System.out.println("===================");
        Student.jumlahObjek();

        sigma.close();
    }
}
