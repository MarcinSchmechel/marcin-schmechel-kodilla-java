package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void sendInformation(User user) {
        System.out.println("Email send to :" + user.getUserName());
    }
}
