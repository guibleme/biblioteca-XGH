package br.com.unipar.exampleroom.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import br.com.unipar.exampleroom.dao.CarDao;
import br.com.unipar.exampleroom.entities.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CarDao carDao();
}
