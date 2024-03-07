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

public class NewYearSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap <String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_year_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("নববর্ষ মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "বাউল গানের স্যন্ধা তালে নতুন বছর এসেছে ঘুরে.., উদাসী হাওয়ার সুরে সুরে রাঙ্গা মাটির পথটি জুড়ে । ....শুভ নববর্ষ....");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চৈত্রের রাত্রি শেষে, সূর্য আসে নতুন বেসে, সেই সূর্যের রঙ্গিন আলো, মুছে দিক তোমার জীবনের সকল কালো…! শুভ__নববর্ষ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "পানতা ইলিশ আর ভরতা বাজি বাঙ্গালীর প্রাণ…নতুন বছর সবাই গাইবো বৈশাখের গান.. .এসো হে বৈশাখ এসো এসো… শুভ নভবর্ষ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোরাই আমার বন্ধু যে, তোরাই আমার ডিয়ার, তাইতো আমি ভালোবেসে বলছি শুভ নববর্ষ !.Good bye বলে শেষ করছি পুরোনো বছরের আশা, নতুন বছরের,নতুন সাজে জানাচ্ছি ভালোবাসা !");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বসন্তের আগমনে কোকিলের সুর ! গ্রিস্মের আগমনে রোদেলা দুপুর ! বর্ষার আগমনে সাদা কাঁশফুল ! তাই তোমায় Wish করতে মন হল বেকুল ! শুভ নববর্ষ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বার মাসে তের পার্বণ এবার এলো বলে,বাঙ্গালির একটি বছর বয়ে গেলো চলে!!! নতুন বছর আসুক শুধু আনন্দের স্মপর্শ,, আমার তরফ থেকে আমার সকল বন্ধুদের জানাই **শুভ নববর্ষ**");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন পোশাক নতুন সাঁজ।নতুন বছর শুরু আজ। মিষ্টি মনমিষ্টি হাঁসি।শুভেচ্ছা জানাইরাশি রাশি॥ শুভ নববর্ষ !!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "কাটবে রাত, আসবে প্রভাত। যাক পুরাতন, যাক মুছে যাক সব দুঃখ। নতুন বছর, নতুন আশা, সঙ্গে থাকুক ভালবাসা। শুভ নববর্ষ ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হাসি-দুঃখ-গ্লানি। ছিল, আছে, থাকবে। নতুন বছরের শুভদিন। আসবে কাছে ডাকবে। ঐসব গ্লানি ভুলে গিয়ে, নাও মনে ঐ ডাক। জানাই হে প্রিয় সকলকে। শুভ পহেলা বৈশাখ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আম পাতা জোড়া জোড়া, নতুন সব দিচ্ছে সাড়া। ভাল থেকো, সুখে থেকো। আর আমার কথাটি মনে রেখো। শুভ নববর্ষ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন বছরের আগমনে যাক ক্লান্তি দূর হয়ে। জীবন হোক সুন্দর, অতীত যাও ভুলে। নতুন বছর সাজাও তুমি নিজের মতো করে। শুভ নববর্ষ ১৪২৯।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নিশি যখন ভোর হবে। সুখ তারা নিভে যাবে। আসবে একটা নতুন দিন। দুঃখ হতাশা যাও ভুলে। হাসি আনন্দ নিও তুলে। বছরটা হোক অমলিন। বাংলা নতুন বছরের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বিদায় নিল আজ পুরনো বছরের সূর্য। আসবে নতুন সকাল, নতুন দিন, নতুন স্বপ্ন, নতুন আশা। আর নতুন হোক আজকের ভালবাসা। শুভ নববর্ষ ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আগের সব কষ্ট, করে ফেল নষ্ট। নতুন দিনে সবার প্রাণে, কেউ রেখনা দুঃখ মনে। শুভ হোক নতুন দিন, খুশি থেকো সারা দিন। শুভ নববর্ষ ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন সূর্যটা হাসে, তোমায় ভালবাসে। তাই তোমাকে জানাই নতুন বছরের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঝরে গেল আজ বসন্তের পাতা। নিয়ে যাক সঙ্গে সব মলিনতা। বৈশাখের সকালে লাগুক প্রাণে আনন্দের এই স্পর্শ, মন থেকে আজ জানাই তোমায়, “শুভ নববর্ষ”");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রাঙা আবির মেখে চোখে চোখে মনের কথা বলছে, নতুন সাজে সবার ঘরে বৈশাখ এসেছে। রং মেখে ললনা, হেলে দুলে চলনা। এমন দিনে কেউ করোনা ছলনা। শুভ পহেলা বৈশাখ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঢাক ঢোল মাদলের তালে। রঙ বেরঙের মনের দেয়ালে। বাঙালি সংস্কৃতি উজ্জীবিত থাক যুগে যুগে। শুভ নববর্ষ ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নববর্ষের নবরুপ রাঙিয়ে দিক প্রতিটি মুহূর্ত। সুন্দর, সমৃদ্ধ হোক তোমার আগামীর দিনগুলো। শুভ নববর্ষ!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ আপনাকে সবকিছুতে আশীর্বাদ করুন। তাকে হালাল উপায়ে জীবন যাপনের দান করুক। শুভ নব বর্ষ.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ আপনাকে ভালো ও মন্দের পার্থক্য বোঝার শক্তি দিন। আল্লাহ আপনাকে আপনার সব কাজে সফল করুন। শুভ আরবি নববর্ষ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ আপনার ভবিষ্যত সহজ করে দিন। সর্বস্তরে সাফল্যের ব্যবস্থা করুন। আপনার আগামী দিন ভালো কাটুক। শুভ আরবি নববর্ষ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনার জীবন সুন্দর এবং অবর্ণনীয় আনন্দে পূর্ণ হোক। এই বিশেষ দিনে আমি এই প্রার্থনা করি। আমি আপনাকে এবং আপনার পরিবারের সুস্বাস্থ্য এবং শুভ আরবি নববর্ষ কামনা করছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আপনার দুঃখ এবং হতাশা দূর করা হোক এবং নতুন জীবন হাসি এবং আনন্দে পূর্ণ হোক। সবাইকে সাথে থাকার উপহার দান করুন। ঈশ্বর তোমার মঙ্গল করুক. শুভ নব বর্ষ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "হিজরি নববর্ষের সুন্দর দিনে আল্লাহ আপনাকে তার সর্বোত্তম বরকত দান করুন। আপনাকে এবং সবাইকে ইসলামিক নববর্ষের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "শান্তি আমাদের চারপাশের সমস্ত খালি জায়গা পূর্ণ করুক, সুখ এই বছর আমাদের সমস্ত ইচ্ছার উত্তর দিক। ইসলামিক হিজরী নববর্ষের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাইকে ইসলামিক নববর্ষের শুভেচ্ছা। ইসলামি হিজরি নববর্ষের বিশেষ দিনে ইসলামের আলোয় সবার জীবন ভরে উঠুক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাইকে ইসলামিক নববর্ষের শুভেচ্ছা, আন্তরিকভাবে প্রার্থনা করি আমরা যেন কখনো মন্দের খপ্পরে না পড়ি এবং পাপের প্রলোভনে না পড়ি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাইকে ইসলামিক নববর্ষের শুভেচ্ছা। এই নতুন বছর পৃথিবীতে বয়ে আনুক অনাবিল শান্তি, সমৃদ্ধি ও সুখ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি ইসলামিক নববর্ষের শুভ উপলক্ষ্যে আপনার সাফল্য এবং সমৃদ্ধির জন্য প্রার্থনা করি, আপনার সমস্ত স্বপ্ন পূরণ হোক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই ছুটির চেতনা এবং এই আবহাওয়া আপনার হৃদয়কে ভালবাসা, শান্তি এবং শান্ত দিয়ে পূর্ণ করুক। এই ইসলামিক নববর্ষে আপনাকে অনেক অনেক শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মহান আল্লাহ তায়ালা মুসলিম উম্মাহ এবং সমস্ত ইসলামী দেশের উপর তাঁর রহমত বর্ষণ করুন। হিজরী নববর্ষের শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাইকে হিজরী নববর্ষের শুভেচ্ছা এবং এই নববর্ষের নতুন আলোয় আলোকিত হয়ে সবার জীবন সাফল্যে ভরে উঠুক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সবাইকে নতুন বছর এর শুভেচ্ছা! আল্লাহ কষ্টগুলো সহজ করুন এবং উম্মাহকে অনেক হিদায়াত দান করুন, আমীন!!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন বছর শুরু হয়, আসুন আমরা প্রার্থনা করি, এটি একটি নতুন শান্তি, নতুন সুখ এবং সকলের প্রাচুর্যের সাথে একটি বছর হোক। আল্লাহ আপনাকে নতুন বছর জুড়ে আশীর্বাদ করুন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মহররমের শুভ দিনে, আল্লাহ আপনাকে স্বাস্থ্য, সম্পদ, শান্তি এবং সুখ দিয়ে আশীর্বাদ করুন! ইসলামিক নববর্ষের শুভেচ্ছা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সমস্ত প্রশংসা ও কৃতজ্ঞতা আল্লাহর জন্য যাঁর মালিকানাধীন আসমান ও যমীনে যা কিছু আছে। বরকতময় মহরম হোক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এখানে আশা করা যায় যে নববর্ষের দিনটি তার সাথে একটি নতুন আশার রশ্মি নিয়ে আসে। চারিদিকে শান্তি ও মঙ্গল থাকুক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মহররমের শুভ দিনে, আল্লাহ আপনাকে স্বাস্থ্য, সম্পদ, শান্তি এবং সুখের সাথে আশীর্বাদ করুন!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সর্বশক্তিমান আল্লাহর শান্তি এবং আশীর্বাদ এই বছর এবং সর্বদা আপনার সাথে থাকুক! শুভ নব বর্ষ.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আল্লাহ আপনাকে ভালবাসা, সাহসিকতা, প্রজ্ঞা, তৃপ্তি, স্বাস্থ্য, ধৈর্য এবং পরিচ্ছন্নতার দান করুন। শুভ নব বর্ষ!");
        arrayList.add(hashMap);




        NewYearAdapter newYearAdapter = new NewYearAdapter();
        listView.setAdapter(newYearAdapter);

    }

    private class NewYearAdapter extends BaseAdapter {

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
            View newYearView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = newYearView.findViewById(R.id.tvDisplay);
            TextView tvCopy = newYearView.findViewById(R.id.tvCopy);
            TextView tvShare = newYearView.findViewById(R.id.tvShare);


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


            return newYearView;
        }
    }

}