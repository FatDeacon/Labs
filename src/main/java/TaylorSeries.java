public class TaylorSeries
{
    //simulates the equation
    public static double approximateExp(int x, int numIterations)
    {
        double approximation = 0;

        //loops equation until n reaches 0
        while(numIterations >= 0)
        {
            approximation = approximation + (pow(x, numIterations)/factorial(numIterations));

            numIterations = numIterations - 1;
        }

        return approximation;
    }

    public static double factorial(int numIterations)
    {
        //base case
        if (numIterations == 0)
        {
            return 1;
        }

        //calculates n!
        return numIterations * factorial(numIterations - 1);
    }

    public static double pow(int x, int numIterations)
    {
        //base case
        if (numIterations == 0)
        {
            return 1;
        }

        //calculates x^n
        return x * pow(x, numIterations - 1);
    }

}
