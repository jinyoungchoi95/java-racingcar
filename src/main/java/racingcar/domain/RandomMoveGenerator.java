package racingcar.domain;

import java.util.Random;

public class RandomMoveGenerator implements MoveGenerator {

    private static final Random random = new Random();
    private static final int MAX_NUMBER = 10;
    private static final int MOVABLE_NUMBER = 4;

    @Override
    public boolean isMovable() {
        return random.nextInt(MAX_NUMBER) >= MOVABLE_NUMBER;
    }
}
