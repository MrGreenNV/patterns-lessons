package ru.averkievnv.patternlessons.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");

        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("PHP")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException("'" + specialty + "'" + " is unknown specialty.");
        }
    }
}
