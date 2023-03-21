package TimeStampORDate;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Base64;

/**
 * {@code description:} 图片转base64
 * {@code author:} 物联系 ITAEM 陈金城
 * {@code create:} 2023-03-21 15:00
 **/
public class imageToBase64 {
    /**
     * 图片地址转base64，安卓代码
     * @param path
     * @return
     */
    public static String imageToBase64(String path) {
        if (path.isEmpty()) {
            return null;
        }
        InputStream is = null;
        byte[] data = null;
        String result = null;
        try {
            is = new FileInputStream(path);
            //创建一个字符流大小的数组。
            data = new byte[is.available()];
            //写入数组
            is.read(data);
            //用默认的编码格式进行编码
            result = Base64.encodeToString(data, Base64.NO_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return result;
    }
}
