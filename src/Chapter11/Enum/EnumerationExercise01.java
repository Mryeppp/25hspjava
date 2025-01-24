package Chapter11.Enum;

public class EnumerationExercise01 {
    public static void main(String[] args) {
        Gender boy1 = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy1.toString());
        System.out.println(boy2 == boy1);

    }
}

enum Gender {
    // 易错点：不写构造器说明存在一个默认无参构造器
    BOY, GIRL;
    // @Override
    // public String toString() {
    // return super.toString(); // enum 继承于Enum类
    // }
    // 调用无参构造器 可以省去常量对象的()

}
