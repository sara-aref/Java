public class Operation {
    public double div(double num1,double num2) throws RunException{
        if(num2==0){
            throw new RunException("Error! you divide by zero");
        }
        return num1/num2;


    }
    public double root(double num1) throws RunException{
        if(num1<0){
        throw new RunException("Error! you try to make square root on negative number");
        }
        return Math.sqrt(num1);

    }
    public  double diff(double num1,double num2) throws RunException{
        if(num1<num2){
                    throw new RunException("The result should be positive.");
        }
        return num1-num2;
    }
}
