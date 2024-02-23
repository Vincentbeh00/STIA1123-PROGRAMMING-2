/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.PibgVoteApp;

/**
 *
 * @author vince
 */
public class Voter {

    private String name;
    private String icNo;
    private String voted;

    public Voter(String name, String icNo, String voted) {
        this.name = name;
        this.icNo = icNo;
        this.voted = voted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public String getVoted() {
        return voted;
    }

    public void setVoted(String voted) {
        this.voted = voted;
    }

    @Override
    public String toString() {
        return "Parent{" + "name=" + name + ", icNo=" + icNo + ", voted=" + voted + '}';
    }

}
