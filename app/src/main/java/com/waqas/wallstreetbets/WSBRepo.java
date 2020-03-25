package com.waqas.wallstreetbets;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

public class WSBRepo {
    private String DB_NAME = "";

    private WSBDatabase wsbDatabase;

    public WSBRepo(Context context){
        wsbDatabase = Room.databaseBuilder(context, WSBDatabase.class, DB_NAME).build();
    }

    public void insertOption(Integer id){
        WSBEntity wsb = new WSBEntity(id);
    }

    public void insertTask(final WSBEntity wsbEntity){
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                wsbDatabase.wsbdao().insert(wsbEntity);
                return null;
            }
        }.execute();
    }

    public void updateTask(final WSBEntity wsbEntity){
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                wsbDatabase.wsbdao().update(wsbEntity);
                return null;
            }
        }.execute();
    }

    public void deleteTask(final WSBEntity wsbEntity){
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                wsbDatabase.wsbdao().delete(wsbEntity);
                return null;
            }
        }.execute();
    }
}
