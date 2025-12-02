import java.util.ArrayList;

class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        super.name = name;
        super.age = age;
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }

    public Child[] siblings() {
        return siblings;
    }
    public void setName() {
        super.name = name;
    }
    public String getName() {
        return super.name;
    }
    public void setAge() {
        super.age = age;
    }
    public int getAge() {
        return super.age;
    }
    public Parent getParent1() {
        return parent1;
    }
    public Parent getParent2() {
        return parent2;
    }
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }
    public Child[] getSiblings() {
        return this.siblings;
    }
    public void addSibling(Child sibling) {
    Child[] newArray = new Child[siblings.length + 1];
    for (int i = 0; i < siblings.length; i++) {
        newArray[i] = siblings[i];
    }
    newArray[siblings.length] = sibling;
    siblings = newArray;
    }
}
