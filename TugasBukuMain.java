package Tugas2;

import java.util.Scanner;
public class TugasBukuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilih;

            TugasBuku teknologi1 = new TugasBuku("Pengantar Teknologi Informasi", "Buhori Muslim", "2017", "Teknologi", "Sejak jaman nenek moyang dahulu proses pengolahan data telah dilakukan, dengan mempergunakan perangkat sangat sederhana sampai selanjutnya ditemukanlah alat-alat mekanis dan elektronis untuk membantu melakukan perhitungan serta pengolahan data agar di peroleh hasil lebih cepat, tepat, tidak mengenal lelah dan dapat menyimpan data yang di olahnya di kenal dengan komputer.");
            TugasBuku teknologicopy1 = teknologi1.copy();
            TugasBuku teknologi2 = new TugasBuku("Metode Penelitian Teknik Informatika", "Ade Johar Maturidi", "2019", "Teknologi", "Buku ini membantu mahasiswa teknik informatika dalam mempelajari metode-metode penelitian yang relevan dengan bidang teknik informatika, meliputi langkah-langkah penelitian, teknik pengumpulan data, analisis data, dan pembuatan laporan penelitian.");
            TugasBuku teknologicopy2 = teknologi2.copy();
            TugasBuku teknologi3 = new TugasBuku("Komputer Cerdas Untuk Mahasiswa Teknik Informatika", "Nur Nafiiyah", "2017", "Teknologi", " Buku ini membahas konsep dasar dan aplikasi komputer cerdas dalam konteks teknik informatika, membantu mahasiswa memahami konsep-konsep penting seperti kecerdasan buatan, pemrosesan bahasa alami, dan sistem pakar.");
            TugasBuku teknologicopy3 = teknologi3.copy();
            TugasBuku teknologi4 = new TugasBuku("The Shallows", "Nicholas Carr", "2010", "Teknologi", "keberlimpahan informasi di internet tak membuat kita kian pintar. Justru sebaliknya. Kebiasaan membaca artikel atau berita serba pendek membuat kemampuan kita tekun membaca buku hingga tuntas berangsur hilang.");
            TugasBuku teknologicopy4 = teknologi4.copy();
            TugasBuku teknologi5 = new TugasBuku("The Great Shifting", "Rhenald Kasali", "2018", "Teknologi", "Buku ini membahas fenomena perubahan sosial, ekonomi, dan teknologi yang signifikan di era digital. Rhenald Kasali menjelaskan bagaimana perubahan ini mempengaruhi pola bisnis, pekerjaan, dan kehidupan sehari-hari, serta memberikan perspektif dan strategi untuk menghadapinya.");
            TugasBuku teknologicopy5 = teknologi5.copy();
        
            TugasBuku filsafat1 = new TugasBuku("Studi Dasar Filsafat", "Tazkiyah Basaad", "2018", "Filsafat", "Sebuah pengantar kepada konsep-konsep dasar dalam filsafat, mengeksplorasi ide-ide dan konsep-konsep kunci dalam bidang ini.");
            TugasBuku filsafat2 = new TugasBuku("Filsafat Pendidikan Operasional", "Aswasulasikin", "2018", "Filsafat", "Mempelajari aspek-aspek operasional dalam filsafat pendidikan, buku ini membahas pendekatan dan strategi praktis untuk pengajaran dan pembelajaran yang efektif.");
            TugasBuku filsafat3 = new TugasBuku("Filsafat Pendidikan Vokasi", "Soetyono Iskandar dan Mardi Syahir", "2017", "Filsafat", "Eksplorasi komprehensif mengenai filsafat pendidikan vokasional, membahas prinsip-prinsip, tujuan, dan pentingnya dalam mempersiapkan individu untuk karier-karier tertentu.");
            TugasBuku filsafat4 = new TugasBuku("Filsafat Ilmu : Hakikat Mencari Pengetahuan", "Ahmad Taufik Nasution", "2016", "Filsafat", "Mendalami hakikat pengetahuan dan proses pencarian pengetahuan, buku ini menjelajahi dasar-dasar filsafat sains dan upaya mencari kebenaran.");
            TugasBuku filsafat5 = new TugasBuku("Filsafat Pendidikan Akhlak", "Sehat Sultoni Dalimunthe", "2016", "Filsafat", "Fokus pada filsafat pendidikan moral, buku ini membahas prinsip-prinsip dan nilai-nilai yang diperlukan untuk mengembangkan perilaku etis dan pembentukan karakter individu.");
            
            TugasBuku sejarah1 = new TugasBuku("Sapiens", "Dr. Yuval Noah Harari", "2011", "Sejarah", "Buku ini menyajikan sebuah panorama sejarah manusia mulai dari zaman prasejarah hingga masa depan yang diwarnai oleh revolusi-revolusi budaya, teknologi, dan pemikiran yang mengubah jalannya peradaban.");
            TugasBuku sejarah2 = new TugasBuku("China: Warisan Klasik dan Daya Dinamis yang Menggetarkan Dunia", "Jusra Chandra", "2020", "Sejarah", "Melalui buku ini, pembaca akan mempelajari tentang kekayaan sejarah dan budaya China, serta bagaimana negara tersebut menjadi kekuatan global yang memiliki pengaruh kuat di berbagai bidang.");
            TugasBuku sejarah3 = new TugasBuku("Sejarah Dunia yang Disembunyikan", "Jonathan Black", "2007", "Sejarah", "Buku ini mengungkap fakta-fakta sejarah yang jarang diketahui, memperkenalkan pembaca pada sisi gelap dan misteri peradaban manusia yang jarang terungkap.");
            TugasBuku sejarah4 = new TugasBuku("Sejarah Lengkap Perang Dunia 1", "Alfi Arifian", "2020", "Sejarah", "Buku ini merangkum secara komprehensif peristiwa-peristiwa penting, faktor-faktor pemicu, serta dampak dari Perang Dunia I yang mengguncang dunia dan membentuk geopolitik global.");
            TugasBuku sejarah5 = new TugasBuku("Dunia Kuno Empat Benua", "Anisa Septianingrum", "2017", "Sejarah", "Melalui penjelajahan yang mendalam, buku ini membawa pembaca menjelajahi sejarah kuno di empat benua, mengungkap peradaban-peradaban yang membangun fondasi peradaban manusia seperti yang kita kenal saat ini.");
            
            TugasBuku agama1 = new TugasBuku("Nalar Tasawuf Sebagai Revolusi Pendidikan Islam", "Istania Widayati Hidayati", "2019", "Agama", "Buku ini mengajukan pandangan tentang pentingnya pengintegrasian nalar tasawuf dalam sistem pendidikan Islam sebagai bagian dari sebuah revolusi untuk mencapai pendidikan yang holistik dan berkesinambungan.");
            TugasBuku agama2 = new TugasBuku("Paradigma Masterpiece Keuangan Islam dan Aplikasinya di Perbankan Syariah", "Muhammad Hadi", "2019", "Agama", "Buku ini membahas konsep keuangan Islam dan penerapannya dalam sistem perbankan syariah, membuka wawasan mengenai paradigma baru dalam pengelolaan keuangan yang berlandaskan prinsip-prinsip Islam.");
            TugasBuku agama3 = new TugasBuku("Islam Rahmatan Lil’alamin: Antologi Puisi Guru dan Siswa", "Ahmad Taufik Nasution", "2019", "Agama", "Buku ini merupakan sebuah antologi puisi yang menggambarkan tema-tema keindahan Islam, kasih sayang, dan toleransi, yang ditulis oleh guru-guru dan siswa-siswa sebagai ungkapan cinta mereka terhadap agama dan ajaran Islam.");
            TugasBuku agama4 = new TugasBuku("Komunikasi dan Dakwah Islam", "Abdul Pirol", "2018", "Agama", "Buku ini membahas pentingnya komunikasi yang efektif dalam dakwah Islam, menjelaskan prinsip-prinsip dasar komunikasi dalam menyampaikan pesan-pesan agama kepada masyarakat.");
            TugasBuku agama5 = new TugasBuku("Murabahah: Konsep dan Aplikasinya Dalam Perbankan Islam", "Mukhlishin", "2018", "Agama", "Buku ini mengulas konsep murabahah dan penerapannya dalam sistem perbankan Islam, membantu pembaca memahami mekanisme transaksi dan prinsip-prinsip yang melandasi praktik keuangan berdasarkan prinsip syariah.");
            
            TugasBuku psikologi1 = new TugasBuku("Thinking Fast & Slow", "Daniel Kahneman", "2011", "Psikologi", "Buku ini menggali mekanisme pikiran manusia, menjelaskan peran sistem pikiran cepat dan sistem pikiran lambat dalam pengambilan keputusan, serta dampaknya terhadap pemahaman, penilaian, dan perilaku manusia.");
            TugasBuku psikologi2 = new TugasBuku("The Art of Choosing", "Sheena Iyengar", "2010", "Psikologi", "Melalui buku ini, Sheena Iyengar membahas proses memilih yang kompleks dalam kehidupan kita, menggali faktor-faktor yang memengaruhi pilih kita, serta memberikan wawasan tentang bagaimana kita dapat membuat keputusan yang lebih baik.");
            TugasBuku psikologi3 = new TugasBuku("Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa", "James Clear", "2018", "Psikologi", "Buku ini mengungkap prinsip-prinsip yang dapat membantu mengubah kebiasaan-kebiasaan kecil dalam kehidupan sehari-hari untuk mencapai perubahan besar dan hasil yang luar biasa.");
            TugasBuku psikologi4 = new TugasBuku("The Selfish Gene", "Richard Dawkins", "1976", "Psikologi", "Dalam buku ini, Richard Dawkins menjelaskan teori tentang evolusi dari sudut pandang gen, menjelaskan bagaimana gen-gen bersaing untuk kelangsungan hidupnya sendiri dan berdampak pada sifat-sifat yang diturunkan dalam populasi.");
            TugasBuku psikologi5 = new TugasBuku("I Want to Die But I Want to Eat Tteopokki", "Baek Se Hee", "2022", "Psikologi", "Buku ini adalah sebuah kumpulan cerita yang mengeksplorasi tema kehidupan, harapan, perjuangan, dan pertumbuhan melalui perjalanan emosional para karakternya, termasuk dilema dan keinginan yang kompleks dalam hidup.");

            TugasBuku politik1 = new TugasBuku("Dasar-Dasar Ilmu Politik", "Miriam Budiardjo", "1972", "Politik", "Buku ini membahas konsep-konsep dasar dalam ilmu politik, menjelaskan tentang sistem politik, kekuasaan, partai politik, pemilu, dan berbagai aspek lain yang terkait dengan studi politik.");
            TugasBuku politik2 = new TugasBuku("Politik Hukum di Indonesia", "Prof. Dr. Moh. Mahfud MD", "2014", "Politik", "Buku ini mengulas hubungan antara politik dan hukum di Indonesia, membahas peran hukum dalam pembentukan kebijakan politik, penegakan hukum, dan tantangan dalam menjaga keadilan politik di negara ini.");
            TugasBuku politik3 = new TugasBuku("Etika Politik", "Franz Magnis Suseno", "1988", "Politik", "Buku ini membahas aspek etika dalam konteks politik, menyoroti pertanyaan-pertanyaan moral yang muncul dalam politik, serta menjelaskan prinsip-prinsip moral yang harus dijadikan pedoman dalam tindakan politik.");
            TugasBuku politik4 = new TugasBuku("Il Principe", "Niccolo Machiavelli", "1532", "Politik", "uku ini adalah sebuah karya klasik yang membahas tentang politik dan kepemimpinan. Machiavelli menjelaskan pandangan realistisnya tentang pemerintahan dan memberikan nasihat-nasihat politik yang kontroversial.");
            TugasBuku politik5 = new TugasBuku("The Social Contract", "Jean-Jacques Rousseau", "1762", "Politik", "Buku ini membahas konsep kontrak sosial, di mana Rousseau mengajukan gagasan bahwa kekuasaan politik harus berasal dari kesepakatan sukarela antara individu-individu dalam masyarakat, dan mengeksplorasi implikasi politik dan sosial dari gagasan tersebut.");
            
            TugasBuku fiksi1 = new TugasBuku("Harry Potter · Philosopher's Stone", "J.K. Rowling", "1997", "Fiksi", "Buku pertama dalam seri Harry Potter, mengisahkan petualangan seorang anak yatim piatu bernama Harry Potter yang menemukan bahwa ia sebenarnya seorang penyihir dan masuk ke dunia sihir yang penuh dengan keajaiban, persahabatan, dan ancaman gelap.");
            TugasBuku fiksi2 = new TugasBuku("Dracula", "Bram Stoker", "1897", "Fiksi", "Buku ini adalah novel gothic yang ikonik, mengisahkan kisah Count Dracula yang menakutkan, seorang vampir kuno yang berusaha menyebar teror dan mengejar korban di Transylvania dan London.");
            TugasBuku fiksi3 = new TugasBuku("Sherlock Holmes", "Arthur Conan Doyle", "1892", "Fiksi", "Kumpulan cerita detektif yang menampilkan Sherlock Holmes, seorang detektif brilian dengan kemampuan analitis yang luar biasa. Holmes memecahkan berbagai misteri yang menantang dengan bantuan temannya, Dr. John Watson.");
            TugasBuku fiksi4 = new TugasBuku("Laskar Pelangi", "Andrea Hirata", "2005", "Fiksi", "Buku ini adalah kisah tentang perjuangan sekelompok anak muda dari desa pesisir Belitong dalam menghadapi keterbatasan dan kesulitan dalam mendapatkan pendidikan, tetapi tetap menjaga semangat dan keceriaan hidup mereka.");
            TugasBuku fiksi5 = new TugasBuku("Bumi Manusia", "Pramoedya Ananta Toer", "1980", "Fiksi", "Buku pertama dalam tetralogi Buru Quartet, menggambarkan kehidupan Minke, seorang pribumi Jawa pada masa penjajahan Belanda, yang berusaha memperjuangkan hak-haknya dan menghadapi konflik sosial dan politik yang kompleks di masa kolonial.");
            

        teknologicopy1.printDetail();

        do {
            System.out.println("List Kategori Buku");
            System.out.println("1. Teknologi");
            System.out.println("2. Filosofi");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("8. Keluar");
            System.out.print("Silahkan Pilih Kategori Buku: ");
            pilih = input.nextLine();
            System.out.println(" ");

            switch (pilih) {
                case "1":
                    System.out.println("Teknologi");
                    System.out.println("1. " + teknologi1.getJudul());
                    System.out.println("2. " + teknologi2.getJudul());
                    System.out.println("3. " + teknologi3.getJudul());
                    System.out.println("4. " + teknologi4.getJudul());
                    System.out.println("5. " + teknologi5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihTeknologi = input.nextLine();
                    System.out.println(" ");
                    if (pilihTeknologi.equals("1")) {
                        teknologi1.printDetail();
                    } else if (pilihTeknologi.equals("2")) {
                        teknologi2.printDetail();;
                    } else if (pilihTeknologi.equals("3")) {
                        teknologi3.printDetail();
                    } else if (pilihTeknologi.equals("4")) {
                        teknologi4.printDetail();;
                    }  else if (pilihTeknologi.equals("5")) {
                        teknologi5.printDetail();;
                    }
                     else {
                        System.out.println("invalid.");
                    }
                    break;
                case "2":
                    System.out.println("Filosofi");
                    System.out.println("1. " + filsafat1.getJudul());
                    System.out.println("2. " + filsafat2.getJudul());
                    System.out.println("3. " + filsafat3.getJudul());
                    System.out.println("4. " + filsafat4.getJudul());
                    System.out.println("5. " + filsafat5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihFilsafat = input.nextLine();
                    System.out.println(" ");
                    if (pilihFilsafat.equals("1")) {
                        filsafat1.printDetail();
                    } else if (pilihFilsafat.equals("2")) {
                        filsafat2.printDetail();;
                    } else if (pilihFilsafat.equals("3")) {
                        filsafat3.printDetail();
                    } else if (pilihFilsafat.equals("4")) {
                        filsafat4.printDetail();;
                    } else if (pilihFilsafat.equals("5")) {
                        filsafat5.printDetail();;
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                    case "3":
                    System.out.println("Sejarah");
                    System.out.println("1. " + sejarah1.getJudul());
                    System.out.println("2. " + sejarah2.getJudul());
                    System.out.println("3. " + sejarah3.getJudul());
                    System.out.println("4. " + sejarah4.getJudul());
                    System.out.println("5. " + sejarah5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihSejarah = input.nextLine();
                    System.out.println(" ");
                    if (pilihSejarah.equals("1")) {
                        sejarah1.printDetail();
                    } else if (pilihSejarah.equals("2")) {
                        sejarah2.printDetail();
                    } else if (pilihSejarah.equals("3")) {
                        sejarah3.printDetail();
                    } else if (pilihSejarah.equals("4")) {
                        sejarah4.printDetail();
                    } else if (pilihSejarah.equals("5")) {
                        sejarah5.printDetail();
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                    case "4":
                    System.out.println("Agama");
                    System.out.println("1. " + agama1.getJudul());
                    System.out.println("2. " + agama2.getJudul());
                    System.out.println("3. " + agama3.getJudul());
                    System.out.println("4. " + agama4.getJudul());
                    System.out.println("5. " + agama5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihAgama = input.nextLine();
                    System.out.println(" ");
                    if (pilihAgama.equals("1")) {
                        agama1.printDetail();
                    } else if (pilihAgama.equals("2")) {
                        agama2.printDetail();
                    } else if (pilihAgama.equals("3")) {
                        agama3.printDetail();
                    } else if (pilihAgama.equals("4")) {
                        agama4.printDetail();
                    } else if (pilihAgama.equals("5")) {
                        agama5.printDetail();
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                    case "5":
                    System.out.println("Psikologi");
                    System.out.println("1. " + psikologi1.getJudul());
                    System.out.println("2. " + psikologi2.getJudul());
                    System.out.println("3. " + psikologi3.getJudul());
                    System.out.println("4. " + psikologi4.getJudul());
                    System.out.println("5. " + psikologi5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihPsikologi = input.nextLine();
                    System.out.println(" ");
                    if (pilihPsikologi.equals("1")) {
                        psikologi1.printDetail();
                    } else if (pilihPsikologi.equals("2")) {
                        psikologi2.printDetail();
                    } else if (pilihPsikologi.equals("3")) {
                        psikologi3.printDetail();
                    } else if (pilihPsikologi.equals("4")) {
                        psikologi4.printDetail();
                    } else if (pilihPsikologi.equals("5")) {
                        psikologi5.printDetail();
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                    case "6":
                    System.out.println("Politik");
                    System.out.println("1. " + politik1.getJudul());
                    System.out.println("2. " + politik2.getJudul());
                    System.out.println("3. " + politik3.getJudul());
                    System.out.println("4. " + politik4.getJudul());
                    System.out.println("5. " + politik5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihPolitik = input.nextLine();
                    System.out.println(" ");
                    if (pilihPolitik.equals("1")) {
                        politik1.printDetail();
                    } else if (pilihPolitik.equals("2")) {
                        politik2.printDetail();
                    } else if (pilihPolitik.equals("3")) {
                        politik3.printDetail();
                    } else if (pilihPolitik.equals("4")) {
                        politik4.printDetail();
                    } else if (pilihPolitik.equals("5")) {
                        politik5.printDetail();
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                    case "7":
                    System.out.println("Fiksi");
                    System.out.println("1. " + fiksi1.getJudul());
                    System.out.println("2. " + fiksi2.getJudul());
                    System.out.println("3. " + fiksi3.getJudul());
                    System.out.println("4. " + fiksi4.getJudul());
                    System.out.println("5. " + fiksi5.getJudul());
                    System.out.print("Pilih Buku Yang Ingin Dilihat: ");
                    String pilihFiksi = input.nextLine();
                    System.out.println(" ");
                    if (pilihFiksi.equals("1")) {
                        fiksi1.printDetail();
                    } else if (pilihFiksi.equals("2")) {
                        fiksi2.printDetail();
                    } else if (pilihFiksi.equals("3")) {
                        fiksi3.printDetail();
                    } else if (pilihFiksi.equals("4")) {
                        fiksi4.printDetail();
                    } else if (pilihFiksi.equals("5")) {
                        fiksi5.printDetail();
                    } else {
                        System.out.println("invalid.");
                    }
                    break;
                case "8":
                    System.out.println("Terima Kasih Telah Menggunakan Program.");
                    break;
                default:
                    System.out.println("invalid.");
            }

            System.out.println();

        } while (!pilih.equals("8"));
        input.close();
    }
}

