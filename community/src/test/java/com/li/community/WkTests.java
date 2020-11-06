package com.li.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "F:/wkthmltox/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com F:/wkthmltox/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
