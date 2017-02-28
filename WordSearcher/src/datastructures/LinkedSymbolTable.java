/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jaw40
 */
public class LinkedSymbolTable<String, Integer>
{

    List<Word> words;
    int size;

    public LinkedSymbolTable()
    {
        words = new LinkedList();
    }

    public void put(String key, Integer value)
    {
        Word tmp = new Word(key, value);
        int index = words.indexOf(tmp);

        if (index < 0) {
            words.add(tmp);
            size++;

        }

        else {
            Word w = words.get(index);
            int orig = w.getCount();
            w.setCount(orig + value);
        }

    }

    public Integer get(String key)
    {
        int index = words.indexOf(new Word(key, 0));
        return words.get(index).getCount();

    }

    public int size()
    {
        return size;
    }

    public Iterable<String> keys()
    {
        ArrayList<String> al = new ArrayList();
        for (Word word : words) {
            al.add(word.getWord());
        }
        return al;
    }
}