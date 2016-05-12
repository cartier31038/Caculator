package com.cjlab.calculator;

import android.support.test.espresso.Espresso;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Nitirat on 5/11/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void add()
    {
        onView(withId(R.id.operand_1_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operand_2_edit_text)).perform(typeText("2"));

        onView(withId(R.id.add_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(ViewAssertions.matches(withText("3.0")));
    }

    @Test
    public void sub()
    {
        onView(withId(R.id.operand_1_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operand_2_edit_text)).perform(typeText("2"));

        onView(withId(R.id.sub_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(ViewAssertions.matches(withText("-1.0")));
    }

    @Test
    public void mul()
    {
        onView(withId(R.id.operand_1_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operand_2_edit_text)).perform(typeText("2"));

        onView(withId(R.id.mul_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(ViewAssertions.matches(withText("2.0")));
    }

    @Test
    public void divide()
    {
        onView(withId(R.id.operand_1_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operand_2_edit_text)).perform(typeText("2"));

        onView(withId(R.id.divide_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(ViewAssertions.matches(withText("0.5")));
    }
}