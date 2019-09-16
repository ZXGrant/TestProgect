/**
 * 版权所有 (c) 2019，中金支付有限公司
 */

import java.util.HashSet;

/**
 * 信息说明:卡尔的技能测试
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/7/11       Create
 * </pre>
 */
public class MNKarel {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=80;
        int d=200;
        int check=0;
        HashSet<Integer> hashSet=new HashSet<Integer>();
        int[] ball={1,10,100,1000};
        String[] show={"a","b","c","d"};
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                for (int k = 0; k <4 ; k++) {
                    for (int l = 0; l < 4; l++) {
                        check=ball[i]+ball[j]+ball[k]+ball[l];
                        if(hashSet.add(check)){
                            System.out.println(show[i]+","+show[j]+","+show[k]+","+show[l]);
                        }

                    }
                }
            }
        }

        System.out.println("集合的长度为："+hashSet.size());
    }
}
