package ru.averkievnv.patternlessons.creational.abstractfactory.banking;

import ru.averkievnv.patternlessons.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
