package usetmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class UsetMaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        HashSet<String> courses = new HashSet<>();

        System.out.println("=== HashSet ===");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter course " + i + ": ");
            String course = sc.nextLine();
            courses.add(course);
        }

        System.out.println("Courses: " + courses);

        System.out.print("\nSearch course: ");
        String courseSearch = sc.nextLine();

        if (courses.contains(courseSearch)) {
            System.out.println(courseSearch + " is available.");
        } else {
            System.out.println(courseSearch + " is not available.");
        }

        System.out.print("Remove course: ");
        String courseRemove = sc.nextLine();

        if (courses.remove(courseRemove)) {
            System.out.println(courseRemove + " removed successfully.");
        } else {
            System.out.println(courseRemove + " not found.");
        }

        System.out.println("Courses after removal: " + courses);

      
        HashMap<String, Integer> grades = new HashMap<>();

        System.out.println("\n=== HashMap ===");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student " + i + " name: ");
            String name = sc.nextLine();

            System.out.print("Enter " + name + "'s grade: ");
            int grade = sc.nextInt();
            sc.nextLine(); 

            grades.put(name, grade);
        }

        System.out.println("Grades: " + grades);

        System.out.print("\nSearch student: ");
        String searchStudent = sc.nextLine();

        if (grades.containsKey(searchStudent)) {
            System.out.println(searchStudent + "'s grade: " + grades.get(searchStudent));
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("Update student: ");
        String updateStudent = sc.nextLine();

        if (grades.containsKey(updateStudent)) {
            System.out.print("New grade: ");
            int newGrade = sc.nextInt();
            sc.nextLine();

            grades.put(updateStudent, newGrade);
            System.out.println("Grades after update: " + grades);
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("Remove student: ");
        String removeStudent = sc.nextLine();

        if (grades.remove(removeStudent) != null) {
            System.out.println(removeStudent + " removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("Grades after removal: " + grades);

        sc.close();
    }
}