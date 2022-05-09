package Generics.seasons;

public enum SeasonsYear {
    WINTER("Winter", 90), SPRING("Spring", 92), SUMMER("Summer", 92), AUTUMN("Autumn", 91);

    private final String description;
    private final Integer countOfDays;

    SeasonsYear(String description, Integer countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    @Override
    public String toString() {
        return description + " - пора года" + ", " +  countOfDays + " - количество дней в этот сезон";
    }
}


