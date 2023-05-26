public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KueJadi("Kue Lapis legit", 2000, 3);
        kueArray[1] = new KueJadi("Kue Klepon", 3000, 8);
        kueArray[2] = new KueJadi("Kue Lumpur", 5000, 17);
        kueArray[3] = new KueJadi("Kue Putu Ayu", 3000, 5);
        kueArray[4] = new KueJadi("Kue Dadar gulung", 7000, 20);
        kueArray[5] = new KueJadi("Kue Serabi", 8000, 7);
        kueArray[6] = new KueJadi("Kue Lidah kucing", 6000, 10);
        kueArray[7] = new KueJadi("Kue Nagasari", 4000, 4);
        kueArray[8] = new KueJadi("Kue Talam ubi", 4000, 2);
        kueArray[9] = new KueJadi("Kue Onde-onde", 2000, 9);
        kueArray[10] = new KuePesanan("Kue Tumpi", 1000, 1);
        kueArray[11] = new KuePesanan("Kue Rangi", 2500, 3);
        kueArray[12] = new KuePesanan("Kue Risoles", 5500, 5);
        kueArray[13] = new KuePesanan("Kue Cucur", 7000, 9);
        kueArray[14] = new KuePesanan("Kue Lumpur merah", 2000, 2);
        kueArray[15] = new KuePesanan("Kue Wajik", 10000, 6);
        kueArray[16] = new KuePesanan("Kue Talam jagung", 12000, 5);
        kueArray[17] = new KuePesanan("Kue Lemper", 4500, 7);
        kueArray[18] = new KuePesanan("Kue Getas", 7000, 2);
        kueArray[19] = new KuePesanan("Kue Kembang goyang", 7500, 3);

        System.out.println("Daftar Kue:");
        for (Kue kue : kueArray) {
            if (kue != null) {
                if (kue instanceof KuePesanan) {
                    System.out.println("Kue Pesanan: " + kue.toString());
                } else if (kue instanceof KueJadi) {
                    System.out.println("Kue Jadi: " + kue.toString());
                }
            }
        }
        System.out.println();

        double totalHargaSemuaKue = 0.0;
        for (Kue kue : kueArray) {
            if (kue != null) {
                totalHargaSemuaKue += kue.hitungHarga();
            }
        }

        double totalHargaKuePesanan = 0.0;
        double totalBeratKuePesanan = 0.0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }

        double totalHargaKueJadi = 0.0;
        double totalJumlahKueJadi = 0.0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }

        double hargaTerbesar = 0.0;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }


        System.out.println("Total Harga Semua Kue\t: Rp" + totalHargaSemuaKue);
        System.out.println("Total Harga Kue Pesanan\t: Rp" + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan\t: " + totalBeratKuePesanan + "gr");
        System.out.println("Total Harga Kue Jadi\t: Rp" + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi\t: " + totalJumlahKueJadi);
        System.out.println("Harga Akhir Termahal\t: " + kueTerbesar);

    }
}
