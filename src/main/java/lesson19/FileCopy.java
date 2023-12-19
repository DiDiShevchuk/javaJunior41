package lesson19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // путь бывает двух форматов : полный и относительный путь
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Диана\\Downloads\\работа\\Lection_IO.ppt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\main\\java\\lesson19\\copy.ppt"));

            int c = 0;
            while (true) {
                c = bis.read(); // откусили кусочек байта
                if (c != -1) //  это не конец файла? (-1 выдается, когда конец файла)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }

}
