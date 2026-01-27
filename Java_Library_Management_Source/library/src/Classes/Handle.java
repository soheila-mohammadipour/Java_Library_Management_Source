/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author mad
 */
public class Handle {

    private static final int NAME_INDEX = 0;
    private static final int VALUE_INDEX = 1;

    private static ArrayList[] items = new ArrayList[2];

    static {
        items[NAME_INDEX] = new ArrayList();
        items[VALUE_INDEX] = new ArrayList();
    }

    public static void putItem(Object name, Object value) {
        items[NAME_INDEX].add(name);
        items[VALUE_INDEX].add(value);
    }

    public static Object getItem(Object name) {
        int findIndex;
        findIndex = items[NAME_INDEX].indexOf(name);
        items[NAME_INDEX].remove(findIndex);
        Object returnValue = items[VALUE_INDEX].remove(findIndex);
        return returnValue;
    }
}