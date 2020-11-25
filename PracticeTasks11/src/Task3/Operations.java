package Task3;

public abstract class Operations implements Operation{
    Const const_1;
    Const const_2;
    Variable variable;
    Operations operation1;
    Operations operation2;

    @Override
    public int evaluate(int number) {
        return 0;
    }
}
