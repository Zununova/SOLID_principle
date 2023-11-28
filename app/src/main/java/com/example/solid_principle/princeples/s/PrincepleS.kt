package com.example.solid_principle.princeples.s

// Single Responsibility - Принцип единной ответственности

// Не правильно:
class NetWordApp() {

    fun sendRequest(data: String) {}
    fun dataProcessing() {}
}

// Правильно:
class NetWorkApiService() {
    fun sendRequest(data: String) {}
}

class NetWorkRepository() {
    fun dataProcessing() {}
}