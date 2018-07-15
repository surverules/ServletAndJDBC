package com.ubs.Constants;

public enum DaysofWeek {
    MONDAY(1,7),
    TUESDAY(2,7),
    WEDNESDAY(3,7),
    THURSDAY(4,7),
    FRIDAY(5,7),
    SATURDAY(6,7),
    SUNDAY(7,7);

    private int start;
    private int end;
    private DaysofWeek(int a, int b){
        start = a;
        end = b;
    }

    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
}
