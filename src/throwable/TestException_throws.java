package throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by $zhanyan on 2017/12/5.
 */
public class TestException_throws {
    public static void main(String[] args) {
        TestException_throws tt = new TestException_throws();
        try {
            tt.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void method() throws IOException {
        method1();
    }

    public void method1() throws IOException {
        FileInputStream fis = new FileInputStream(new File("a.txt"));
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }

}
