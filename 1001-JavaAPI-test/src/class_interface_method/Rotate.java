/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package class_interface_method;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * 1、接口的方法默认就是public abstract
 * 2、变量默认就是public static final
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/11/20       Create
 * </pre>
 */
public interface Rotate {

    public long duration=5;

    public long speed=10;

    public static int a=6;
    public static String bb="hello";

    //抽象方法不能有方法体
    public int speedUp(int arg);

    //定义static方法可以有方法体
    public static int speedDown(int arg){
        int b=5;
        return arg+5;
    }

    //接口中的方法加了default修饰，必须有返回值..
    public default boolean start (String command){

        if(command instanceof String){
            System.out.println("机器启动成功！");
        }
        return true;
    }
}
