package br.com.carolchiaradia.imc_gordinho.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)