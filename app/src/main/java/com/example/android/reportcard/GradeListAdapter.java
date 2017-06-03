package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeListAdapter extends ArrayAdapter<GradeList> {

    private static final String LOG_TAG = GradeListAdapter.class.getSimpleName();

    public GradeListAdapter(Activity context, ArrayList<GradeList> gradeLists) {

        super(context, 0, gradeLists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.report_card, parent, false);
        }

        GradeList currentReportGrades = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.grade_name);
        nameTextView.setText(currentReportGrades.getGradeName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.grade_number);
        numberTextView.setText(currentReportGrades.getGradeNumber());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.grade_icon);

        iconView.setImageResource(currentReportGrades.getGradeIcon());

        return listItemView;
    }


}
