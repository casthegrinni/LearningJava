public class Person {
    private int oldAge;
    private String name;
    private String eyeColor;

    public Person () {
        this.oldAge = 18;
        this.name = "Stranger";
        this.eyeColor = "Brown";
    }

    public Person(int oldAge, String name, String eyeColor) {
        this.oldAge = oldAge;
        this.name = name;
        this.eyeColor = eyeColor;
    }

    public int getOldAge() {
        return oldAge;
    }

    public void setOldAge(int oldAge) {
        this.oldAge = oldAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void growUp () {
        this.oldAge++;
    }

}
