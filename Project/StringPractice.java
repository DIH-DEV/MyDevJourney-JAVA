package Project;

public class StringPractice {
    static String name = "oluwasegun Babatunde Esho";
    int number = name.length();
    String text ="SubString is a sub string";
    String[] checks = text.split(" ");
    String attachment = "report.pdf";
    String report = "presentationSheet.xlxs";
    static String ref = "With strong, personalised letters on official letterhead that include concrete examples of your work and explain why you have the potential to become a leader in digital technology, your current set of recommenders is credible and suitable for an Exceptional Promise application. The quality of the content will matter more than trying to find people with more prestigious titles.";
    static String[] wordCount = ref.split(" ");



    public static void main(String[] args) {
        StringBuilder student = new StringBuilder();
        student.append("Esho");
        student.append(" Oluwasegun");
        System.out.println(student);
        student.append(" Babatunde");
        System.out.println(student);
        System.out.println(name.replace(" ","_"));

        StringPractice str = new StringPractice();
        int length = name.length();
        System.out.println("Length:" +length);
        System.out.println(str.number);
        System.out.println("Uppercase: "+ name.toUpperCase());
        System.out.println("Index 3: " + name.substring(3));
        System.out.println(name.charAt(3));
        System.out.println(str.text.substring(3));
        System.out.println(str.checks.length);
        System.out.println("File type: " + str.attachment.substring(str.attachment.lastIndexOf(".")+1));
        System.out.println("File format: " + str.report.substring(str.report.lastIndexOf(".")+1));
        //System.out.println("Word Count: " + str.count.length );
        System.out.println("Checks: " + wordCount.length);

    }
}
