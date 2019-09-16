/**
 * 版权所有 (c) 2019，中金支付有限公司
 */

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/7/8       Create
 * </pre>
 */
public class Student {
    private String stuid;
    private String name;
    private int sex;
    private String className;

    public Student(String stuid, String name, int sex, String className) {
        this.stuid = stuid;
        this.name = name;
        this.sex = sex;
        this.className = className;
    }

    public Student(String stuid, String name, int sex) {
        this.stuid = stuid;
        this.name = name;
        this.sex = sex;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
