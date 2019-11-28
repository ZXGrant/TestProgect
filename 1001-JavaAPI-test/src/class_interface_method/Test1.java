/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package class_interface_method;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * 1、实现某接口时，接口中定义的抽象方法是必须要被重写的
 * 2、接口中定义的static 方法有方法体，不能被重写
 * 3、java8中增加了可以定义default方法，有方法体，可以被重写
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/11/21       Create
 * </pre>
 */
public class Test1 implements Rotate {


    @Override
    public int speedUp(int arg) {
        return 0;
    }

    public static String speedDown(String arg){
        System.out.println(arg);
        return bb+arg;
    }


    @Override
    public boolean start(String command) {
        return false;
    }


}
