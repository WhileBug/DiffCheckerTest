package org.example;

import org.example.state.StateB;

import java.util.HashMap;
import java.util.Map;

public class StateA {
    public Integer test_state_1 = 1;
    public Integer test_state_2 = 2;
    public StateB test_state_b = new StateB();
    public static Map<Integer, StateB> state_set = new HashMap<>();
}
