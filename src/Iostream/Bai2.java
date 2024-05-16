import java.io.File;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap duong dan cua thu muc hoac file: ");
        String duongDan = scanner.nextLine();
        
        File fileHoacThuMuc = new File(duongDan);
        
        if (fileHoacThuMuc.exists()) {
            if (fileHoacThuMuc.isDirectory()) {
                // Xoá thư mục
                if (xoaThuMuc(fileHoacThuMuc)) {
                    System.out.println("Thu muc da duoc xoa thanh cong.");
                } else {
                    System.out.println("Khong the xoa thu muc.");
                }
            } else {
                // Xoá file
                if (xoaFile(fileHoacThuMuc)) {
                    System.out.println("File da duoc xoa thanh cong.");
                } else {
                    System.out.println("Khong the xoa file.");
                }
            }
        } else {
            System.out.println("Thu muc hoac file khong ton tai.");
        }
        
        scanner.close();
    }
    
    // Hàm xoá thư mục
    public static boolean xoaThuMuc(File thuMuc) {
        if (thuMuc.isDirectory()) {
            File[] cacTapTin = thuMuc.listFiles();
            if (cacTapTin != null) {
                for (File tapTin : cacTapTin) {
                    xoaThuMuc(tapTin);
                }
            }
        }
        return thuMuc.delete();
    }
    
    // Hàm xoá file
    public static boolean xoaFile(File file) {
        return file.delete();
    }
}
