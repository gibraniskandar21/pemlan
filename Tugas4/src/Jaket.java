public class Jaket {
    Byte pilih;
    int harga, jumlah;
    final int jaketA = 100000, jaketB = 125000, jaketC = 175000;
    public Jaket (Byte pilih, int jumlah){
        this.pilih = pilih;
        this.jumlah = jumlah;
    }
    void hargaJaketA(){
        if (jumlah>100)
            harga = jumlah * 95000;
        else
            harga = jaketA;
    }
    void hargaJaketB(){
        if (jumlah>100)
            harga = jumlah * 120000;
        else
            harga = jaketB;
    }
    void hargaJaketC(){
        if (jumlah>100)
            harga = jumlah * 160000;
        else
            harga = jaketC;
    }

    void pesanan(){
        String tipeJaket = null;
        if (pilih == 1)
            tipeJaket = "Jaket A";
        else if (pilih == 2) {
            tipeJaket = "Jaket B";
        } else if (pilih == 3) {
            tipeJaket = "Jaket C";
        }

        System.out.println("Jenis jaket        : " + tipeJaket);
        System.out.println("Jumlah pesanan     : " + jumlah + " pcs");
        System.out.println("Harga satuan       : Rp" + harga);
        System.out.println("Total harga        : Rp" + harga * jumlah);
    }
    void display(){
        if (pilih == 1) {
            hargaJaketA();
            pesanan();
        }
        else if (pilih == 2) {
            hargaJaketB();
            pesanan();
        }
        else if (pilih == 3) {
            hargaJaketC();
            pesanan();
        }
    }
}