package tugaspraktikumpemlan.tugas2;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static int count = 0; // menyimpan jumlah objek yang dibuat

    // construktor default
    public Student() {
        name = "";
        address = "";
        age = 0;
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0;
        count++;
    }

    // construktor overload dengan parameter nama, alamat, dan umur
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0;
        count++;
    }

    // construktor overload dengan parameter nama, alamat, umur, dan nilai mata pelajaran
    public Student(String n, String a, int ag, double math, double science, double english) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        scienceGrade = science;
        englishGrade = english;
        count++;
    }

    public void setName(String n) { 
        name = n; 
    }
    public void setAddress(String a) { 
        address = a; 
    }
    public void setAge(int ag) {
         age = ag; 
        }
    public void setMath(double math) {
         mathGrade = math; 
        }
    public void setEnglish(double english) {
         englishGrade = english; 
        }
    public void setScience(double science) {
         scienceGrade = science; 
        }

    private double getAverage() {// untuk mencari rata-rata nilai mata pelajaran
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    public boolean statusAkhir() {// menentukan apakah siswa remidi atau tidak
        return getAverage() >= 61;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("Beralamat di " + address);
        System.out.println("Berumur " + age);
        System.out.println("Mempunyai nilai rata-rata: " + getAverage());
        System.out.println("Status kelulusan: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }

    // method untuk menampilkan jumlah objek yang telah dibuat
    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang dibuat: " + count);
    }
}
