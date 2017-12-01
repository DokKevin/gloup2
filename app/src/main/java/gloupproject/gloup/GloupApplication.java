package gloupproject.gloup;

import android.app.Application;
import android.arch.persistence.room.Room;

import gloupproject.gloup.database.AppDatabase;

/**
 * Created by Brad on 12/1/17.
 */

//This class allows us to add custom code that will be run on startup of the app.
public class GloupApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "gloup-database").build();
    }

}
