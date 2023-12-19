package lesson19;

import java.io.*;

public class CopyWithOneByteUtils implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destFile = new File(destination);

        if(destFile.exists()){
            throw new FileAlreadyExistsException("файл назначения уже существует: " + destination);
        }
        try {
            // путь бывает двух форматов : полный и относительный путь
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

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
            throw new FileCopyFailedException(e.getMessage());
        }
    }



}
