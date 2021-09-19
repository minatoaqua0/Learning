package learning;

public class MainClass {
    public static void main(String[] args) {
         Teacher t = new Teacher();
         Student s = new Student();
         System.out.println(t.add(12,236));
         System.out.println(t.sub(234,120));
         s.speak();
    }
}
