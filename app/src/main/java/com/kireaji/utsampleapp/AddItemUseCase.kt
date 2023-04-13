package com.kireaji.utsampleapp

class AddItemUseCase(private val itemRepository: ItemRepository) {
    fun execute(item: String): List<String> {
        return itemRepository.addItem(item)
    }
}
