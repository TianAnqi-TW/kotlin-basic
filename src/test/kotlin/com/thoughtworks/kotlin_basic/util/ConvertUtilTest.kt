package com.thoughtworks.kotlin_basic.util
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class ConvertUtilTest {
    @Test
    fun testConvert(){
        val convertUtil = ConvertUtil()
        assertEquals(convertUtil.convert(1, 1), mutableListOf("A"), "Expected result to be [A]")
        assertEquals(convertUtil.convert(1, 2), mutableListOf("A","B"), "Expected result to be [A, B]")
        assertEquals(convertUtil.convert(26, 3), mutableListOf("Z", "AA", "AB"), "Expected result to be [Z, AA, AB]")
        assertEquals(convertUtil.convert(701, 5), mutableListOf("ZY", "ZZ", "AAA","AAB","AAC"), "Expected result to be [ZY, ZZ, AAA, AAB, AAC]")
    }

    @Test
    fun testConvertExceedsZZZ(){
        val convertUtil = ConvertUtil()
        assertFailsWith<IllegalStateException> { convertUtil.convert(99999, 5) }
    }
}