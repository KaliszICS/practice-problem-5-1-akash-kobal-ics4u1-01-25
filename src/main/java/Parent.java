import java.util.ArrayList;

class Parent extends Person {
    private Parent spouse;
    private Child[] children;
    
    // Has a constructor that includes the name and age inherited from Person, 
    // and a spouse field (parent object).
    public Parent(String name, int age, Parent spouse) { 
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[0];
    }

    // Has a secondary Constructor that is the same as person.
    public Parent(String name, int age) { 
        super(name, age);
        this.spouse = null;
        this.children = new Child[0];
    }

    // Has a spouse field that holds their husband/wife(also a parent object). 
    // This will default to null.
    public Object spouse() {
        return spouse;
    }

    // Has a children field that holds all their children. Starts as an empty 
    // array of Childs.
    public Child[] children() {
        return children;
    }
    // Setters and getters for all fields. (setName, getName, setAge, getAge, 
    // setSpouse, getSpouse, setChildren, getChildren)
    public void setName(String name) {
        super.name = name;
    }
    public String getName() {
        return super.name;
    }
    public void setAge(int age) {
        super.age = age;
    }
    public int getAge() {
        return super.age;
    }
    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }
    public Parent getSpouse() {
        return this.spouse;
    }
    public void setChildren(Child[] children) {
        this.children = children;
    }
    public Child[] getChildren() {
        return children;
    }
    
    public void addChild(Child child) {
    Child[] newArray = new Child[children.length + 1];
    for (int i = 0; i < children.length; i++) {
        newArray[i] = children[i];
    }
    newArray[children.length] = child;
    children = newArray;
    }

}

