package Bai17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void CopyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void CopyFiledUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file: ");
        String desPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File desFile = new File(desPath);

        try {
            CopyFileUsingJava7Files(sourceFile, desFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
