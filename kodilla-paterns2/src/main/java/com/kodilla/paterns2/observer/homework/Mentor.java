package com.kodilla.paterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(mentorName + ": New tasks from student " + studentTasks.getStudentsName() +
                ", total: " + studentTasks.getTasks().size() + " " + getTaskForm(studentTasks));
        updateCount++;
    }

    private String getTaskForm(StudentTasks studentTasks){
        return studentTasks.getTasks().size() == 1 ? "task" : "tasks";
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
