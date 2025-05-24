package model;

public class Job {
    private int id;
    private String title;
    private String company;
    private String location;
    private String skills;

    public Job(int id, String title, String company, String location, String skills) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.skills = skills;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getLocation() { return location; }
    public String getSkills() { return skills; }
}