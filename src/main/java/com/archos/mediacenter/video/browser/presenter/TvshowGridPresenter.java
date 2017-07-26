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

package com.archos.mediacenter.video.browser.presenter;

import android.content.Context;
import android.view.View;

import com.archos.mediacenter.utils.ThumbnailEngine;
import com.archos.mediacenter.video.browser.adapters.AdapterDefaultValues;
import com.archos.mediacenter.video.browser.adapters.AdapterDefaultValuesGrid;
import com.archos.mediacenter.video.browser.adapters.object.Tvshow;

/**
 * Created by alexandre on 27/10/15.
 */
public class TvshowGridPresenter extends TvShowPresenter{
    public TvshowGridPresenter(Context context, ExtendedClickListener listener) {
        this(context, AdapterDefaultValuesGrid.INSTANCE, listener);
    }

    public TvshowGridPresenter(Context context, AdapterDefaultValues defaultValues, ExtendedClickListener listener) {
        super(context, defaultValues, listener);
    }

    @Override
    public View bindView(View view, Object object, ThumbnailEngine.Result result, int positionInAdapter) {
        Tvshow tvShow = (Tvshow) object;

        ViewHolder holder = (ViewHolder) view.getTag();
        super.bindView(view,object, result, positionInAdapter);
        if(holder.secondLine!=null)
            holder.secondLine.setVisibility(View.VISIBLE);

        holder.name.setText(tvShow.getName());



        return view;
    }
}
