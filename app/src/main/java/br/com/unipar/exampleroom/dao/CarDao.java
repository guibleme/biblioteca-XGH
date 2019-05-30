package br.com.unipar.exampleroom.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.com.unipar.exampleroom.entities.Car;

@Dao
public interface CarDao {

    @Insert
    void insertAll(Car... car);

    @Update
    void update(Car car);

    @Delete
    void delete(Car car);

    @Query("SELECT * FROM CAR")
    List<Car> findAll();
}
