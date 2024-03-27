package com.kireaji.utsampleapp

class ItemRepositoryImpl: ItemRepository{

    private val itemList: MutableList<String> = mutableListOf()

    override fun addItem(item: String): List<String> {
        itemList.add(item)
        return itemList
    }

    override fun addAllItems(items: List<String>): List<String> {
        itemList.addAll(items)
        return itemList
    }

    override fun removeItem(item: String): List<String> {
        itemList.remove(item)
        return itemList
    }

    override fun findItem(item: String): String? {
        return itemList.find { it == item }
    }

    override fun takeItems(take: Int): List<String> {
        return itemList.take(take)
    }

    override fun firstItem(): String? {
        return itemList.firstOrNull()
    }

    override fun lastItem(): String? {
        return itemList.lastOrNull()
    }
}
