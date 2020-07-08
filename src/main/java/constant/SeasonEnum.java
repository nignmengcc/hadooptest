package constant;

/**
 * @author didi
 */

public enum SeasonEnum {
    SPRING(1);
    private int seq;

    SeasonEnum(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }
}
