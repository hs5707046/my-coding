class Student{
String name;
int age;
Student(){

}
Student(Student s1){
    this.name=s1.name;
    this.age=s1.age;
}
void print(){
    System.out.println(name+" "+age);
}
}

public class OOP {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="himanshu";
        s1.age=18;
        Student s2=new Student(s1);
        s2.print();
        
    }
    
}
