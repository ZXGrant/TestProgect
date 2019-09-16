/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package httpprotocaltest.basedatatypes;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/8/12       Create
 * </pre>
 */
public class test_1 {
    public static void main(String[] args) {
        Integer a=5;
        System.out.println(a);

        int b=2;
        int sum=a+b;
        int c=a.parseInt("456");
        System.out.println("sum is "+sum);
        System.out.println("c is "+c);
    }
}
