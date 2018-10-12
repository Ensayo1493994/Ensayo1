package ragp.provicional.com.proyectoensayo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PRREK on 12/10/2018.
 */

public class GestorDB extends SQLiteOpenHelper {
    public GestorDB(Context context) {
        super(context, "asd.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
