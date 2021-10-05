package com.solosen.roompaging

import android.app.Application
import androidx.room.Room
import com.solosen.roompaging.add_person.AddPersonViewModel
import com.solosen.roompaging.database.PersonDatabase
import com.solosen.roompaging.list_person.ListPersonViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(
                databaseModule,
                viewModelModule
            ))
        }
    }
}

val databaseModule = module {
    single { Room.databaseBuilder(get(), PersonDatabase::class.java, "database_t4two").build() }
    single { get<PersonDatabase>().personDao() }
}

val viewModelModule = module {
    viewModel { AddPersonViewModel(get()) }
    viewModel { ListPersonViewModel(get()) }
}