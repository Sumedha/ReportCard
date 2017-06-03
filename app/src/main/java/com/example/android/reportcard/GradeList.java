package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class GradeList extends AppCompatActivity {


    // Student Grade Names
    private String mGradeName;

    // Student Grade Numbers
    private String mGradeNumber;

    // ImageIcon
    private int mImageIcon;


    public GradeList(String gName, String gNumber, int gImageIcon)
    {
        mGradeName = gName;
        mGradeNumber = gNumber;
        mImageIcon = gImageIcon;
    }

    /**
     * Get the name of the Grade
     */
    public String getGradeName() {
        return mGradeName;
    }

    /**
     * Get the Grade Number
     */
    public String getGradeNumber() {
        return mGradeNumber;
    }

    /**
     * Get the icon
     */
    public int getGradeIcon() {
        return mImageIcon;
    }


}