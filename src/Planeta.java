public enum Planeta {
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    SATURN(10759),
    URANUS(30687),
    NEPTUNE(60200),
    PLUTO(90530);
     int dayOfAYear;

    Planeta(int dayOfAYear) {
        this.dayOfAYear = dayOfAYear;

    }

    @Override
    public String toString() {
        return "Planeta{" +
                "dayOfAYear=" + dayOfAYear +
                '}';
    }

}
