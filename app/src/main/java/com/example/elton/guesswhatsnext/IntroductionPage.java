package com.example.elton.guesswhatsnext;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class IntroductionPage extends AppCompatActivity {

    Button mButton;
    TextView mText;
    TextView mSuits;
    TextView mColors;
    ImageView mPicture;
    Button rButton;
    int x=0;
    //int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mButton = (Button) findViewById(R.id.button);
        mText = (TextView) findViewById(R.id.textView2);
        mSuits = (TextView) findViewById(R.id.suitsValue);
        mColors = (TextView) findViewById(R.id.colorsValue);
        mPicture = (ImageView) findViewById(R.id.cardPicture);
        rButton = (Button) findViewById(R.id.restartButton);

        Cards h1 = new Cards(1, "hearts", "red", getDrawable(R.drawable.ace_of_hearts));
        Cards d1 = new Cards(1, "diamonds", "red", getDrawable(R.drawable.ace_of_diamonds));
        Cards s1 = new Cards(1, "spades", "black",getDrawable(R.drawable.ace_of_spades));
        Cards c1 = new Cards(1, "clubs", "black",getDrawable(R.drawable.ace_of_clubs));

        Cards h2 = new Cards(2, "hearts", "red", getDrawable(R.drawable.two_of_hearts));
        Cards d2 = new Cards(2, "diamonds", "red", getDrawable(R.drawable.two_of_diamonds));
        Cards s2 = new Cards(2, "spades", "black",getDrawable(R.drawable.two_of_spades));
        Cards c2 = new Cards(2, "clubs", "black",getDrawable(R.drawable.two_of_clubs));

        Cards h3 = new Cards(3, "hearts", "red", getDrawable(R.drawable.three_of_hearts));
        Cards d3 = new Cards(3, "diamonds", "red", getDrawable(R.drawable.three_of_diamonds));
        Cards s3 = new Cards(3, "spades", "black",getDrawable(R.drawable.three_of_spades));
        Cards c3 = new Cards(3, "clubs", "black",getDrawable(R.drawable.three_of_clubs));

        Cards h4 = new Cards(4, "hearts", "red", getDrawable(R.drawable.four_of_hearts));
        Cards d4 = new Cards(4, "diamonds", "red", getDrawable(R.drawable.four_of_diamonds));
        Cards s4 = new Cards(4, "spades", "black",getDrawable(R.drawable.four_of_spades));
        Cards c4 = new Cards(4, "clubs", "black",getDrawable(R.drawable.four_of_clubs));

        Cards h5 = new Cards(5, "hearts", "red", getDrawable(R.drawable.five_of_hearts));
        Cards d5 = new Cards(5, "diamonds", "red", getDrawable(R.drawable.five_of_diamonds));
        Cards s5 = new Cards(5, "spades", "black",getDrawable(R.drawable.five_of_spades));
        Cards c5 = new Cards(5, "clubs", "black",getDrawable(R.drawable.five_of_clubs));

        Cards h6 = new Cards(6, "hearts", "red", getDrawable(R.drawable.six_of_hearts));
        Cards d6 = new Cards(6, "diamonds", "red", getDrawable(R.drawable.six_of_diamonds));
        Cards s6 = new Cards(6, "spades", "black",getDrawable(R.drawable.six_of_spades));
        Cards c6 = new Cards(6, "clubs", "black",getDrawable(R.drawable.six_of_clubs));

        Cards h7 = new Cards(7, "hearts", "red", getDrawable(R.drawable.seven_of_hearts));
        Cards d7 = new Cards(7, "diamonds", "red", getDrawable(R.drawable.seven_of_diamonds));
        Cards s7 = new Cards(7, "spades", "black",getDrawable(R.drawable.seven_of_spades));
        Cards c7 = new Cards(7, "clubs", "black",getDrawable(R.drawable.seven_of_clubs));

        Cards h8 = new Cards(8, "hearts", "red", getDrawable(R.drawable.eight_of_hearts));
        Cards d8 = new Cards(8, "diamonds", "red", getDrawable(R.drawable.eight_of_diamonds));
        Cards s8 = new Cards(8, "spades", "black",getDrawable(R.drawable.eight_of_spades));
        Cards c8 = new Cards(8, "clubs", "black",getDrawable(R.drawable.eight_of_clubs));

        Cards h9 = new Cards(9, "hearts", "red", getDrawable(R.drawable.nine_of_hearts));
        Cards d9 = new Cards(9, "diamonds", "red", getDrawable(R.drawable.nine_of_diamonds));
        Cards s9 = new Cards(9, "spades", "black",getDrawable(R.drawable.nine_of_spades));
        Cards c9 = new Cards(9, "clubs", "black",getDrawable(R.drawable.nine_of_clubs));

        Cards h10 = new Cards(10, "hearts", "red", getDrawable(R.drawable.ten_of_hearts));
        Cards d10 = new Cards(10, "diamonds", "red", getDrawable(R.drawable.ten_of_diamonds));
        Cards s10 = new Cards(10, "spades", "black",getDrawable(R.drawable.ten_of_spades));
        Cards c10 = new Cards(10, "clubs", "black",getDrawable(R.drawable.ten_of_clubs));

        Cards h11 = new Cards(11, "hearts", "red", getDrawable(R.drawable.jack_of_hearts));
        Cards d11 = new Cards(11, "diamonds", "red", getDrawable(R.drawable.jack_of_diamonds));
        Cards s11 = new Cards(11, "spades", "black",getDrawable(R.drawable.jack_of_spades));
        Cards c11 = new Cards(11, "clubs", "black",getDrawable(R.drawable.jack_of_clubs));

        Cards h12 = new Cards(12, "hearts", "red", getDrawable(R.drawable.queen_of_hearts));
        Cards d12 = new Cards(12, "diamonds", "red", getDrawable(R.drawable.queen_of_diamonds));
        Cards s12 = new Cards(12, "spades", "black",getDrawable(R.drawable.queen_of_spades));
        Cards c12 = new Cards(12, "clubs", "black",getDrawable(R.drawable.queen_of_clubs));

        Cards h13 = new Cards(13, "hearts", "red", getDrawable(R.drawable.king_of_hearts));
        Cards d13 = new Cards(13, "diamonds", "red", getDrawable(R.drawable.king_of_diamonds));
        Cards s13 = new Cards(13, "spades", "black",getDrawable(R.drawable.king_of_spades));
        Cards c13 = new Cards(13, "clubs", "black",getDrawable(R.drawable.king_of_clubs));

        final ArrayList<Cards> CardDeck = new ArrayList<>();
        CardDeck.add(h1);
        CardDeck.add(d1);
        CardDeck.add(s1);
        CardDeck.add(c1);

        CardDeck.add(h2);
        CardDeck.add(d2);
        CardDeck.add(s2);
        CardDeck.add(c2);

        CardDeck.add(h3);
        CardDeck.add(d3);
        CardDeck.add(s3);
        CardDeck.add(c3);

        CardDeck.add(h4);
        CardDeck.add(d4);
        CardDeck.add(s4);
        CardDeck.add(c4);

        CardDeck.add(h5);
        CardDeck.add(d5);
        CardDeck.add(s5);
        CardDeck.add(c5);

        CardDeck.add(h6);
        CardDeck.add(d6);
        CardDeck.add(s6);
        CardDeck.add(c6);

        CardDeck.add(h7);
        CardDeck.add(d7);
        CardDeck.add(s7);
        CardDeck.add(c7);

        CardDeck.add(h8);
        CardDeck.add(d8);
        CardDeck.add(s8);
        CardDeck.add(c8);

        CardDeck.add(h9);
        CardDeck.add(d9);
        CardDeck.add(s9);
        CardDeck.add(c9);

        CardDeck.add(h10);
        CardDeck.add(d10);
        CardDeck.add(s10);
        CardDeck.add(c10);

        CardDeck.add(h11);
        CardDeck.add(d11);
        CardDeck.add(s11);
        CardDeck.add(c11);

        CardDeck.add(h12);
        CardDeck.add(d12);
        CardDeck.add(s12);
        CardDeck.add(c12);

        CardDeck.add(h13);
        CardDeck.add(d13);
        CardDeck.add(s13);
        CardDeck.add(c13);


        Collections.shuffle(CardDeck);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x < 52) {
                    mText.setText(String.valueOf(CardDeck.get(x).number));
                    //mSuits.setText(String.valueOf(CardDeck.get(x).suits));
                    mSuits.setText(String.valueOf(x));
                    mColors.setText(String.valueOf(CardDeck.get(x).colors));
                    mPicture.setImageDrawable(CardDeck.get(x).picture);
                    x++;
                } else {
                    mText.setText(getString(R.string.Good_Game));
                    mSuits.setText(getString(R.string.Textview1));
                    mColors.setText(getString(R.string.Textview1));
                    Collections.shuffle(CardDeck);
                    x = 0;
                }
            }
        });

        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText(getString(R.string.Good_Game));
                mSuits.setText(getString(R.string.Textview1));
                mColors.setText(getString(R.string.Textview1));
                Collections.shuffle(CardDeck);
                x = 0;
            }
        });


    }

    /*public class Deck {

        public void main(String[] args) {

            //Creating user defined class objects
            Cards h1 = new Cards(1, "hearts", "red", getDrawable(R.drawable.snorlax));
            Cards d1 = new Cards(1, "diamonds", "red", getDrawable(R.drawable.snorlax2));
            Cards s1 = new Cards(1, "spades", "black",getDrawable(R.drawable.snorlax3));
            Cards c1 = new Cards(1, "clubs", "black",getDrawable(R.drawable.clock));

            ArrayList<Cards> CardDeck = new ArrayList<Cards>();
            CardDeck.add(h1);
            CardDeck.add(d1);
            CardDeck.add(s1);
            CardDeck.add(c1);
        }
    }*/

    public class Cards    {
        public int number;
        public String suits;
        public String colors;
        public Drawable picture;
        Cards(int number,String suits,String colors, Drawable picture){
            this.number=number;
            this.suits=suits;
            this.colors=colors;
            this.picture=picture;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_introduction_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
