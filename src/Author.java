import java.util.Objects;

public class Author {
    private final String firstName ;
    private final String lastName;

    public Author(String firstName , String lastName) {
        this.firstName = firstName ;
        this.lastName = lastName ;
    }

    public String toString() {
        return this.firstName + " " + this.lastName ;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


}
