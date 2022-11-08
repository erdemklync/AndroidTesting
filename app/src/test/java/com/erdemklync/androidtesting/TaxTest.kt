package com.erdemklync.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var taxCalculator: TaxCalculator

    @Before
    fun setup() {
        taxCalculator = TaxCalculator()
    }

    @Test
    fun `Calculate tax`() {
        val tax = taxCalculator.calculateTax(5000.0,0.1)
        assertThat(tax).isEqualTo(500)
    }

    @Test
    fun `Calculate income`() {
        val netIncome = taxCalculator.calculateIncome(5000.0, 0.1)
        assertThat(netIncome).isEqualTo(4500)
    }
}