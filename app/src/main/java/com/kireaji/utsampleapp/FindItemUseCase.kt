package com.kireaji.utsampleapp

class FindItemUseCase(private val itemRepository: ItemRepository) {
    fun findItem(item: String): String? {
        return itemRepository.findItem(item)
    }

    fun takeItems(): List<String> {
        return itemRepository.takeItems(3)
    }

    fun firstItem(): String? {
        return itemRepository.firstItem()
    }

    fun lastItem(): String? {
        return itemRepository.lastItem()
    }
}