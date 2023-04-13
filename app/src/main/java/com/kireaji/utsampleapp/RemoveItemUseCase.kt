package com.kireaji.utsampleapp

class RemoveItemUseCase(private val itemRepository: ItemRepository) {
    fun execute(item: String): List<String> {
        return itemRepository.removeItem(item)
    }
}