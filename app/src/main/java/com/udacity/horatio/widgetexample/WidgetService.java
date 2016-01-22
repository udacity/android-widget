package com.udacity.horatio.widgetexample;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by horatio on 1/21/16.
 */
public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetDataProvider(this, intent);
    }
}
