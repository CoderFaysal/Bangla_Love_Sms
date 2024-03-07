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

public class FBStatus01 extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbstatus01);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("FB স্ট্যাটাস");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);



        // New Content

        hashMap = new HashMap<>();
        hashMap.put("text", "কবি বলেছেন \uD83E\uDD28\nযেখানে সম্মান নেই, সেখানে যেও না\nতাই বলে কী আমি আমার বাসায় যাবো না\uD83D\uDE44\nএইডা কোনো কথা \uD83D\uDE42\uD83E\uDD26\u200D♀");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিজে ব্যাক্তিগত Facebook id আছে, এটাই অনেক। ব্যাক্তিগত মানুষ থাকা বিলাসিতা!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDDA4\n\n-মুচকি হাসো আর জীবনটাকে উপভোগ করো_\uD83C\uDF38\uD83D\uDE0A\n\n\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাতের আকাশটা দেখলেই বুঝতে পারা যায় নিরবতা কতোটা সুন্দর হতে পারে।\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- ক্লাস six এর মেয়ে স্ট্যাটা-স দিয়েছে.!\n\n- পৃথিবীর শ্রেষ্ঠ অনুভূতি হলো মা হওয়া.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "____\uD83E\uDD8B\uD83C\uDF3A\uD83E\uDD8B\nসেই মানুষটাকে জীবনে রেখে দাও\uD83D\uDCAE\uD83E\uDD40….!\nযে মানুষটা শত কাজের মধ্যে তোমাকে মনে রাখে\uD83E\uDD70..||\n\uD83C\uDF3B\n____\uD83E\uDD8B\uD83C\uDF3A\uD83E\uDD8B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-চুল পড়ার জন্য ডাক্তারের কাছে গেছিলাম \uD83D\uDE42\n- গিয়ে দেখি ডাক্তার নিজেই টাকলা\uD83D\uDE44\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "༆༉”ღ”\uD83E\uDD70\uD83E\uDD40-ღ\uD83D\uDC9C\uD83C\uDF3B\nজীবনে যাই হোক কখনো হাসতে ভুলে যেও না\uD83E\uDD8B࿐\nকারন হাসিটা তোমার শক্তি আর সাহস যোগাবে!-\uD83D\uDC9A\n︵❛❛༎\uD83D\uDC9A\uD83C\uDF3A︵❛❛༎\uD83D\uDC9A\uD83C\uDF3A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষ দিন দিন cute হয়!\nআর আমি দিন দিন cuffee কালার হচ্ছি!☕");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- হাজার হাজার মানুষের ভিড়েও একজনই হয়\nশ্রেয়,,,,\uD83D\uDE14\uD83D\uDCAB\n\n- মনের মানুষ ধরতে পেলে আগলে রেখো \nপ্রিয়,,,,\uD83D\uDE0D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যারা পরিক্ষার হলে দেখায় না তাদেরকে আমি ঘেন্নাআআআআ করি\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কবি বলছেন, হে ফেইসবুক এর ফেমাস নারী – তোমার জন্য অপেক্ষা করছে রান্না ঘরের হাড়ি।\uD83E\uDD78\uD83D\uDE0E");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- আমাকে কেউ জোর করে বিয়ে করে ফেলো.!☹☹\n\n- আমার আর পড়াশোনা ভাল্লাগে না.!\uD83D\uDE36");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- বৃষ্টির দিনে খিচুড়ির প্লেটের ছবি দিতে আমারও ইচ্ছা করে.!\uD83D\uDE36\n\n- কিন্তুু আমি তো খাই গামলায়.!\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রপোজাল Accept করি নাই বলে তার কাছে আমি তার Ex হয়ে গেছি..!\uD83D\uDE42\uD83D\uDC4D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Sir: H2O মানে কি?\nMe : পানি।\uD83D\uDE42\nSir: H2O+H2O+H2O মানে কি?\nMe : বন্যা মনে হয়!\uD83D\uDE11");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিরে,,\uD83D\uDE12\n\nআমার পোস্টে তাকাই আছস ক্যান\uD83D\uDC40\n\nবেয়াদব\uD83D\uDE1C\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- সিম কোম্পানি ছাড়া কেউ আর ভালোবাসে না\uD83D\uDE2A\n\n- প্রতিদিন একটা হইলেও SMS দিবেই\uD83D\uDC94\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাকমা মেয়ে পটাতে গিয়ে পাহাড়ি দের হাতে গণধোলাই খেয়ে আসলাম \uD83D\uDE3F");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- apu বলার অপরাধে.!\uD83E\uDD15\n\n- আমাকে Block মেরে দিলো 26 বছরের এক যুবতী.!\uD83E\uDD74");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিপদে পরার সময় যেই ড্রেস পরা থাকি ঐ ড্রেস ভয়ে আর পরবর্তীতে না পরা আমি \uD83D\uDE42\uD83D\uDD2A\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83E\uDEF5তুই মেয়ে তুই আমার সাথে প্রেম করবি \uD83D\uDE12\n\n\uD83D\uDE10\uD83E\uDEF5তুই কেন ,,bf,, ছাড়া সিঙ্গেল ঘুরবি\uD83D\uDE21বুঝা আমারে\uD83E\uDD28বুঝা\ninbox a ai\uD83D\uDE20\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- প্রতিদিন'ই বলি কাল থেকে \nপড়তে বসবো!\uD83D\uDE2A\uD83D\uDCDA\n- কিন্তু সেই কাল আর আসে না.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চারদিকে এতো লাভ বার্ড❤\nমাঝখানে আমি এক অসহায় কাক....\uD83D\uDE42\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "“না আসে কারো call না আসে কারো Message বুঝি না এটা Phone ব্যবহার করছি না calculator \uD83D\uDE10\uD83E\uDD74");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ডিয়ার হবু বউ \uD83E\uDDD0\nআমাদের কি অদ্ভুত মিল তাই না \uD83D\uDE48\uD83E\uDD2D\uD83E\uDD2D\n\nআমি বিয়ে না করলে\uD83D\uDE0F\nতুমিও করতে পারবে না \uD83D\uDE0A\uD83D\uDE0A\uD83D\uDE02\uD83D\uDE02\uD83D\uDE0A\uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "★\n\nকারোর \uD835\uDE74\uD835\uDEA1\uD835\uDE9D\uD835\uDE9B\uD835\uDE8A \uD835\uDE70\uD835\uDE9D\uD835\uDE9D\uD835\uDE92\uD835\uDE9D\uD835\uDE9E\uD835\uDE8D\uD835\uDE8E সহ\u200D্য করি না\nআর কাউকে \uD835\uDE78\uD835\uDE96\uD835\uDE99\uD835\uDE9B\uD835\uDE8E\uD835\uDE9C\uD835\uDE9C করার চেষ্টাও করি না\n\uD835\uDE88\uD835\uDE8E\uD835\uDE8A\uD835\uDE91 \uD835\uDE78\uD835\uDE9D'\uD835\uDE9C \uD835\uDE7C\uD835\uDE8E \uD83E\uDD71\uD83E\uDD1E\n\n★");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Ogo shuncho \uD83D\uDC40\nআমার হবু শশুরকে বলে দিও Happy Father's Day \uD83D\uDE0D❤");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঃ পড়তেছিস.? \nআমিঃ হুম \uD83D\uDE0A\nমাঃ তোর বইয়ের ভিতরে কিসের আলো দেখা যায়\nআমিঃ শিক্ষার আলো মা\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "~মেয়েদের বিয়ে করার চেয়ে \uD83D\uDC9E\uD83E\uDD40\n\n~বউ সাজার শখ বেশি \uD83D\uDE07\uD83D\uDC9C\uD83E\uDD23\uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83C\uDF38\uD83C\uDF3C~ছেড়ে যাওয়া শহরে ধরে রাখার একটা মানুষ হোক..!!\uD83D\uDDA4\uD83E\uDD8B\uD83C\uDF38\n\n– হোক না সে যেমন তেমন, গড়ে নেবো মনের মতন...!!\uD83D\uDDA4\uD83E\uDD8B\uD83C\uDF38❤");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্ত্রী:- বিয়ের আগে তো কতো  I love YOU  বলতে \uD83E\uDD70 এখন আর বলো না কেনো.??\uD83E\uDD14\uD83E\uDD14\n\nস্বামী:- নির্বাচন শেষ প্রচার ও শেষ..!! \uD83E\uDD17\uD83D\uDE0E");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- কি প্রেম করমু\uD83D\uDE44\n\n- কথাই তো খুঁজে পাই না, কেমন আছেন\uD83D\uDE2A\n- আর কি করেন ছাড়া!!\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ক্লাসমেট দের কারো বিয়ে হয়ে গেছে,কারো বাচ্চাও আছে দুই একটা,আর আমি এখনো কার্টুন দেখে দেখে ভাত খাই!'\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সংসার সুখের হয় পুরুষের গুনে,,\uD83D\uDE0C\uD83D\uDE0A\n\nপুরুষ যদি চুপচাপ বৌ এর কথা শোনে..\uD83D\uDE42\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "• ছোট বেলায় আমি মুরগিকে ভাবতাম হাঁসের ব\u200Cউ\"..!\uD83E\uDD37\u200D♀️\uD83D\uDE42\uD83D\uDE48");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83E\uDD8B••••তুমি যাকে ফিরিয়ে আনার জন্য ••\uD83E\uDD8B\n\uD83E\uDD8B ••• \uD835\uDE4E\uD835\uDE56\uD835\uDE59 \uD835\uDE68\uD835\uDE69\uD835\uDE56\uD835\uDE69\uD835\uDE6A\uD835\uDE68 দিচ্ছো•••••!\uD83D\uDE13\uD83D\uDE1E\n\uD83E\uDD8B একটু খুঁজ নিয়ে দেখো সে অন্য কারো•••জন্য \uD835\uDE4D\uD835\uDE64\uD835\uDE62\uD835\uDE56\uD835\uDE63\uD835\uDE69\uD835\uDE5E\uD835\uDE58 \uD835\uDE68\uD835\uDE69\uD835\uDE56\uD835\uDE69\uD835\uDE6A\uD835\uDE68 দিচ্ছে••••• \uD83E\uDD7A\uD83D\uDDA4\n\n❣️••••এটা'ই   \uD835\uDE4D\uD835\uDE5A\uD835\uDE56\uD835\uDE61\uD835\uDE5E\uD835\uDE69\uD835\uDE6E \uD835\uDE3D\uD835\uDE64\uD835\uDE68\uD835\uDE68••••••\uD83D\uDC9E\n••এই শহরে সবাই \uD835\uDE3D\uD835\uDE5A\uD835\uDE69\uD835\uDE69\uD835\uDE5A\uD835\uDE67 টা'ই খুঁজে•••••!\uD83D\uDE0A\uD83C\uDF3A,,,!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- হাসি তো তখনি পায়\n- যখন পরিক্ষার খাতায় আবল তাবল লিখি\n- কিন্তু পিছনের জন বলে হাতটা সরাও দেখতে পারছিনা\uD83E\uDD72\uD83D\uDE36");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সন্তান জন্মানোর পরে মার উক্তি :\uD83E\uDD23\n\nআমি তোমাকে নয় মাস গবে ধারণ করেছি\uD83E\uDD30\nঘন্টার পর ঘন্টা প্রসব বেদনা সহ্য করেছি\uD83D\uDE14\nসিজার সেকশনের মধ্য দিয়ে গিয়েছি\uD83E\uDD72\n\nআর তুমি কি না বাবার ফটোকপি?\uD83D\uDC69\u200D\uD83D\uDC66");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Facebook :- আমি সব জানি\uD83D\uDE43\n\nMessenger :- আমার কাছে সব প্রমান আছে\uD83D\uDE43\uD83D\uDE42\n\nGoogle :- আমার কাছে সব আছে \uD83D\uDC38\n\nInternet :- আমি ছাড়া তোরা কিছুই না,,\uD83E\uDEE0\n\nCharger :- আওয়াজ নিচে,,\uD83D\uDE12\n\n*লে কারেন্ট :- আমি ছাড়া তোদের কোনো অস্তিত্বই নেই,,\uD83E\uDD23\uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "' Gd n8 তো বাচ্চারা বলে! লিজেন্ড'রা তো Conversations এর মধ্যে'ই ঘুমিয়ে পড়ে! \uD83D\uDE11");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDE42ছেলেরা কেমনে ডুবে ডুবে ভালোবাসে”\uD83E\uDD79\n\n___অর আমি তো ডুব দিলেই পানি খাই”\uD83E\uDD79");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জীবনে এই প্রথম ছেকা খাইলাম,,\n\nতাও আবার ডিম ভাজি করতে গিয়া।.....\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05\uD83D\uDE05");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আন্টির মেয়েরা \uD83E\uDEE2\uD83D\uDE48\uD83C\uDF3A  \uD835\uDC14\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC26\uD835\uDC1A\uD835\uDC21\uD83D\uDE3D\uD83D\uDE3D°__আসলেই তো স্বাদ  \uD83D\uDCA6\uD83E\uDD75 এতো স্বাদ কেন,\uD83E\uDD14 সেই স্বাদ, \uD83E\uDEE6");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই বছরটা দেখবো, প্রেম না হলে! জানুয়ারীর ১ তারিখে বিয়ে করে ফেলবো\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- ধরে নাও আমি তোমার বয়ফ্রেন্ড।\n\nধরে যখন নিয়েছো আর ছেড়ে দিও না।\uD83D\uDE00");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এখন আর রাতে ঘুম আসে না \uD83D\uDE13 \nচাঁদ এখন আর আমার ঘরে আসেনা \uD83D\uDE25\nদাঁড়ান মশাই \uD83D\uDE12 \nআজ দুপুরে বেশি ঘুমিয়েছি,, \nতার মধ্যে অমাবস্যার রাত \uD83C\uDF2A️\nঘুম আর চাঁদ কি বাল করে আসবে \uD83D\uDE0F\uD83E\uDD23\uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_ হুদাই একা একা ফেসবুকে ঘুরো কেনো!\uD83D\uDE12\n\nআমাকে নিয়ে ঘুরলে কি হয়! \uD83D\uDE44\uD83D\uDE14");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_✨\uD83D\uDE07তুমি ফুল হয়ে থেকে যাও\"আমি যত্ন করে রেখে দিব-!!\uD83D\uDDA4\uD83E\uDD70");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভাবিয়া  করি ও প্রেম \uD83D\uDE43\uD83D\uDE1C\nকরিয়া  ভাবি ও না \uD83E\uDD2D\nকিভাবে খাইবা  বাঁশ \uD83D\uDE07\uD83D\uDE0A\nটের ও পাইবা না\uD83E\uDD71");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "– Single থাকাটা ও একটা শিল্প …!\n\n– আর আমি হলাম সেই শিল্পের শিল্প পতি…!\uD83E\uDD71");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দরজা, জানালা, লাইট বন্ধ করে রুমটাকে গু'হা বানিয়ে মোবাইল হাতে বসে বসে সা!ধনা করা স!ন্ন্যাসী আমি\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- প্রেম হবে কিভাবে.!\n\n- জানু,বাবু,সোনা,বেবি এসব কথা শুনলেই তো আমার হাসি পায়.!\uD83D\uDE48\uD83E\uDEE2");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Ex যখন বলে, তোর মতো কত এলো আর গেলো..\uD83E\uDD74\n\nলে আমি :- আল্লাহ তোর ব্যবসার উন্নতি করুক.\uD83D\uDE1C\uD83D\uDE43");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালোবাসা না দাও’ অন্তত একটা মামলা দিও’ তারিখে তারিখে দেখা তো হবে!\uD83E\uDEE3");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- কিছু হয়নি শোনার পরও যে বলবে তুই বলবি না মার খাবি..!\uD83E\uDEE0\n\n- এমন একটা Bestfriend থাকা অনেক ভাগ্যের ব্যাপার..!\uD83C\uDF38\uD83D\uDDA4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- দরকার হইলে Story seen করবি না.!\uD83D\uDE11\n\n- দেখে রিয়েক্ট না দিয়ে চলে যাস,এইটা আবার কোন ধরণের অসভ্য'তা!\uD83D\uDE3E");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসুন সবাই বিয়ে করি সিঙ্গেলমুক্ত সমাজ গড়ি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমাকে ছাড়া আমি বাঁচবো না \uD83D\uDE25\nএই চাপা কে বেশি দেয়..!\uD83D\uDE42\n ⭕ছেলে\uD83D\uDC6E\uD83C\uDFFB\u200D♂️ ⭕মেয়ে\uD83D\uDE45\uD83C\uDFFB");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পরামর্শ চাই..?\uD83D\uDE43\n\nকি করলে বাড়ি থেকে জোর করে বিয়ে করিয়ে  দিবে.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার এক গার্লফ্রেন্ডও বলছিলো আমাকে ছাড়া নাকি বাঁচবে না দুই বছর আগেই ছেড়ে চলে গেছে এখনো বেঁচে আছে মরে নাই \uD83D\uDE04");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি ভাবি তুমি mingle, তুমি ভাবো আমি mingle\uD83D\uDE44\n\nঠিক এই কারনে আমরা দুজনেই single\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যাকে নিয়ে ছিল আমার শত চিঠি,\nসে কখনো খোলেনি আমার চিঠির খাম!\uD83D\uDDA4\uD83D\uDC94\uD83D\uDDA4\uD83D\uDC94");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শহর জুড়ে বৃষ্টি নামুক,তুমি খুঁজে নিও ঠাই..। প্রতিটি বৃষ্টি কণায় লেখা থাকুক, শেষ অবধি তোমাকে চাই.।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিয়ের জন্য ফ্যামিলির উপর ভরসা করে থাকবেন নাহ! এমনও তো হতে পারে, তারাও আপনার উপর ভরসায় আছে। \uD83D\uDE04");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সিঙ্গেল মেয়ে  \uD83D\uDE42কোনোদিন ও দেখিনি\uD83E\uDD79\n\nআচ্ছা ওরা দেখতে কেমন হয় ???\uD83E\uDD14");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমারা সেই লেভেলের Student \uD83D\uDE2C\nযারা পরিক্ষার প্রশ্ন দেখে নয়, স্যার দেখেই বলে দিতে পারি পরিক্ষা কেমন হবে\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি অলস হতে পারি.!\uD83D\uDE11\n- কিন্তুু.!\uD83D\uDE15\n- পাশের বাসায় ঝ,গ,'ড়া লাগলে দৌড়ে গিয়ে সেই দৃশ্য দেখা আমি  মিস করি না.!\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আগে মানুষ রেগে গেলে\nঅভিশাপ দিতো।\uD83D\uDE44\nএখন রেগে গেলে ব্লক দেয়,,,,\uD83D\uDE06\uD83E\uDD14");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মোবাইল টিপার সময় মুচকি হাসি খুবই বিপ'দজনক। কারণ আম্মু ভাবে প্রেম করতাছি। \uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফালতু টেনশন করতে করতে এমন লেভেলে চলে গেছি,\n\nযে এখন টেনশন না থাকলেও টেনশন হয়\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "!- প্রেমের টানে আমেরিকান মেয়ে বাংলাদেশে আসতে পারে.\uD83D\uDE0C\n\n_আর তুমি Facebook থেকে আমার \uD835\uDE92\uD835\uDE97\uD835\uDE8B\uD835\uDE98\uD835\uDEA1 এ আসতে  পারো না \uD83D\uDE12 \n\nবেয়াক্কেল বেডা...!\uD83D\uDE24\uD83D\uDE42\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- দেনমোহর পরিশোধ না করে স্ত্রীকে স্পর্শ করাও হারাম।\uD83D\uDE15\n\n! আর তুমি গার্লফ্রেন্ডের কপালে চুমু দিয়ে বলো পবিত্র প্রেম\uD83D\uDE11");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83E\uDD86-হাঁস আর বেডা  মানুষ-\uD83D\uDE42\n\n-দুটোই- এক\uD83D\uDE12\n\n\uD83E\uDD15-অকারণে-প্যাঁক-প্যাঁক- করে-\uD83D\uDE10\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা সারা জীবন দুটো জিনিস লুকিয়ে রাখে.!! \nনিজের ইচ্ছা আর নিজের কষ্ট.!!..\uD83D\uDE25\uD83E\uDD40\uD83D\uDC95");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_❝ঐ ছেমরা...\uD83E\uDEF5\uD83D\uDE3E\uD83E\uDEF5\n\nপ্রেম  করবি..!\uD83E\uDD2D\uD83D\uDE44\n\nঈদ আইতাছে, পে°পু পে•পু জুতা কিনে দিব❞.! \uD83E\uDD74\uD83E\uDD71\uD83D\uDE05\uD83E\uDD23\uD83D\uDE02");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "My Dear  হবু  বউ \uD83D\uDC78\uD83D\uDE48\uD83D\uDE48\n\uD83D\uDE0Fসপ্তাহে সাত দিন চুলে শ্যাম্পু করবা, সমস্যা নাই আইনা দিমু \uD83D\uDE0E\n\uD83D\uDE0Fচুল কাইটা লেয়ার কাটিং বয়লার মুরগির কাটিং করবা, তাতেও সমস্যা নাই পার্লারের বিল দিবো \uD83D\uDE0E\n\uD83D\uDE09চুল কালার কইরা ঘোড়ার লেজের মতো বানাও, তাতেও আপত্তি নাই \uD83D\uDE0E\n\uD83D\uDE15খালি যদি একদিন ভাতে চুল পাইগো সোনা \uD83D\uDE15\n\uD83D\uDE02 সেই দিন বুঝবা \uD83D\uDE02\n\uD83D\uDE07আমি কোন ঝাড়ের বাঁশ \uD83C\uDF35");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- আচ্ছা যারা ঢং করে মা কে Mom বলে \uD83D\uDC38\n\n- তারা নিশ্চয়ই বাবা কে বোম বলে\uD83D\uDE44");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__  তোমারে পটানোর লাগি....\n__ Post করি....!!\uD83D\uDE07\uD83D\uDE3C\n__ আর তুমি হা হা' মেরে...\nচলে যাও...!!\uD83D\uDE1E\n\nপ্রতারক বেডা\uD83D\uDE0F\uD83E\uDD27\uD83D\uDE29");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনি আমি সিঙ্গেল তার মানে এই না যে চেহারা খারাপ,,\uD83D\uDE12\uD83D\uDE12\n\nএকটা কথা মনে রাখবেন ব্র্যান্ডের জিনিস কখনো ফুটপাতে বিক্রি হয় না,,\uD83D\uDE42\uD83D\uDE42\uD83E\uDD1F\uD83E\uDD1F");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একজন সিরিয়াল কি'লারের চেয়েও ভ'য়ংকর \n\uD83D\uDE42 ইমুজি দেয়া মানুষগুলো\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পারলে ammu বানান উলটা করে দেখাও\uD83E\uDD71\uD83E\uDD74\uD83E\uDEF5\uD83E\uDEF0\uD83E\uDD74\n\nআমি জানি কেউ পারবে না \uD83D\uDE0F\uD83D\uDE44\uD83D\uDE0F");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- Story তে রিপ্লাই দিয়ে প্রে-ম হয়ে গেছে অনেকের.!\n\n- আর আমি স্টোরি দিলেই বলে ''ভিডিওটা সেন্ড করেন.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দশ নারীতে আসক্ত হওয়া,!!!\nকখনোই পুরুষত্তের প্রমান দেয় না\uD83E\uDD37\u200D♂️\uD83E\uDD37\u200D♂️\n\nআসল পুরুষ তো এক নারীতেই \uD83D\uDC70\u200D♀️\uD83D\uDC70\u200D♀️\uD83D\uDC70\u200D♀️\n ❤️❤️আসক্ত থাকে\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "bf তুমি  কই গো \uD83E\uDEE3\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনার বিশ্বাস হবে কিনা জানি না…\uD83D\uDE44\n\nআমার বয়স যখন ২ বছর,….\uD83D\uDE4B\u200D♀️\n\nতখন আমি অনেক ছোট্ট ছিলাম..!\uD83D\uDE07");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এক মাত্র পরীক্ষার সৃজনশীল প্রশ্ন ছাড়া আর কেউ আমার মতামত জানতে চায় না \uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ধোঁকা কাকে বলে?\n- এই গল্পটা না পড়লে বুঝবেন না.!\uD83D\uDE14\n\n- একদিন এক রাজা..... See more");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_ মেয়ে তোর কাইল্লা কাইল্লা মুখে \uD83C\uDF1A\uD83D\uDC79\uD83D\uDE2A\n\n_ যখন রুপের আগুন জ্বলে \uD83D\uDD25\uD83D\uDE26\uD83D\uDEB6\n\n_তোর কাইল্লা মুখের মেকাপ আমার ভাল্লাগে \uD83C\uDF1A\uD83D\uDC38\uD83E\uDD13");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Sorry bro... \uD83D\uDE42\uD83E\uDD40\nসব মেয়েরা টাকা খোঁজে নাহ \uD83D\uDE0F\nকিছু মেয়েরা ভালোবাসাও খোঁজে \uD83E\uDD70\uD83E\uDD40");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তৈ তৈ তৈ,,\n\nসিঙ্গেল ছেলেগুলো কই \uD83D\uDE09");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝে মাঝে Ex এর মায়ের কথা ভাবি\uD83E\uDD14\uD83E\uDD40\n\nকি জিনিস ডাউনলোড দিলো খালাম্মায়\uD83D\uDE33\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাইলেই যদি সবকিছু পাওয়া যেতো,,তাহলে অপেক্ষার কোন মূল্যই থাকতো না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মোবাইল টিপলে যদি বেতন পাওয়া যেতো, তাহলে আমি এতোদিনে কোটিপতি হয়ে যেতাম!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা তার বাবাকে একটু বেশিই ভালোবাসে!\uD83D\uDE0A❤️");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আবশেষে উপবৃত্তির টাকা পাইলাম \uD83D\uDCB7\uD83D\uDCB4\uD83D\uDCB6\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB4\uD83D\uDCB6\uD83D\uDCB6\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB4\uD83D\uDCB6\uD83D\uDCB6\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB4\uD83D\uDCB6\uD83D\uDCB7\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB5\uD83D\uDCB7\uD83D\uDCB4\uD83D\uDCB7\uD83E\uDD75\nআপনাদের কি খবর?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDE32Edit শক্তি, Edit বল,\nEdit ছাড়া!ছেলেরা\nপুরাই,,\uD83D\uDE44\nআফ্রিকার জঙ্গল!! \uD83D\uDE0D\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি শ্যামলাও না আবার উজ্জ্বল ফর্সাও না, আবার কালো ও না, এখন এইটা রে কি কালার বলব?\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শুষ্ক কণ্ঠে যদি এত সুর হয়☺ সুরময় কেন হবে না হৃদয় ?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েদের পটানো একদম সোজা\uD83C\uDF1A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কেমনে তোমায় মনে রাখি \uD83E\uDD7A\uD83E\uDD71\nচারিদিকে যাচ্ছে আঁখি \uD83D\uDE42\uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Bye!\nBhalo thakis!\nAr message korbo na!\n\nEgulo konodin e last msg hoyna.\uD83D\uDE42\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেয়েরা হুটহাট শাড়ী পরলে দুনিয়ার সেরা সুন্দরী লাগে.!\uD83E\uDD70\n\nআর ঘনঘন শাড়ী পরলে বেডি বেডি লাগে.!\uD83E\uDD2D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__মানুষের সুন্দর্য তার মস্তিস্কে বসবাস করে,যার মস্তিষ্কের ভাবনা যত সুন্দর সে মানুষ হিসেবে ঠিক ততটাই সুন্দর.!❤️\u200D\uD83E\uDE79\uD83C\uDF3C\uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাঝেমাঝে ইচ্ছা করে! বিয়ে করে, জীবনটা শেষ করে দেই!'\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Weather Is So Romantic, A Weather এ জানালার পাশে বসে কানে হেডফোন পছন্দের গান শুনার ফিলিংস টা সেই !! Opps \uD83D\uDE0A\uD83D\uDE0A\uD83E\uDD70");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "If you don't like me\nCongratulation\nI Don't Care\uD83D\uDE12\uD83D\uDE12\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "°  লুডু খেলা ছাড়া আমা*কে খাওয়া সম্ভব না \uD83E\uDD71\uD83D\uDE0F  °");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_____””প্রিয়\n\n“”—-তুমি কার আকাশে উড়ো______\uD83C\uDF3A\uD83D\uDE24\uD83D\uDE3C\n\n\uD83C\uDF38____””দোয়া করি ঐ “আকাশে”_____\uD83D\uDE42\uD83D\uDC94\n\n\uD83C\uDF3A____””ঠাডা পইরা মরো””______\uD83D\uDC94\uD83D\uDE3C\uD83E\uDD23\uD83D\uDE02\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দইন মিক্কেতুন বাতাস মারি লুঙ্গি দিইয়ি খুলি, ডাগত আছিল তালতো বইন চাইলু আ গরি \uD83D\uDE33 আইসতে আইসতে তালতো বইনে দিইয়ি দৌড় মারি। ইজ্জত সম্মান হাই ফেলাইয়ি বাতাইসসে মাদারি \uD83E\uDD23\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "───উফ ༆\uD83C\uDF3A\n❥━༎༅•• \uD83D\uDE3C\n\n_° খুব ঝগড়া করার ফিলিংস হচ্ছে হক . \uD83E\uDD74\uD83E\uDD71\nআমি ও ঝগড়া করতে গিয়ে প্রেমে পড়ে যাওয়ার লোক \uD83D\uDE01\uD83E\uDD18\n\n⬤───༆☠️..!\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "●───༊༆-আমি\"যে\" সিঙ্গেল\n_\uD83E\uDD12\uD83D\uDE11 \n\n-তোগো\" একটু\"মায়া\"হয়\"নাহ\"\uD83E\uDD7A\uD83D\uDE3F\n\n-ঠাডা\"পরবো\"তোগো\"পিরিতে\" -\n ●───༊༆\uD83D\uDE3E\uD83D\uDDE1");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Someone : তোর থেকে তোর মাকে দেখতে বেশি সুন্দর...\nMe : তাই জন্যই তো মায়ের বিয়ে হয়ে গেছে আমার এখনো হয় নাই.. \uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি হাজারো মশার Crush\uD83D\uDE48\uD83D\uDE1C");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ক্লাস নাইন-টেনের ছেলে মেয়েদের ভাব দেখলে মনে হয় আমি ফাইভে পড়ি আর ওরা বিসিএস ক্যাডার.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কষ্টগুলো যত্নে থাকুক, তৃপ্ত সুখের ছায়ায়\n\nতোমার তুমিকে জড়িয়ে রেখো ভালোবাসার মায়ায়");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "_ আমার যাওয়ার আমি যাবো তুমি বলার কে। জিনিস টা কী তোমার বাপের। যে চামচা গিরি কর।\uD83D\uDE21\uD83D\uDE21\uD83D\uDE11\uD83D\uDE11");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হঠাৎ একদিন বিয়ে করে ফেলব!❣️\uD83D\uDE01\uD83D\uDC38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- ভালো ছেলেদের গার্ল'ফ্রেন্ড জু'টে না.!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আচ্ছা,,মনে কর\uD83D\uDE42\nসামনে ভুত,,পিছনে আমি \uD83D\uDC81\u200D♂️\n\nএখন তুমি কাকে জড়িয়ে ধরবে\uD83E\uDD37\u200D♂️\uD83D\uDE48\uD83E\uDD2D\uD83E\uDD2D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "•_>\uD83C\uDF38\uD83D\uDC30>\n\n_ কেউ একজন থাকুক যে বোঝাবে বুঝবে কিন্তু ছেড়ে যাবে না ..!\uD83C\uDF38\uD83D\uDDA4☺️\n\n_•\uD83E\uDD8B☺️•_");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "°\n_না কেউ পটে\" না কেউ পটায়!\uD83E\uDD7A\uD83D\uDCA6\uD83D\uDE48\n\n°  হুদাই ফোন কিনে দিছে\n\nআব্বায়\uD83D\uDE3E\uD83E\uDD23\n.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "●───༆༄࿐\uD83C\uDF41\uD83C\uDF3A\uD83E\uDD8B༄࿐ღ༎\n\uD83D\uDE42\"কেউ পছন্দ না করলে,,\uD83D\uDE0A\n\uD83D\uDE42কি যায় আসে,,\uD83D\uDE42\n\uD83D\uDE07\"\"আল্লাহ তো,,\uD83D\uDE42\n❤️\uD83E\uDD40পছন্দ করেই বানিয়েছে,, ❤️\uD83E\uDD40\n\uD83E\uDD8B\uD83E\uDD40\uD835\uDC00\uD835\uDC25\uD835\uDC21\uD835\uDC1A\uD835\uDC26\uD835\uDC1D\uD835\uDC2E\uD835\uDC25\uD835\uDC22\uD835\uDC25\uD835\uDC25\uD835\uDC1A\uD835\uDC21\uD83E\uDD8B\uD83E\uDD40\n ❥❥──\uD83E\uDD8B\uD83C\uDF41\uD83C\uDF42\uD83C\uDF38\uD83C\uDF3A\uD83E\uDD17,,,\uD83C\uDF38\uD83E\uDD7A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কেউ আমার লগে\nIn a Relationship status দিবা \nতাহলে তাকে আমি\nপুত পুত বাশিওয়ালা জুতা কিনে দিমু..\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যে বয়সে আমার দাঁত ভাঙ্গত ,,,\uD83D\uDE43\n\nসে বয়সে নাকি এখনকার বাচ্চাদের হৃদয় ভাঙ্গে,,,,,,,,,\uD83D\uDE06\uD83D\uDE06\uD83E\uDD2D");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সপ্নের মাঝখানে ঘুম ভে'ঙে গেলে, আবার ঘুমিয়ে সেই সপ্নটার 2nd part দেখার চেষ্টা করতে থাকা আমি।\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একটা সময় ছিলো! \nফোন মাটিতে পড়লে ব্যাটারি বাইরে চলে আসতো। \n\nআর এখন ফোন পড়লে আমার হার্ট, কিডনি, লিভার সব বাইরে চলে আসে!! \uD83E\uDD74\uD83E\uDD74");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কি নেই আমার Problems, Tension, Stress,Depression, Fat belly,Dark Circle, Pimple সবই আছে।\n\nতোর কাছে কি আছে ভাই?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "Someone : kire tor mood karap?\n\nMe : Mood,Face,Life,Luck,sob'i karap:)\n\nAsole ami manus ta e karap\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- আমি আমার মতোই,\uD83D\uDE0A\n\n- আমি আর অন্য কারোর মতো হওয়ার চেষ্টাও করি না!\uD83D\uDE42\uD83C\uDF38");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মাক্স তুমি ধন্য,,,,,\uD83E\uDEE1\nদাত বাঁকা, নাক বোঁচা মাইয়াগোর সম্মান বাঁচানোর জন্য,,,, \uD83D\uDE43\uD83D\uDE0F");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পরীক্ষা খারাপ হওয়া সত্ত্বেও হাসতে হাসতে হল থেকে বের হওয়া চরম নি-র্লজ্জ আমি আর আমার বান্ধবীরা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- বিয়ে বিয়ে নিয়ামত,\n- বিয়ের পর কিয়ামত।\uD83D\uDE05\uD83D\uDE02");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু মানুষ ঘুম থেকে উঠেই ম্যাসেজ দেখে,\nGood Morning, Koliza!\uD83D\uDE07\n\nআর আমি ঘুম থেকে উঠে দেখি\nBattery is full. Remove your charger");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমাকে দিয়ে প্রেম হবেনা এটা আমার ফ্যামিলি জানে, তাই ডাউট ও করে না\uD83D\uDE03");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যাহা লিখেছি খাতায়,পাবে না কোনো বইয়ের পাতায়! \uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "''নায়ক নায়িকা বৃষ্টিতে \uD83C\uDF27 ভিজলে\nপ্রেম হয় ''\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC68\n\nআর আমি বৃষ্টিতে \uD83C\uDF27️ ভিজলে \uD83E\uDD79\n\n104° জ্বর হয় \uD83E\uDD12\uD83E\uDD12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "টেক্সট আসতেছে না দেখে মনে হলো ইগনোর করতেছে, চেক করে দেখি নিজেই রিপ্লাই দিতে ভুলে গেছি\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বাসায় একটু ঝামেলা হলেই মনে মনে বলি,একবার খালি বিয়ে টা হোক আর আসবো না এই বাসায়!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "__পালিয়ে গিয়ে...\uD83D\uDE44\uD83E\uDD72\n\n__তোমার চৌদ্দগুষ্টিকে সারপ্রাইজ দিব বিয়ে করে...\uD83D\uDC38\uD83D\uDD2A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- প্রচুর ঘুরতে হবে ভাই,এমন ঘোরা ঘুরতে হবে,যাতে বাড়ির ঠিকানা ভুলে যাওয়া যায়! \uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "❝রাগ❞ \"control \" করতে না পেরে কেঁদে ফেলি\n\nহ্যাঁ এইটায় আমি মেয়ে \uD83D\uDE06\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ক্রাশ হচ্ছে \uD83E\uDD70\nপাশের বাসার ওয়াইফাই এর মত \uD83D\uDE0A\nনেটওয়ার্ক পায় কিন্তু কানেক্টেড হয়না\uD83E\uDD29\uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "খাটো মেয়েদের ফ্রেন্ড রিকোয়েস্ট একসেপ্ট করবেন না…এদেরকে ঝুলিয়ে রেখে লম্বা হওয়ার সুযোগ করে দিন।\uD83E\uDD74\uD83D\uDE04");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- ছোট বেলায় বড়দের প্রেম দেখতাম,!\uD83D\uDE44\n\n- আর এখন বড় হয়ে ছোটদের প্রেম দেখি\uD83E\uDD27");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-: মহিলা কলেজের সামনে কিসের দোকান দিলে ভালো হয়। ☺️\n\n★ একটু পরামর্শ দিন!!\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- সার্টিফিকেট পুড়িয়ে চাকরি পাওয়া গেলে.!\n\n- কি পোড়ালে তোমাকে পাওয়া যাবে.?\uD83E\uDD7A\uD83D\uDE42");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সে মধু খেত না কারন মৌমাছি অইটা মুখে আনতো,, কারো মুখের জিনিস সে খাবে না\uD83D\uDE42অথচ ডিম তার প্রিয় খাদ্য\uD83C\uDF1A\uD83D\uDC38\uD83D\uDE04");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মিথ্যাটা শুনতে তখনি ভালো লাগে\n\nযখন সত্যটা আগে থেকেই জানা থাকে!\uD83D\uDE02");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফ্যামিলি থেকে পারমিশন পাইছি প্রেম করার জন্য\uD83D\uDE01\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-অনলাইনে মাঝে মাঝে  বেড়াতে আসি বলে কী\uD83D\uDE22\n\n-চা বিস্কুট ও দিবেন না \uD83D\uDE12☕\uD83E\uDDC7");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি ঘটক বলছি\uD83C\uDF02\nম্যেনসন দাও \uD83D\uDE0A\n\nকার বিয়ে দিতে হবে..?\uD83D\uDE38\uD83D\uDE01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- কোন কাজ নাই.!\uD83D\uDE42\n\n- প্রেম ও করি না তবুও সারাদিন অনলাইনে পরে থাকি.!\uD83E\uDD70\uD83D\uDE0E");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ প্রেম করি না বলে ক্লাস সিক্সের মেয়েও বলে আপনি ভালোবাসার কি বুঝেন\uD83E\uDD10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-/ তুমি ব্যতীত আমার কোনো একান্ত  ব্যাক্তি'গত চাহিদা নেই.!!\uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আম্মুকে বলেছিলাম \"বিরিয়ানি\"\uD83D\uDE42 \n\n- আম্মু শুনেছে  \"বিরি টানি। \uD83D\uDE44\n\n-তারপর শুরু হলো থাপড়ানি..\n\n-আলহামদুলিল্লাহ এখন আমি বাম কানে কম শুনি \uD83D\uDE2B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি শিক্ষামন্ত্রী হলে প্রতিটি স্কুল কলেজে মেয়েদের ইউনিফর্ম শাড়ি করে দিতাম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "- যদি শোনো ছেলেটা ধর্ষণ হয়েছে!\uD83E\uDD7A\n\n-পারবে? তখন তাকে বিয়ে করতে! \uD83D\uDE42\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অবশেষে বুঝলাম \uD83E\uDD1E\n\nজীবনে প্রেম নয় কারেন্ট থাকা খুব জরুরি \uD83D\uDE10\uD83D\uDE10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যেদিকে তাকাই জোড়া জোড়া এদের মাঝখানে আমি একজন কপাল পোড়া ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDE25কিডনি দিয়ে দিবো, \uD83D\uDE2A\uD83D\uDE2A\n\nতবুও কাউকে  মন দিবো না,\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\n\nদিলেও মনের  ফটোকপি দিবো\uD83D\uDE01\uD83D\uDE02");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDC53 এই নাও চশমা\uD83D\uDE3E\n\nচোখে লাগিয়ে ভালো করে দেখো\uD83D\uDE44\n\n_ আমি সিঙ্গেল\uD83D\uDE12");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "\uD83D\uDE42\uD835\uDC69\uD835\uDC86\uD835\uDC94\uD835\uDC95 \uD835\uDC87\uD835\uDC93\uD835\uDC8A\uD835\uDC86\uD835\uDC8F\uD835\uDC85  সে নয় যে\nনতুন কাওকে পেয়ে তোমাকে\nভুলে যাবে!\uD83D\uDE14\n\n\uD835\uDC69\uD835\uDC86\uD835\uDC94\uD835\uDC95 \uD835\uDC87\uD835\uDC93\uD835\uDC8A\uD835\uDC86\uD835\uDC8F\uD835\uDC85 সেই যে হাজারো\nমানুষের ভীরে তোমাকে\nখুজবে ☺️\n\nhappy best friend day \uD83E\uDD0D\uD83C\uDF38\n\nভালো থাকুক বন্ধুত্ব নামক সম্পর্কগুলো \uD83D\uDE0A");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "-নতুন বউ! প্রথম দিন... \uD83D\uDE0A\nবউ : আম্মা, দেন আমি রান্না করি। \nশাশুড়ি : না, মা! আমি রান্না করি।\uD83D\uDE42\nআর শোনও মা তুমি এখন থেকে আমাকে বা অন্য কাউকে ডাকার সময় \nশেষে 'জান' শব্দটা যুক্ত করবে!\nএই যেমন আম্মাজান আব্বাজান খালাজান খালুজান। \uD83D\uDE44\nদ্বিতীয় দিন,\nশাশুড়ি : বউমা মাচার নিচে খাঁচা থেকে মুরগি গুলো বের করো তো।\nবউ : আম্মাজান মাচাজান এর নিচে খাঁচাজান এর ভিতরে মুরগীজান নেই! \uD83E\uDD23\uD83E\uDD23");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যেই বয়সে বউ বিরক্ত করার কথা \uD83D\uDE1D\n\nসেই বয়সে কারেন্ট বিরক্ত করে যাচ্ছে \uD83D\uDE10\n\n~");
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