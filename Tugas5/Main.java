public class Main {
    public static void main(String[] args) {
        // Manusia
        Manusia manusia1 = new Manusia("Badil", "534623", true, true);
        System.out.println(manusia1);
        System.out.println("====================================================");
        Manusia manusia2 = new Manusia("Roxanne", "534245", false, true);
        System.out.println(manusia2);
        System.out.println("====================================================");
        Manusia manusia3 = new Manusia("Poden", "463454", true, false);
        System.out.println(manusia3);
        System.out.println("====================================================");

        // Mahasiswa
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("225150707111078", 2.89, "Bambang", "234232", true, false);
        System.out.println(mahasiswa1);
        System.out.println("====================================================");
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("225153453920480", 3.4, "Indri", "308454", false, false);
        System.out.println(mahasiswa2);
        System.out.println("====================================================");
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("225150707111078", 3.89, "Gibran", "234232", true, false);
        System.out.println(mahasiswa3);
        System.out.println("====================================================");

        //Pekerja
        Pekerja pekerja1 = new Pekerja(3000, 2020, 1, 23, 2, "Zeus", "304954", true, true);
        System.out.println(pekerja1);
        System.out.println("====================================================");
        Pekerja pekerja2 = new Pekerja(3000, 2013, 4, 16, 0, "Mahrez", "564345", true, false);
        System.out.println(pekerja2);
        System.out.println("====================================================");
        Pekerja pekerja3 = new Pekerja(3000, 2002, 2, 10, 10, "Boncos", "134534", false, false);
        System.out.println(pekerja3);
        System.out.println("====================================================");
        Manager manager1 = new Manager("Residence", 7500, 2007, 1, 2, 0, "Bayu", "135346", true, false);
        System.out.println(manager1);
        System.out.println("====================================================");
    }
}


