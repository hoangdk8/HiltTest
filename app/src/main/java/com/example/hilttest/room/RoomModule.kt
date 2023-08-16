package com.example.hilttest.room

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "app_database").build()
        // sử dụng Hilt để tạo Room Database
    }

    @Provides
    fun provideUserDao(database: AppDatabase): UserDao {
        return database.userDao()
        //sử dụng Hilt để cung cấp UserDao
    }
}