import org.junit.Assert.assertEquals
import org.junit.Test


class TaskOneKtTest {

    @Test
    fun calcComission_withMaestroAndMC() {
        //arrange
        val cardType = masterCard
        val sumPay = 77_000 * 100
        val sumPay2 = 1000 * 100
        //act
        val result = calcComission(cardType, sumPay)
        val result2 = calcComission(cardType, sumPay2)
        //assert
        assertEquals(464_000, result)
        assertEquals(0, result2)
    }

    @Test
    fun calcComission_withVkPay() {
        //arrange
        val cardType = vkPay
        val sumPay = 30_000
        //act
        val result = calcComission(cardType,  sumPay)
        //assert
        assertEquals(0, result)
    }

    @Test
    fun calcComission_withVisaAndMir() {
        //arrange
        val cardType = visa
        val sumPay = 400 * 100
        val sumPay2 = 2000 * 100
        //act
        val result = calcComission(cardType, sumPay)
        val result2 = calcComission(cardType, sumPay2)
        //assert
        assertEquals(35 * 100, result)
        assertEquals(150 * 100, result2)
    }
}
