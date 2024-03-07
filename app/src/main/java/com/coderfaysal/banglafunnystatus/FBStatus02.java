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

public class FBStatus02 extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbstatus02);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("FB Sad স্ট্যাটাস");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content

        hashMap = new HashMap<>();
        hashMap.put("text", "মানসিক শান্তি না থাকলে\nপুরো দুনিয়াটা'ই অন্ধকার লাগে.......!\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "~যারা বলে..!\nতুমি বদলে গেলেও আমি আগের মতই থেকে যাবো\nবিশ্বাস করেন তারাই আগে বদলে যায়..!\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "~থাকতে তো চেয়েছিলাম প্রিয় তুমি আর রাখলে কোথায়,\nপ্রথম প্রথম আগলে রেখে শেষমেষ ফেলে দিলে অবহেলার খাতায়..\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- হাসিটা সবার জন্য হতে পারে!\uD83D\uDE0A\n\n- কিন্তু চোখের পানি কোনো এক বিশেষ মানুষের জন্যই প'ড়ে।\uD83E\uDD40\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-রূপ নিয়ে বিচার করতে নেই\n\nমাটি থেকেই শুরু, আবার মাটি-তেই শেষ! \uD83D\uDDA4\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঠোঁটে কথা আসার আগেই চোখে পানি চলে আসে, আমি আবার নাকি ঝ!গ!ড়া করবো\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- ফ্যামিলি Problem,  জীবনের অর্ধেক \nহাঁসি খুসি কেড়ে নেয়..!\uD83D\uDE14\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিজেকে অপচয় করা ছাড়া, তেমন  উল্লেখযোগ্য কিছু আর হলোনা এই জীবনে....!\uD83D\uDE42\uD83E\uDD40\uD83D\uDE13");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_মাঝে মাঝে একটা জিনিসের খুব অভাব ফিল করি\uD83D\uDE1E\uD83D\uDE1E\n\n_ ইস আমার যদি একটা ভাই থাকতো\uD83E\uDD7A\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি খুব খুশি\uD83D\uDE05\n\nআমার মনের সব শখগুলো আস্তে আস্তে মারা যাচ্ছে\n\uD83D\uDD30আর\uD83D\uDD30\nসয়ে গেলে দুঃখটাও সুখ\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__এই ব্যস্ত শহরে যার তোমাকে যতটা প্রয়োজন\n\n_সে তোমাকে ততটাই গুরুত্ব দিবে! \uD83D\uDE05\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- নিজের ভালো থাকার দায়িত্বটা নিজেই নিয়েছি.!\uD83D\uDE07\uD83D\uDE07\n- কারণ, প্রিয়জন /আপনজন শুধুমাত্র গল্প\uD83D\uDC94\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কথা আর অভ্যাসের মায়ায় পড়ে গেলে সেটার বাঁধন ছেড়া  খুব কঠিন......!\uD83D\uDC94\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ততোটা ভালোবাসি আমি তাকে ❤️\u200D\nযতোটা ভালোবাসলে দ্বিতীয় কারো কথা মাথায় ও আসে নাহ......\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDE43~কঠিন এক পৃথিবী... \uD83D\uDE42\n\n~ মিথ্যা কথা বললে সবাই বিশ্বাস করে...!\uD83D\uDC94\uD83D\uDE14\n\n ~কিন্তু সত্যি কথা বললে সবাই প্রমাণ খুঁজে..! \uD83D\uDC94\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব আছে\uD83E\uDD40\uD83E\uDD17\uD83D\uDE0E\nকিন্তু মনের ভিতর শান্তি নাই\uD83D\uDE12☹️\uD83D\uDE14");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83E\uDD8B﹏﹏নিজের জীবনের লড়াইটা﹏﹏\uD83D\uDE42\n\uD83D\uDE43নিজেকে লড়তে হবে 〰 \uD83E\uDD7A\n\uD83D\uDE42⚊⚊জ্ঞান অনেকেই দেবে--\uD83D\uDE36\n\uD83E\uDD8B~কিন্তু~\uD83E\uDD2B\n সঙ্গ কেউ দেবে না\uD83D\uDE42.     _ \uD83D\uDC9A\n\n___\uD83D\uDC9A__পৃথিবীটা আজ...\n মিথ্যে মায়াতে ভরা...!\uD83D\uDC9A\uD83C\uDF3A\n\n____\uD83E\uDD40_তাই তো পৃথীবীর মানুষ আজ....! \n অভিনয়ের সেরা....!\uD83D\uDDA4\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব অপমান একদিন ফিরিয়ে দেওয়া হবে শুধু সময়ের অপেক্ষা.... \uD83D\uDE14\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- অপরিচিত কারোর সাথে.!\uD83D\uDE42\n\n- পরিচিত হবার ইচ্ছেটা মরে গেছে সেই কবে..! \uD83D\uDE11\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পুরুষের চোখে সাধারণত জল আসে না \nযদিও বা জল আসে..!\nকারণটা তীব্র ছাড়া আর কিছু না\uD83D\uDE14\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দু'র্বল কেউ নয় পরিস্থিতি মানুষকে দু'র্বল বানিয়ে দেয়। আর কিছু ধা'ন্দা'বা'জ লোক সেই দু'র্ব'ল'তার সুযোগ নিয়ে নিজেকে বাঘ ভাবে।\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- একা বাঁচতে শিখো.!\uD83D\uDE42\n\n- মানুষ শান্তনা দেবে শান্তি না.!\uD83D\uDE42\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "•-অতিরিক্ত কেয়ার এবং ভালোবাসা…\n•-একসময় 'Block' লিষ্টে সীমাবদ্ধ থাকে!-\uD83D\uDE42\uD83E\uDD40\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_মন খারাপ থাকলে হাসতে হয়..!\uD83D\uDE42\n\n_কারণ রোদের দিনেও বৃষ্টি হয়..!❤️\u200D\uD83E\uDE79\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঠকানোর চেয়ে ঠকে যাওয়া ভালো।\nতাতে অন্তত সারাজীবন কারো অভিশাপ বয়ে বেড়াতে হয় না। 😥✅");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "___❝মানুষ যতটা কষ্ট প্রকাশ করে, তার থেকে হাজারগুন ভিতরে পুষে রাখে-!!\uD83D\uDE42\uD83D\uDC99\uD83D\uDC90✍️");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "❝টাকা বো'কা মা!নুষ'কেও বু'দ্ধিমান বানিয়ে দেয়।❞");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সময়ের সাথে সাথে মানুষের আসল রুপ বেরিয়ে আসে, কোনটা মুখ আর কোনটা মুখোশ!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব সময় সমাধান খুজতে নাই,মাঝে মাঝে চোখ দিয়ে তাকিয়ে দেখতে হয় অসহায়ের সুযোগ নিয়ে কে কেমন রং বদলায়!\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাই তো তলে তলে আলগা পিরিত করছ,  আবার আমার সামনে এসে নাটক কেন দেখাচ্ছ \uD83D\uDE0F\uD83D\uDE0F");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কোথাও সান্ত্বনা নেই পৃথিবীতে আজ; বহুদিন থেকে শান্তি নেই।\nনীড় নেই পাখিরো মতন কোনো হৃদয়ের তরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ ছাড়াও নিজেকে নিয়ে সুন্দর বাঁচা যায়,অথচ আমরা নিজেকে হারিয়ে মানুষ খুঁজি!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিজের জন্য যথেষ্ট হও, অন্যের প্রতি অভিযোগ কমে যাবে\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সময় আমাকে একটাই শিক্ষা দিয়েছে....!!\uD83D\uDE0C\uD83D\uDE0C\nপরিচয় সবার সাথে রাখা যাবে কিন্তু সম্পর্ক না..!\uD83D\uDE42\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দূরত্বে তুমি,\uD83D\uDE10 তবু ও আমার আঙিনায় তোমার আয়না, \uD83C\uDF41স্রেফ ঘড়ির কাটাঁর বিশ্বাসে আমি ও মানুষ মন্দ না \uD83C\uDF38\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "I Wish ___\uD83E\uDD8B\uD83D\uDE07\n__কেউ যদি আমাকে হারানোর ভয় পেতো...!! ☺️\n\nI promise __\uD83D\uDE0C\n__তাকে সবটা দিয়ে আগলে রাখতাম..!\uD83D\uDDA4\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জিবনে অনেক কিছুই পাইসি শুধু পাইনি \uD83E\uDD40\uD83E\uDD7A\uD83D\uDC94\uD83D\uDC94\n\nআমি যা চাইসি\uD83D\uDC94\uD83D\uDE22\uD83E\uDD7A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে ভালোবাসে, সে ভুল ধরে না, ভুল শুধরে দেয়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সাবধানে যাও,\uD83E\uDD17\n\nবাসায় পৌছে মেসেজ দিও!\uD83D\uDE0D\nএই ছোট্ট ছোট্ট কেয়ার গুলো পেতেও ভাগ্য লাগে!'\uD83D\uDDA4\uD83E\uDD7A\uD83D\uDE25");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রয়োজন ছাড়া খোঁজ নেওয়া মানুষের বড়ই অভাব, প্রয়োজন ছাড়া যারা আপনার খোঁজ নেয় তাদেরকে ভালোবেসে আগলে রাখুন!'\uD83D\uDDA4\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু মানুষ মোমবাতির মত হয়..!\n\nসবাইকে আলো দিতে দিতে নিজেই শেষ হয়ে যায়..!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিজের দূ'র্ব'ল'তা কারো কাছে প্রকাশ করতে নেই। ই'চ্ছে'দের কখনো কখনো বুকের বা-পাশে মাটি চাপা দিতে হয়! নিজের মানসিক শান্তি অ'ন্যে'র মাঝে খোঁজতে নেই। মানসিক শান্তি নিজের মনে থাকলে'ই হয়!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে সত্যি তোমাকে ভালোবাসবে, সে কখনোই তোমাকে ভুলে থাকতে পারবে না। হয়তো অভিমান করে কথা বলবে না, তবুও সে সারাক্ষণ তোমাকেই মিস করবে।\uD83D\uDDA4\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রসঙ্গ যখন বিনা স্বার্থে ভালোবাসা, তখন পৃথিবীর প্রত্যেক টা মায়েই সেরা!\uD83C\uDF38\uD83E\uDD0D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "—❝\uD83E\uDD8Bসপ্ন তাকে নিয়ে দেখা উচিত.!!\uD83D\uDE0A\n\n—“সে শুধু সপ্ন দেখাবে না,,সপ্নগুলো বাস্তবও  করবে.!!\uD83E\uDD70\uD83C\uDF3C\uD83D\uDE07\uD83D\uDC96");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমরা যাদের খারাপ সময়'টা \nপাশে রয়ে ভালো করে দেই!\uD83D\uDE03\nঅথচ তারাই আমাদের ভালো সময়'টা \nখারাপ করে দুরে চলে যায়\uD83D\uDC94\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে নিজেকে খুব মনে পড়ে' কী ছিলাম, আর কী হয়ে গেলাম...\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বাবার হোটেল থেকে বের হলেই বুঝা যায় \nপৃথিবীতে এক মুঠো ভাতের কত মূল্য!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই ব্যস্ত শহরে,ব্যস্ত মানুষের,\nমাঝে শ্বা'স নেওয়া বড্ড ক'ষ্টের। ~\uD83E\uDD40\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সে আমায় কাজের অজুহাত দেখিয়ে\nঅন্য কাউকে সময় দিতো \uD83D\uDE0A\uD83D\uDC94।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের দু-একটা মধুর মধুর কথাতেই যাদের মন গলে যায়,তারা জীবনে ভীষনভাবে ঠকে থাকে....! \uD83D\uDC94\uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83C\uDF39.....আমি তাকেই \nচাই যার প্রতিটা \uD83E\uDD70\uD83E\uDD70\n★*★ নিঃশ্বাসে আমি থাকবো.... \uD83D\uDE43\nআর কেওনা.. ❤️\uD83C\uDF39\uD83D\uDE48\uD83D\uDE48\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ইচ্ছে গুলো পূরন হয়না বলে মন খারাপ করি না।\nকারণ আমি ভুলে যায়নি আমি মধ্যবিত্ত\uD83D\uDE25");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "___অবহেলা তখনই শুরু হয়.. \uD83D\uDE0C__\\\n\n_____যখন কেউ বুঝে ফেলে আপনি তার প্রতি দুর্বল \uD83D\uDE42❤️\uD83D\uDCAB__");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "$ জীবনটা ঘড়ির কাঁটার মতো হয়ে গেছে \uD83D\uDD56\nপ্রয়োজন ছাড়া কেউ ফিরে তাকায় না \uD83D\uDE43\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত্রির ফুলের মতো- ঘুমন্তের হৃদয়ের মতো অন্তর ঘুমায়ে গেছে  - ঘুমায়েছে মৃত্যুর মতন!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__যে যাকে পাওয়ার জন্য বেশি তীব্র হয়ে থাকে, সে কখনোই তাকে নিজের করে পায় না!\uD83D\uDE42\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার অপেক্ষার শহরে.! তুমি → \uD83D\uDDA4 \uD83D\uDD25\n\nএক অস্তিত্বহীন নির্বাক কবিতা \uD83C\uDF38\uD83D\uDD25");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার অপেক্ষায় আমার দিনগুলো রঙহীন\nতুমি কি সত্যিই ব্যস্ত.\uD83E\uDD79\n\nনাকি আমার প্রতি শুধু উদাসীন! \uD83D\uDE14");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- একদিন হবো লাশ , কেউ কাটবে বাঁশ..!\uD83D\uDE14\n\n- কেউ খুড়বে কবর , কেউ নিবে না আর খবর..!\uD83E\uDD40\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হঠাৎ কিছু আপন মানুষের আচরণে এমন অবাক হতে হয়  তখন নিজেকে অনেক ছোট লাগে\uD83C\uDF3F\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__ তাকে কল্পনায় ভালো'বাসতে প্রচন্ড ভালো লাগে.\uD83D\uDE0A\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সমাজ যতই চরিত্রের কথা বলুক,মানুষ তো আজও সুন্দর চেহারাই খুঁজে.!\uD83C\uDF38\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "°তুমি আমার কাছে ফুটফুটে ওই রাতের শুকতারা... \uD83D\uDC9C\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_তুমি আমার স্মৃতির পাতায় গল্প হয়ে থেকো.!\uD83D\uDDA4\uD83C\uDF3A\n\n_আমি কল্পনাতে তোমায় খুঁজে নিবো. !\uD83D\uDC94\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনাকে না পাওয়ার আ'ফসোসটা\n\nহয়তো আমার সারা জীবন থেকে যাবে.! \uD83D\uDC94\uD83E\uDD79");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কার ডাক কবে আসে কেউ বলতে পারে না। তবু মানুষ লোভ করে বেড়াই। তার পিছু ছাড়ে না");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মৃত্যু কে রিকুয়েস্ট পাঠিয়েছি\uD83D\uDE0A\nখুব তারাতারি এপসেট করতে পারে \uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- একটা মানুষ তখনই একা থাকতে পছন্দ করে।\uD83D\uDE43\n\n- যখন সে জানতে পারে সবাই তাকে ঠ\"কা\"তে ভালোবাসে।\uD83D\uDC94\uD83C\uDF38\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "••ভুল টা কোথায় ছিলো..?\uD83D\uDE42\n\n^অতিরিক্ত ভালোবাসায়, নাকি অতিরিক্ত বিশ্বাসে!\uD83D\uDE43\uD83E\uDD40••\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কোনো এক শীতের রাতে তোমার গায়ে ফ্রিজের পানি ঢেলে দিয়ে বলবো ভালোবাসি প্রিয়\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হারানোর ভয়ে বাচ্চাদের মতো কান্না করা\uD83E\uDD72\uD83D\uDE05\n ছেলেটাও তার শখের নারীটা কে ছেড়ে আসে\uD83D\uDE05\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "....যে কাঁদায়  - সে ও কাঁদবে....... \uD83D\uDE2D\n\nপাথক্য  শুধু  সময়ের.......??");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবন স্বপ্নের মত রঙিন নয়\n\nআমরা যেভাবে দেখি বা দেখতে চাই জীবনকে, জীবন আমাদের সেভাবে দেখে না!\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__বিখ্যাত হওয়ার ছেয়ে বিশ্বস্ত হওয়াটাই সেরা\uD83D\uDDA4\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মায়াবী এই শহরে স্বপ্ন দেখা বারণ,\uD83D\uDE0A\nবাস্তব মিলাতে গেলে পরিস্থিতির কারণ \uD83D\uDE05\uD83E\uDEF0");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অতীত থাকা ভালো অতীতে থাকা নয়,যে ছেড়ে গেছে তাকে যেতে দিয়ে নতুন করে বাঁচতে হয় \uD83D\uDE42\uD83D\uDC9C");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব স্ট্যাটাসের ভিতরেই, একটা গোপন বার্তা থাকে কাউকে উদ্দেশ্য করে! \uD83D\uDE42❤️");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83C\uDF38Attitude, Ego দেখিয়ে মানুষকে ইগনোর করাটা Smartness নয়, বরং সবার সাথে মিশতে পারা, এবং ভালোভাবে কথা বলতে পারাটাই স্মার্টনেস!\uD83D\uDDA4\uD83D\uDE42\uD83C\uDF3C");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পরিস্থিতি যেকোনো সময় পরিবর্তন হতে পারে, তাই জীবনে কাউকে কষ্ট দিও না! আজ হয়তো তুমি শক্তিশালী, কিন্তু সময় তোমার থেকেও শক্তিশালী!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি তুমি চাও.?\nফিরিয়ে নিতে পারো সব \uD83D\uDC94\uD83D\uDDA4\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- তোমাকে ভালোবেসে আমি সব গিয়েছি ভুলে.!\n\n- শ্যাম্পু দিয়েছি গালে আর ফেসওয়াস দিয়েছি চুলে.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অপেক্ষা করো, বিশ্বাস রাখো, শেষটা সুন্দর হবে!\uD83E\uDD0D\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যখন তুমি নিজেকে সামলাতে পারবে\nতখন তুমি সত্যিকারের মানুষ হবে \uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাই ভালোবাসার মর্যাদা দিতে জানে নাহ্!'\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- দিন দিন যত বড় হচ্ছি।\uD83D\uDE42\n\n- Life টা ততই ক'ঠি'ন হয়ে যাচ্ছে।\uD83D\uDE13\uD83C\uDF38\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- চেয়েছিলাম ভালোবাসতে!\uD83D\uDC98\n\n- কিন্তু কখন যে বিরক্তির কারণ হয়ে গেলাম বুঝতে\uD83D\uDE14\n- পারিনি...!\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার ও ইচ্ছে হয় কেউ আমাকে একটু বুঝুক \uD83D\uDE14\nআমার অনুপস্থিতিতে একটু হলে ও খুঁজুকু \uD83D\uDE12\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নীরবতা এবং হাসি দুটোই জীবনের ক্ষেত্রে প্রয়োজনীয়। হাসি যেমন সমস্যা মেটাতে সাহায্য করে, নীরবতা সেই সমস্যাগুলিকে এড়িয়ে চলতে শেখায়!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- যেখানে হাসলে প্রবলেম,বিশ্বাস করেন সেখানেই আমার বেশী হাসি পায়\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "উপার্জন করতে শিখ নয়ত \n\nঅ'যো'গ্য ব্যা'ক্তিরাও কথা শোনাবে-!\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার এক আকাশ সমান অভিমান তোমার উপর!\uD83D\uDE0A\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু মিথ্যা অভিনয়ের \nফাঁদে; কিছু নিষ্পাপ মানুষ ফেঁসে যায়! \uD83D\uDE42❤️");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- সবাই ভাবে আমি ভালো আছি.!\uD83D\uDE42\n\n- কিন্তু ভিতরে ভিতরে আমার প্রেম করা দরকার\uD83D\uDDA4\uD83C\uDF3A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "(__༅- হাজারো অপমানের পর ༎༅༎ ﹏\uD83D\uDE42\uD83E\uDD40\n__ যদি কেউ আপনাকে ভালোবাসে। \n\uD83D\uDC9Aღ﹏\uD83E\uDD70\uD83C\uDF3A\n\n- তবে তার ভালোবাসাটা পবিত্র।\uD83D\uDC9A༅༎﹏ღ﹏\uD83D\uDE07\uD83C\uDF3A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অপেক্ষা করো, বিশ্বাস রাখো, শেষটা সুন্দর হবে!\uD83E\uDD0D\uD83C\uDF38\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চুরি করে গুড়ো দুধ খেতে গিয়ে\nতাড়াহুড়ো করে ভুল করে আটা খেয়ে ফেলা বলদ আমি\uD83D\uDE42\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__•হাজারো সৌন্দর্যের ভিড়ে তুমিই এক অদৃশ্য অনুভূতি•__\uD83D\uDE0A\uD83C\uDF3B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83C\uDF3C\uD83D\uDDA4\uD835\uDDF8\uD835\uDDEE\uD835\uDDEF\uD835\uDDF5\uD835\uDDF6 \uD835\uDE00\uD835\uDE02\uD835\uDDFB \uD835\uDE01\uD835\uDDFC\uD835\uDDF5 \uD835\uDE07\uD835\uDDEE\uD835\uDDFF\uD835\uDDEE,\uD835\uDDF7\uD835\uDDFC \uD835\uDDFA\uD835\uDDEE\uD835\uDDF6\uD835\uDDFB \uD835\uDDF8\uD835\uDDF5\uD835\uDDF2\uD835\uDDFB\uD835\uDDEE \uD835\uDE00\uD835\uDDEE\uD835\uDDF8\uD835\uDDEE,  \uD83C\uDF38❤️\n\n—! \uD835\uDDFA\uD835\uDDF2\uD835\uDDFF\uD835\uDDF6 \uD835\uDDF1\uD835\uDE02\uD835\uDDFB\uD835\uDDF6\uD835\uDE06\uD835\uDDEE \uD835\uDE01\uD835\uDE02\uD835\uDDFA\uD835\uDDF5\uD835\uDDF6 \uD835\uDDF5\uD835\uDDFC,, \uD835\uDE01\uD835\uDE02\uD835\uDDFA\uD835\uDDF5\uD835\uDDF6 \uD835\uDDEE\uD835\uDE00\uD835\uDDFF\uD835\uDDEE\uD835\uDDEE..__\uD83E\uDEF6\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__\uD83D\uDC9A\uD83C\uDF3Bシ︎\uD83E\uDD7Aপৃথিবীর সবচেয়ে ভয়ংকর রোগের নাম হচ্ছে মায়া------!! ༅༎ \uD83E\uDD40\n\n\uD83E\uDD8B⊱|| যেটা মানুষকে মৃত্যুর আগেই জীবিত লাশ বানিয়ে দেয়\uD83E\uDD7A\uD83C\uDF3C\uD83C\uDF3A\uD83E\uDD8B_\uD83D\uDC9A\uD83C\uDF3B\uD83C\uDF3B_");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "—মায়াবী এই শহরে সপ্ন দেখা বারন, \n\n—বাস্তব মিলাতে গেলেই পরিস্থিতি তার কারন। \uD83E\uDD7A\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "●─༉\uD83C\uDF38 কখনো কারো খারাপ চাই নি ☺️\n\n- তবুও সবার গল্পেই আমি খারাপ \uD83D\uDE05\uD83D\uDC94");
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