import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<s_obj> array = new ArrayList<s_obj>();

        // Creates s_obj objects and adds grades for the students
        s_obj student1 = new s_obj("Alice", 101);
        student1.add(85);
        student1.add(90);
        student1.add(78);
        array.add(student1);

        s_obj student2 = new s_obj("Bob", 102);
        student2.add(92);
        student2.add(88);
        student2.add(95);
        array.add(student2);

        s_obj student3 = new s_obj("Charlie", 103);
        student3.add(70);
        student3.add(60);
        student3.add(65);
        array.add(student3);

        // Finding the letter grade of the students
        for(int i = 0; i < array.size(); i++) {
            s_obj temp = array.get(i);
            double gradeNum = temp.getVal();
            String grade = "";
            if (gradeNum >= 90){
                grade = "A";
            }
            else if (gradeNum >= 80){
                grade = "B";
            }
            else if (gradeNum >= 70){
                grade = "C";
            }
            else if (gradeNum >= 60){
                grade = "D";
            }
            else{
                grade = "F";
            }

            System.out.println("ID: " + temp.idNum + " | Name: " + temp.name + " | Avg: " + gradeNum + " | Grade: " + grade);
        }

        // Finding which student has the best grades
        double best = -1;
        String name = "";
        for (s_obj i : array) {
            if (i.getVal() > best) {
                best = i.getVal();
                name = i.name;
            }
        }
        System.out.println("Top: " + name + " with " + best);

        // finds which students are failing
        System.out.println("Needs Help:");
        for(s_obj i : array) {
            if(i.getVal() < 70) {
                System.out.println(i.name);
            }
        }
    }
}