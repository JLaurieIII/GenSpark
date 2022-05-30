import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = (Student) context.getBean("Student"); // Setter Injection
        Student student1 = context.getBean("Student1", Student.class); //Getter Injection

        System.out.println(student);
        System.out.println(student1);

    }

}
