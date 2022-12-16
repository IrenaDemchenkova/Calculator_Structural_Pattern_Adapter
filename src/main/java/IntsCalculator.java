public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula =  target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        return  (int) formula.calculate(Calculator.Operation.SUM).result();
         }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        return (int) formula.calculate(Calculator.Operation.MULT).result();
    }

    @Override
        public int pow(int a, int b) {
        Calculator.Formula formula =  target.newFormula();
        formula.addOperand(a);
        formula.addOperand(b);
        return  (int) formula.calculate(Calculator.Operation.POW).result();
        }
}