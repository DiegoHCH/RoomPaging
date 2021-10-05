package com.solosen.roompaging.add_person

import android.content.Context
import androidx.lifecycle.ViewModel
import com.solosen.roompaging.database.PersonDao
import com.solosen.roompaging.database.PersonDatabase
import com.solosen.roompaging.person.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class AddPersonViewModel(private val personDao: PersonDao): ViewModel() {

    fun setPerson(person: Person){
        runBlocking{
            withContext(Dispatchers.Default) {
                personDao.addPerson(person)
            }
        }
    }
}