public class App {
    public static void main(String[] args) {
        String course = "Biology";

        switch (course) {
        case "Algebra": 
            break;
        case "Biology": 
            System.out.println("Hello");
        case "History": 
            // Enroll in History
            break;
        case "Theatre":
            // Enroll in Theatre
            break;
        default:
            System.out.println("Course not found");
    }

    // enrolls student in Biology... AND History and Theatre!

    }
}
