package or_dvir.hotmail.com.justkotlin

class Main
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println(solution(intArrayOf(-1,-3)))
        }

        fun solution(a: IntArray): Int
        {
            //return smallest positive integer which is NOT in "a"
            //a may have duplicates - DONE
            //a may have negative numbers - DONE
            //0 is NOT positive - DONE
            //max size of array is 100,000 elements

            //sort the array
            val updatedList = a.filter { it > 0 }.distinct().sorted()

            for (i in 1..100_000)
            {
                if(!updatedList.contains(i))
                    return i
            }

            //if updatedList is all the numbers between 1-1,000,000
            //then the smallest integer NOT in updatedList is 1,000,001
            return 1_000_001
        }
    }
}