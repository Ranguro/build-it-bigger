package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Randall on 04/01/2016.
 */
public class JokeTest extends AndroidTestCase{


    final CountDownLatch signal = new CountDownLatch(1);
    public void testVerifyReturnNonEmptyString() throws InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new JokeReceivedListener() {
            @Override
            public void onJokeReceived(String result) {

                assertFalse("Joke is an empty string", result.isEmpty());
                signal.countDown();
            }
        });
        signal.await();// Wait for callback
    }


}
