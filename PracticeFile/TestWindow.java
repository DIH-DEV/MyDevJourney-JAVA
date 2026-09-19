package PracticeFile;

public class TestWindow {
    double width;
    double height;
    double track;

    public double aluminiumWindow (double height, double width, double track){
        this.width = width;
        this.height = height;
        this.track = track;
        double frame = (width * height) - track;
        return frame;

    }

    public static void main(String[] args) {
        TestWindow window = new TestWindow();
        window.aluminiumWindow(10,4,0);
        System.out.println("Window Estimation: " + window.aluminiumWindow(10,4,0));
    }

}

