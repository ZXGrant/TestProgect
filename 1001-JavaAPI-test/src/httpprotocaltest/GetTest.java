/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package httpprotocaltest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/7/29       Create
 * </pre>
 */
public class GetTest {
    public static void main(String[] args) {
        new ByGet().start();
    }

    static class ByGet extends Thread{ //创建Thread子类
        public void run() {
            try {
                URL url = new URL("https://fanyi.baidu.com/");//实例化一个URL对象，用百度有道翻译进行了测试
                URLConnection connection = url.openConnection();//通过URL对象的openConnection()方法得到一个java.net.URLConnection;
                InputStream is = connection.getInputStream();  // 获取输入流
                InputStreamReader isr = new InputStreamReader(is,"utf-8");//在InputStreamReader中指定编码，手动指定为UTF-8
                BufferedReader br = new BufferedReader(isr);//实例化一个BufferedReader对象用来存放转换后的字符
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = br.readLine()) != null) {  // 读取数据
                    builder.append(line+"\n");
                }
                br.close();//关闭流
                isr.close();
                is.close();
                System.out.println(builder.toString());
            } catch (MalformedURLException e) {//异常处理
                e.printStackTrace();//打印异常所在位置及原因
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
