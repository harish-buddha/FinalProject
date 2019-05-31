package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Pair;
import static org.junit.Assert.*;
import static android.support.test.InstrumentationRegistry.getContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.ExecutionException;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ChuckjokesTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest()
    {
        EndpointsAsyncTask endpointsAsyncTask=new EndpointsAsyncTask(new EndpointsAsyncTask.MyPieInterface() {
            @Override
            public void getJokeInterface(String chuck) {


            }
        });
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(),"hello"));
        try {
            String chuck=endpointsAsyncTask.get();
            assertNotNull(chuck);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e)
        {
            e.printStackTrace();
        }

    }

}
