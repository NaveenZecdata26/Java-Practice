package DesignPatterns;

class User {

    private String name;
    private String email;
    private String address;
    private String mobile;
    private int age;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.mobile = userBuilder.mobile;
        this.address = userBuilder.address;
    }

    public String toString() {
        return "User{ name : '" + name + "', email : '" + email + "', address :'" + address + "','" + mobile + "', age : '" + age + "'}";
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String address;
        private String mobile;
        private int age;


        UserBuilder(String name, String email)
        {
            this.name = name;
            this.email = email;

        }

        UserBuilder age(int age)
        {
            this.age =age ;
            return this;
        }
        UserBuilder address(String address)
        {
            this.address = address;
            return this;
        }
        UserBuilder mobile(String mobile)
        {
            this.mobile = mobile;
            return this;
        }

        User build()
        {
            return new User(this);
        }
    }

}

public class Builder {
    public static void main(String[] args) {

        User user  =  new User.UserBuilder("naveen","naveen.p@zecata.com").age(25).address("Indore").mobile("9691832145").build();

        System.out.println(user);
    }
}
