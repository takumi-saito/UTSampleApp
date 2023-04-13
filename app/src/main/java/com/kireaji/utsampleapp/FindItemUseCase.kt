package com.kireaji.utsampleapp

class FindItemUseCase(private val itemRepository: ItemRepository) {
    fun execute(item: String): String? {
        return itemRepository.findItem(item)
    }
}