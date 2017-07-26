// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.archos.mediacenter.video.browser.adapters;


import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import com.archos.mediacenter.video.browser.adapters.mappers.VideoCursorMapper;
import com.archos.mediacenter.video.browser.adapters.object.Video;

public class AdapterByShow extends PresenterAdapterByCursor implements AdapterByVideoObjectsInterface {
    private final VideoCursorMapper mVideoCursorMapper;
    public static final int ITEM_VIEW_TYPE_SHOW = 0;

    public AdapterByShow(Context context, Cursor c) {
        super(context, c);

        mVideoCursorMapper = new VideoCursorMapper();
        mVideoCursorMapper.publicBindColumns(c);
    }




    private int getItemType(int position) {
        return  ITEM_VIEW_TYPE_SHOW;
    }
    @Override
    public Object getItem(int position){
        Log.d("showdebug", "get " + position);
        getCursor().moveToPosition(position);
         return mVideoCursorMapper.publicBind(getCursor());


    }


    public boolean isEnabled(int position) {

                return true;

    }

    @Override
    public Video getVideoItem(int position) {
            return (Video) getItem(position);
    }
}
