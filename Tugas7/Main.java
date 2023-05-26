import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Informasi Karyawan ============");
        System.out.print("Masukkan nama             : ");
        String name = scanner.nextLine();

        System.out.print("Masukkan nomor registrasi : ");
        int registrationNumber = scanner.nextInt();

        System.out.print("Masukkan gaji per bulan   : Rp");
        int salaryPerMonth = scanner.nextInt();

        System.out.print("Masukkan jumlah invoice   : ");
        int numInvoices = scanner.nextInt();

        System.out.println("");
        System.out.println("============ List Produk ============");
        Invoice[] invoices = new Invoice[numInvoices];
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Masukkan informasi invoice ke-" + (i + 1) + ":");
            System.out.print("Nama produk: ");
            String productName = scanner.next();

            System.out.print("Jumlah produk: ");
            int quantity = scanner.nextInt();

            System.out.print("Harga per item: Rp");
            int pricePerItem = scanner.nextInt();
    
            System.out.println("");

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        Employee employee = new Employee(registrationNumber, name, salaryPerMonth, invoices);
        System.out.println("================================");
        System.out.println("");
        System.out.println("Informasi Karyawan");
        System.out.println("Nomor Registrasi    : " + employee.getRegistrationNumber());
        System.out.println("Nama                : " + employee.getName());
        System.out.println("Gaji per Bulan      : Rp" + employee.getSalaryPerMonth());
        System.out.println("");
        System.out.println("================================");
        System.out.println("");

        System.out.println("Detail Belanjaan:");
        Invoice[] employeeInvoices = employee.getInvoices();
        for (int i = 0; i < employeeInvoices.length; i++) {
            Invoice invoice = employeeInvoices[i];
            System.out.println("Invoice ke-" + (i + 1));
            System.out.println("Nama Produk     : " + invoice.getProductName());
            System.out.println("Jumlah          : " + invoice.getQuantity() + " Pcs");
            System.out.println("Harga per Item  : Rp" + invoice.getPricePerItem());
            System.out.println("Total           : Rp" + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("Total gaji setelah potongan adalah Rp" + employee.getPayableAmount());

        scanner.close();
    }
}