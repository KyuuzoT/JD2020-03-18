package by.it.borys.jd01_09;


abstract class Var implements Operation {

    static Var createVar(String operand) {
        operand = operand.trim().replaceAll("\\s*", "");
        if (operand.matches(Pattern.SCALAR)) {
            return new Scalar(operand);
        }
        if (operand.matches(Pattern.VECTOR)) {
            return new Vector(operand);
        }
        if (operand.matches(Pattern.MATRIX)) {
            return new Matrix(operand);
        }
        return null;
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения " + this + "+" + other + " невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания " + this + "-" + other + " невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения " + this + "*" + other + " невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления " + this + "/" + other + " невозможна");
        return null;
    }
}
