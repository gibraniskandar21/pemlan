import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------- Toko Labkomdas ----------------");
        System.out.println("Pilih tipe jaket dibawah ini");
        System.out.println("1. Jaket A = Rp100.000,00-");
        System.out.println("2. Jaket B = Rp125.000,00-");
        System.out.println("3. Jaket C = Rp175.000,00-");
        System.out.print("Masukkan kode tipe jaket yang anda ingin pesan      : ");
        Byte pilihan = in.nextByte();
        System.out.print("Masukkan jumlah jaket yang ingin dipesan            : ");
        int jumlah = in.nextInt();
        System.out.println("--------------------------------------------------");
        Jaket pesanan = new Jaket(pilihan, jumlah);
        pesanan.display();
    }
}
