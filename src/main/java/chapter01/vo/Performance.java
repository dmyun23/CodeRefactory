package chapter01.vo;

public class Performance {
    private String playId;
    private int audience;

    public Performance(String playId, int audience) {
        this.playId = playId;
        this.audience = audience;
    }

    public String getPlayId() {
        return playId;
    }
    public int getAudience() {
        return audience;
    }
    public void setPlayId(String playId) {
        this.playId = playId;
    }
    public void setAudience(int audience) {
        this.audience = audience;
    }
}
