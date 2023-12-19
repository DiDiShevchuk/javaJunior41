package lesson19;

public class TestCopy {
    public static void main(String[] args) {
        CopyWithOneByteUtils copyWithOneByteUtils = new CopyWithOneByteUtils();
        CopyWithNIOUtils copyWithIOUtils = new CopyWithNIOUtils();
CopyWithGuava copyWithGuava = new CopyWithGuava();

        long time1 = System.currentTimeMillis();
        try {
           copyWithOneByteUtils.copyFile("C:\\Users\\Диана\\Downloads\\2023-12-13 18-17-20.mkv", "src\\main\\java\\lesson19\\4 star - copy1.mkv");
       }catch (FileCopyFailedException e) {
            throw new RuntimeException(e);
       }
        long time2 = System.currentTimeMillis();
        System.out.println("Copy with one byte: " + (time2 - time1));

        long time3 = System.currentTimeMillis();
        try {
            copyWithIOUtils.copyFile("C:\\Users\\Диана\\Downloads\\2023-12-13 18-17-20.mkv", "src\\main\\java\\lesson19\\4 star - copy2.mkv");
        }catch (FileCopyFailedException e){
            throw new RuntimeException(e);
        }
        long time4 = System.currentTimeMillis();

        System.out.println("Copy with NIO: " + (time4 - time3));





        long time5 = System.currentTimeMillis();
        try {
            copyWithGuava.copyFile("C:\\Users\\Диана\\Downloads\\2023-12-13 18-17-20.mkv", "src\\main\\java\\lesson19\\4 star - copy3.mkv");
        }catch (FileCopyFailedException e){
            throw new RuntimeException(e);
        }
        long time6 = System.currentTimeMillis();

        System.out.println("Copy with guava: " + (time6 - time5));
    }

}
