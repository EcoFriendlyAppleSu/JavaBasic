package chapter14_lambda.stream;

public class Student implements Comparable<Student> {

    private String name;
    private int ban;
    private int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    // 내림차순을 기본 정렬로 한다.
    public int compareTo(Student student) {
        return student.totalScore - this.totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }
}
