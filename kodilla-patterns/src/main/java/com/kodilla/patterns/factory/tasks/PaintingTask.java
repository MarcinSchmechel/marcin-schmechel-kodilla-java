package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (isTaskExecuted()) {
            System.out.println("Task: " + getTaskName() + " was executed before");
        } else {
            System.out.println("Task: " + getTaskName() + " executed");
            this.isTaskExecuted = true;
        }
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
