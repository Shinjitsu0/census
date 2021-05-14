package census;

public enum Sex {
    MAN ("Мужчина"),
    WOMAN ("Женщина");

    private String title;

    Sex(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
