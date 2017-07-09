package com.chrisThomps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian Thompson on 7/8/2017.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
