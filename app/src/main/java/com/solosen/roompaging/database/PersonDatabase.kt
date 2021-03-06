package com.solosen.roompaging.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.solosen.roompaging.person.Person

@Database(
    entities = [Person::class],
    version = 1,
    exportSchema = false
)
abstract class PersonDatabase : RoomDatabase() {

    abstract fun personDao(): PersonDao
}
