package relationships;

public class MemberParticipatesInContest {
    private String username;
    private Integer contestNumber;
    private String finishTime; // convert string to time stamp ?
    private Integer score;

    public MemberParticipatesInContest(String username, Integer contestNumber, String finishTime, Integer score) {
        this.username = username;
        this.contestNumber = contestNumber;
        this.finishTime = finishTime;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public Integer getContestNumber() {
        return contestNumber;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContestNumber(Integer contestNumber) {
        this.contestNumber = contestNumber;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
