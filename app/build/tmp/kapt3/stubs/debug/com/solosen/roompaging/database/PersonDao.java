package com.solosen.roompaging.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/solosen/roompaging/database/PersonDao;", "", "addPerson", "", "person", "Lcom/solosen/roompaging/person/Person;", "Landroidx/paging/DataSource$Factory;", "", "app_debug"})
public abstract interface PersonDao {
    
    @androidx.room.Insert()
    public abstract void addPerson(@org.jetbrains.annotations.NotNull()
    com.solosen.roompaging.person.Person person);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Person")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.solosen.roompaging.person.Person> person();
}