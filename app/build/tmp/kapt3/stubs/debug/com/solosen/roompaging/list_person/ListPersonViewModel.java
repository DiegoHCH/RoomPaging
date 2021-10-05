package com.solosen.roompaging.list_person;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/solosen/roompaging/list_person/ListPersonViewModel;", "Landroidx/lifecycle/ViewModel;", "personDao", "Lcom/solosen/roompaging/database/PersonDao;", "(Lcom/solosen/roompaging/database/PersonDao;)V", "getPersonDao", "()Lcom/solosen/roompaging/database/PersonDao;", "personPagedLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/solosen/roompaging/person/Person;", "getPersonPagedList", "", "putPersonPagedList", "app_debug"})
public final class ListPersonViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.solosen.roompaging.person.Person>> personPagedLiveData;
    @org.jetbrains.annotations.NotNull()
    private final com.solosen.roompaging.database.PersonDao personDao = null;
    
    public final void getPersonPagedList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.solosen.roompaging.person.Person>> putPersonPagedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.solosen.roompaging.database.PersonDao getPersonDao() {
        return null;
    }
    
    public ListPersonViewModel(@org.jetbrains.annotations.NotNull()
    com.solosen.roompaging.database.PersonDao personDao) {
        super();
    }
}