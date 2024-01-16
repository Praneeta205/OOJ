import java.util.Arrays;
import java.util.Scanner;

class student {
    int regno;
    String name;
    short sem;
    float cgpa;

    student() {
        sem = 3;
    }

    student(String name, int regno, float cgpa) {
        this.name = name;
        this.regno = regno;
        this.cgpa = cgpa;
        this.sem=3;
    }

    public String toString() {
        return "name:" + name + " regno:" + regno + " sem:" + sem + " cgpa:" + cgpa;
    }
}

class studMain {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of students:");
        int n = s.nextInt();
        student[] stud;
        stud = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the name:");
            String name = s.next();
            System.out.println("enter the regno:");
            int regno = s.nextInt();
            System.out.println("enter the cgpa:");
            float cgpa = s.nextFloat();
            stud[i] = new student(name, regno, cgpa);
        }
        Arrays.sort(stud, (a, b) -> Float.compare(a.cgpa, b.cgpa));
        System.out.println("Sorted by cgpa:");
        for (int i=0;i<n;i++) {
            System.out.println(stud[i]);
        }
        Arrays.sort(stud, (a, b) -> a.name.compareTo(b.name));
        System.out.println("Sorted by name:");
        for (int i=0;i<n;i++) {
            System.out.println(stud[i]);
        }
    }
}
   