package com.fsmmmssaleschampionhoneywell.app.utils.swipemenulayout.listener;


import com.fsmmmssaleschampionhoneywell.app.utils.swipemenulayout.SwipeMenuLayout;

public interface SwipeFractionListener {
    void beginMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);

    void endMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);
}
