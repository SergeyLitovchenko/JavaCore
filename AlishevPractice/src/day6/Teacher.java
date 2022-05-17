package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String theme) {
        this.name = name;
        this.subject = theme;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(6 - 2) + 2;

        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "Unsatisfactory";
                break;
            case 3:
                evaluation = "Satisfactory";
                break;
            case 4:
                evaluation = "Good";
                break;
            case 5:
                evaluation = "Great";
                break;
        }

        System.out.println("Teacher " + this.name + " rated student with name " + student.getName() +
                " on the subject " + this.subject + " for evaluate " + evaluation);
    }

}
