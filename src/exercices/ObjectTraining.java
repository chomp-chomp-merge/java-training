public class ObjectTraining {

    private String name = "Robot#1";
    private int age = 1;
    private boolean wilder = false;

    public ObjectTraining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWilder() {
        return this.wilder;
    }

    public void setWilder(boolean wilder) {
        this.wilder = wilder;
    }

    public String whoAmI() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }
    
    public ObjectTraining() {
    }
}
