package com.denreyes.chapter6

import android.app.Application
import com.denreyes.chapter6.di.appModules
import org.koin.core.context.startKoin

class ChapterSixApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModules)
        }
    }
}