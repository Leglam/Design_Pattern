public class App {
    public static void main(String[] args) {
        Student prayuth = new Student.StudentBuilder("prayuth", "Thai-Army-University")
            // .age(20) // Uncomment to add age
            .build();
        System.out.println(prayuth);
    }
    
}
