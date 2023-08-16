package com.example.hilttest

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    // Phương thức inject để cho Hilt biết cần inject vào MainActivity
    fun inject(activity: MainActivity)
    // Phương thức inject để cho Hilt biết cần inject vào MainFragment
    fun inject(fragment: MyFragment)
}
