package com.coderfaysal.banglafunnystatus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class IslamicSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.islamic_sms);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ইসলামিক মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "যখন রক্ত সম্পর্কীয় কেউ আপনার সাথে প্রতারণা করবে, ভেঙ্গে পড়বেন না। মনে রাখবেন, হজরত ইউসুফ (আ:) আপন ভাইদের দ্বারা প্রতারিত হয়েছিলেন । ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যখন পিতামাতা আপনার প্রতিপক্ষ হয়ে দাঁড়াবেন,  ভেঙ্গে পড়বেন না। মনে রাখবেন, হজরত ইব্রাহিম (আ:) নিজ পিতার দ্বারাই আগুনে নিক্ষিপ্ত হয়েছিলেন ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জানি পুলিশ করবে হামলা,হবে জেল মামলা জানি বুলেট পর্র্বে বুকে, তবুও মোরা দারাবো রুখে দিবো লক্ষ প্রাণ, তবুও ”কোরাআন” হোক সংবিধান");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রোজা কিয়ামতের দিন রোজাদার মুমিন ব্যক্তির জন্য আল্লাহর কাছে শুপারিশকারী হবে। - আল হাদিস");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গেল রাত এল দিন, ফিরে এল জুম্মার দিন--। জুম্মার সময় করবেনা লস, জুম্মার নামাজ গরীবদের যে হজ্জ!!!। জলদি যাও নামাজ পরতে, গুরুত্ত দাও এই দিনটাকে। হেপ্পী জুম্মাহ মোবারক টু মাই অল ফ্রেন্ড।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রমজান জান্নাতে যাওয়ার উৎকৃষ্টতম উপায় এবং রাইয়ান নামক বিশেষ দরজা দিয়ে জান্নাতে প্রবেশের সুবর্ণ সুযোগ ----আল হাদিস");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রমযানেরই পুণ্যে আমি তুমি হতে চাই যে ধনবান সেই ধনের বিনিময়ে পাব রোজাদারের পুরষ্কার,রাইয়্যান! আল্লাহ্ তায়ালার দান, মোবারক হো..মোবারক হো..মাহে রমজান !");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভুলেও যেন একটি রোজা তোমার বন্ধু না হয় ক্বাযা.. ফকীর নয় তারাবীর নামাযের পুণ্যের যেন হতে পারো রাজা!!! হেসে খেলে ভুল করে হায় পেওনা ভুলের কঠিন সাজা!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বেশি বেশি দান করে ,দানের সওয়াব নিও তুলে তাহাজ্জুদের পুণ্য টুকু নিতে মন যেন না যায় ভুলে পড়বে কোরআন প্রতিদিন সুরের দরজা খুলে সেই কোরআনের মধুর সুরে সবার মন উঠবে আনন্দে দুলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ওই দেখ! বন্ধু সকল.. ঐযে অমূল্য ধনের খনি আজকে কে নেবে বল হীরে,পান্না ,জহরত আর মণি পারো যদি নিতে নিজের করে,তবে হবে আখেরাতের ধনি হবে নাকি কেউ আখিরাতের ধনি?চাও নাকি কেউ অমূল্য ধনের খনি? রমজানুল মোবারক শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এলো রে এলো... ওই মাহে রমজান মানবজাতির তরে আল্লহতায়ালার শ্রেষ্ঠ দান... পুণ্যের সূর্য উদয় হয়ে, পাপের হবে অবসান. জং গুলো সব ঝোরে গিয়ে,ঈমান করবে শাণ।।। রহমতেরই ডালি নিয়ে আসছে ওই!মাহে রমজান!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঐ সকল নারী জাহান্নামী, যারা কাপড় পরেও উলঙ্গ থাকে। —বিশ্বনবী হযরত মোহাম্মদ(সঃ) ..!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক এক করে যাচ্ছে চলে মাহে রমযান, কি করে দিবো আমি তার প্রতিদান. ক্ষমার আশায় আজও আমি তুলি দুই হাত. কবুল করো আল্লাহ তুমি আমার মোনাজাত.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জান্নাতের নেটওয়ার্ক হল ইসলাম, সিম হল ঈমান।  বোনাস হল রমযান, রিচার্জ হল নামাজ, আর হেলপ লাইন হল কোরআন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পৃথিবিতে সব চাইতে কঠিন কাজ হল নিজে সংশোধন হওয়া আর সব চাইতে সহজ কাজ হল অন্যের সমলোচনা করা.... (হযরত আলী রাঃ)");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "ডান চোখ হতে বাম চোখের দূরত্ব যতটুকু, মৃত্যু তার চেয়েও নিকটে --বিশ্বনবী হযরত মুহাম্মদ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "ধংস তার জন্য, যার আজকের দিনটা গতকালের চেয়ে উত্তম হলো না। — আল কুরআন");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "হিংসা মানুষকে এমনভাবে ধ্বংস করে, যেভাবে মরিচা লোহাকে ধ্বংস করে । -- ইবনুল খাতীব");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "ঐ ব্যক্তিই প্রকৃত বুদ্ধিমান, যে নিজে নত হয়ে অপরকে বড় ভাবে, আর সে ব্যক্তিই নির্বোধ, যে সর্বদাই নিজেকে বড় ভাবে। ---হযরত আলী (রাঃ)");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "এমন এক সময় আসবে যখন মুসলমানদের জন্য ঈমান ধরে রাখা, জ্বলন্ত কয়লা হাতের মধ্যে রাখার ন্যায় কঠিন হবে। ___বিশ্বনবী হযরত মোহাম্মদ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের মনের মধ্যে এমনভাবে নিজের জন্য জায়গা করে নাও যেন তুমি মরে গেলে তোমার জন্য তারা দুয়া করে আর বেঁচে থাকলে তোমাকে ভালবাসে। __ হযরত আলী (রাঃ)");
        arrayList.add(hashMap);






        IslamicAdapter islamicAdapter = new IslamicAdapter();
        listView.setAdapter(islamicAdapter);




    }

    private class IslamicAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View islamicView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = islamicView.findViewById(R.id.tvDisplay);
            TextView tvCopy = islamicView.findViewById(R.id.tvCopy);
            TextView tvShare = islamicView.findViewById(R.id.tvShare);


            HashMap<String, String> hashMap = arrayList.get(position);

            String tvText = hashMap.get("text");
            tvDisplay.setText(tvText);


            tvCopy.setOnClickListener(v->{
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", tvDisplay.getText().toString());
                assert clipboardManager!= null;
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();
            });

            tvShare.setOnClickListener(v->{
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, tvDisplay.getText().toString());
                shareIntent.setType("text/plain");
                shareIntent = Intent.createChooser(shareIntent, "Share Via:");
                startActivity(shareIntent);
            });



            return islamicView;
        }
    }

}