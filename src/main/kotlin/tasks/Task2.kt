fun main() {
    val orderOne: Order = Order.Confirmed("1", Payment.Cash)
    val orderTwo: Order = Order.Cancelled("złe", Payment.Card("0000 0000"))
    val one = processOrder(orderOne)
    val two = processOrder(orderTwo)
    println(one)
    println(two)
}

sealed class Order(val payment: Payment) {
    class Confirmed(val orderNumber: String, payment: Payment) : Order(payment)
    class Cancelled(val reason: String, payment: Payment) : Order(payment)

}

sealed interface Payment {
    object Cash : Payment
    data class Card(val cardNumber: String) : Payment
}

fun processOrder(order: Order): String {
    val result: String = when (order) {
        is Order.Confirmed -> {
            "Zamówienie potwierdzone. Wybrano sposób płatności: ${typeOfPayment(order)}"
        }
        is Order.Cancelled -> {
            "Zamówienie anulowane. Wybrano sposób płatności: ${typeOfPayment(order)}. Powód anulacji: ${order.reason}"
        }
        else -> {
            "Nie rozpoznano"
        }
    }
    return result
}

private fun typeOfPayment(order: Order): String {
    val typeOfPayment: String = when (order.payment) {
        is Payment.Cash -> "gotówka"
        is Payment.Card -> "karta o numerze ${order.payment.cardNumber}"
        else -> "nie określono"
    }
    return typeOfPayment
}


