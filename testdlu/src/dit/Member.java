package dit;

import java.util.Scanner;

public class Member extends User {
    private String username;
    private String password;

    protected void display(int waktu) {
        System.out.println("id user :" + id);
        System.out.println("member : " + username);
        System.out.println("lama memesan :" + waktu + " jam");
    }

    protected int mengisi(int n) {
        Scanner in = new Scanner(System.in);
        setId(id(n));
        System.out.print("Masukkan username : ");
        username = in.next();
        setUsername(username);

        if (username.equals("member01")) {
            System.out.print("Masukkan Password : ");
            password = in.next();
            setPassword(password);
            if (password.equals("200303")) {
                System.out.print("Masukkan lama memesan : ");
                waktu = in.nextInt();
            } else {
                System.out.println("Password Salah!!");
            }
        } else if (username.equals("member02")){
            System.out.println("Masukkan password : ");
            password = in.next();
            setPassword(password);
            if (password.equals("555777")){
                System.out.println("Masukkan lama memesan : ");
                waktu = in.nextInt();
            }
        }
        return setWaktu(waktu);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
