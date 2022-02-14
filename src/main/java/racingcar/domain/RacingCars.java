package racingcar.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.controller.RacingCarDto;

public class RacingCars {

    private static final String CAR_NAME_DELIMITER = ",";
    private static final String NAME_BLANK = " ";
    private static final String NAME_NOT_BLANK = "";

    private final List<RacingCar> cars;

    public RacingCars(List<RacingCar> cars) {
        this.cars = cars;
    }

    public static RacingCars from(String names) {
        List<RacingCar> cars = Arrays.stream(names.split(CAR_NAME_DELIMITER))
            .map(RacingCars::removeNameBlank)
            .map(Name::new)
            .map(RacingCar::new)
            .collect(Collectors.toList());
        return new RacingCars(cars);
    }

    private static String removeNameBlank(String name) {
        return name.replaceAll(NAME_BLANK, NAME_NOT_BLANK);
    }

    public List<String> getCarNames() {
        return cars.stream()
            .map(RacingCar::getName)
            .collect(Collectors.toList());
    }

    public List<RacingCarDto> getRacingCars() {
        return cars.stream()
            .map(RacingCarDto::from)
            .collect(Collectors.toList());
    }

    public void moveCars() {
        cars.forEach(RacingCar::move);
    }

    public List<String> calculateWinnerNames() {
        int winnerPosition = calculateWinnerPosition();
        return cars.stream()
            .filter(car -> car.comparePosition(winnerPosition))
            .map(RacingCar::getName)
            .collect(Collectors.toList());
    }

    private int calculateWinnerPosition() {
        return Collections.max(cars.stream()
            .map(RacingCar::getPosition)
            .collect(Collectors.toList()));
    }
}
