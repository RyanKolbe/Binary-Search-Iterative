/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeBinarySearch;

/**
 *
 * @author Ryan Kolbe
 */
public class IterativeBinarySearch {

    public static int iterativeBinarySearch(int[] data, int target) {
        int position = -1;
        int left = 0;
        int right = data.length - 1;
        boolean found = false;

        while (!found) {
            int middle = (left + right) / 2;
            if (data[middle] == target) {
                found = true;
                position = middle;
            } else if (target > data[middle]) {
                left = middle + 1;
            } else if (target < data[middle]) {
                right = middle - 1;
            }
        }
        return position;
    }
}
