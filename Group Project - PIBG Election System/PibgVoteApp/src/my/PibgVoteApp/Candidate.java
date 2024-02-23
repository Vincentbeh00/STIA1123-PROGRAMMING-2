/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.PibgVoteApp;

/**
 *
 * @author vince
 */
public class Candidate {

    private String name;
    private int Age;
    private String Job;
    private int Experience;
    private String Achievements;

    public Candidate(String name, int Age, String Job, int Experience, String Achievements) {
        this.name = name;
        this.Age = Age;
        this.Job = Job;
        this.Experience = Experience;
        this.Achievements = Achievements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public String getAchievements() {
        return Achievements;
    }

    public void setAchievements(String Achievements) {
        this.Achievements = Achievements;
    }

    @Override
    public String toString() {
        return "Candidate{" + "name=" + name + ", Age=" + Age + ", Job=" + Job + ", Experience=" + Experience + ", Achievements=" + Achievements + '}';
    }

}
