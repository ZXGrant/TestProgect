public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Student student1=new Student("2019001","zhangsan",1);
        Object[] args1=new Object[]{student1.getStuid(),student1.getName(),student1.getSex(),student1.getClass()};


        System.out.println(args1.length);
        System.out.println();
    }
}
