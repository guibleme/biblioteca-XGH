package br.com.unipar.exampleroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import br.com.unipar.exampleroom.database.AppDatabase;
import br.com.unipar.exampleroom.entities.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view) {

        AppDatabase db =
                Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "database")
                        .allowMainThreadQueries()
                        .build();

        //Fazer um select da lista de carros
        List<Car> cars = db.carDao().findAll();

        //Object
        Car car = new Car();
        car.setBrand("Ford");
        car.setColor("Blue");
        car.setModel("Ford Ka");

        //Insert new car
        db.carDao().insertAll(car);
    }
}
