package com.kireaji.utsampleapp

import org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AddItemUseCaseTest {
    @Mock
    private lateinit var itemRepository: ItemRepository

    @Test
    fun addItemUseCase() {
        val item = "NewItem"
        val expectedList: List<String> = listOf("Item1", "Item2", item)
        `when`(itemRepository.addItem(item)).thenReturn(expectedList)

        val addItemUseCase = AddItemUseCase(itemRepository)
        val result = addItemUseCase.execute(item)

        assertEquals(expectedList, result)
    }

    @Test
    fun removeItemUseCase() {
        val item = "Item1"
        val expectedList = listOf("Item2")

        `when`(itemRepository.removeItem(item)).thenReturn(expectedList)

        val removeItemUseCase = RemoveItemUseCase(itemRepository)
        val result = removeItemUseCase.execute(item)

        assertEquals(expectedList, result)
    }

    @Test
    fun findItemUseCase_found() {
        val item = "Item1"

        `when`(itemRepository.findItem(item)).thenReturn(item)

        val findItemUseCase = FindItemUseCase(itemRepository)
        val result = findItemUseCase.execute(item)

        assertEquals(item, result)
    }

    @Test
    fun findItemUseCase_notFound() {
        val item = "Item3"

        `when`(itemRepository.findItem(item)).thenReturn(null)

        val findItemUseCase = FindItemUseCase(itemRepository)
        val result = findItemUseCase.execute(item)

        assertNull(result)
    }
}
