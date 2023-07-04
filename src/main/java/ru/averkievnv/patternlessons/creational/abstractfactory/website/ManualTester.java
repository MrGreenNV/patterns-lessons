package ru.averkievnv.patternlessons.creational.abstractfactory.website;

import ru.averkievnv.patternlessons.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
