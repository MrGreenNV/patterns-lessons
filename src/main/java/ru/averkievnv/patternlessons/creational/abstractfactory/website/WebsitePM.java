package ru.averkievnv.patternlessons.creational.abstractfactory.website;

import ru.averkievnv.patternlessons.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
