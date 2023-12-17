package com.mnj.strategydesignpattern

class Context {

    fun makePayment(stratergy: PaymentStrategy) {
        stratergy.payment()
    }
}