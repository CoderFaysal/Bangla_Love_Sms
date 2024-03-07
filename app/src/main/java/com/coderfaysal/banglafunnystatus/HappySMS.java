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

public class HappySMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happy_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("হাসির মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "ডাক্তার: ভালো স্বাস্থের জন্য প্রত্যেকদিন ব্যায়াম করবেন। রোগী: আমি প্রত্যেকদিন ক্রিকেট খেলি। ডাক্তার: কতক্ষণ খেলেন? রোগী: যতক্ষণ ব্যাটারিতে চার্জ থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রোগী: এই ঔষুধ খেলে আমার অসুখ সারবেতো? ডাক্তার: আস্থে আস্থে সেরে যাবে। রোগী: তাহলে আমি আসি স্যার। ডাক্তার: আমার ফী দিয়ে যান। রোগী: আস্থে আস্থে দিয়ে যাবো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রোগী: আমার ভীষণ পেট ব্যাথা! ডাক্তার: আপনার পায়খানা কেমন? রোগী: গরীব মানুষ পায়খানা আর কেমন হবে! ৩ পাশে বেড়া, আর সামনে ছিড়া ছালার পরদ্দা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হব্বর  অনেক মদ খেয়ে বাড়িতে ঢুকলো। কিন্তু সে ঘরে না ঢুকে ভুল করে সরাসরি গোয়াল ঘরে ঢুকে পড়লো। তারপর গরুর লেজ ধরে বলল- মাতাল: কিগো বল্টুর মা, প্রতিদিন দুটো করে বেণী করো। আজ একটা বেণী কেন?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রেমিকা:;  জানু, এবার ভালো করে দেখে বলো না,,, আমার শরীরের কোন অংশ সবচেয়ে সুন্দর?, প্রেমিক: হুম, সেটা হলো এমন একটা জিনিস; যেটা দেখতে নারিকেলের মতো গোল ও সাদা। তার ভেতরে আরো দুইটা বৃত্ত আছে, বৃত্তের উপর ডট। !!!!! প্রেমিকা: শয়তান!!!! কী বলতে চাস? প্রেমিক: সেটা হলো তোমার চোখ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নেকবর একবার পূর্ণিমা রাতে এক গোরস্থানের পাশ দিয়ে একা যাচ্ছিল। তার খুব ভয় ভয় লাগছিল! হঠাৎ দেখলো যে, এক লোক কবরের পাশে বসে আছে! লোকটিকে দেখে তার কাছে এগিয়ে গিয়ে বলল- পল্টু: একা একা ভয় লাগছিল! আপনাকে দেখে একটু সাহস হলো! কিন্তু এ সময় আপনি এখানে কী করেন? লোক: কবরে খুব গরম লাগতেছিল! তাই বাইরে এসে একটু বাতাস খাচ্ছি নেকবর তো পোরাই বেহশ!!!!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ছেলে : মা মা, আজকে কি ঈদ? মা : না তো, কেন কি হইছে? ছেলে : না মানে, ভাইয়াকে দেখলাম পাশের বাড়ির আপুর সাথে কোলাকুলি করছে। মা : কি বললি হারামজাদা!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক মেয়ে হেঁটে যাচ্ছে। লাল্টু তার দিকে তাকিয়ে আছে। মেয়েটি লাল্টুকে তাকিয়ে থাকতে দেখে বলল- মেয়ে : কী দেখছেন এভাবে? লাল্টু : আপনাকে। মেয়ে : শয়তান ছেলে! এভাবে তাকিয়ে আছিস কেন? জীবনে কি কখনো মেয়ে দেখিস নাই? তোর ঘরে কি মা-বোন নাই? লাল্টু : মা-বোন তো আছে, কিন্তু দাদি নাই! আপনি দেখতে একদম আমার দাদির মতো!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চিকিৎসক : যে প্রেসক্রিপশনটা আপনাকে লিখে দিয়েছিলাম, তা ঠিকমতো ফলো করছেন তো? রোগী : ওই প্রেসক্রিপশনটা ফলো করলে নির্ঘাত মারা যেতাম। চিকিৎসক : মানে? রোগী : ওই প্রেসক্রিপশনটা ছাদ থেকে পড়ে গিয়েছিল যে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শিক্ষক : আমার হাত দেখছোস? বাবু : হ্যাঁ! শিক্ষক : এক থাপ্পড়ে সব দাঁত ফেলে দেব? বাবু : আমার পা দেখেছেন? শিক্ষক : কী, কী করবি তুই? বাবু : বেশি কিছু করব না। শুধু এক দৌড়ে পালিয়ে যাব।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বাংলা ব্যাকরণ পড়ানোর সময় শিক্ষক অন্যমনস্ক এক ছেলেকে বললেন- শিক্ষক: এই ছেলে, সর্বনাম পদের দুইটা উদাহরণ দাও তো। ছেলেটি হকচকিয়ে দাঁড়িয়ে বলল- ছাত্র: কে? আমি? শিক্ষক: গুড, হয়েছে। বসো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মা ছেলেকে দুধ খেতে বলছে কিন্তু ছেলে দুধ খাচ্ছে না- মা: বাবা, দুধটা খেয়ে নে। তোর অনেক বুদ্ধি হবে। তুই আইনস্টাইন হতে পারবি। ছেলে: মা মা, সত্যি কি দুধ খেলে আইনস্টাইন হওয়া যায়? মা: হ্যাঁ রে, বাবা দুধ খেলে আইনস্টাইন হওয়া যায়। ছেলে: তাহলে গরুর বাচ্চাগুলো মানে আইনস্টাইন না হয়ে বড় হয়ে গরু হয় কেন?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ গরিব বলে পৃথিবীতে থাকি, বড়লোক হলে মঙ্গল গ্রহে থাকতাম।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শীতকাল আসছে সবার প্রেম হবে, বিয়ে হবে। আর আমার সর্দি কাশি হবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি: মা আমার খুব মাথা ব্যাথা করছে। মা: মোবাইল থেকে ওষুধ ডাউনলোড করে খা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ছেলে: মা আমার পকেট খরচের টাকা লাগবে। মা: কাল থেকে লুঙ্গি পড়বি। তাহলে আর পকেট খরচ লাগবে না…!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্ত্রী বমি করলে সুখবর, আর স্বামী বমি করলে – সালা আজকে আবার খেয়ে এসছে..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "১ জন বিখ্যাত প্রেমিক গতকাল রাতে প্রেমিকার গালে কিস করতে গিয়ে থাপ্পড় খেয়ে অপমানে মারা গেছেন, ভালোবাসার এই দশা… তার নাম মশা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার অসুখ হোক, তোমার ঘরে মোসা আসুক, তোমার মাথা খারাফ হোক, তোমার স্বপ্নে ভুত আসুক, সারা রাট শীত লাগুক, —- তা আমি চাইনা,,, কারণ তুমি আমার ফ্রেন্ড !!!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি বোকা, আমি ছাগল, আমি গরু, আমি পাগল, আমি জানোয়ার, আমি রাক্ষস, আমি স্টুপিড, ... আস্তে পড়ো, তোমার এত্ত গুলো নাম সবাই জেনে ফেলবে ...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "১ম বন্ধুঃ কিরে দোস্ত তোর মন খারাফ কেনো ? ২য় বন্ধুঃ আর বলিশ না, একটা বই কেনার জন্য বাবার কাছে টাকা চেয়ে ছিলাম । ১ম বন্ধুঃ টাকা দেয় নাই ? ২য় বন্ধুঃ নাহ ! বইটা উনি নিজেই কিনে আনছে !!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শ্বাশুড়ি: কোনো কাজ যখন করতে পারো না, তাহলে বিয়ে করলে কিসের জন্য ? আমি: বউ সেজে আপনার ছেলের সাথে ছবি তোলার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্যার: গরু আমাদের কি দেয় ? ছাত্র: গুতো দেয় স্যার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মন খারাপ তাই ছাদে বসেছিলাম। পাশের ছাদে এক আন্টি তার মেয়ের কান্না থামানোর জন্য আমাকে দেখিয়ে বলল, ঐ দেখ ভুত। কেমন লাগে বলুনতো…..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রথম বন্ধুঃ জানিস, আমাদের বাসার সবাই বাথরুমে গান গায়। দ্বিতীয় বন্ধুঃ সবাই ? প্রথম বন্ধুঃ সবাই, চাকর-বাকর পর্যন্ত। দ্বিতীয় বন্ধুঃ তোরা তাহলে সবাই খুব গানের ভক্ত! প্রথম বন্ধুঃ দূর, তা নয়। আসলে আমাদের বাথরুমের ছিটকিনিটা নষ্ট তো, তাই!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা লেখা-পড়া করে বিয়ে আটকানোর জন্য। আর ছেলেরা লেখা-পড়া করে বিয়ে করার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা স্বপ্ন দেখলে হয় DREAM, আর আমি স্বপ্ন দেখলেই হয় স্বপ্নদোষ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কেউ যদি আপনাকে সস্তা ভাবে, আপনি তাকে ময়লার বস্তা ভেবে ডাস্টবিনে ফেলে দিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বাবা বলেছিলেন এমন কিছু কর, যেন মানুষ তোর পেছনে দৌড়ায়। ব্যাস, তারপর আর কি, ছেলেটা আজ চোর…!!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিয়ের কার্ডে লেখা ছিল, কোনো সিগারেট খোর বিয়েতে আসবেন না। তাই বিয়েতে বর আসেনি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মা: তোর কাছে মোবাইল ছাড়া Important কি আছে…? আমি: আছে তো মোবাইলের Charger.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঘুম থেকে উঠে চমকে গেলাম। আমার গলায় মালা পড়ালো কে। পরে দেখি ওটা লুঙ্গি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমিঃ আম্মু DSLR কিনে দাও, আম্মুঃ তুই ঢিলা সালোয়ার কিনে কি করবি বাজান? আমিঃ কেমনডা লাগে এহন।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাউকে ভালবাস? হুম কাকে? যে এই পোস্টা পড়েছে তাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বাড়ি থেকে পালাব। কাপোড়/চোপোড়,টাকা/পয়সা, মোবাইল নিছি ,কারও কাছে কি একটা জিএফ হবে?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা ফুসকা খাওয়ার সময় যত্ত বড় হা করে, তাতে ফুসকা নয় টাইটানিক জাহাজ ও ঢুকে যেতে পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বর্তমানে বাংলাদেশের আবহাওয়া আর মেয়েদের মন প্রায়ই এক কখন যে বদলায় কি রুপ ধারন করে তা কেউই বলতে পারে নাহ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভয় পাওয়ার পর বুকে থুতু দেয়ার সাইন্স টা আজও বুঝলাম না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঐখানে মোর জিএফ এর কবর ডালিম গাছের তলে আছাড় দিয়া মাইরালাইছি আদর করবার ছলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাথা গরম হওয়ার পর সাইন্সের ছাএটি গালাগালি করল, সালা মাদারবোর্ড তোর বউয়ের সোডিয়াম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শালী: দুলাভাই। আপনি আমাকে এই নিরবিলি জায়গায় একা পেয়ে আমার সাথে সুযোগের সৎ ব্যবহার তো করবেন না? দুলাভাই: তুমি দেখছো না আমার এক হাতে ছাগল আর লাঠি। আর অন্য হাতে মুরগী, দড়ি এবং বালতি ধরে রাখছি। আমি কিভাবে তোমার সাথে সুযোগের সৎ ব্যবহার করবো? শালী: কেন করতে পারবেন না? যদি আপনি লাঠি মাটিতে গেঁথে দড়ি দিয়ে ছাগল্টাকে বাঁধেন আর বালতিটাকে উল্টা করে রেখে তার ভিতরে মুরগীটাকে রাখেন তাহলে তো আপনি আমার সাথে সব কিছুই করতে পারেন। আমার কিন্তু এই কথা ভাবতেই খুব ভয় লাগছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রোগী: ডাক্তার সাব। বেশীদিন বাচোনের কোন উপায় আছে কি? ডাক্তার: যান বিয়ে করে ফেলুন। রোগী: ক্যান? বিয়া করলে কি বেশিদিন বাচন যায়? ডাক্তার: তা বলতে পারব না। তবে এটা বলতে পারি যে আপনি বিয়ে করার পর আর বেশিদিন বাঁচার চেষ্টাই করবেন না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়ে : জান আর না। এইবার ঘুমাতে দাও না। সারারাত তো করলা ছেলে: আজকে কোনো থামাথামি নাই। সারারাত চলবে মেয়ে: আর পারছিনা সোনা। আর কত? ছেলে: এতেই TIRED হয়ে গেছ। মাত্র তো ২০০ বার করলাম মেয়ে: আজকের মত ছেড়ে দাও না জান: ছেলে: OK.আর৫০ টা sms করবো। FREE SMS পাইছি শেষ করতে হবে তো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ছাত্র : স্যার একটি কথা বলবো..? স্যার : কি বলবে বলো..? ছাত্র : আমার খুব লজ্জা লাগছে। স্যার : লজ্জার কি আছে বল..? ছাত্র : আস্তে বলব না জোরে বলব স্যার স্যার :আরে বেটা যা বলবি জোরে বল সবাই শুনুক। ছাত্র : ছাত্র চিত্কার করে বলে-স্যার আপনার পেন্টের চেইন খোলা । স্যার :হারামজাদা আস্তে ক।");
        arrayList.add(hashMap);






        HappyAdapter happyAdapter = new HappyAdapter();
        listView.setAdapter(happyAdapter);




    }

    private class HappyAdapter extends BaseAdapter {

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
            View happyView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = happyView.findViewById(R.id.tvDisplay);
            TextView tvCopy = happyView.findViewById(R.id.tvCopy);
            TextView tvShare = happyView.findViewById(R.id.tvShare);


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



            return happyView;
        }
    }



}