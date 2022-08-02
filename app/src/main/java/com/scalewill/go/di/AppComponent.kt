package com.scalewill.go.di

import com.scalewill.go.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun inject(activity: MainActivity)

}