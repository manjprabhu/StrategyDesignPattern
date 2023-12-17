package com.mnj.strategydesignpattern

class PayPalPayment:PaymentStrategy {

    override fun payment() {
        println("==>>PayPal Payment")

    }
}