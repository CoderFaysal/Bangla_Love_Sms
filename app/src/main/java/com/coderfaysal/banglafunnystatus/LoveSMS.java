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

public class LoveSMS extends AppCompatActivity {

    ListView listView;
    ArrayList <HashMap <String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("লাভ মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা শব্দটা হয় না কখনোই পুরানো..হয় না কখনোই মলিন..হয় না ধূসর কিংবা বর্নহীণ.,,.যা শুধু রংধনুর রঙের মতো রঙিন..হোক না সেটা এপার কিংবা ওপারের..তারপরেও ভালোবাসা তো শুধুই ভালোবাসা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সত্যিকারের হৃদয দিয়ে যারা ভালোবাসতে চায়, তারাই ভালোবাসা পায়না। আর যারা মিথ্যা ভালোবাসে, তাদেরই জীবনে ভালোবাসার মানুষের অভাব হয় না! এটায় বাস্তব...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি আমার সমগ্র জীবনের বিনিময়ে শুধু তোমাকে চেয়েছিলাম। তোমাকেই পেয়েছি। পৃথিবীর কাছে আমার আর কিছুই চাইবার নাই আমার ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একটু একটু মেঘ থেকে, হালকা হালকা বৃষ্টি হয়। ছোট ছোট গল্প হতে, ভালোবাসা সৃষ্টি হয়।।। মাঝে মাঝে স্বরন করলে,,,, সম্পর্কটা মিষ্টি হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক সাগর ভালোবাসা,,,,,, আমি রেখেছি তোমার জন্য। তুমি যে আমার,,,,,আমি যে তোমার। তুমি শুধু আমার জন্যে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জসনার আলো,,,,,, রেশমি চুলে লাগে বড় ভালো,,,,, ঠোটে তোমার হালকা হাসি,,,, লাগে আমার ভালো।  তুমি দৃষ্টি হতে দূরে,,,,, মন হতে দূরে নয়,,,,, তুমি বাস্তব থেকে দূরে,,,,, স্বপ্ন হতে দূরে নয়।  তুমি আমার থেকে দূরে,,,,,, ভাবনা হতে দূরে নয় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Ondokar Ai Rat a, Junakir Shata Ak Juri Suk Patiya Dilam Tumar Janalar Kacha, Ar Junakir Danay Lika Dilam - I LOVE YOU");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মন ছাড়া love বেকার,,,,,, SMS ছাড়া inbox বেকার,,,,, Sorry ছাড়া রাগ বেকার,,,, সুবাস ছাড়া flower বেকার,,,,,, আর you ছাড়া I বেকার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Jodi Bol Tumar Kota Mona Pora Kotobar? Ami Bolbo Coker Pata Nora Jotobar. Jodi Bolo Tumay Valobasi Koto?? Ami Bolbo Akasa Tara Asha Joto.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কে বলে চাঁদকে ছোয়া যায়না, এই যে ছোয়ে দিলাম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Misty Chader Misty Alo, Basi Tumay Onk Valo. Meti meti Tarar Mela, Dekbo Tumay Sarabela. NisiRat a Sonto Vubon... Chaibo Tumay Sarajobon.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জান, তোমায় বলতে চাই........ তুমি ছাড়া প্রিয় আর কেহ নাই। ভালবাসি শুধু তোমায় আমি....... জনম জনম ভালবাসতে চাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Lagbe Jokon Kub Aka, Chad Hoya Dibo Deka. Monta Jokon Takbe Karap, Sopna Giya Korbo Alap, Kosto Jokon Mon Asasha,,, Tara Hoy Jolbo Pasha");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দিনের প্রয়োজন সূর্যের আলো....... ভোরের প্রয়োজন শিশির..... আর আমার প্রয়োজন তুমি,,,,,,আমি তোমাকে ভালবাসি। আই লাভ ইউ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার সেই প্রিয় জন, যাকে আমার হৃদয়ের সব ভালোবাসা দিয়ে দিয়েছি। আই লাই ইউ জান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুল লাল, পাতা সবুজ। মন কেন এতো অবুজ । কথা কম কাজ বেশি... মন চায় তোমার কাছে আসি। মেঘ চায় বৃষ্টি,,, চাঁদ চায় নিশি,,., মন বলে আমি তোমায় অনেক ভালোবাসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Pritibita Tumari Thak,,, Parla Akto Nil Diya. Akash ta Tumari Thak,,, Parla Akto Tara Diyo. Megta Tumari Thak,,, Sodu Akto Vijiya Diyo. Monta Tumari Thak. Parla Akto Jaygo Diyo.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "১ টা আকাশ বাতাসের জন্য.... ১টা সাগর নদীর জন্য..... ১টা ফুল ভোমরার জন্য.... আর আমি শুধু তোমার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জনম জনম রবো আমি তোমার আশে পাশে। খুজে দেখো আমায় পাবে.... হৃদয়ের কাছে। শুনাব না কোন গল্প..... গাইব শুধু গান। যে গানে খুজে পাবে ভালবাসার টান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কেনো হঠাৎ তুমি এলে,,,,,, কেনো নয় তবে পুরোটা জুড়ে!!! আজ পেয়েও হারানো যায়না মানা.... বাঁচার মানেটা রয়ে যাবে দূরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি তুমি বাসো ভালো...... চাঁদের মতো দিব আলো....,,,। যদি আমায় ভাবো আপন.....,,, হব তোমার মনের মতন...,,,। নদী যেমন দেয় মোহনা,,,,. তোমার ই আমি তোমার উপমা।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমায দেখে পালাও তুমি মুখ ঢাকিয়া লাজে,,,,,, ভালোবাসার প্রতীক তুমি আমার হৃদয় মাঝে। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি যদি বিষ্কিট হও,,,,, আমি হব মুড়ি,,, আমার সাথে প্রেম করলে কিনে দিব চুড়ি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাঠাল গাছে কাঠাল ধরে,,,, নারিকেল গাছে ডাব, তোমার জন্য আছে,,, আমার অফুরন্ত Love।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার হৃদয়ে কেউ নেই, তুমি ছাড়া.....। আমার বুকে কোনও স্বপ্ন নেই, তুমি ছাড়া...। আমার দুচোখ কিছু খোজেনা, তোমায় ছাড়া.....। আমি কিছু কল্পনা করতে পারিনা তোমায় ছাড়া....। আমি কিছু শুনতে পারিনা,,,, তোমার নাম ছাড়া...। আমি আর কিছু চাইনা তোমায় ছাড়া।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Tumi Amr Valobasa,,, Tumi Amr Jan. Valobaser Ful Tumi, Likbo Tumar Nam. Tumi Amar Moyna paki,,,, Ami Tumar Tiya... Tumay Ami Rakbo Buk a ,,,,,, Valobasa Diya.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুল ফুল করনা....ফুল আমি দেবনা। ফুল জদি পেতে হয়..... ভালবাসা দিতে হয়। ভালবাসা দিয়ে দাউ..... ফুল তুমি নিয়ে নাউ। ফুল নিয়া চলে যাও i love you বলে  দাও ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালবাসা হাজার বছর বেঁচে থাকে,,,,, কখনবা কবিতা হয়ে, কখনবা গল্প হয়ে,,, কখনওবা সৃতি হয়ে,,,, আবার কোন মানুষের জীবনে সাথী হয়ে..,, কখনও আবার কারও বুজের কষ্ট হয়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আকাশের তারা তুমি, শ্রাবণের বৃষ্টি।।  ভালোবাসার সুখ তুমি,,,,,, বিধাতার সৃষ্টি। বসন্তের ফুল তুমি,,,, হ্নদয়ের হাসি,,, মনে চায় তোমাকে আরো আরও খুব খুব ভালোবাসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার যত ভালোবাসা,,,, দিব তোমার পায়,,,,, তুমি বধু উঠে এসো,,,, আমার ভাঙ্গা নায়।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি পাশে নেই,.,..,.,. তবুও তোমায় লাভ করি,,,।,, তুমি আমার হবে না জানি,,,, তবুও তোমার পথ চেয়ে আছি। স্বপ্ন সত্যি হবে না জানি,,,, তবুও তোমায় নিয়ে স্বপ্ন দেখি। কারণ আমি যে তোমায় ভীষণ ভালবাসি।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্বপ্ন দিয়ে রাঙ্গাব আমি সুখের আল্পনা। হৃদয় দিয়ে খুঁজব আমি হৃদয়ের ঠিকানা। ছায়ার মত থাকব আমি শুধু তোমার পাশে। যে আমাকে অনেক বেশি ভালবাসে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হৃদয়টা আজ কাঁদছে অঝর নয়নে,, খুব আপন যে আমার সে আছে দূরে,,,,,। তবুও মনের ব্যাথা বলিনি তারে যদি দুঃখ পেয়ে তার চোখে অশ্রু ঝরে। আমি যে খুব ভালোবাসি তারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Chad K Vhalobasi Rat porjonto,,,,, Surjo K Vhalobasi Din Porjonto. Ful k Valobasi Subas Porjonto. Kinto Tumay Valobasi Ar Valobasbo Ses Nissas Porjonto.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হৃদয় কেটে বানিয়েছি ছোট্ট ১ টি খাম,,,, সে খামেরী ভেতরে লিখেছি তোমার নাম,,,, সে খামটি কিনে নিও ভালোবাসার দামে,,,, কোনদিনও ছিড়ে ফেলনা নিরব অভিমানে।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চোখে আমার নদী বহে,,,,, মনে দুঃখের গান। তোময় যদি না পাই আমি, দিব আমার প্রান । দেখতে চাই তোমার মুখ, ধরতে চাই হাত। কি করে তোমায় ছাড়া, থাকি দিন রাত?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার প্রিয়সী, বুঝে নিও গোপনে, তোমার দেখা পাই আমিনিশি রাতের স্বপনে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Alpo Alpo Meg Thake, Halha Halha Bristy Hoy. Cuto Cuto Golpo Thaka, Valobasa Sristy Hoy. Maja Maja Soron Korla Somporkota Misty Hoy");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার কলংকে আমি হব কলংক ভাগী,,,, হে আমার প্রিয়তমা, আমার অনুরাগী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Choka Asha Kajol, Kane Asha Dul, Tuta Jano Rokto ranga Ful. Cuk Akto Cuto Muka Misty Hasi, Amon Akjon MayaK ami Sotti Valobasi.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মনে যদি পড়ে এ আমাকে,,,, বেঁধে নিও খুব যত্ন করে,,, যেন তোমারই রই চিরতরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Amar Jibona Kaw nai Tumi Cara. Amar Jobon a Konu Sopno Nai Tumi Care. Amr DuCok Kicu Kujana Tumay Cara. Ami Kicu Vabta parina Tumay Cara. Ami Kicu Likta Pari Na Tumay Nam Nara. Ami Kicu Bujta Cai na Tumay Cara.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি চাদঁ হতাম সারা রাত পাহারা দিতাম।।।। যদি বৃষ্টি হতাম,,,, সারা শরীর ভিজিয়ে দিতাম। যদি বাতাস হতাম,,,,, তোমার কানে চুপি চুপি বলতাম------- আমি তোমায় ভালবাসি।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "লাভ ইজ ফান কেউ করবে লাভ , কেউ করবে পাপ , কেউ খাবে ছেকা, কেউ হবে একা , কেউ করবে গান  কেউ দিবে জান, আর কেউ করবে অভিমান! সো লাভ ইজ ফান, যদি ভালো লাগে একটি কবিতা লিখো।যদি কষ্ট হয় একটা ছবি একো।যদি খারাপ লাগে স্বপ্ন দেখো।যদি মনে পড়ে তবে Please একটা SMS দিও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার কি খবর চোখের কোনে জমে আছে একটু খানি পানি,মুছে দিতে আসবেনা কেউ এ-কথাও জানি…অনেক আপন ছিলে তুমি হঠাৎ হলে পর,আমার খবর নাইবা নিলে,তোমার কি খবর ???");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Jodi Bolo Tumar Kota Mona Pora Kotobar? Ami Bolbo Coker Pata Nora Jotobar. Jodi Bolo Tumay Valobasi Koto? Ami Bolbo, Akasha Tara Asha Joto.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুই বললে মেঘ হবো,,,, এনে দেবো বৃষ্টি............। তুই বললে পথহবো,,,,,, কেড়ে নেবো দৃষ্টি। তুই বললে রাতহবো,,,,, এনে দেবো আধাঁর,,,,। তুই বললে আকাশ হবো,,,,, হবো বিশাল পাহাড়,,,,। তুই বলরে জ্যোত্স্না হবো,,,,,, এনে দেবো আলো। না বললেও তোমায় সরাজীবন,,, বেসে যাবো অনেক অনেক ভালো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Jiboner Sopno Niya Badachi akti Gor. Tumak Pabo Bola Sajiyaci Premer Basor. Abeg Vora Mona Ofuronto Valobasa. Sara Dey konu konu Sihoron jage mona, Tumak Pawer Asay.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দিন ফুরাবে,,,,রাত ফুরাবে,,,,ফুরাবে ফুলের প্রান,,,, সমায় ফুরাবে,,,,জীবন ফুরাবে,,,,ফুরিয়ে যাবে জান,,,,But তোমার জন্য ফুরাবে না আমার ভালোবাসার টান।। মিস ইউ জান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার রঙিন স্বপ্ন শিল্পীর রঙে ছবি, তুমি আমার ছাঁদের আলো, সকাল বেলার রবি, তুমি আমার নদীর মাঝে একটি মাত্র কূল, তুমি আমার ভালোবাসার শিউলি বকুল ফুল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ মানুষের জন্য, পাখি আকাশের জন্য, সবুজ প্রকিতির জন্য, পাহাড় ঝর্নার জন্য, ভালোবাসা সবার জন্য, আর তুমি শুধু আমার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু না এই কথাটার মাঝে অনেক কিছু লুক্কায়িত থাকে..কখনো থাকে রাগ,কখনো থাকে না বলা কষ্ট.!আবার কখনো থাকে আবেগ মিশ্রিত ভালবাসা..যেটা সবাই বুজে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালো লাগা থেকেই জন্ম নেয় ভালোবাসা, আর তার মাঝে গড়ে ওঠে ছোটো ছোটো আশা...পাগলি ভালো বাসবি কি আমায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে সত্যিকার ভালোবাসেতার কাছে পৃথিবীর সব চেয়ে সুন্দর তার ভালোবাসার মানুষ,,সে দেখতে যেমনই হোক না কেন,,,,,,,,,,,,তার কাছে সেই সবচাইতে সেরা!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি কেউ আপনাকে ভালবাসে , তবে কোন কিছুই তাকে আপনার কাছ থেকে দূরে সরাতে পারবে না কখনো ! আর,যদি ভালবাসার অভিনয় করে , যাওয়ার সময় কোন কিছুই তাকে ধরে রাখতে পারবে না........!! . নির্মম বাস্তব সত্য...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি ভালবাসাকে আমরা মৌচাক ধরি,♥♥ তাহলে বিশ্বাসটাই হল মৌমাছি। ♥♥কেননা উভয়ের বিশ্বাসের মাধ্যমেই ভালবাসার অমৃত মধু পাওয়া যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব সময় মন দেখে ভালবাসবে, কখনো ধন দেখে নয় গুন দেখেই প্রেম কর, রুপ দেইখা নয় রাতের বেলায় সপ্ন দেখ,দ িনের বেলায় নয় একজনকে ভালবাস, দশ জনকে নয়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি তোমাকেই ভালবাসি।আর সারাজীবন তোমাকে ভালোবেসে যাব -ভালবাসার মানুষের মুখে এই কথাটুকু শুনলেও যেন মন জুড়িয়ে যায়..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি তোমায় ভালবাসি বললেই কাউকে ভালবাসা যায় না.. ভালবাসার জন্যে চাই দুটো সুন্দর মন আর অনেক অনেক বিশ্বাস..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোর হৃদয়ের মাঝখানেতে রাখবি আমায় শুধু বেঁধে ? ঠোঁট বাঁকিয়ে বললি হেসে মাথা খারাপ নাকি !পাগলকে আমি নেবো সেঁধে !");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দুটি মন একটি আশা এরই নাম হলো ভালোবাসা প্রেম আছে বলেই পৃথিবী টা এখনো এত সুন্দর");
        arrayList.add(hashMap);






        LoveAdapter loveAdapter = new LoveAdapter();
        listView.setAdapter(loveAdapter);

    }

    private class LoveAdapter extends BaseAdapter {

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
            View loveView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = loveView.findViewById(R.id.tvDisplay);
            TextView tvCopy = loveView.findViewById(R.id.tvCopy);
            TextView tvShare = loveView.findViewById(R.id.tvShare);


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


            return loveView;
        }
    }

}