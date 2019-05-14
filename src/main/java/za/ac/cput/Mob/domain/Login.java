package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Login {
    private String username;
    private String password;
    public Login(){}

    private Login(Builder builder){

        this.username = builder.username;
        this.password = builder.password;

    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String username;
        private String password;
        public Builder username( String username) {
            this.username = username;
            return this;
        }
        public Builder password( String password) {
            this.password = password;
            return this;
        }
        public Builder copy(Login login){

            this.password = login.password;
            this.username = login.username;
                        return this;
        }

        public Login build() {
            return new Login(this);
        }

    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(username, login.username) &&
                Objects.equals(password, login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
