package Tugas;

import java.util.Scanner;
public class TugasBukuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String bukuTeknologi[][] = {
                {"Pengantar Teknologi Informasi", "Buhori Muslim", "2017"},
                {"Metode Penelitian Teknik Informatika", "Ade Johar Maturidi", "2019"},
                {"Komputer Cerdas Untuk Mahasiswa Teknik Informatika", "Nur Nafiiyah", "2017"},
                {"The Shallows", "Nicholas Carr", "2010"},
                {"The Great Shifting", "Rhenald Kasali", "2018"}
            };

            String bukuFilsafat[][] = {
                {"Studi Dasar Filsafat", "Tazkiyah Basaad", "2018"},
                {"Filsafat Pendidikan Operasional", "Aswasulasikin", "2018"},
                {"Filsafat Pendidikan Vokasi", "Soetyono Iskandar dan Mardi Syahir", "2017"},
                {"Filsafat Ilmu : Hakikat Mencari Pengetahuan", "Ahmad Taufik Nasution", "2016"},
                {"Filsafat Pendidikan Akhlak", "Sehat Sultoni Dalimunthe", "2016"}
            };

            String bukuSejarah[][] = {
                {"Sapiens", "Dr. Yuval Noah Harari", "2011"},
                {"China: Warisan Klasik dan Daya Dinamis yang Menggetarkan Dunia", "Jusra Chandra", "2020"},
                {"Sejarah Dunia yang Disembunyikan", "Jonathan Black", "2007"},
                {"Sejarah Lengkap Perang Dunia 1", "Alfi Arifian", "2020"},
                {"Dunia Kuno Empat Benua", "Anisa Septianingrum", "2017"}
            };

            String bukuAgama[][] = {
                {"Nalar Tasawuf Sebagai Revolusi Pendidikan Islam", "Istania Widayati Hidayati", "2019"},
                {"Paradigma Masterpiece Keuangan Islam dan Aplikasinya di Perbankan Syariah", "Muhammad Hadi", "2019"},
                {"Islam Rahmatan Lil’alamin: Antologi Puisi Guru dan Siswa", "Ahmad Taufik Nasution", "2019"},
                {"Komunikasi dan Dakwah Islam", "Abdul Pirol", "2018"},
                {"Murabahah: Konsep dan Aplikasinya Dalam Perbankan Islam", "Mukhlishin", "2018"}
            };

            String bukuPsikologi[][] = {
                {"Thinking Fast & Slow", "Daniel Kahneman", "2011"},
                {"The Art of Choosing", "Sheena Iyengar", "2010"},
                {"Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa", "James Clear", "2018"},
                {"The Selfish Gene", "Richard Dawkins", "1976"},
                {"I Want to Die But I Want to Eat Tteopokki", "Baek Se Hee", "2022"}
            };

            String bukuPolitik[][] = {
                {"Dasar-Dasar Ilmu Politik", "Miriam Budiardjo", "1972"},
                {"Politik Hukum di Indonesia", "Prof. Dr. Moh. Mahfud MD", "2014"},
                {"Etika Politik", "Franz Magnis Suseno", "1988"},
                {"Il Principe", "Niccolo Machiavelli", "1532"},
                {"The Social Contract", "Jean-Jacques Rousseau", "1762"}
            };

            String bukuFiksi[][] = {
                {"Harry Potter · Philosopher's Stone", "J.K. Rowling", "1997"},
                {"Dracula", "Bram Stoker", "1897"},
                {"Sherlock Holmes", "Arthur Conan Doyle", "1892"},
                {"Laskar Pelangi", "Andrea Hirata", "2005"},
                {"Bumi Manusia", "Pramoedya Ananta Toer", "1980"}
            };

            int pilihan = 8;

            do {
                System.out.println(" Pilih kategori buku yang tersedia ");
                System.out.println(" 1. Teknologi");
                System.out.println(" 2. Filsafat");
                System.out.println(" 3. Sejarah");
                System.out.println(" 4. Agama");
                System.out.println(" 5. Psikologi");
                System.out.println(" 6. Politik");
                System.out.println(" 7. Fiksi");
                System.out.print(" Pilihan : ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1: displayed(bukuTeknologi, "Teknologi"); break;
                    case 2: displayed(bukuFilsafat, "Filsafat"); break;
                    case 3: displayed(bukuSejarah, "Sejarah"); break;
                    case 4: displayed(bukuAgama, "Agama"); break;
                    case 5: displayed(bukuPsikologi, "Psikologi"); break;
                    case 6: displayed(bukuPolitik, "Politik"); break;
                    case 7: displayed(bukuFiksi, "Fiksi"); break;
                    default: System.out.println("Tidak ada di pilihan"); break;
                }
            } while (pilihan != 9);

            input.close();
        }



        static void displayed(String attribute[][], String katBuk){
            TugasBuku buku = new TugasBuku();
            buku.setKategori(katBuk);
            for (int i = 0; i < attribute.length; i++ ) {
                buku.setJudul(attribute[i][0]);
                buku.setPenulis(attribute[i][1]);
                buku.setTahun(attribute[i][2]);
                buku.display();
            }

        }
    }

