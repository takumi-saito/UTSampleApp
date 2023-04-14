package com.kireaji.utsampleapp

interface ItemRepository {
    fun addItem(item: String): List<String>
    fun addAllItems(items: List<String>): List<String>
    fun removeItem(item: String): List<String>
    fun findItem(item: String): String?
    fun takeItems(take: Int): List<String>
    fun firstItem(): String?
    fun lastItem(): String?
}
