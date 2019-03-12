package or_dvir.hotmail.com.justkotlin

class Main
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println(solution(intArrayOf(-1, -3)))
        }

        @Suppress("MemberVisibilityCanBePrivate")
        fun solution(a: IntArray): Int
        {
            //return smallest positive integer which is NOT in "a"
            //a may have duplicates
            //a may have negative numbers
            //0 is NOT positive
            //max size of array is 100,000 elements
            //each element is between -1,000,000 and 1,000,000

            val updatedList = a.filter { it > 0 }.distinct().toHashSet()

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