/**
 * 版权所有 (c) 2019，中金支付有限公司
 */

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/7/26       Create
 * </pre>
 */
public class StringUtil {
    public static void main(String[] args) {
        String clearingForadvance="003087,4530,00308700001,6000030870001|003498,4530,003498001,600003498001,000020,4530,00002000001,60000200001";
        String[] advances=clearingForadvance.split("\\|",3);
        for (int i = 0; i <advances.length ; i++) {
            System.out.println(advances[i]);
        }
    }
}
