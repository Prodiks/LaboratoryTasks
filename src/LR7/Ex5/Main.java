package LR7.Ex5;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("Tom", 'A');
        Teacher teacher = new Teacher("Jack", 1);
        Person person = student;

        student.print();
        teacher.print();
        person.print();
    }
}
