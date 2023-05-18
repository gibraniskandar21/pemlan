package Tugas2;

public class TugasBuku {
        private String Judul;
        private String Penulis;
        private String Tahun;
        private String Kategori;
        private String Sinopsis;
        
        public TugasBuku(String Judul, String Penulis, String Tahun, String Kategori, String Sinopsis) {
            this.Judul = Judul;
            this.Penulis = Penulis;
            this.Tahun = Tahun;
            this.Kategori = Kategori;
            this.Sinopsis = Sinopsis;
}

public String getJudul(){
    return Judul;
}

private int hitungKata() {
    String[] words = Sinopsis.split("\\s+");
    return words.length;
}

public TugasBuku copy(){
    return new TugasBuku(Judul, Penulis, Tahun, Kategori, Sinopsis);
}

        public void printDetail() {
            System.out.println("Judul Buku\t = " + Judul);
            System.out.println("Penulis Buku\t = " + Penulis);
            System.out.println("Kategori Buku\t = " + Kategori);
            System.out.println("Tahun Terbit\t = " + Tahun);
            System.out.println("Sinopsis\t = " + Sinopsis);
            System.out.println("Jumlah kata\t = " + hitungKata());
        }
  
        }
 
    
     