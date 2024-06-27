package Mockito;

public class Calculator {

    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int add(int a, int b) {
        return calculatorService.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculatorService.subtract(a, b);
    }
}
