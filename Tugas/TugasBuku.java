package Tugas;
public class TugasBuku {
        private String Judul;
        private String Penulis;
        private String Tahun;
        private String Kategori;
        

        public void setJudul (String JudulBuku) {
            this.Judul = JudulBuku;
        }
        
        public void setPenulis (String PenulisBuku) {
            this.Penulis = PenulisBuku;
        }

        public void setKategori (String KategoriBuku) {
            this.Kategori = KategoriBuku;
        }

        public void setTahun (String TahunTerbit) {
            this.Tahun = TahunTerbit;
        }

        public void display() {
            System.out.println("Judul Buku\t = " + this.Judul);
            System.out.println("Penulis Buku\t = " + this.Penulis);
            System.out.println("Kategori Buku\t = " + this.Kategori);
            System.out.println("Tahun Terbit\t = " + this.Tahun);
            System.out.println();
        }
    }
    
     