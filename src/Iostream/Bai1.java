import java.io.File;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap duong dan file: ");
        String duongDan = scanner.nextLine();
        
        File file = new File(duongDan);
        
        if (file.exists()) {
            long doLon = file.length();
            System.out.println("Do lon cua file la: " + doLon + " bytes");
        } else {
            System.out.println("File khong ton tai.");
        }
        
        scanner.close();
    }
}