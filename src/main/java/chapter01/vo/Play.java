package chapter01.vo;

import chapter01.vo.PlayType;

public class Play {
    private String name;
    private PlayType type;

    public Play(String name, PlayType playType) {
        this.name = name;
        this.type = playType;
    }

    public String getName() {
        return name;
    }
    public chapter01.vo.PlayType getType() {
        return type;
    }
}
