package org.florescu.android.rangeseekbar.sample;

import android.content.Context;
import android.util.AttributeSet;

import org.florescu.android.rangeseekbar.RangeSeekBar;

/**
 * Custom range seek bar which overrides text above thumbs
 * Created by keisukekobayashi on 16/02/02.
 */
public class CustomRangeSeekBar extends RangeSeekBar<Double> {
    public CustomRangeSeekBar(Context context) {
        super(context);
    }
    public CustomRangeSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomRangeSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected String getSelectedMaxText() {
        return getContext().getString(R.string.custom_text_above_thumbs, getSelectedMaxValue());
    }

    @Override
    protected String getSelectedMinText() {
        return getContext().getString(R.string.custom_text_above_thumbs, getSelectedMinValue());
    }
}
