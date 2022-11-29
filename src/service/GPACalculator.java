package service;

import model.Subject;

import java.util.List;

public class GPACalculator implements Calculator<Double, List<Subject>> {

    @Override
    public Double calculate(List<Subject> input) {
        double gpa = 0.0;
        double gradeCredits = 0;
        double credits = 0;
        for(int i=0; i<input.size(); i++) {
            gradeCredits = gradeCredits + input.get(i).getGradePoint()*input.get(i).getNoOfCredits();
            credits = credits + input.get(i).getNoOfCredits();
        }
        return gradeCredits/credits;
    }

}
