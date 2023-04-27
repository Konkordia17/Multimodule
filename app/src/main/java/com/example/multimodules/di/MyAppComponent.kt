package com.example.multimodules.di

import android.content.Context
import com.example.core.di.CoreModule
import com.example.data.Database
import com.example.data.di.DataModule

class MyAppComponent(val context: Context) : AppComponent {
    private val dataModule = DataModule()
    private val coreModule = CoreModule()

    override fun getDatabase(): Database {
        return dataModule.provideDatabase(context,coreModule.provideFileManager())
    }
}