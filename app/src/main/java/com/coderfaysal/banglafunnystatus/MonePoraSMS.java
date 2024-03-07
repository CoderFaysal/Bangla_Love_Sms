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

public class MonePoraSMS extends AppCompatActivity {


    ListView listView;
    ArrayList<HashMap <String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mone_pora_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("মনে পরার মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "মনেরই নীল খামে, প্রথম চিঠি তোমার নামে, তাও আবার মনে মনে, পাঠিয়েছি মোবাইল ফোনে, পড়ে দেখ শেষ লাইন, মিস করছি all time , I MISS You..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি অনেক লাকি ? কারণ তোমায় মিস করলে তোমার কাছে কোনো নোটিফিকেশন যায় না ? যদি যেতো তাহলে তুমি কখনো ঘুমাতে পারতে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এখনও আমি বুঝি, লোকালয় ছেঁড়ে নির্জনেতে তোমায় খুঁজি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একটু খানি শোন একটু আমায় জানো.. একটু খবর নিয়ো,, একটু যখন একা, একটু দিয়ো দেখা,, একটু নিয়ো খোঁজ Sms দিয়ো রোজ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে তোমার স্মৃতি গুলো ভীষণ কাঁদায়। আনমনে ভাবতে থাকি কোথায় যেন হারিয়ে যাই। তখন তোমাকে কাছে পাবার বাসনা খুব তীব্র হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জানিনা কিভাবে তোমার দেখা পাবো,জানিনা কিভাবে তমাকে কাছে পাবো,জানিনা কতটা আপন ভাবো তুমি আমায়।শুধু জানি এই অবুজ মনটা অনেক মিস করে তোমায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবচেয়ে বাজে অনুভুতিটা তখনি হবে,যখনআপনি কাউকে খুব মিস করবেন,তারসাথে কথা বলতে চাইবেন,কিন্তুসেইমানুষটি আপনার কোন কথায় সাড়া দেবে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি সেই কবিতা ! যা প্রতি দিন ভাবি…. লিখতে পারিনা॥ তুমি সেই ছবি! যা কল্পনা করি…. আঁকতে পারি না॥ তুমি সেই ভালবাসা! যা প্রতিদিন চাই…. কিন্তু তা কখনো-ই পাই না।তুমি আমার সেই রাজকন্যা যাকে সপ্নে দেখেছি কখনো পাইনি খুঁজে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমাকে মিস করার মত সময়হয়তো তোর হবে না জানি ……কারণ, তোর পৃথিবীতে আমি ছাড়াওআরো অনেকে আছে …….কিন্তু আমার পৃথিবীতে তুইছাড়া আরকেও নেই তাইতো আজওতোকে অনেক মিসকরি ….");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাজল কালো আঁখি তোমার, চাঁদের মতো মুখ,না দেখলে বন্ধু তোমায় লাগে না যে সুখ,যেখানে আছো যেভা আছো,ভালো থেকো তুমিমন চাইলে খবর নিও কেমন আছি আমি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যখন তোমায় মনে পরে মনজে আমার কেমনকরে…..তকে মিস করচি ভীষন……।যত দিন এদেহে প্রান আছে তকে বুধহয় আমারভুলে থাকা সম্ভব নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভুলে গেলে যেতে পারো, বাঁধা দিবো না ..জোর করে কিছু,পাওয়া যায় না ..মন থেকে miss করি, মুখ থেকে নয় !জীবনের শেষ মুহূর্তে, যেন একবার দেখা হয় ……");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসার মাঝে সুক আছে।ভালো থাকার মাঝে কষ্ট আছে।দূরে রাখার মাঝে টান আছে।মনে রাখার মাঝে প্রান আছে। তাইমনে রেখ আমায় চিরদিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে তোমাকে খুব কষ্ট দেই,কারন তোমাকে ভালোবাসি বলে ।নিরবে নিজে ও কষ্ট পাই,তোমাকে মিস করবো বলে ।তোমাকে যখন মিস করি,তখন পৃথিবীকে এড়িয়ে চলি ।কারন, তখন আমার সবঅনুভূতি জুড়ে শুধুই তুমি ..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শ্রাবনে ওই বৃষ্টি ধারায়, আজ শুধুতোমাকে খুঁজে বেড়াই. যদিও তুমি অনেকদুরে, তবুও রেখেছি তোমায় মন পাঁজরে.নীরবে তোমায় মিস করি সারাক্ষণ, অথচতা তোমার কাছে আজও গোপন..!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কতো দিন হাঁটা হয় নি হাঁতে রেখে হাঁত,কতো দিন একসাথে দেখা হয় নি চাঁদনী রাত ।কতো দিন বসা হয় নি পাশা – পাশি,কতো দিন দেখা হয় নি তোমার দুষ্ট মিষ্টি হাঁসি ।ভিষণ মিস করছি তোমাকে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাখবে কি আমায় মনে?বলবে কি আমার কথা?বুঝবে কি আমার ব্যাথা?ভাববে কি আমায়?পড়বে কি মনে আমায়?,,যেই দিন থাকবো না এই পৃথীবীতে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ জীবনে দুইবার বদলায়: প্রথমবার : যখন সে প্রেমে পড়ে দ্বিতীয় বার : যখন সে তার মনের মানুষকে হারায়……♡");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাই না ফুল , শুকিয়ে যাবেচাই না তাঁরা , লুকিয়ে যাবে চাই না মেঘ , ঝরে যাবেচাই না ভালোবাসা , হারিয়ে যাবেচাই একটা মনের মত বন্ধু ,,যে আমাকে সব সময় মিস করবে___");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অনেক miss করছি ,মন পাখি তোরে ..কোথায় আছিস কেমন আছিস ,আমার চোখের আড়ালে …শুনতে ইচ্ছে করেতোর মিষ্টি সুর ,বলনা পাখি তুইকোথায় আছিস কতো দূর");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের জীবনে চাওয়ার শেষ নেই স্বপ্নের সমাপ্তি নেই আকুলতার অন্তি নেই আমার চাওয়া তুমি স্বপ্ন তুমি আমার সব আকুলতা শুধু তোমার মাঝে আমার জীবন শুধু তোমাকে ঘিরে॥");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একা একা সারাহ্মন পথ চেয়ে থাকি¤ কল্পনাতে শুধু তারি ছবি আঁকি ¤ বর্ষার কাব্য লাগেনা যে ভালো¤ তাকে শুধু মনে পড়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গোলাপকে ছিঁড়তে গেলে কাঁটা লাগে হাতে, মনের মানুষকে ভুলতে চাইলে ব্যথা লাগে বুকে, তাই শত কষ্টের মাঝে মনে রাখতে চাই তোমাকে।,, I miss you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে তোমার স্মৃতি গুলো ভীষণ কাঁদায়। আনমনে ভাবতে থাকি কোথায় যেন হারিয়ে যাই। তখন তোমাকে কাছে পাবার বাসনা খুব তীব্র হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এখনও আমি বুঝি, লোকালয় ছেঁড়ে নির্জনেতে তোমায় খুঁজি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রেমে পরলে এই দোয়া পড়তে হয় I LOVE YOU.প্রেম ভাঙ্গিলে এই দোয়া পড়তে হয় I HATE YOU তারপর আজীবন কেঁদে কেঁদে এই দোয়া পরতে হয় “I MISS YOU”");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার হারানো স্মৃতি আমাকে এখনো কাঁদায়, কেন চলে গেলে আমাকে ছেড়ে, তোমাকে ভুলে যাবার অনেক চেষ্টা করেছি, কিন্তু তোমাকে ভুলতে পারি নাই… I miss u");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি কি অনুভব করতে পারো আমার হৃদয় ভাঙ্গার বেদনা? তুমি কি শুনতে পাও আমার স্বপ্ন ভাঙ্গার কান্না? যদি তুমি আমাকে বুঝতে তবে আমাকে একা ফেলে চলে যেতে না I Miss U__");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "টিপ টিপ বৃষ্টি পরছে অঝোরে আজ সারা দিন ধরে____ বিষণ্ণ ভাবনায় কাটে না সময়, তাকে শুধু মনে পরে____");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মনে রাখব তোমাকে চিরদিন তুমি যেখানেই থাক যতদিন। তোমাকে নিয়ে ঘুরবো স্মৃতির ঘরে, যদিও তুমি হয়ে গেছ আমার পর, তবুও Miss করব তোমায় জীবনভর….");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মনে রাখব তোমাকে চিরদিন তুমি যেখানেই থাক যতদিন। তোমাকে নিয়ে ঘুরবো স্মৃতির ঘরে, যদিও তুমি হয়ে গেছ আমার পর, তবুও Miss করব তোমায় জীবনভর….");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু কথা কিছু পরিচয়, ক্ষনিকের হয়। কিছু ব্যাথা কিছু সৃষ্টি, ভূলার নয়। কিছু মানুষ কিছু বন্ধু চিরদিনের হয়। “আই মিছ ইউ”।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কেমন আছ জানতে চাই,, মোখের কথাও শুনতে চাই। আমি আচি খুবভাল,, তুমি কেমন? তাই বল….I miss you..?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রেমে পরলে এই দুআ পড়তে হয় I LOVE YOU.প্রেম ভাঙ্গিলে এই দুআ পড়তে হয় I HATE YOU তাঁরপর আজীবন কেঁদে কেঁদে এই দুআ পরতে হয়”I MISS YOU”?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধুত্বের পরে কাউকে ভালোবাসা সম্ভব , কিন্তু ভালোবাসার পর কারও সাথে বন্ধুত্ব সম্ভব নয় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মৃত্যু শুধু দেহের হয় না কখনও মৃত্যু স্বপ্ন আর ইচ্ছেরও হয় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মনে শুধু একটাই কষ্ট আমি কার জীবনে আপন হতে পারলাম না। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একটি চোখ কখনো আরেকটি চোখকে দেখতে পারে না,, তারপরও বুকে কষ্ট হলে,,,, দুটি চোখ দিয়েই কিন্তু জল ঝড়ে। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাউকে ভালোবেসে তাকে কষ্ট দিলে,,,,, সে নিজে ও অনেক কষ্ট পায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিন্দা করতে গেলে,,,,,, বাইরে থেকে করা যায় তবে বিচার করতে গেলে.... ভিতরে প্রবেশ করতে হয়। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি সত্যিই ব্যার্থ,,,, কারণ আমি কোনভাবেই,,,, তোমাকে বুঝাতে পারিনি,,,,, আমি তোমাকে কতটা ভালবাসি..। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু কথা আছে যেগুলো কাউকে বলা যায়না,, শুধু বুকের মধ্যে বয়ে বেড়াতে হয়। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব মানুষই প্রেমে পরে.,,.,,., কেউ প্রকাশ করতে পারে,,,,, আবার লুকিয়ে রাখে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাওকে কষ্ট দিলে তোমাকে কষ্ট পেতে হবে,,,সেটা আজ হোক অথবা কাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি কখনও রাগ করি না,,,, কারন আমি জানি আমার রাগের মূল্য নেই কারও কাছে। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সৃতি নিয়ে বেচে থাকার চেয়ে,,,,, স্বপ্ন নিয়ে বেছে থাকা অনেক বেটার। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পৃথিবীর সবচেয়ে দুর্বল জায়গা হলো মন,,,, আর সবচেয়ে দুর্বল অস্ত্র হলো ভালোবাসা,,,,। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সম্পর্কের আদি ঘটতে শুরু হয় যখন থেকে.,,, তখন থেকেই,,,,,,, যখন ভালোবাসার মানুষটি মিথ্যা বলা শুরু করে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অশ্রু হলো এমন ভাষা,,,,,,,,, যা হৃদয়, মুখে প্রকাশ করতে পারে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখের সময়ে সুখের কথা মনে করার মতো কষ্ট,,,,,, আর কিছুতেই নেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এত ভালবেসেও তোমাকে পাওয়া হলো না,,,,,,ভাল থাকুক আমার ভালোবাসা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক নদীর তিরে,,, খুজে বেড়াই আমি তারে,,,, সে দেয়না দেখা আমায় কভু,,,, তার খেয়াল রেখো তুমি প্রভু");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রেম করতে চাই না কষ্ট পাবার ভয়ে, কিন্তু আমি আগে থেকেই আপনাকে অনেক ভালোবাসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "লাভ এমন একটা সফটওয়ার যা সবার জীবন এ ইনস্টল হয় না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনটা যদি কাঠ পেন্সিল দিয়ে লেখা কবিতা হতো, তাহলে রাবার দিয়ে মুছে নতুন করে লিখা যেতো।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ আমার জন্ম সূত্র হতে পাওয়া সম্পদ, তাই সুখের চেয়ে দুঃখকে বেশি ভালোবাসি।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রকৃত বীর সেই ব্যক্তি, যে দুঃখকে জয় করতে পারে।\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যাকে সত্যিকারের ভালোবাসা যায়, সে অতি অপমান আঘাত করলে,, হাজার ব্যথা দিলেও তাকে ভুলা যায় না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বুকের কাছে যদি জমে উঠে মেঘ,, কান্নায় ধুয়ে মুছে যায় চোখেল কাজল, তখনি আমাকে ভেবো তুমি টেনে নিও স্মৃতির আঁচল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যাদের অবহেলায় আমরা চার দেয়ালে বন্ধি,,,, তাদের অবহেলা ভুলে, তাদেরকে নিয়েই বেশি স্বপ্ন দেখি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জন্ম হলো আনন্দময়.,,,, মৃত্যু হলো শান্তিময়,,, শুধু এই দুটির মঝে বেদনায় ভরা থাকে। ");
        arrayList.add(hashMap);






        MorePoraAdapter morePoraAdapter = new MorePoraAdapter();
        listView.setAdapter(morePoraAdapter);




    }

    private class MorePoraAdapter extends BaseAdapter {

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
            View morePoraView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = morePoraView.findViewById(R.id.tvDisplay);
            TextView tvCopy = morePoraView.findViewById(R.id.tvCopy);
            TextView tvShare = morePoraView.findViewById(R.id.tvShare);


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



            return morePoraView;
        }
    }



}