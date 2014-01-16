/*
 * Copyright (C) 2013 YROM.NET
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.acfun.video.player.resolver;

import tv.acfun.video.player.MediaList;
import android.content.Context;

/**
 * @author Yrom
 *
 */
public class TudouResolver extends BaseResolver{
    public TudouResolver(String vid) {
        super(vid);
    }

    @Override
    public void resolve(Context context) {
        // TODO Auto-generated method stub
    }

    @Override
    public void resolveAsync(Context context) {
        // Not support yet
        mHandler.sendEmptyMessage(ARG_ERROR);
    }

    @Override
    public MediaList getMediaList(int resolution) {
        // TODO Auto-generated method stub
        return null;
    }

}
