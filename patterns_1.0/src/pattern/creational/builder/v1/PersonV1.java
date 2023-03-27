package pattern.creational.builder.v1;

import java.util.List;

public class PersonV1 {

    private int id;
    private String name;
    private int age;
    private List<String> books;

    public static class Builder {
        private PersonV1 personV1;

        public Builder() {
            this.personV1 = new PersonV1();
        }

        public Builder withId(int id) {
            personV1.id = id;
            return this;
        }

        public Builder withName(String name) {
            personV1.name = name;
            return this;
        }

        public Builder withAge(int age) {
            personV1.age = age;
            return this;
        }

        public Builder withBooks(List<String> books){
            personV1.books = books;
            return this;
        }

        public PersonV1 build() {
            return personV1;
        }
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
