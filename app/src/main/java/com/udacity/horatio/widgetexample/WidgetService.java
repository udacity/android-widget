package com.udacity.horatio.widgetexample;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by horatio on 1/21/16.
 */
public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {

        WidgetDataProvider dataProvider = new WidgetDataProvider(
                getApplicationContext(), intent);
        return dataProvider;

    }
}
