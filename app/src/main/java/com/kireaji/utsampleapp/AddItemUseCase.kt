package com.kireaji.utsampleapp

class AddItemUseCase(private val itemRepository: ItemRepository) {
    fun execute(item: String): List<String> {
        return itemRepository.addItem(item)
    }

    fun execute(items: List<String>): List<String> {
        return itemRepository.addAllItems(items)
    }
}
