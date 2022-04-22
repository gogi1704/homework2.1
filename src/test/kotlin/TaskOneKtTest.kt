import org.junit.Assert.assertEquals
import org.junit.Test


    class TaskOneKtTest {

        @Test
        fun calcComission_withMaestroAndMC() {
            //arrange
            val cardType = masterCard
            val totalAmountFroamMonth = 0
            val sumPay = 77_000 * 100
            val sumPay2 = 1000 * 100
            //act
            val result = calcComission(cardType, totalAmountFroamMonth, sumPay)
            val result2 = calcComission(cardType, totalAmountFroamMonth, sumPay2)
            //assert
            assertEquals(464_000, result)
            assertEquals(1, result2)
        }

        @Test
        fun calcComission_withVkPay() {
            //arrange
            val cardType = vkPay
            val totalAmountFroamMonth = 0
            val sumPay = 30_000
            //act
            val result = calcComission(cardType, totalAmountFroamMonth, sumPay)
            //assert
            assertEquals(0, result)
        }

        @Test
        fun calcComission_withVisaAndMir() {
            //arrange
            val cardType = visa
            val totalAmountFroamMonth = 0
            val sumPay = 400 * 100
            val sumPay2 = 2000 * 100
            //act
            val result = calcComission(cardType, totalAmountFroamMonth, sumPay)
            val result2 = calcComission(cardType, totalAmountFroamMonth, sumPay2)
            //assert
            assertEquals(35 * 100, result)
            assertEquals(150 * 100, result2)
        }
    }
