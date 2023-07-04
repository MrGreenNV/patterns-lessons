package ru.averkievnv.patternlessons.creational.abstractfactory.website;

import ru.averkievnv.patternlessons.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
