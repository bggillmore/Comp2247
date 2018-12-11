/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Dec 10, 2018
* Assignment: TeamRecord
* Description: Defines the TeamRecord class intended binary tree
*/
public class TeamRecord implements Comparable<TeamRecord>{
    String teamName;
    int totalWin, totalLoss;

    //constructor
    public TeamRecord(String teamName, int totalWin, int totalLoss) {
        this.teamName = teamName;
        this.totalWin = totalWin;
        this.totalLoss = totalLoss;
    }

    //setters and getters
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(int totalWin) {
        this.totalWin = totalWin;
    }

    public int getTotalLoss() {
        return totalLoss;
    }

    public void setTotalLoss(int totalLoss) {
        this.totalLoss = totalLoss;
    }

    //toSting
    @Override
    public String toString() {
        return "Team Name: " + teamName + " Wins: " + totalWin + ", Losses: " + totalLoss + "\n";
    }

    //compare teamName field
    @Override
    public int compareTo(TeamRecord other) {
        //string compare team name
        return this.teamName.toLowerCase().compareTo(other.teamName.toLowerCase());
    }
    
    
}
