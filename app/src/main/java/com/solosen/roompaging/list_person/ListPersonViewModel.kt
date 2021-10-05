package com.solosen.roompaging.list_person

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import androidx.paging.toLiveData
import com.solosen.roompaging.database.PersonDao
import com.solosen.roompaging.person.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class ListPersonViewModel(val personDao: PersonDao) : ViewModel() {

    private lateinit var personPagedLiveData: LiveData<PagedList<Person>>

    fun getPersonPagedList() {

        runBlocking {
            personPagedLiveData = withContext(Dispatchers.Default) {
                val config = PagedList.Config.Builder()
                    .setPageSize(10)
                    .setEnablePlaceholders(false)
                    .build()
                personDao.person().toLiveData(config)
            }
        }
    }

    fun putPersonPagedList() = personPagedLiveData
}