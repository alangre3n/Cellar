package cellar;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Bank {
    protected final String name;

    @Override
    public String toString() {
        return "Банка "
                 + name;
    }
}
