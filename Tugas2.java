import java.util.Scanner;

public class Tugas2 {
    public static void bentukPersegi(Scanner input) {
        System.out.println("Masukkan sisi persegi:");
        double sisi = input.nextDouble();
        double luas = luasPersegi(sisi);
        double keliling = kelilingPersegi(sisi);
        System.out.println("Luas persegi adalah: " + luas);
        System.out.println("Keliling persegi adalah: " + keliling);
    }

    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static void hitungPersegiPanjang(Scanner input) {
        System.out.println("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        double luas = luasPersegiPanjang(panjang, lebar);
        double keliling = kelilingPersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("Keliling persegi panjang adalah: " + keliling);
    }

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void hitungLingkaran(Scanner input) {
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = luasLingkaran(jariJari);
        double keliling = kelilingLingkaran(jariJari);
        System.out.println("Luas lingkaran adalah: " + luas);
        System.out.println("Keliling lingkaran adalah: " + keliling);
    }

    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungPersegiPanjang(input);
                break;
            case 2:
                hitungPersegiPanjang(input);
                break;
            case 3:
                hitungLingkaran(input);
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan pilih 1, 2, atau 3.");
        }
    }
}

