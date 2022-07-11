package chapter14_lambda.lambdaEx01;

public class LambdaEx01 {

    static void execute(MyFunction myFunction) {
        myFunction.run();
    }

    static MyFunction getMyFunction() {
        MyFunction function = () -> System.out.println("function3.run()");
        return function;
    }


    public static void main(String[] args) {

        MyFunction function1 = () -> System.out.println("function01.run()");

        MyFunction function2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("function02.run()");
            }
        };
        MyFunction f3 = getMyFunction();

        function1.run();
        function2.run();
        f3.run();

        execute(function1);
        execute(() -> System.out.println("run()"));
    }
}
