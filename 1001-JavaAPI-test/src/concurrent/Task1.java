package concurrent;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/9/12       Create
 * </pre>
 */
public class Task1 implements Runnable{


    @Override
    public void run() {
        System.out.println("开始执行任务1---");
    }
}
