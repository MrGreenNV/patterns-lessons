package ru.averkievnv.patternlessons.creational.abstractfactory.banking;

import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
