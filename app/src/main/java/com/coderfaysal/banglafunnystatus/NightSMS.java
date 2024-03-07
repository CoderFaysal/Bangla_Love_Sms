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

public class NightSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap <String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.night_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("শুভ রাত্রী মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "নীরব রাতে ঘুম পরীরা হাসছে মিটি মিটি, মনে রেখ আমার এই বন্ধুত্বের চিঠি। বন্ধু তোমায় দেখতে আমার মনটা দিল পাড়ি, এবার তবে ঘুমিয়ে পড় । না ঘুমালে আড়ি...... শুভ রাত্রি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার আকাশে তুমি জ্বলে আছো চাঁদ হয়ে। আর সেই চাঁদের আলোতেই তো আমি অন্ধকার রাতে পথ চলতে শিখেছি। ,,,,,,,,,শুভ রাত্রি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাদেঁর মতো সুন্দর তুমি,,,, সুন্দর তোমার মন। লক্ষ রঙিন স্বপ্নে ভরে উঠুক তোমার জীবন। শুভ রাত্রি আগামী দিনটির জন্য শুছেচ্ছা রইলো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শরীরের ভিতরে মন আছে, মনের ভিতরে তুমি আছো। বন্ধু হয়ে তোমার বুকে থাকতে চাই আমি। কি রাখবে গো আমায়? যেমন করে আমি রেখেছি বন্ধু তোমায়? শুভ রাত্রি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হালকা হালকা শীতের মিষ্টি রাতে। তোমায় জানায় শুভ রাত্রির শুভেচ্ছা। রাতের মাঝে লুকিয়ে থাকে অনেকখানি আশা। শুভরাত্রি বলে তোমায় জানাই ভালোবাসা। শুভ রাত্রি প্রিয়তমা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজকের এই তারাভরা রাতে,,,, আকাশের দিকে তাকিয়ে। চাঁদের সৌন্দর্য উপভোক করতে করতে,,,,, মনকে শান্ত রাখার চেষ্টা করে। আপনাদের সকলকে জানায় শুভরাত্রী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাঁদের গায়ে থাকে লক্ষ তারা, ভালো করে তাকিয়ে দেখো ১ টি তারা করছে ঈসারা,.... বলছে তোমায় শোনো ওগো আমার সজনী,,, এখন তুমি ঘুমিয়ে পড়ো হয়েছে অনেক রজনী।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দিন মিস করে চাঁদকে, রাত মিস করে সুর্যকে, বাগান মিস করে ফুলকে আর, আমি মিস করি তোমাকে। শুভ রাত্রি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নীল আকাশে তারার মেলা, আর চাঁদের খেলায় ভুলা মন। মন বলছে হাসিখুশি থাকুক আমার প্রিয়জন।নীল রঙ্গের আকাশ এখন দেখা যাচ্ছে কালো,,,,, আমি আছি বিন্দাস আর তোমরাও থেকো ভালো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চলো যাই ঘুমের দেশে, সুন্দর একটা ঘুমের সাথে, মিষ্টি কিছু স্বপ্ন আসুক দুচোখ জুড়ে। শুভ রাত্রি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঝিকিমিকি তারা ঐযে দূরে ডাকছে তোমায় মিষ্টি সুরে উঁকি দিয়ে চাঁদের আলো বলছে তোমায় রাত্রি হলো আকাশ দেশের নীল পরিরা বলছে এবার ঘুমিয়ে পড়। শুভ রাত্রি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার লক্ষি সোনা তুমি আমার প্রিয়া,,,, তুমি আমার প্রাণ সজনী তুমিই আমার হিয়া, মন মাঝে আছো তুমি থাকবে চিরকাল,,,, এখন তুমি শুয়ে পরো হবে কথা কাল। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্বপ্ন মানে দিনের শেষ, স্বপ্ন মানে নেশা, স্বপ্ন মানে রাতের মাঝে লুকিয়ে থাকা আশা, স্বপ্ন মানে দুঃখ ভুলে নতুন পথের যাত্রী, স্বপ্ন মানে মিষ্টি ঘুমে জানায় শুভরাত্রী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা তাকেই দিও যে ভালোবাসার মূল্য বোঝে,,,, আর সম্পর্ক তার সাথেই রেখো যে তোমার গুরুত্ব বোঝে! শু ভ রা ত্রি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ রাতে কি আসবো একটু রোমাঞ্চ করতে? আজ মুড ভালো আছে, শুধু কিছু মিষ্টি কামড় দিবো, জলদি রিপ্লাই দাও। ইতি তোমার মশা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি চাঁদে না থাকে কলঙ্ক, হৃদও যদি না থাকে বেথা। তোমার বাড়ি যদি হতো কাছে, আমি রোজ বলতে আসতাম একটি কথা। শুভরাত্রী");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জ্যোৎস্না ভরা চাঁদের আলো, বন্ধু তুমি থেকো ভালো, রাত্রি এবার অনেক হলো, ঘুম আমায় জানিয়ে দিলো । গুড নাইট।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নাইবা সরন করলে আমায় নাইবা নিলে আমার খোজ,,,, শুভ রাত্রি শুভেচ্ছাটা তবুও আমি দিয়ে যাবো রোজ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত হলো গভীর নেশা, স্বপ্ন দেখার আশা। রাত হলো লুকিয়ে থাকা উষ্ণভালবাসা। রাত হলো চোখটিবুজে স্রিতির মোড়ক খোলা। রাত হলো তোমার আর আমার শুভ রাত্রি বলা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রজাপতি ডানা মেলে ডাকছে তোমায় মিষ্টি হেসে,,,, উঁকি দিয়ে এল, বলছে তোমায় রাত্রি এবার হলো, পরীরদেশের নীল পরীরা বলছে এবার ঘুমিয়ে পর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাঁদের খেলায় ভোলা মন। মন চাইছে খুশি থাকুক সবার প্রিয়জন। নীল আকাশটা এখন দেখা যাচ্ছে কালো, আমি আছি Bindas আর তোমরাও থেকো ভালো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পাগলী আমার ঘুমিয়ে পড়েছে, MotoPhone তাই শান্ত, আমি রাত জেগে দিচ্ছি পাহারা MotoPhone এর এই প্রান্ত। এই কথা যদি সে শুনতো ? গুড নাইট|।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত মানে পাখিরা সব নীড়ে ফিরে আসা, রাত মানে চাঁদের আলোয় মিষ্টি ভালোবাসা। রাত মানে দীর্ঘ এক প্রতীক্ষার শেষ, রাত মানে চোখের পাতায় স্বপ্নেররেশ। গুড নাইট।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সারাজীবন আমার মাথার উপরে ছাতা হয়ে থেকেছো তুমি বাবা, যাতে আমি নিশ্চিন্তে ঘুমোতে পারি।। আজকের রাতটা অন্তত তুমি নিশ্চিন্তে ঘুমোও,,,,, ***G00d Night***।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সূর্যের আলো উঠবে ফোটে রাতের অবসানে,,,, তোমায় আবার জাগতে হবে নতুন আলোর টানে,,,,, নতুন দিনে চলতে হবে নতুন পথের যাত্রী, ক্লান্ত ক্ষনে তাইত জানাই...... গুড নাইট।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার জানটা আজ যদিও... তুমি তোমার টেডি বিয়ারের সঙ্গে ঘুমোচ্ছ, কিন্তু আমি তোমাকে কথা দিচ্ছি, আমরা ২জনে খুব তাড়াতাড়ি একসঙ্গে ঘুমবো...অনেক আদর,.... শুভ রাত্রি জান");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাতের তারা তাকিয়ে দেখো নীল আকাশে ভাসে, ভালো একজন বন্ধু পেলে মন খুশিতে হাসে। রাতজাগা ১ পাখি জানি আমার পথের যাত্রী, সময় হল তাই তো এবার জানাই শুভ রাত্রি!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পৃথিবীর সবথেকে সুন্দর এবং মিষ্টি মানুষটা এখন আমার পাঠানো এসএমএস পড়ছে...আর মিটিমিটি হাসছে... কি, তাই তো? গুড নাইট আমার সোনা!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত শুধু আধার নয়, একটু খানি আলো। রাত শুধু খারাপ নয়,স্বপ্ন গুলো ভালো। তাই ঘুমিয়ে পর,ভাল থেক। গুড নাইট।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসবো রাতের স্বপ্ন হয়ে, থাকবো আমি কাছে,.... চোখ খুলতেই চলে যাবো ভোরের আলোর দেশে, দিয়ে যাবো কিছু স্মৃতি আজ এই রাতে, গুড নাইট জানাই ভালোবাসার সাথে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আখি ২টি বুজে ফেলো অনেক হলো রাত, কাল আবার আখি মেলে দেখবো সুপ্রভাত। সারারাত নিদ্রায় থেকে স্বপ্ন দেখো খুব,,.. অনেক রাত হলো এ বার দাও,,,,, ঘুম সাগরে ডুব।");
        arrayList.add(hashMap);



        NightAdapter nightAdapter = new NightAdapter();
        listView.setAdapter(nightAdapter);




    }

    private class NightAdapter extends BaseAdapter {

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
            View nightView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = nightView.findViewById(R.id.tvDisplay);
            TextView tvCopy = nightView.findViewById(R.id.tvCopy);
            TextView tvShare = nightView.findViewById(R.id.tvShare);


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



            return nightView;
        }
    }



}