package com.kireaji.utsampleapp

interface ItemRepository {
    fun addItem(item: String): List<String>
    fun removeItem(item: String): List<String>
    fun findItem(item: String): String?
}
