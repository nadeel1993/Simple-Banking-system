package service;

import model.Subject;

public class GradeCalculator implements Calculator<Double, Subject> {

    @Override
    public Double calculate(Subject input) {
        if(input.getMarks() >= 70)
            return 4.0;
        else if(input.getMarks() >= 55)
            return 2.5;
        else if(input.getMarks() >= 40)
            return 2.0;
        else if(input.getMarks() >= 30)
            return 1.7;

        return 0.0;
    }

}
