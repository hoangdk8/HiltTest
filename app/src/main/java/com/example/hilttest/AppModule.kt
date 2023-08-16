package com.example.hilttest

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.hilttest.room.AppDatabase
import com.example.hilttest.room.UserDao
import com.example.hilttest.room.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }
}
