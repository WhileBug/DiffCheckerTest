package org.example;

import java.util.*;

public class StateA {
    public Integer test_state_1 = 1;
    public StateB test_state_b = new StateB();
    public static Map<Integer, StateB> state_set = new HashMap<>();
}
