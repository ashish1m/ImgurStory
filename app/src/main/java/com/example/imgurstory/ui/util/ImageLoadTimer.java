package com.example.imgurstory.ui.util;

import android.os.CountDownTimer;

public class ImageLoadTimer extends CountDownTimer {

    private Observer observer;
    private long totalTime;
    private int currentIndex;

    public ImageLoadTimer(int dataSize) {
        super(dataSize * 4 * 1000, 1000);
        totalTime = dataSize * 4 * 1000;
    }

    public void addObserver(Observer observer) {
        this.observer = observer;
    }

    void removeObserver() {
        this.observer = null;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        if (observer != null) {
            long currentTime = totalTime - millisUntilFinished;
            long index = currentTime / (4 * 1000);
            if (index != currentIndex) {
                currentIndex = (int) index;
                observer.loadNextSlide(currentIndex);
            } else {
                long remainingSec = 4 - ((currentTime / 1000) % 4);
                observer.updateTimer((int) remainingSec);
            }
        }
    }

    @Override
    public void onFinish() {

    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public interface Observer {
        void loadNextSlide(int index);

        void updateTimer(int remainingSec);
    }
}
