package com.example.comporationhashtreeset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    EditText wordForAdd;
    TextView treeSet, hashSet;
    TreeSet<String> wordTreeSet;
    HashSet<String> wordHashSet;
    String word;
    Iterator<String> treeSetIterator;
    Iterator<String> hashSetIterator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordForAdd = findViewById(R.id.word);
        treeSet = findViewById(R.id.TreeSet);
        hashSet = findViewById(R.id.HashSet);

        wordTreeSet = new TreeSet<>();
        wordHashSet = new HashSet<>();
    }

    public void addWordInSets(View view) {
        word = wordForAdd.getText().toString();
        wordTreeSet.add(word);
        wordHashSet.add(word);
        wordForAdd.setText("");
        Toast.makeText(this, "Добавлено " + word, Toast.LENGTH_SHORT).show();
    }

    public void printWordFromSets(View view) {
        String wordTreeSetString = "";
        String wordHashSetString = "";
        treeSetIterator = wordTreeSet.iterator();
        hashSetIterator = wordHashSet.iterator();
        while (treeSetIterator.hasNext()){
            wordTreeSetString += treeSetIterator.next() + "-";
        }
        while (hashSetIterator.hasNext()){
            wordHashSetString += hashSetIterator.next() + "-";
        }
        treeSet.setText(wordTreeSetString);
        hashSet.setText(wordHashSetString);

    }
}