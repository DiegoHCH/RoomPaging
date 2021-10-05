package com.solosen.roompaging.database;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.solosen.roompaging.person.Person;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PersonDao_Impl implements PersonDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Person> __insertionAdapterOfPerson;

  public PersonDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPerson = new EntityInsertionAdapter<Person>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `person` (`id`,`first_name`,`last_name`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Person value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
      }
    };
  }

  @Override
  public void addPerson(final Person person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPerson.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public DataSource.Factory<Integer, Person> person() {
    final String _sql = "SELECT * FROM Person";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Person>() {
      @Override
      public LimitOffsetDataSource<Person> create() {
        return new LimitOffsetDataSource<Person>(__db, _statement, false , "Person") {
          @Override
          protected List<Person> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(cursor, "first_name");
            final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(cursor, "last_name");
            final List<Person> _res = new ArrayList<Person>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Person _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpFirstName;
              _tmpFirstName = cursor.getString(_cursorIndexOfFirstName);
              final String _tmpLastName;
              _tmpLastName = cursor.getString(_cursorIndexOfLastName);
              _item = new Person(_tmpId,_tmpFirstName,_tmpLastName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
