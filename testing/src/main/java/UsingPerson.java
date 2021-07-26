public class UsingPerson {
    public static void main(String[] args) {
        // First block
        String name = "Lina Starovolkov";
        int oldAge = 19;
        String eyeColor = "Green";

        Person newPerson = new Person();

        newPerson.setName(name);
        newPerson.setEyeColor(eyeColor);
        newPerson.setOldAge(oldAge);

        // Second block
        String name2 = "Freya Braggi";
        int oldAge2 = 20;
        String eyeColor2 = "Blue";

        Person newPerson2 = new Person(oldAge, name2, eyeColor2);

        Person newPerson3 = new Person(21, "Frisk Amethyst", "blue-green");

        System.out.println("First person log -> name:" + newPerson.getName() + " Age:" +
                newPerson.getOldAge() + " Eye color:" + newPerson.getEyeColor());
        System.out.println("Second person log -> name:" + newPerson2.getName() + " Age:" +
                newPerson2.getOldAge() + " Eye color:" + newPerson2.getEyeColor());
        System.out.println("Third person log -> name:" + newPerson3.getName() + " Age:" +
                newPerson3.getOldAge() + " Eye color:" + newPerson3.getEyeColor());
    }
}
