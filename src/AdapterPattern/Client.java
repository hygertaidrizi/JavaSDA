package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        JavaClass studentJava = new JavaClass("Hygerta ", 10.0);
        DotNetClass studentNet = new DotNetClass("Gerta", 8.0);
        Nxenes nxenes = new Nxenes("Ana", "Anna", 4);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(studentJava);
        studentList.add(studentNet);

        NxenesToStudentAdapter adapter = new NxenesToStudentAdapter(nxenes);
        studentList.add(adapter);

        for (Student student : studentList){
            student.printFullName();
            System.out.println (student.getGrade());
        }
    }
}
