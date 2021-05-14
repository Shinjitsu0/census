package census;

public enum Education {
    ELEMENTARY("Начальное"),
    SECONDARY("Среднее"),
    FURTHER("Дальнейшее"),
    HIGHER("Высшее");

    private String title;

    Education(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title;
    }
}
