package ru.averkievnv.patternlessons.creational.abstractfactory.website;

import ru.averkievnv.patternlessons.creational.abstractfactory.Developer;
import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectManager;
import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectTeamFactory;
import ru.averkievnv.patternlessons.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }
    @Override
    public Tester getTester() {
        return new ManualTester();
    }
    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
