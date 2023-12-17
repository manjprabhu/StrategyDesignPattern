package com.mnj.strategydesignpattern

class CreditCardPayment: PaymentStrategy {

    override fun payment() {
        println("==>> Credit Card payment")
    }
}