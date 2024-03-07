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

public class BirthdaySMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("শুভ জন্মদিন মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content

        hashMap = new HashMap<>();
        hashMap.put("text", "আশা করি,,, তোমার এই শুভ দিনটি কেকের মতো মিষ্টি হবে। এই বছরের তোমার সমস্ত ইচ্ছা যেন আল্লাহ পূরণ করে এবং তোমার সব স্বপ্ন সত্যি হোক। **হ্যাপি বার্থ ডে টু মাই ফ্রেন্ড**");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জন্মদিন পত্যেক মানুষের জীবনের বিশেষ দিনের মধ্যে ১টি। আজকের তোমার সেই বিশেষ দিন,,,, জন্মদিনের অসংখ্য শুভেচ্ছা রইলো আমার প্রিয় বন্ধুটির জন্য। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তর জন্যে ভালবাসা,,,,, লক্ষ গোলাপ জুঁই,,,,,,, হাজার লোকের ভিরে বন্ধু আমার,,,,, থাকবি হৃদয়ে তুই। ***শুভ জন্মদিন দোস্ত**");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজকের এই স্পেসাল দিন-এ হয়ে ওঠো আরও নবীন,,,,,,, ভালোবেসে জানাই তোমায় শুভ জন্মদিন ! ***শুভ জন্মদিন বান্ধবী***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সুখে কাটুক বন্ধু তোমার আজকের দিন,,,,,,,, জানাচ্ছি আজ বন্ধু তোমায় ------- শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শুভ জন্মদিন বন্ধু,,,,,,,,,, আশা করি আজকের এই দিবসটি তোমার জীবনে বয়ে নিয়ে আনুক আনন্দের বন্যা। ***শুভ জন্মদিন বন্ধু ****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজকে তোমার এই জন্মদিনে সবকিছু হউক নতুন করে,,,, সুখের স্মৃতিটুক থাক কাছে,,,, দু:খগুলো যাক দুরে। জড়া জীর্ণ অতীতটাকে রেখোনা আর মনে নব উদ্দমে কাজ করো নবীন এই দিনে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শুভ জন্মদিন বন্ধু। যেহেতু তুমি আমার সবচেয়ে ভালো একজন বন্ধু,,, তাই আমি দোয়া করি তোমার জীবনের সবকিছুই যেন অত্যন্ত ভালো হয় এবং সামনের জীবনে উপভোগ করতে পারো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমাকে জানায় তোমার জন্মদিনের অঢেল শুভেচ্ছা এবং একটি সুন্দর এবং সফল বছর পার করার শুভেচ্ছা। ধন্যবাদ এত ভালো একজন বন্ধু হওয়ার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার মতো এমন বন্ধু কোটি টাকা দিয়েও কেনা সম্ভব নয়,,,,, তাই আশা করছি তোমার জন্মদিনের খুশি এবং মুহূর্তগুলোও তোমার কাছে অমূল্য হবে। *** জন্মদিনের শুভেচ্ছা বন্ধু ***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার বন্ধুত্বে আমি মুগ্ধ,,,,,,,, আশা করি, যেমন আছো ঠিক তেমনি থাকবে সারাজীবন আমার বন্ধু হয়েই,,,,, শুভ জন্মদিনের শুভেচ্ছা বন্ধু।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের দেহ যেমন আত্মা ছাড়া অর্থহীন,,,,, ঠিক তেমনি আমার জীবনে তোমার বন্ধুত্ব ছাড়া নিথর, অপরিপূর্ণ। আমার জীবনে পরিপূর্ণ করার জন্য অসংখ্য ধন্যবাদ দিয়ে তোমায় জানাই শুভ জন্মদিনের অঢেল শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বন্ধু কখনও অবহেলা নয়,,,,, বন্ধুকে হ্রদয় মাঝে গেথে রাখতে হয়। বন্ধু হলো সুখ - দুঃখের সাথী, এমন বন্ধু রেখো না,,,,,,,,,,,,যে তোমার করে ক্ষতি।।। *** শুভ জন্মদিন প্রিয় বান্ধবী আমার***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ আমার সবথেকে ভালো বন্ধুটির জন্মদিন,,,,, আর এই বিশেষ দিনে তোমায় জানাই আমার হৃদয়ের অন্তস্থল থেকে অনেক অনেক শুভেছা এবং আশা করছি আরও এমন শত শত জম্মদিন কাটাতে পারবো তোমার সাথে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মুছে যাক সব দুঃখ.,,,,, ধুয়ে যাক কষ্ট আজকের এই জন্মদিনে হয়ে যাক তোমার সব খারাপ নষ্ট। ***জন্মদিনের শুভেচ্ছা****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপু - তুমি আমার নিকট অনেক দামী,,,,, তোমার মত একটা বোন পেয়ে আমি নিজেকে অনেক ভাগ্যবান বলে মনে করি,,,,,,,,,,,, ****শুভ জন্মদিন আপুমনি****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি জীবনে সবসময় একজন মানুষকে আমার পাশে পেয়েছি। সে হলো আমার বড় ভাই। তোমার মতো ভাইকে পেয়ে গর্বিত,,,,,. তোমাকে সবথেকে বেশি ভালোবাসি,,,,,, ****শুভ জন্মদিন বড় ভাই****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সুন্দর এই পৃথিবীতে সুন্দরতম জীবন হোক তোমার,,,,, পূরণ হোক প্রতিটি স্বপ্নপ্রতিটি আশা,,,, বেঁচে থাকো হাজার বছর ধরে। ****শুভ জন্মদিন ভাই****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি আমার সবচেয়ে কাছের মানুষ,,,,,,,  আমার বেস্ট ফ্রেন্ড,,,,,। যদিও আমার জিনিস তোমার সাথে ভাগ করতে অপছন্দ করি,,,। তবুও তোমার সাথে কাটানো প্রতিটা মুহুর্ত আমি উপভোগ করি,,,,,, তুমি আমার সবচেয়ে স্পেশাল মানুষ। **শুভ জন্মদিন ভাই**");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শুভ জন্মদিন দাদা ভাই। আলোকিত হোক  তোমার ভবিষ্যৎ। প্রতিটা দিন কাটুক সুন্দর ভাবে। সুখ দিয়ে পরিপূর্ণ হোক জীবন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনার মতো বড় ভাই পাওয়া সত্যি খুব ভাগ্যের ব্যাপার।  আপনাকে আমি ভাই হিসাবে পেয়ে আমি নিজেকে ভাগ্যবান বলে মনে করি।  ***জন্মদিনের শুভেচ্ছা ভাই***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভাইয়া এখন তোমার বয়স 22 বছর।  এখন আইনত কাজটা সেরে আমাদের জন্য সুন্দর একটা ভাবি এনে দাও।  ***শুভ জন্মদিন বড় ভাই***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জানি তোকে অনেক জালিয়েছি,,,,,,,,।  তোর আনেক সময় নষ্ট করেছি,,,,,। জানি তোর সাথে আনেক ঝগড়া করেছি,,,,,। কিন্তু  আমি তোকে সবচেয়ে ভালোবাসি আপু........।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি হয়তো পৃথিবীর সবচেয়ে ভালো মেয়েটি ছিলে,,,,,,,, তবে আমি ভাগ্যবান যে আমি তুমার মতো মিষ্টি দুষ্ট একটা মেয়েকে ভোন হিসাবে পেয়েছি,,,,,,  জন্মদিনের শুভেচ্ছা বোন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সুন্দর এই দুনিয়াতে সুন্দরতম জীবন হোক তোমার,,,,,,,পূরণ হোক প্রত্যেকটি স্বপ্ন, প্রত্যেকটি আশা,,,,,,বেঁচে থাকো হাজার বছর ধরে। ***শুভ জন্মদিন প্রিয়তমা***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মহান আল্লাহর আশীর্বাদে তোমার প্রত্যেকটি দিন কাটুক নতুন নতুন সুখের চোয়ায়,,,,,,। আর তোমার চারিপাশে ছড়িয়ে থাকুক,,, খুশির নানান আভাস। ****জন্মদিনের শুভেচ্ছা পিয়তমা****");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ বাতাসে* সুবাসিত স্নিগ্ধতা,,,,, পাখিরা সারি সারি গাইছে গান,,,,,, প্রকৃতি নতুন করে হয়েছে রঙিন,,,,, ফুলেরা সব ফুটেছে বাগানে,,,,, আজ আমার সবচেয়ে প্রিয় মানুষের জন্মদিন ---- !!!!শুভ জন্মদিন !!!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুলের হাসিতে হ্রদয়ের খুশিতে,,,,,,,, সোনালী রোদ্দুরে সবুজের বুকেতে,,,,,, লাগছে আজ অনেক রঙিন ওলিরা গানে গানে ফুলের কানে কানে,,,,,, বলছে আজ সেই শুভ দিন....***শুভ জন্মদিন***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোর জন্যে ভালোবাসা,.,,,, লক্ষ গোলাপ জুঁই,...,,,, হাজার লোকের ভিরে আমার, থাকবি হৃদয়ে তুই। ***শুভ জন্মদিন প্রিয়তমা***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সুন্দর এই ভুবনে, সুন্দরতম হোক তোমার জীবন,,,,, পূরণ হোক প্রতিটি স্বপ্ন,,,,,, প্রতিটি আশা,,,,, বেঁচে থাকো হাজার বছর !!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার হাসি আমার জীবনে সবচাইতে বড় আনন্দ। আজকে এই দিনটা তোমার। তাই আজকের দিনটা আনন্দের সঙ্গে উপভোগ কর। ***শুভ জন্মদিন জান***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জন্মদিন* মানুষের জীবনের একটি বিশেষ দিন। আজকের তোমার সেই বিশেষ দিন,,,,,, জন্মদিনের অসংখ্য শুভেচ্ছা রইলো তোমার জন্য। *** শুভ জন্মদিনে সোনা***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজকের এই দিনটি আমার কাছে সবসময় ব্রাইট এবং সুন্দর কারণ, আমার জীবনের ভালোবাসা এই দিনে জন্মগ্রহণ করেছে। *** জন্মদিনের অঢেল শুভেচ্ছা***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সব মানুষেই তো ফুল দিয়ে উইশ করে। আমি না হয় হৃদয় দিয়ে করবো। কেউ মুখে বলবে আবার কেউ গিফট দিবে। আমি না হয় স্ট্যাটাস দিয়ে বললাম। *** Shovo jonmodin ***");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কিছু কথা অব্যক্ত রয়ে যায়, কিছু অনুভূতি মনের মাঝে থেকে যায়, কিছু ভালবাসার স্মৃতি নিরবে কাদে। শুধু এই দিন সব ভুলিয়ে দেয়। শুভ জন্মদিন!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসুক ফিরে এমন দিন হোক না তোমার সব রঙিন জনম জনমের তরে, তোমার এই শুভ জন্মদিনে বারে বারে পড়ছে মনে যতই থাকি না দুরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই এসএমএস টায় ফ্যাট , কোলেস্টেরল, নেশার দ্রব্য কিছুই নেই ..আছে শুধু অনেকটা মিষ্টি , এই মেসেজটার পাঠকের মতই মিষ্টি ..জন্মদিনের মিষ্টি শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই দিনটা আসে যেন বারবার বারবার ফিরে, যেন অনেক স্বপ্ন দেখতে পারি তোমায় আমি ঘিরে. হ্যাপি বার্থডে !!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন সকাল , নতুন দিন নতুন করে শুরু, যা হয় না যেন শেষ. জন্মদিনের অনেক শুভেচ্ছার সাথে পাঠালাম তোমায় এই এস এম এস ! শুভ জন্মদিন !!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জন্মদিনের উষ্ণ অভিনন্দন জানাই আমার জানা সুন্দর মানুষটিকে, তোমার একটা হাসিতে আলোকিতো হয় চারিদিকে, অনেক ভালোবাসা রইলো তোমার জন্য!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সাগরের ঢেউ ফুলের সুগন্ধ, রাতের তারারা সবাই জড়ো হয়েছে তোকে একসাথে বলতেছে, শুভ জন্মদিন~");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "অভিমানের মেঘ ভাসিয়ে দাও অনেক দুরে, মন খারাপের দিনটা তোমার না আসুক ফিরে, দুঃখগুলো দাও উড়িয়ে ওই আকাশের নীড়ে, অসীম সুখ বয়ে আসুক তোমার জীবন জুড়ে ~শুভ জন্মদিন~");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ তোমার জন্মদিন, জীবন হোক তোমার রঙিন, সুখ যেন না হয় বিলীন, দুঃখ যেন না আসে কোনো দিন। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই বারেতে একটু খানি, কাটিয়ে ঘুমের রেশ , চোখটি মেলে চেয়ে দেখো, আরো একটি বছর শেষ। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শুভ শুভ শুভ দিন, আজ তোমার জন্মদিন। মুখে তোমার দীপ্ত হাসি, ফুল ফুটেছে রাশি রাশি। হাজার ফুলের মাঝে গোলাপ যেমন হাসে, তেমনি করে বন্ধু তোমার, জীবন যেন সুখের সাগরে ভাসে। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্বপ্ন গুলো সত্যি হোক, সকল আশা পূরণ হোক। দু:খ গুলো দূরে যাক, সুখে জীবনটা ভরে যাক। জীবনটা হোক ধন্য, শুভ কামনা তোমাদের জন্য। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত যায় দিন আসে, মাস যায় বছর আসে, সবাই আশায় থাকে একটি সুদিনের, আমি আশায় থাকি তোমার জন্মদিনের। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাত পেরিয়ে আরেকটা দিন তাই তোমার জন্মদিন। প্রকৃতি সেজেছে নতুন সাজে, ফুল ফুটেছে রাশি আসি গাছে গাছে, দোয়েল ময়না টিয়া ডাকছে আপন শুরে, জন্মদিনের শুভেচ্ছা জানাবে বলে। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুলের হাসিতে প্রাণের খুশিতে সোনালী রোদ্দুরে সবুজের বুকেতে লাগছে আজ অনেক রঙিন অলিরা গানে গানে ফুলের কানে কানে বলছে আজ সেই শুভ দিন। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার জন্য প্রার্থনা করি ১২ মাস আনন্দ, ৫২ সপ্তাহ খুশি, ৩৬৫ দিন সাফল্য, ৮৭৬০ ঘণ্টা সুস্বাস্থ্য এবং ৫২৬০০ মিনিট সৌভাগ্য। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ করুন প্রতিটি বছর তোমার জীবনে খুশি নিয়ে আসুক, জীবনের প্রতিটি মুহূর্ত নতুন আনন্দের উপহার নিয়ে আসুক, পরীক্ষা যেন আসুক তোমার জীবনে, প্রতিটি পরীক্ষা শুধুই সাফল্য নিয়ে আসুক! শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কামনা বাসনা স্বপ্ন সাধনা তুমি প্রদীপের আলো তোমার হাসিতে তোমার খুশিতে ভুবন লাগে ভালো পৃথিবী যত দিন থাকবে ততোদিন থাকুক তোমার ঐ হাসি অনেক বড় হও দেখুক তোমাকে এই বিশ্ববাসী। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ইচ্ছে গুলো পূর্ণ্য হোক সুখের দোলায় দুলে খুশি যত সঙ্গী হোক সর্বদা হেসো প্রাণ খুলে পৃথিবীর শত ভুল আর বেদনা থাকুক আমার শুভ হোক আনন্দের হোক জন্মদিন তোমার। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জন্মদিনের শুভেচ্ছা, পৃথিবীর ভালোবাসা, পৌঁছবে তোমার কাছে, আমার এই আশা, এই কবিতা পরে তুমি হাসবে হয়তো, কে বা জানে উদ্দেশ্য সফল হবে, যদি এই মেসেজ একটু হাসি তোমার মুখে আনে। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মুছে দিও পুরোনো বেদনা, খুলে দিও মনেরই জানালা, ভুলে যাও বেথার দিনগুলি, মুছে ফেলো চোখের পানি, ঝরে যাক দুঃখ দুর্দশা, মনে জাগাও সব নতুন নতুন আশা। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মিষ্টি আলোর ঝিকিমিকি সবুজ গাছে গাছে, স্নিগ্ধ হাওয়ায় দুলিয়ে মাথা ফুলের কলি হাসে, পাখির গান পরিবেশের মায়াবী এক দয়া, পেয়েছে ওরা তোমার সবুজ জন্মদিনের ছোয়া। শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "স্বাশত এই জন্মদিন তোমার স্বগত হোক বার বার ধরণীর ম্লান অভ্র কুঞ্জে রূপ রঙে করুক আবার ধুয়ে যাক সব কষ্ট দুঃখ গ্লানি তোমার হাসির ছোয়া লেগে সুরভিত হোক সকল প্রাণী শুভ জন্মদিন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হাসি ভরা মুখ হৃদয়ে থাকা সুখ ভেসে যাক তোমার সাথে.. পায়ে পায়ে রোজ হোক সবুজ.. ভবিষ্যত তোমার হাতে.. ভালো যত আছে সব.. ঘিরে থাক তোমায়.. এমন শুভক্ষণে তোমাকে জন্মদিনের শুভচ্ছা জানাই শুভ জন্মদিন");
        arrayList.add(hashMap);






        BirthdayAdapter birthdayAdapter = new BirthdayAdapter();
        listView.setAdapter(birthdayAdapter);

    }

    private class BirthdayAdapter extends BaseAdapter {

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
            View birthdayView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = birthdayView.findViewById(R.id.tvDisplay);
            TextView tvCopy = birthdayView.findViewById(R.id.tvCopy);
            TextView tvShare = birthdayView.findViewById(R.id.tvShare);


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


            return birthdayView;
        }
    }

}