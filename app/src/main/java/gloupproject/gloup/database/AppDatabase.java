package gloupproject.gloup.database;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;

/**
 * Created by Brad on 12/1/17.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
