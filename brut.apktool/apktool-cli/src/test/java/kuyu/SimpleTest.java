package kuyu;

import brut.apktool.Main;
import brut.common.BrutException;
import org.junit.Test;

import java.io.IOException;

public class SimpleTest {

    @Test
    public void test() {
        String[] args = new String[]{"d", "/Users/kuyuzhiqi/Downloads/1003491_ydcs_meizu_huangbaichong_1578043978.apk",
                "-o", "/Users/kuyuzhiqi/Downloads/ydcs"};
        try {
            Main.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrutException e) {
            e.printStackTrace();
        }
    }
}