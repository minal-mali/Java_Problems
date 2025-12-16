import java.io.*;
import java.util.zip.*;

class ZipDemo
{
    public static void main(String args[])
    {
        String sourceFile = "C:\\Java_Problems\\FileData\\check.txt";
        String zipFile = "C:\\Java_Problems\\FileData\\output.zip";

        try
        {
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);

            File fileToZip = new File(sourceFile);
            FileInputStream fis = new FileInputStream(fileToZip);

            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zos.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;

            while ((length = fis.read(bytes)) >= 0) {
                zos.write(bytes, 0, length);
            }

            zos.closeEntry();
            zos.close();
            fis.close();
            fos.close();

            System.out.println("File zipped successfully!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
