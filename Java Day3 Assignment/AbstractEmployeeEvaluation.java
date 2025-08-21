// 20. Abstract Employee Evaluation
// Problem: Abstract class PerformanceEvaluation with method evaluate(). Implement in DeveloperEvaluation and ManagerEvaluation.
// Steps:
// 1.	Define abstract class.
// 2.	Override evaluation logic.
// 3.	Print results.

abstract class PerformanceEvaluation {
    abstract String evaluate();
}

class DeveloperEvaluation extends PerformanceEvaluation {
    @Override
    String evaluate() {
        return "Developer performance evaluated based on code quality and deadlines.";
    }
}

class ManagerEvaluation extends PerformanceEvaluation {
    @Override
    String evaluate() {
        return "Manager performance evaluated based on team feedback and project success.";
    }
}
public class AbstractEmployeeEvaluation {
    public static void main(String[] args) {
        PerformanceEvaluation developerEval = new DeveloperEvaluation();
        PerformanceEvaluation managerEval = new ManagerEvaluation();

        System.out.println("Developer Evaluation: " + developerEval.evaluate());
        System.out.println("Manager Evaluation: " + managerEval.evaluate());
    }
}