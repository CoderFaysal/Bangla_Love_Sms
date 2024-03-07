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

public class MorningSMS extends AppCompatActivity {


    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morning_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("শুভ সকাল মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.listView);


        // New Content

        hashMap = new HashMap<>();
        hashMap.put("text", "পরম করুণাময় আল্লাহর নামে শুরু হোক আরো একটি সুন্দর দিন, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আলহামদুলিল্লাহ, আল্লাহ আমাদের আরেকটি নতুন সকাল দেখালেন। সবাইকে শুভ সকাল। আল্লাহর নামে সবার দিন ভালো কাটুক। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আজ না বলে কোনো কাজ ফেলে রাখবে না কখনো ...আজকের সময়টা তুমি আর কাল কে  ফেরত পাবে না.. সুপ্রভাত.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার পরান যাহা চায় তুমি তাই, তুমি তাই গো। তোমা ছাড়া আর এ জগতে মোর কেহ নাই কিছু নাই গো॥ ..সুপ্রভাত..");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আলো সূর্যের হোক কিংবা আশার, দুটোই জীবনের অন্ধকার মুছে ফেলে, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভোরের শিশির তুমি জোছনার আলো, আমি চাই তুমি থাকো সব সময় ভালো, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সূর্য মামা উকি দিলো। পাখিরা সব উড়াল দিলো, আমার ঘুমটি ভেংগে গেলো, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভোরের প্রথম সোনালি আলো, স্বপ্নগুলো জাগিয়ে গেলো। সবাইকে জানাই সুপ্রভাত। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গান শোনালো সকাল পাখি, এখনো সবাই ঘুমাচ্ছো নাকি! শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শিশির ভেজা সবুজ ঘাসে, শিশির কণা রয়েছে হেঁসে, বিদায় নিচ্ছে কালো রাত, সকলকে জানাই সুপ্রভাত");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গাছে গাছে ডাকছে পাখি, সূর্য মামা দিচ্ছে উঁকি, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", " নতুন দিন শুরু হলো, জেগে ওঠো তাড়াতাড়ি, SMS গেছে তোমার বাড়ি, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার যেমন ঘুম ভেংগেই তোমার কথা মনে পরে, তোমারও কি এমন হয়? শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ’র করুণায় আরেকটি সকাল পেলাম। আল্লাহ’র শোকর গুজার করে শুরু করে দিনটি, শুভ সকাল। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হালকা হাল্কা বইছে বাতাস, তোমার কথা পরছে মনে, জানাচ্ছি তাই শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হাতে রেখে হাত দেখে ঘড়ি, বসে অপেক্ষা করি, কবে হবে কাল ফুটবে সকাল। এখন সেই সকাল হয়ে এলো। সুপ্রভাত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গোলাপ ফুলের মত ফুটে ওঠো প্রতি সকালে, শুধু আমার ভুবনে রাঙাতে। আমার সুখের কারন হবার জন্য অনেক অনেক ধন্যবাদ, প্রিয়। শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দিনের শুরুটা হোক সুন্দর কিছু দিয়ে, সবাইকে নতুন ভোরের আলোয় নতুন আশা নিয়ে জাগ্রত হবার জন্য ডাকছি। সুপ্রভাত সবাইকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিপদ আপদ মুক্ত একটি দিনের কামনায় সবাইকে জানাই শুভ সকাল। ভালো কাটুক সবার আজকের দিনটি। সুপ্রভাত সবাইকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাঁদের আলো ফুরিয়ে এলো, সূর্য মামা হেঁসে উঠলো, সবাইকে জানাই সকালের শুভেচ্ছা। সুপ্রভাত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঘুম ঘুম রাতের শেষে সূর্য আবার উঠলো হেঁসে, ফুটলো আবার ভোরের আলো শুরু হোক নতুন দিনটি ভালো। সবাইকে জানাই গুড মর্নিং।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মানুষের জীবনে প্রধানত দুই ধরনের আলোর সন্ধান মিলে। একটি হল সূর্যের আলো এবং অন্যটি হলো আশার আলো। তবে আমাদের জীবনে যে কোনো আলো আসুক না কেন। এর মাধ্যমে কিন্তু আমরা আমাদের জীবনে অন্ধকার কে দূরে রাখতে পারবো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "জানো সূর্যটা কে আমার খুব হিংসে হয়। কারণ এই সূর্যটা প্রতিদিন সকালে সবার আগে তোমার মুখটা দেখে। আর সে কারণেই এই সূর্যটা কে আমার প্রচুর পরিমাণে হিংসে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার কাছে এই পৃথিবীর সবচেয়ে ভালো মুহূর্ত হলো, তোমার পাশে শুয়ে থেকে সকালে ঘুম থেকে জেগে ওঠা। যদি আমি একবার এই সুযোগ টি পাই, তাহলে কখনোই আমি সেই সকাল কে বরণ করতে ভুলবো না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "একদিন তুমি আর আমি একসাথে সকালে ঘুম থেকে জেগে উঠবো। আর এই আশা ব্যক্ত করে তোমাকে জানাচ্ছি শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার এই ভালোবাসা তোমাকে এসএমএস এর মাধ্যমে জানিয়ে দিলাম। তুমি ঘুম থেকে জেগে উঠো। এবং আমার এই ভালোবাসা কে গ্রহণ করো। যদি পারো তাহলে একটুকু ভালোবাসার রেখে দিও আমার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ওগো প্রিয়তমা, তুমি আমার জীবনের সবচেয়ে দীপ্তমান আলো। আর আমি আমার জীবনের প্রতিটি সকাল তোমার মত করেই আলোকিত করতে চাই। আমি প্রতি সকালে তোমার মুখটা দেখে আমার দিনের শুরুটা করতে চাই। তাই তোমার প্রতি রইল শুভ সকাল এর শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তুমি গোলাপ ফুলের মত প্রতি সকালে ফুটে ওঠো। তুমি সুবাস ছড়িয়ে দাও আমার ভুবনে। আর আমি তোমার অপেক্ষায় আছি বলে, তোমাকে জানিয়ে দিলাম শুভ সকালের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "যদি কখনো কোন সময় এই পৃথিবীর সকল অক্সিজেন ফুরিয়ে যায়। তাহলেও আমি বেঁচে থাকব। কারণ তুমি হলে আমার বেঁচে থাকার একমাত্র সম্বল। তুমি হলে আমার জীবনের অক্সিজেন এবং তুমি হলে আমার জীবনের বেঁচে থাকার সর্বশেষ আলোর প্রদীপ। আর সে কারণে আমি এই পৃথিবীর অক্সিজেন ছাড়াও তোমার দেয়া অক্সিজেনের মাধ্যমে বেঁচে থাকবো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হয়তোবা তুমি ঘুমিয়ে আছো, কিন্তু তোমার চারপাশে সূর্যের আলোয় আলোকিত হয়ে গেছে। আর এই মুহূর্তে আমি তোমার ঘুমন্ত ওই দু চোখে দুটো চুমু দিতে চাই। আর তোমার চুল গুলো নিয়ে বিলি কাটতে চাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার জীবনে আসা প্রতিটা সকাল কে আমি ভালোবাসায় পরিপূর্ণ করতে চাই। তোমার জীবনে যত গুলো সকাল আসবে, সেই সকাল গুলো তে আমি তোমাকে অনেক আদর যতনে ভরিয়ে দিতে চাই। আর এমনটা আমি ততদিন করতে চাই, যতদিন আমরা দুজন এই পৃথিবীতে বেঁচে থাকব।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "প্রবাদে আছে তুমি যদি সকালের শুরুটা কোন ভালো মানুষের কথা ভেবে শুরু করো। তাহলে তোমার দিনটা অনেক ভালো যাবে। আর সে কারণেই আমি তোমার কথা ভেবেই আজকের এই দিনটা শুরু করলাম। এবং তোমাকে জানিয়ে দিলাম শুভ সকাল এর শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোমার আজকের এই দিনটি ঝামেলা বিহীন সুন্দর একটি দিন কাটুক। সেই প্রত্যাশা নিয়ে আমি তোমাকে জানাই শুভ সকাল। অনেক অনেক সুখে এবং আনন্দে কাটুক তোমার আজকের এই দিনটি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাতের বুকে মাথা রেখে চাঁদ ঘুমায় তার নিজের মনের সুখে। তুমি বন্ধু জেগে ওঠো, খুব সকালে হয়েছে দেখো হাসিমুখে। আর সেজন্য তোমাকে এসএমএস করে জানিয়ে দিলাম, শুভ সকালের শুভেচ্ছা।।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঘুমের সেই রাতের সমাপ্তি হয়েছে, পূর্ব আকাশে দেখো সূর্য উদিত হয়েছে। তুমিও আর ঘুমন্ত অবস্থায় থেকো না। বরং ঘুম থেকে জেগে ওঠো, উপভোগ করো তোমার জীবনে আশা নতুন একটি দিন কে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমার যেমন ঘুম ভেংগেই তোমার কথা মনে পরে, তোমারও কি এমন হয়? শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হালকা হাল্কা বইছে বাতাস, তোমার কথা পরছে মনে, জানাচ্ছি তাই শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হাতে রেখে হাত দেখে ঘড়ি, বসে অপেক্ষা করি, কবে হবে কাল ফুটবে সকাল। এখন সেই সকাল হয়ে এলো। সুপ্রভাত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গোলাপ ফুলের মত ফুটে ওঠো প্রতি সকালে, শুধু আমার ভুবনে রাঙাতে। আমার সুখের কারন হবার জন্য অনেক অনেক ধন্যবাদ, প্রিয়। শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভোরের শিশির তুমি জোছনার আলো, আমি চাই তুমি থাকো সব সময় ভালো, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সূর্য মামা উকি দিলো। পাখিরা সব উড়াল দিলো, আমার ঘুমটি ভেংগে গেলো, শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভোরের প্রথম সোনালি আলো, স্বপ্নগুলো জাগিয়ে গেলো। সবাইকে জানাই সুপ্রভাত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "গান শোনালো সকাল পাখি, এখনো সবাই ঘুমাচ্ছো নাকি! শুভ সকাল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শিশির ভেজা সবুজ ঘাসে, শিশির কণা রয়েছে হেঁসে,");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিদায় নিচ্ছে কালো রাত, সকলকে জানাই সুপ্রভাত");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "দিনের শুরুটা হোক সুন্দর কিছু দিয়ে, সবাইকে নতুন ভোরের আলোয় নতুন আশা নিয়ে জাগ্রত হবার জন্য ডাকছি। সুপ্রভাত সবাইকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিপদ আপদ মুক্ত একটি দিনের কামনায় সবাইকে জানাই শুভ সকাল। ভালো কাটুক সবার আজকের দিনটি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চাঁদের আলো ফুরিয়ে এলো, সূর্য মামা হেঁসে উঠলো, সবাইকে জানাই সকালের শুভেচ্ছা। সুপ্রভাত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঘুম ঘুম রাতের শেষে সূর্য আবার উঠলো হেঁসে, ফুটলো আবার ভোরের আলো শুরু হোক নতুন দিনটি ভালো। সবাইকে জানাই গুড মর্নিং।");
        arrayList.add(hashMap);




        MorningAdapter morningAdapter = new MorningAdapter();
        listView.setAdapter(morningAdapter);




    }

    private class MorningAdapter extends BaseAdapter {

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
            View morningView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = morningView.findViewById(R.id.tvDisplay);
            TextView tvCopy = morningView.findViewById(R.id.tvCopy);
            TextView tvShare = morningView.findViewById(R.id.tvShare);


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



            return morningView;
        }
    }



}