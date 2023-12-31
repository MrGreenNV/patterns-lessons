package ru.averkievnv.patternlessons.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebSiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
