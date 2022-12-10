package dit;
import yan.Abs;
import yan.TestAbs;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int z;
    public Main(){
        z = 1;
    }
    static String tampilam(String test){
        return test;
    }

    public static void main(String[] args) {
        System.out.println(tampilam("==========="));
        TestAbs yudit1 = new TestAbs(" Yudit Aditya1");
        yudit1.display();
        Scanner in = new Scanner(System.in);
        Admin a = new Admin();
        User u = new User();
        Member m = new Member();
        Transaksi t = new Transaksi();
        Main ab = new Main();
        ArrayList dit = new ArrayList();
        int n = ab.z;
        int set = 0;
        dit.add(set);
        int waktu = 0;
        int harga = 3000, diskon = 0,total;
        int pil, pi;
        boolean ad;
        String ph="y";

        while (ph.equals("y")) {
            String pilih = "y";
            System.out.println("Masuk sebagai :");
            System.out.println("1. Admin");
            System.out.println("2. User/Personal");
            System.out.println("3. Member");
            System.out.print("Masukan Pilihan :");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    ad = a.mengisi();
                    if (ad) {
                        while (pilih.equals("y")) {
                            System.out.println("MENU WARNET DITYAN");
                            System.out.println("1. Lihat Pengguna");
                            System.out.println("2. Atur Harga Billing");
                            System.out.println("3. Atur Diskon (%)");
                            System.out.println("Masukan Pilihan :");
                            pi = in.nextInt();
                            switch (pi) {
                                case 1:
                                    System.out.println("Masukan id user : ");
                                    int ka = in.nextInt();
                                    int jml = (int) dit.get(ka);
                                    a.display(ka, jml);
                                    break;
                                case 2:
                                    harga = a.mengatur();
                                    System.out.println(harga);
                                    break;
                                case 3:
                                    diskon = a.mengatur(harga);
                                    System.out.println(diskon);
                                    break;
                            }
                            System.out.println("kembali ke menu admin |y/n| :");
                            pilih = in.next();
                        }
                    }
                    break;
                case 2:
                    waktu = 0;
                    total = 0;
                    while (pilih.equals("y")) {
                        waktu += u.mengisi(n);
                        System.out.println("Apakah ingin tambah waktu? |y/n| : ");
                        pilih = in.next();
                    }
                    u.display(waktu);
                    total = t.hitung(harga, waktu);
                    System.out.println("Total harga :"+total);
                    dit.add(total);
                    n++;
                    break;
                case 3:
                    waktu = 0;
                    total = 0;
                    while (pilih.equals("y")) {
                        waktu += m.mengisi(n);
                        System.out.println("apakah ingin tambah waktu? |y/n| : ");
                        pilih = in.next();
                    }
                    m.display(waktu);
                    total = t.hitung(harga, waktu, diskon);
                    System.out.println("total harga :"+total);
                    dit.add(total);
                    n++;
                    break;
            }
            System.out.println("kembali ke menu awal |y/n| :");
            ph = in.next();
        }
    }
}