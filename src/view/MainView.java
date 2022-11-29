package view;

import model.Subject;
import service.Calculator;
import service.GPACalculator;
import service.GradeCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainView {
    private boolean shouldContinue = true;
    MarksInputView marksInputView = new MarksInputView();
    WelcomeView welcomeView = new WelcomeView();
    GpaView gpaView = new GpaView();
    Calculator<Double, Subject> gradeCalculator = new GradeCalculator();
    Calculator<Double, List<Subject>> gpaCalculator = new GPACalculator();


    public void run() {
        while (shouldContinue) {
            welcomeView.showWelcome();
            Subject sub1 = new Subject("Introduction to Information Technology", 3);
            Subject sub2 = new Subject("Office Automation and Productivity Application", 2);
            Subject sub3 = new Subject("Fundamentals of Programming", 3);
            Subject sub4 = new Subject("Database Design: Introduction", 3);
            Subject sub5 = new Subject("English for Communication", 2);

            List<Subject> subjects = new ArrayList<>();
            subjects.add(sub1);
            subjects.add(sub2);
            subjects.add(sub3);
            subjects.add(sub4);
            subjects.add(sub5);

            for(int i=0; i< subjects.size(); i++) {
                subjects.get(i).setMarks(marksInputView.getMarks(subjects.get(i).getSubjectName()));
                subjects.get(i).setGradePoint(gradeCalculator.calculate(subjects.get(i)));
            }

            double currentGpa = gpaCalculator.calculate(subjects);
            gpaView.showGpa(currentGpa);
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue for another student? (Y/N)");
            String answer = sc.next();
            if(answer.toLowerCase().startsWith("n")) {
                shouldContinue = false;
            }
        }
    }
}
