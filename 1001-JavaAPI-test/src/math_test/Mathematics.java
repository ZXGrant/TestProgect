/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package math_test;

import java.util.Random;

/**
 * 信息说明：一些算法，随机数，取值范围，数据类型int,long等数学类的问题测试
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/9/10       Create
 * </pre>
 */
public class Mathematics {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            long nextLong = random.nextLong();
            System.out.println("nextLong is:"+nextLong);
        }
    }
}
