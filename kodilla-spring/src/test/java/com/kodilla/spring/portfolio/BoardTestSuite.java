package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask();
        board.getInProgressList().addTask();
        board.getDoneList().addTask();
        board.readBoard();
        //Then
        Assert.assertFalse(board.getToDoList().tasks.isEmpty());
        Assert.assertFalse(board.getInProgressList().tasks.isEmpty());
        Assert.assertFalse(board.getDoneList().tasks.isEmpty());
    }
}
