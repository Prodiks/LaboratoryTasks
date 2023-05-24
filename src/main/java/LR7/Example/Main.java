package LR7.Example;

public class Main
{
    public static void main(String[] args) {
        LR7.Example.superClassTest superClassObject = new LR7.Example.superClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        LR7.Example.subClassTest subClassObject1 = new LR7.Example.subClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        LR7.Example.subClassTest subClassObject2 = new LR7.Example.subClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
