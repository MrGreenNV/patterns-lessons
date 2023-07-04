package ru.averkievnv.patternlessons.creational.abstractfactory.banking;

import ru.averkievnv.patternlessons.creational.abstractfactory.Developer;
import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectManager;
import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectTeamFactory;
import ru.averkievnv.patternlessons.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
