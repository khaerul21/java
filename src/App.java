import java.util.Scanner;

import com.config.MyConfig;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int pilihan;

        System.out.println("-".repeat(40));
        System.out.println("SELAMAT DATANG");
        System.out.println("-".repeat(40));
        System.out.println("1. Read Data");
        System.out.println("2. Insert Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Keluar");

        while (true) {
            System.out.println("-".repeat(40));
            System.out.print("PILIH : ");
            pilihan = inp.nextInt();
            System.out.println("-".repeat(40));

            switch (pilihan) {
                case 1:
                    readData();
                    break;
                case 2:
                    insertData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }
    }

    public static void readData() {
        MyConfig.connection();
        MyConfig.getDatabase();
    }

    public static void insertData() {
        MyConfig.connection();
        MyConfig.insertData();
    }

    public static void editData() {
        MyConfig.connection();
        MyConfig.editData();
    }

    public static void deleteData() {
        MyConfig.connection();
        MyConfig.deleteData();
    }
}
