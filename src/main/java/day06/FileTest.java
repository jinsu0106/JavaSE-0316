package day06;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        // File: 文件 或 目录
        File f1 = new File("writer.txt");
        System.out.println(f1.isFile());
        File f2 = new File(".git");
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());

        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.delete());;
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.getTotalSpace()/1024/1024/1024);
        System.out.println(f1.getUsableSpace()/1024/1024/1024);

        System.out.println(f2.isHidden());
        System.out.println(new Date(f1.lastModified()));
        System.out.println(f1.length());

        System.out.println(Arrays.toString(f2.list()));

//        File f3 = new File("test1/test2/test3");
//        f3.mkdir();
//        f3.mkdirs();

        f1.renameTo(new File("new_writer.txt"));

        File c = new File("c:/");
        System.out.println(Arrays.toString(c.list()));
    }
}

/*
c:/
    dir1
    dir2
    dev
        d1
            f3...
        d2
    f1,
    f2

 */
