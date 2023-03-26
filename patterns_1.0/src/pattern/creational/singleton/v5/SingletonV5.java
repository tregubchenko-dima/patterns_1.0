package pattern.creational.singleton.v5;

public enum SingletonV5 {

    INSTANCE;

    private String name;
    private Integer age;

    SingletonV5(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
