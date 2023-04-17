package com.kireaji.utsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = ItemRepositoryImpl()
        val findItemUseCase = FindItemUseCase(repository)
        val addItemUseCase = AddItemUseCase(repository)
        val removeItemUseCase = RemoveItemUseCase(repository)

        addItemUseCase.execute("item1")
        addItemUseCase.execute(listOf(
            "item2",
            "item3",
        ))
        Log.d("test", "firstItem: ${findItemUseCase.firstItem()}")
        Log.d("test", "findItem: ${findItemUseCase.findItem("item2")}")
        Log.d("test", "lastItem: ${findItemUseCase.lastItem()}")
        Log.d("test", "takeItems: ${findItemUseCase.takeItems(3)}")
        removeItemUseCase.execute("item1")
        Log.d("test", "takeItems: ${findItemUseCase.takeItems(3)}")
    }
}