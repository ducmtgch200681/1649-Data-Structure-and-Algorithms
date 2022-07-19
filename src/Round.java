public class Round
{

    public static long my_pow(int x, int y)
    {
        long result = 1;
        for (int i = 0; i < y; i++)
        {
            result *= x;
        }
        return result;
    }

    public static double my_round(double n, int o)
    {
        long h = my_pow(10, o);

        //        if (round % 10 >= 5)
//            round = round + 10;
//            round /= h;
//
//        if (round % 10 < 5)
//            round = round - h%10;
//            round /= h;

        return (int) (n*h + 0.5)*1.0 / h;
    }
}
