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

public class FriendSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap <String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("প্রিয় বন্ধু মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধুতে আলো, বন্ধুতে ভয়, বন্ধুতে শক্তি, বন্ধুতে জয়... পুকুরেতে কদম গাছ, কত কদম ধরে,আমার একটা বন্ধু আছে রাস্তা, রাস্তায় ঘুরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে বন্ধু সুদিনে ভাগ বসায়,, আর দুর্দিনে ত্যাগ করে চলে যায়,, সেই তোমার সবচেয়ে বড় শত্রু..!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু... কথাটি খুব ছোট্ট হলেও গভীরতা আকাশ সমান বিশাল । জীবনের প্রতিটি পদক্ষেপে আমরা একা নই । চলার পথের বন্ধুর রাস্তা গুলো বন্ধু বিনে চলা প্রায় অসম্ভব। তাই শুধু বন্ধু হলেই পুরন হলেই হবেনা বন্ধুত্বের পুর্ন দাবী, হতে হবে বন্ধুর মতো বন্ধু। কথায় আছে Friends Never Die. বন্ধু কখনো মরেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু তুমি আপন হয়ে,, বাধলে বুকে ঘর.. কষ্ট পাব আমায় যদি,, করে দাও পর.. সুখের নদী হয়না যেন,, দুঃখের বালু চর.. সব সময় নিও বন্ধু আমার খবর..!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু তুমি আমার হৃদয়ের বাধন, আছো তুমি, থাকবে আমার....মিশে এ হৃদয়ে সারাটি জীবন.। বন্ধু তুমি আমার ভোরেরপাখি, হারিয়ে গেলে কভু দূর অজানায় আমায় তুমি খুজে নিবে নাকি.? বন্ধু তুমি আমার আশার আলো, দুই নয়নে তুমি ছাড়া আমি....যেন দেখি সব আধার কালো..।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু তোমায় খুব বেশি মনে পড়ে যেন পৃথিবীর সব হারিয়ে ফেলি,একবার তুমি চোখের আড়াল হলে।বন্ধু তুমি আমার ভালবাসার বাঁধন আছো তুমি থাকবে ভালবাসায়, আমার হৃদয়ে হাজার জনম জনম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বুকের ভিতর মন আছে, মনের ভিতর তুমি , বন্ধু হয়ে তোমার হৃদয়ে থাকতে চাই আমি...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি কি জান ফুল কেন ফুটে? “তুমি দেখবে বলে”। তুমি কি জান আকাশ কেন কাদে? “তোমার মন খারাপ বলে”। তুমি কি জান তোমাকে সবাই পছন্দ করে কেন? “তুমি খুব ভাল বলে”। তুমি কি জান তুমি এত ভালো কেন? “তুমি আমার “ বন্ধু ” বলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "১৬ কোটি লোক, আটকোটি কাজ করে, ৩ কোটি স্টুডেন্ট, ২কোটি স্বপ্ন দেখে, ২কোটি ৯৯ লাখ ৯৯ হাজার ৯৯৮ জন প্রেম করে, বাকি দুজন তুমি আর আমি চলো বন্ধুত্ব করি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ তুমি প্রমিস করো, আমায় চুবে না। সুখ তুমি প্রমিস কর, আমায় ছাড়বে না। চোখ তুমি প্রমিস কর, আমায় কাদাবে না। আর বন্ধু তুমি প্রমিস কর, আমায় ভুলবে না..!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধুত্ব এবং গোলাপের মধ্যে সবচেয়ে বড় পার্থক্য হলো এই যে, গোলাপ কিছুক্ষণের জন্য টিকে থাকে... কিন্তু বন্ধুত্ব হলো চিরন্তন !!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সত্যিকারের বন্ধু আর ছায়ার মাঝে অনেকটাই মিল আছে। কারণ, সত্যিকারের বন্ধু সুখে -দুখে ছায়ার মতোই পাশে থাকে। জীবনে অনেক বন্ধু পাওয়া যায়। কিন্তু... অনেকেই বন্ধু হয়, স্বার্থ উদ্ধারের চিন্তা নিয়ে। অনেক বন্ধু আছে, যারা শুধুই বন্ধু। না সুসময়ের না অসময়ের। আবার কিছু বন্ধু আছে, যাদের শুধু সুসময়ে খুঁজে পাওয়া যায়। দুঃসময়ে ইঙ্গিত পাওয়ার সাথে সাথেই কেটে পড়ে। তবে এমনও কিছু বন্ধু রয়েছে, যা হয়তো সময় যাবে থেমে,হয়তো সুর্য যাবে ডুবে,হয়তো কেউ রবে না পাশে,ভয় পেয় না তুমি হবেনা একা,হাত বাড়ালেই পাবে তুমি তোমার সজল বন্ধুর দেখা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আকাশ দেখেছি,, নদী দেখেছি,, দেখেছি অনেক তারা.. দেখেনি আজ ও ফেসবুকে আমার আসল বন্ধু কারা...!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নদীর পারে আমি একা.., নদী চলে আঁকা বাঁকা... আমি বন্ব্দু বড়ো একা..., এখন ভাবছি তোমার কথা... তোমার সাথে আমার কিগো..,কখনো হবেনা দেখা ?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গভীর বন্ধুত্ত্ব তখনই চরম শত্রুতায় রুপ নেয়, যখন একে অপরকে ভুল বুঝে। বাস্তবে এমন কোনো ঘটনা ঘটে না, যার কারনে বন্ধুত্ত্ব নষ্ট হয়ে শত্রুতায় পরিনত হবে। আর যদি এমন কিছু ঘটে, তবে বুঝতে হবে তা বন্ধুত্ত্ব ছিলো না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালো একজন বন্ধু যতোই ভুল করুক , তাকে কখন্ও ভুলে যেও না। কারন,পানি যতোই ময়লা হোক, আগুন নিভাতে সেই পানিই সবচেয়ে বেশি কাজে লাগে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালবাসা তৈরী হয় ভাল লাগা থেকে, স্বপ্ন তৈরী হয়,কল্পনা থেকে অনুভব তৈরী হয় অনুভূতি থেকে, আর বন্ধুত্ব তৈরী হয়মনের গভীর থেকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পৃথিবীতে সবচেয়ে মূল্যবান হলো খঁাটি বন্ধুত্ব, যদি বন্ধু ভালো হয়-তাহলে সেখানে, অশ্রুর কোনো ঠাই নেই।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি কখনও বন্ধুত্বকে কিনতে পারবে না,তুমি এটা উপার্জন করে নাও। কেউ যদি সাহায্যের জন্য আসে,তখন তুমি সত্যিকার বন্ধু হয়ে যেও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু তো সবারই থাকে,তবে জড়িয়ে ধরে কাঁদতে পারারমত বন্ধু খুব কমই থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একদিন হয়তো চলে যাবো পূথিবীর শেষ সিমানায়,সে দিন ও দেখবে তুমি আছি তোমার কিনারাই,স্রিতি হয়তো বলবে কথা,বলব নাক আমি, পারলে দিয় মনে একটু জায়গা যেথাই থাকব আমি।বন্ধু বল আমায় মনে রাখবে কি তুমি?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কে তোমার সব চেয়ে ভাল বন্ধু সেটা তখনই বুঝবে, যখন তোমার কাউকে খুব প্রয়োজন হবে হাত বাড়ালে- ১০০ বন্ধু পাবে ৫০ জন ছেড়ে চলে যাবে ৩০ জন ভুলে যাবে ১৯ জন ভুল বুঝবে ১ জন চিরদিন তুমার পাশে রয়ে যাবে #সেই তুমার প্রকৃত বন্ধু");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ব্ন্ধু মানে জোসনা ভেজা গলপো বলা রাত.. বন্ধু মানে ভালোবাসার শিক্ত দুটি হাত.. বন্ধু মানে মনের যত গোপন কথা বলা.. বন্ধু মানে তোমার সাথে সারা জীবন চলা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি ১টা দিন চাই আলয় আলয় ভরা। আমি ১টা রাত চাই, অন্ধকার ছারা। আমি ১টা ফুল চাই, সুন্দর সুবাস ভরা। আর ১টা ভাল বন্ধু চাই সবার চেয়ে সেরা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাই আমার বুন্ধু নয়। আবার, আমার বুন্ধু সবার মত নয়। সে আমার কথা মনে রাখে শত কাজের ভিরে। ফ্রী হলে ডাকি ও আমায়, আছি আমি তুমার দুয়ারে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নদীর কষ্ট হয় পানি শূকিয়ে গেলে,গাছের কষ্ট হয় পাতা ঝড়ে গেলে,রাতের কষ্ট হয় চাঁদ ডুবে গেলে,আমার কষ্ট হয় বন্ধূ তুমি ভুলে গেলে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি কখনও বন্ধুত্বকে কিনতে পারবে না, তুমি এটা উপার্জন করে নাও। কেউ যদি সাহায্যের জন্য আসে, তখন তুমি সত্যিকার বন্ধু হয়ে যেও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু মানে জীবনের পরিচয় বন্ধু মানে খেলার সথী বন্ধু মানে অজানা এক পরীর গল্প তাই বন্ধুকে কখনো কষ্ট দিও না বন্ধুর ভালবাসা আছে বলেই পৃথিবী এত সুন্দর তাই বন্ধুর মতো বন্ধু একটা হলে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালবাসা তৈরী হয় ভাললাগা থেকে, স্বপ্ন তৈরী হয়, কল্পনা থেকে অনুভব তৈরী হয় অনুভূতি থেকে, আর বন্ধুত্ব তৈরী হয় মনের গভীর থেকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নয়ন জলে ভাসিয়ে দুচোখ কাঁদছো কেনো তুমি- এই দেখো তোমার পাশে দাড়িয়ে আছি আমি- তোমার চোখের এক ফোটা জল পড়বে নাকো নিচে- যতো দিন আমি বন্ধু আছি তোমার পাশে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনে যদি কাওকে সত্যি ই মন দিয়ে বন্ধুত্ব করে তাহলে তাকে হারিয়ে যেতে দিওনা... কারণ...... চোখের জল হয়তো মোছা যায়,কিন্তু হৃদয়ের কান্না কোনো ভাবেই মুছতে পারবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু আমার জানের জান SmS শুধু পড়তে চান'লিখতে গেলে'মন আনচান' ব্যালেন্স নিয়ে 'শুধু টেনশান' এই করে শুধু' টাকা বাচান কিপটামী ছেড়ে' SmS পাঠান!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধুত্ব করা মাটির উপর মাটি দিয়ে মাটি লিখার মত সহজ, কিন্তু বন্ধুত্ব রক্ষা করা পানির উপর পানি দিয়ে পানি লিখার মত কঠিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পুকুরেতে কদম গাছ, কত কদম ধরে,আমার একটা বন্ধু আছে রাস্তা, রাস্তায় ঘুরে।");
        arrayList.add(hashMap);






        FriendAdapter friendAdapter = new FriendAdapter();
        listView.setAdapter(friendAdapter);


    }

    private class FriendAdapter extends BaseAdapter {

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
            View friendView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = friendView.findViewById(R.id.tvDisplay);
            TextView tvCopy = friendView.findViewById(R.id.tvCopy);
            TextView tvShare = friendView.findViewById(R.id.tvShare);


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



            return friendView;
        }
    }


}