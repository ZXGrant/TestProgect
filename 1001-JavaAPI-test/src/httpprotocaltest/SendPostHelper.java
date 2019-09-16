/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package httpprotocaltest;

import java.io.*;
import java.net.HttpURLConnection;
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
public class SendPostHelper extends Thread{
    @Override
    public void run() {
        try {
            URL url = new URL("http://fanyi.youdao.com/openapi.do");//实例化一个URL对象
            URLConnection connection = url.openConnection();//通过URL对象的openConnection()方法得到一个java.net.URLConnection;
            connection.addRequestProperty("encoding", "UTF-8");//设置请求属性
            connection.setDoInput(true);//允许从服务器上获取数据
            connection.setDoOutput(true);//允许向服务器传输数据
            ((HttpURLConnection) connection).setRequestMethod("POST");//设置请求模式为post请求

            OutputStream os = connection.getOutputStream();// 获取输出流
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osr);

            bw.write("keyfrom=<keyfrom>&key=<key>&type=data&doctype=<doctype>&version=1.1&q=welcome");//指定输入的内容
            bw.flush();

            InputStream is = connection.getInputStream();// 获取输入流
            InputStreamReader isr = new InputStreamReader(is,"utf-8");//在InputStreamReader中指定编码，手动指定为UTF-8
            BufferedReader br = new BufferedReader(isr);//实例化一个BufferedReader对象用来存放转换后的字符

            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = br.readLine()) != null) {// 读取数据
                builder.append(line+"\n");
            }

            bw.close();//关闭流
            osr.close();
            os.close();

            br.close();
            isr.close();
            is.close();

            System.out.println(builder.toString());
        } catch (MalformedURLException e) {//异常处理
            e.printStackTrace();//打印异常所在位置及原因
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

