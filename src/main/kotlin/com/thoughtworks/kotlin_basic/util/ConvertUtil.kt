package com.thoughtworks.kotlin_basic.util

class ConvertUtil {
    fun convert(start:Int, size: Int): MutableList<String> {
        val map = mutableMapOf<Int, Char>()
        for(i in 1..25) {
            map[i] = ('A' + i - 1)
        }
        map[0] = 'Z'

        fun getCharRes(colNum: Int): String{
            var res = ""
            var mutableColNumber = colNum
            while ( mutableColNumber != 0 ){
                val c = map[mutableColNumber % 26]
                if (c != null) {
                    res = c.plus(res)
                }
                if (c != null) {
                    mutableColNumber = (mutableColNumber - ( c.minus('A') + 1) )/ 26
                }
            }
            if(res > "ZZZ" || res.length > 3){
                throw IllegalStateException("计算结果超出ZZZ")
            }
            return res
        }

        val resList = mutableListOf<String>()


        var mutableStart = start
        for(i in 0..<size){
            val numToCharRes = getCharRes(mutableStart)
            resList.add(numToCharRes)
            mutableStart++
        }

        return resList
    }

}