package com.jimdo.myapplication;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.text2), withText("No content yet"),
                        withParent(withId(R.id.fragment)),
                        isDisplayed()));
        textView.check(matches(withText("No content yet")));

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button), withText("Press me"),
                        withParent(withId(R.id.fragment)),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.text2), withText("Yeah!"),
                        withParent(withId(R.id.fragment)),
                        isDisplayed()));
        textView2.check(matches(withText("Yeah!")));

    }
}
