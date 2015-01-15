package cbedoy.easterlist.aplication;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;

/**
 * Created by Carlos Bedoy on 1/15/15.
 * <p/>
 * Mobile App Developer - EasterList
 * <p/>
 * Pademobile
 */
public class ApplicationLoader extends Application
{

    public static volatile Context mainContext;
    public static volatile LayoutInflater mainLayoutInflater;
    public static volatile Handler mainHandler;

    @Override
    public void onCreate()
    {
        super.onCreate();

        mainContext = getApplicationContext();
        mainLayoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        mainHandler = new Handler(mainContext.getMainLooper());
    }


}
