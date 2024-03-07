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

public class SadSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sad_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("কষ্টের মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "অতিরিক্ত মন খারাপ হলেই মানুষ একেবারে নিরব নিথর হয়ে যায়। একা একা থাকতে ভালোবাসে। কারণ তখন তার সমস্যাকে নিজের মত করে কেউ দেখে না আর মূল্যায়ন করে না। তাই মন খারাপের বেলায় একাকিত্বই হয় মানুষের একমাত্র বেস্ট সংগী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "খালি হাতে এসেছিলাম আর খালি হাতেই যাব, ভাবিনি এই পৃথিবীতে এতই কষ্ট পাব. লাভার বল আর বন্ধু বল কেউ আপন নয়, ক্ষণীকের মেলামেশা সব ই অভিনয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হাসি মুখে কথা বলি,সবার সাথে মিশে চলি, দুঃখ পেলে গোপন রাখি,সবাই ভাবে আমি সুখি, আসলে সুখি আমি নয়,আমার জীবন টাই সুখের অভিনয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে মানুষগুলো সারাজীবন পাশে থাকবে বলে, তারাই ছেড়ে চলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ এতটাই স্বার্থপর হই যে, প্রয়োজন শেষ হয়ে গেলে ছুঁড়ে ফেলে দিতে এক মিনিটও ভাবে না");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাতের নিস্তব্ধতা মানে কেউ ভালবাসায় হাসছে আর কেউ নিঃশব্দে কাঁদছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "না চায়তেই পেয়ে গেলে মানুষ তা কদর করতে ভুলে যায়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি ততটাই ফিরে পাবে যতটা তুমি কাউকে দেবে। সেটা ভালবাসা হোক কিংবা কষ্ট।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসলে জীবন মানে একটা ভুমিকাহীন গল্প, যার প্রতিটা লাইন পড়া খুব সোজা কিন্তু বোঝা ঠিক ততটাই কঠিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একদিন ঠিক হয়ে যাবে, এই কথার ওপর নির্ভর করে টিকে আছে হাজারও সম্পর্ক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কি বিচিত্র এই জীবন! কাছে থাকলে কেউ মূল্য দেয় না, কিন্তু হারিয়ে গেলে সবাই খোঁজে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শাসন তাকেই করা যায়, যাকে নিজের করে ভালবাসা যায়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনে কিছু সময়ই আসে যা কোনোদিনও ভোলা যায় না");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনের কথা ভাবলে পা’দুটো থেমে যায়, একাকি এই পথে তখন আত্মবিশ্বাস ছাড়া অন্য কাউকেই সাথে পাইনা ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে কষ্ট পাওয়া ভালো, কারণ কষ্ট মানুষকে বাস্তবতা শিখায় আবার কষ্টই মানুষ কে সফলতার পথ দেখায় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কখনো ভাবিনি হারিয়ে যাবে তুমি আমাকে এভাবে কাঁদিয়ে, কখনো বুঝিনি ফিরবে না আর আমার পৃথিবি রঙিয়ে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "টাকা পয়সাই সকল সুখের মুল উৎস নয়, সুখি হয়ে বেচে থাকতে সুন্দর একটি মনের দরকার হয় টাকা পয়সা নয় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমরা জীবন বলতে যা বুঝি আসলে জীবন তা নয় বাস্তবের মুখে পড়লেই জীবন চেনা যায় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনার লক্ষ লক্ষ টাকা, বাড়ি , ঘাড়ি সবকিছুই থেকে যাবে শুধু থাকবোনা আমি আর আপনি ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবন নিয়ে যত বেশী আপনি চিন্তা করবেন ঠিক ততটাই হারিয়ে যাবেন দুনিয়ার এই রঙ্গমঞ্চে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সহজ এবং সরল ভাবে সব কিছু চিন্তা করতে শিখুন দেখবেন জীবন অনেক সহজ হয়ে গেছে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সত্যের পথে চলুন মানুষ আপনার ক্ষতি করতে চাইলেও পারবে না, কারণ সত্যের মাঝেই রয়েছে মুক্তির পথ ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তখনই বুঝবে যে তুমি সঠিক ভাবে কাজ করে যাচ্ছো, যখন দেখবে পেছনে না তাকিয়ে তুমি সামনে এগোতে পারছো ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার আমার দূরত্ব সমানে সমান তবু আজও আছে ভালোবাসা বহমান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অনুভূতি গুলো একই থাকে শুধু মানুষগুলো বদলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রত্যেক মানুষেরই একজন প্রিয়মানুষ থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা যেমন বুঝে শুনে হয়না হটাৎ করেই শুরু হয়, তেমনি কিছু না বুঝে হটাৎ করেই একদিন শেষও হয়েও যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কখনো কখনো একা থাকা ভালো, একা থাকলে কেউ দুঃখ দিতে পারবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব চেয়ে বড়ো দুঃখ হলো আমি যদি কখনো হারিয়ে যায়, কেউ আমাকে খুঁজবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার চোখের জলের প্রাপ্য কেউ নয়, কারণ যে আমার চোখের জলের দাবীদার সে কখনো আমাকে কাঁদাবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে মানুষ চোখের জলের দাম বোঝেনা তার জন্য চোখের জল না ফেলায় ভালো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যারা অন্যের জন্য বেশি ভাবে তাদের দুঃখ গুলো অন্যজন বোঝেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমরা যখন সুখী থাকি তখন দুঃখের কথাগুলো মনে করার মতো দুঃখ আর কিছু হতে পারে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমাকে ফেসবুক থেকে unfollow করে দিতে পারবে, whatsaap এসএমএস unseen করে রাখতে পারবে, কিন্তু ভাগ করে নেয়া স্মৃতি গুলো কখনই সরিয়ে ফেলা সম্ভব হবে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজকের পৃথিবীতে মনে রাখার চেয়ে ভুলে যাওয়ার মানুষের সংখ্যা বেশি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি দীর্ঘদিন ধরে কোনো সম্পর্ক মনে খারাপ অস্থিরতার সৃষ্টি করে, তবে বুঝতে হবে সেই সম্পর্কের মানুষটি যথাপুযক্ত নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাতে কাঁদি দিনে হাসি তবুও বেদনাগুলোকে ভালোবাসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যেখানে অনুভূতি ও চিন্তা ভাবনা গুলো আমাকে হতাশ করতে পারবেনা সেখানে আমি যেতে চাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চোখের জল ধরে রাখা যায়, হাসি দিয়ে দুঃখ আড়াল করা যায় কিন্তু হৃদয়ের ব্যথাকে লুকিয়ে রাখা সম্ভব হয়না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একদিন তুমি ঠিকই অনুভব করতে পারবে পাথর খোঁজার ব্যস্ততার মাঝে আসল হীরেটিকেই হারিয়ে ফেলেছো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা যদি পৃথিবীর সেরা অনুভূতি হয়, তবে মানুষ ভালোবাসার মানুষের কাছ থেকেই কেনো আঘাত পায়?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব থেকে শক্তিশালী আর্তনাদ হলো নীরবতা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা কি আমি বুঝতে চাইনা কারণ আমি প্রেমে ব্যর্থ হওয়ার যোগ্য নই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রকৃতিতে দুঃখ দেয়ার জন্য যেমন অনেক কিছু আছে, তেমন খুশি করার জন্য আরও বেশি কিছু আছে, শুধু মনোযোগ দিয়ে অনুভব করতে হবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসার আনন্দগুলো একমুহুর্ত থাকে কিন্তু ভালোবাসার দুঃখের মুহূর্তগুলো সারাজীবন রয়ে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনে সুখ কেবল ভালোবাসতেই বসবাস করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রথম প্রেম যেমন সবচেয়ে বেশি মধুর হয়, তেমনি প্রথম ক্ষতটি সবচেয়ে বেশি গভীর হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি যতো তোমাকে ভুলে যাওয়ার চেষ্টা করছি, ততোই তোমাকে নিয়ে বেশি ভাবছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রথম দেখায় প্রেম গুলো কোনো রকম বিদ্যুৎপাত ছাড়াই সবকিছু জ্বালিয়ে দিয়ে চলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসল প্রেমের মানুষ হল সেই জন, দুঃখের গান শুনলে যার কথা মনে পড়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সত্যিকারের ভালোবাসা গুলো খুঁজে পাওয়া যায়না, এগুলেকে তৈরি করে নিতে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা একরাশ সুখের স্বপ্ন নিয়ে আসে আর কিছু ঘুম ভাঙ্গানো দূর্স্বপ্ন দিয়ে চলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রত্যেকের হৃদয়ে ব্যথা থাকে, কেবল এটি প্রকাশের ধরন আলাদা হয়। কেউ দুঃখ গুলোকে আড়ালে রাখার চেষ্টা করে আবার কেউ হাসির দিয়ে ঢেকে রাখে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার কাছে নেই তাতে কি হয়েছে! তুমি আছো আমার সারা হৃদয় জুড়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হৃদয়ে যদি কোনো মানুষ বসবাস করে তবে মন থেকে তাকে সরিয়ে ফেলা অনেক শক্ত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি আর অন্যকোনো জনকে ভালোবাসার অবস্থায় নেই কারণ আমার হৃদয়ের সমস্ত প্রেম গগন শূন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কান্না দিয়ে যদি সব বেদনাকে মুছেফেলা সম্ভব হতো, তাহলে দুঃখ গুলো চিরদিনের জন্য বিদায় নিতো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আনন্দের কারণ গুলো যতো সহজে অন্যকে বোঝানো যায়, দুঃখের কারণ গুলো ততো সহজে বোঝানো যায় না। দুঃখ গুলো হয় একান্ত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চোখ বন্ধ করে যাকে বিশ্বাস করা হবে, সেই একদিন চোখের ঘুম কেড়ে নেবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাউকে কোনো প্রতিশ্রুতি দেয়ার আগে চিরদিন কথাটার অর্থ বুঝে নেওয়া উচিৎ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শেষ পর্যন্ত আমরা কেউই একসঙ্গে থাকতে পারবো না, কাউকে না কাউকে আগে ও পরে একা হতে হবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে জীবন কিছু শিক্ষা আমাদের দান করে যেসব শেখার ইচ্ছা কোনোদিন ছিলোনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বৃষ্টি না হলে যেমন রংধনু তৈরি হয় না, তেমনি দুঃখ না আসলে আনন্দ অনুভূত হবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যেখানে তুমি ছেড়ে গেছো আমি সেখান থেকেই আবার শুরু করতে চাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ হল বিশ্বের বিস্ময়কর ধাঁধা গুলোর মধ্যে একটি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের দৈহিক সৌন্দর্য তার হৃদয়ের সৌন্দর্যের কাছে হারমেনে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুটি কারণে মানুষ তোমার থেকে দূরে সরে যায় ১. হয়তো সে তোমার থেকে নতুন কিছু শিখেছে, ২. নাহলে সে তোমার কাছ থেকে আঘাত পেয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসার ক্ষমতা যার বেশি তার ব্যথা অনুভব করার ক্ষমতা তত বেশী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কষ্ট সবচেয়ে তখন বেশি হয়, চোখের জলকে যখন হাসি দিয়ে ঢাকার ছলনা করতে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সত্যিকারের ভালোবাসা সবসময় কঠিন হয়. কারণ সত্য ভালোবাসাগুলোতে হারানোর ভয় কাজ করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি সুখ গুলোকে ধরে রাখা সম্ভব না হয়; তাহলে কখনোই দুঃখ থেকে নিজেকে রক্ষা করা যাবেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক কথায় যারা উত্তর দেয় ভালো আছি, তারা প্রকৃতপক্ষে ততোটা ভালো থাকেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পৃথিবীর সবচেয়ে খারাপ অনুভূতি হলো যখন দুজনেই একে অপরকে ভালোবাসার সত্বেও একসাথে থাকা সম্ভব হয়না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হৃদয়ের গভীরে যে ব্যথা থাকে তা অনুমান করার ক্ষমতা কারোর নেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অশ্রু এমন একটি ভাষা যা কখনো মুখে প্রকাশ করা যায়না আর হৃদয়ও বহন করতে পারেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি আমার সমস্যা গুলো দিয়ে কাউকে বিরক্ত করতে চাইনা, তাই সবসময় ভালো থাকার ভান করি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একাকীত্ব আমাকে এই পৃথিবীর অনেক কিছু শিখিয়েছে, শুধু যে আমাকে একাকী করেছে তাকে এখনো বুঝতে পারিনি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চোখের জলের কোনো বর্ণ হয়না তাই দুঃখের কারণ ভিন্ন হলে চোখে একই রকম জল ঝরে পড়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দীর্ঘদিন যাবৎ আমি একা আছি তার মানে এই নয় আমি দুঃখে আছি। একা থাকার মাঝেও আনন্দ বাস করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের প্রিয় জিনিস গুলোই মানুষকে বেশি আঘাত করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রথম থেকে শুরু হয়ে যেমন শেষ হয়, তেমনি শেষ থেকেও আবার শুরু হয়, তাই কোনো কিছুর শেষে মানে প্রকৃত অর্থে শেষ নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমাকে বোঝার মতো মানুষ এই পৃথিবীতে নেই। কারণ আমি নিজের ভূমিকা নিজে দিতে পারিনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রতিদিনের ছোট ছোট ভুল গুলোই এক সময় অনেক বড়ো ভুল হয়ে দাড়ায়। যা যেকোনো সম্পর্কে ভাঙ্গন ধরতে যথেষ্ঠ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে হৃদয় ভাঙার আওয়াজ কান্নার শব্দ হয়ে প্রকাশ হতে চায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমাদের অবশ্যই একটা বিষয় বুঝতে হবে, দুঃখ হলো একটি সমুদ্র। সেই সমুদ্রে কখনো কখনো ডুবে যেতে হয়। এবং আমরা দুঃখের সমুদ্রে সাঁতার কাটতে বাধ্য হই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চোখের জল দিয়ে কখনো লেখা যায়না, কিন্তু চোখের জল অনেক কিছু লিখতে সাহায্য করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ মানুষকে সৃজশীল করতে সক্ষম করে, ফলে দুঃখ পাওয়া মানুষগুলো সৃজনশীলতার সাহায্যে নিজের ব্যথা ও নেতিবাচকতার বাইরে যেতে পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যখন আমরা খুশিতে থাকি তখন গানের মিউজিক উপভোগ করি। যখন দুঃখে থাকি তখন গানের ভাষা বুঝতে চেষ্টা করি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ একাকীত্ব বোধ করে, কারণ তারা সম্পর্কে সেতুর নির্মাণ করার পরিবর্তে দেয়াল করার কাজে বেশি ব্যাস্ত থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একটি সম্পর্ক দুজন মানুষ দ্বারা তৈরি হয়, কিন্তু সেই সম্পর্ক একটি মানুষ ভেঙে দিতে পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু কিছু স্মৃতি এমন আছে যতোই পুরানো হোক যখন মনে আসে কিছুক্ষণ ভাবিয়ে তোলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মুখ বুঝে খারাপ গুলোকে মেনে নিয়ে চুপ থাকলেই ভালো, খারাপ গুলোর বিরুদ্ধে কিছু বলে দিলেই তুমি খারাপ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ দুটো মানুষের মধ্যে একটি দেয়াল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি কোনো কারণ ছাড়াই আমার থেকে দূরে সরে গেছো, তাই দয়া করে কোনো অজুহাত দিয়ে আর ফিরে আসার চেষ্টা করনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুঃখ সারাজীবন থাকেনা, সে একদিন ঠিক উরে যাবে সময়ের ডানা দিয়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সময় বারার সাথে সাথে অনেক কিছুর পরিবর্তন হয়, হ্যাঁ ভালোবাসারও পরিবর্তন হয়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কোনো এক প্রেমিক আজও তার প্রেমকে খুঁজে ফেরে এই প্রকৃতির প্রতিটি বস্তু ও জিনিসের মধ্যে,");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আবার কোনো একদিন দেখা হয়ে যাবে সেই চেনা রাস্তায়, তখন আমরা থাকবো অচেনা দুটি মানুষের মতো");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অবহেলায় যাকে হারালে, অবেলায় তাকে খুঁজো না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মনে পড়লেও আজকে তোমায়, মনে করা বারণ …");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা ভালো থাকুক, বেঁচে থাকুক প্রার্থনায় …");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার মনের মানুষ তোমারি থাকুক, আড়াল হওয়া আমায় মানায় …");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্মৃতি গুলো খুব আপন, নয়তো খুব বেহায়া ..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসি তোমায় বলা হয়না আর …");
        arrayList.add(hashMap);





        SadAdapter sadAdapter = new SadAdapter();
        listView.setAdapter(sadAdapter);


    }

    private class SadAdapter extends BaseAdapter {

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
            View sadView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = sadView.findViewById(R.id.tvDisplay);
            TextView tvCopy = sadView.findViewById(R.id.tvCopy);
            TextView tvShare = sadView.findViewById(R.id.tvShare);


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



            return sadView;
        }
    }



}