//package com.example.myapplication.ui.page_2;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ListAdapter;
//
//import com.example.myapplication.R;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import kotlin.Pair;
//
//public class ImageAdapter extends BaseAdapter {
//    private Context mContext;
//
//    public ImageAdapter(Context c) {
//        mContext = c;
//    }
//
//    public int getCount() {
//        return mThumbIds.length;
//    }
//
//    public Object getItem(int position) {
//        return null;
//    }
//
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//
//        if (convertView == null) {
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new ViewGroup.LayoutParams(350,350));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(100,30,100,30);
//        }
//        else {
//            imageView = (ImageView) convertView;
//        }
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;
//    }
//
//    public ArrayList<Pair<Integer, String>> mThumbIdsandText = new ArrayList<>((Arrays.asList(
//            new Pair<>(R.drawable.well1, "Spiritual Wellness - Expanding our sense of purpose and meaning in life."),
//            new Pair<>(R.drawable.well2, "Social Wellness - Developing a sense of connection, belonging, and a well-developed support system."),
//            new Pair<>(R.drawable.well3, "Financial Wellness - Satisfaction with current and future financial situations."),
//            new Pair<>(R.drawable.well4, "Emotional Wellness - Coping effectively with life and creating satisfying relationships."),
//            new Pair<>(R.drawable.well5, "Environmental Wellness - Good health by occupying pleasant, stimulating environments that support well-being."),
//            new Pair<>(R.drawable.well6, "Intellectual Wellness - Recognizing creative abilities and finding ways to expand knowledge and skills."),
//            new Pair<>(R.drawable.well7, "Physical Wellness - Recognizing the need for physical activity, diet, sleep, and nutrition."),
//            new Pair<>(R.drawable.well8, "Occupational Wellness - Personal satisfaction and enrichment derived from one's work.")
//    )));
//    public Integer[] mThumbIds = {
//            R.drawable.well1, R.drawable.well2,
//            R.drawable.well3, R.drawable.well4,
//            R.drawable.well5, R.drawable.well6,
//            R.drawable.well7, R.drawable.well8
//    };
//}
