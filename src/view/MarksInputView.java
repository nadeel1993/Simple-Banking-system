package view;

import model.Subject;

import java.util.Scanner;

public class MarksInputView {
    public int getMarks(String subjectName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter marks for : " + subjectName);
        return sc.nextInt();
    }
}
