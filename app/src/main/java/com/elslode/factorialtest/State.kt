package com.elslode.factorialtest

sealed class State()

class Error: State()
class Progress: State()
class ResultFactorial(val isCalculateResultFactorial: String): State()