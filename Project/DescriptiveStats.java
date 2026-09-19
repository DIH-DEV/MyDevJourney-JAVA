package Project;

public class DescriptiveStats {

    double score_1;
    double score_2;
    double score_3;
    double score_4;
    double score_5;

    private void studentScores(double score_1, double score_2, double score_3,double score_4,double score_5){
        //DescriptiveStats stats = new DescriptiveStats();

        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
        this.score_4 = score_4;
        this.score_5 = score_5;
        double totalScores = score_1 + score_2 + score_3 + score_4 + score_5;
        double avg = totalScores / 5;
        System.out.println("Sum of total scores: " + totalScores);
        System.out.println("Sum of AVG scores: " + avg);
        //double highestScore =

    }
    public static void main(String[] args){
        DescriptiveStats stats = new DescriptiveStats();
        stats.studentScores(23,43,34,34,34);
       // return stats.studentScores();

    }
}
