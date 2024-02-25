//using constructor using display 2 student name and rollno using this keyword

class Student {
     String name;
     int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +rollNo);
    }

    public static void main(String args[]) {
        Student student1 = new Student("Aiswarya", 101);
        Student student2 = new Student("Ajay", 102);
        System.out.println("Student 1:");
        student1.display();
        System.out.println("\nStudent 2:");
        student2.display();
    }
}

