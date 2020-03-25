package com.waqas.wallstreetbets;

import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import androidx.room.Update;

public interface WSBDAO {
    @Insert
    void insert(WSBEntity options);
    @Update
    void update(WSBEntity options);
    @Delete
    void delete(WSBEntity options);
    @Query("")
    void delete(String id);
}

@Database(entities = {WSBEntity.class}, version = 1, exportSchema = false)
abstract class WSBDatabase extends RoomDatabase{
    public abstract WSBDAO wsbdao();
}
