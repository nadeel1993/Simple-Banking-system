package model;

public class Subject {
    private String subjectName;
    private int noOfCredits;
    private int marks;
    private double gradePoint;

    public Subject(String subjectName, int noOfCredits) {
        this.subjectName = subjectName;
        this.noOfCredits = noOfCredits;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }
}
