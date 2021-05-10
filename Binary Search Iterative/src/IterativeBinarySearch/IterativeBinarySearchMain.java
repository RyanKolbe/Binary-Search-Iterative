/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeBinarySearch;

import static IterativeBinarySearch.IterativeBinarySearch.iterativeBinarySearch;

/**
 *
 * @author Ryan Kolbe
 */
public class IterativeBinarySearchMain {

    public static void main(String[] args) {

        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(iterativeBinarySearch(data, 4));
    }
}
