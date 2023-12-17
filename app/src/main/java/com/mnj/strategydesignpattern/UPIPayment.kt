package com.mnj.strategydesignpattern

class UPIPayment : PaymentStrategy {
    override fun payment() {
        println("==>>UPI Payment")
    }
}