package com.kodilla.paterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks johnSmithTasks = new JohnSmithTasks();
        StudentTasks klaraHopkinsTasks = new KlaraHopkinsTasks();
        StudentTasks johnDoeTasks = new JohnDoeTasks();
        Mentor mentorOne = new Mentor("Mentor 1");
        Mentor mentorTwo = new Mentor("Mentor 2");
        johnSmithTasks.registerObserver(mentorOne);
        johnSmithTasks.registerObserver(mentorTwo);
        klaraHopkinsTasks.registerObserver(mentorOne);
        johnDoeTasks.registerObserver(mentorTwo);

        //When
        johnSmithTasks.addTask("Task 1");
        klaraHopkinsTasks.addTask("Task 1");
        johnDoeTasks.addTask("Task 1");
        johnSmithTasks.addTask("Task 2");
        johnDoeTasks.addTask("Task 2");
        johnSmithTasks.addTask("Task 3");

        //Then
        assertEquals(4, mentorOne.getUpdateCount());
        assertEquals(5, mentorTwo.getUpdateCount());
    }
}
