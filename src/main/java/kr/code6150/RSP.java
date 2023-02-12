package kr.code6150;

import java.util.Arrays;
import java.util.Optional;

public enum RSP { //Rock Scissors Paper

    SCISSORS(0, "가위"),
    ROCK(1, "바위"),
    PAPER(2, "보");

    private int ran;
    private String kor;

    RSP( int ran, String kor ) {
        this.ran = ran;
        this.kor = kor;
    }

    public String getKor() { return kor; }
    public boolean isWinner( RSP other ) {
        switch (other) {
            case SCISSORS:
                return this == ROCK;
            case ROCK:
                return this == PAPER;
            case PAPER:
                return this == SCISSORS;
        }
        return false;
    }

    //맴버 함수 - 객체가 생성되어야지만
    public static RSP indexOf(int ran) throws TypeNotFoundException {

        Optional<RSP> o = Arrays.stream(RSP.values()).filter((i) -> ran == i.ran).findFirst();
        if(o.isPresent()) return o.get();
        else throw new TypeNotFoundException();

    }

}
