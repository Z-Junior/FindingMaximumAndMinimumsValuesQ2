/**
 * @author Z
 * @since 13 December 2017
 */

import java.util.Scanner;

public class FindingMaxAndMins
{
    public static int HOURS_PER_DAY = 4; //0x18
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        int iTemp, iMaxTime = -1, iMax = -9999, iMin = 9999, iMinTime = -1;

        for (int i = 0; i < HOURS_PER_DAY; i++)
        {
            iTemp = PromptInt(String.format("Enter the temperature reading at %d hours: ", i));

            if (iTemp > iMax)
            {
                iMax = iTemp;
                iMaxTime = i;
            }
            else if (iTemp < iMin)
            {
                iMin = iTemp;
                iMinTime = i;
            }
        }

        System.out.println(String.format("Highest temperature was %d degrees at %d hours", iMax, iMaxTime));
        System.out.println(String.format("Lowest temperature was %d degrees at %d hours", iMin, iMinTime));
    }

    private static int PromptInt(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt())
        {
            System.out.flush();

            System.out.print("Whole number only: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
