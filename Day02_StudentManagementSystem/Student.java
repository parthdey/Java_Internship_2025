    public class Student {
        String id;
        String name;
        double marks;

        public Student(String id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public String toString() {
            return "ID: " + this.id + ", Name: " + this.name + ", Marks: " + this.marks;
        }
}
