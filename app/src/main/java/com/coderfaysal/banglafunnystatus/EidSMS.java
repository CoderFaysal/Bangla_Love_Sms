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

public class EidSMS extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eid_sms);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ঈদ মেসেজ");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        listView = findViewById(R.id.listView);


        // New Content
        hashMap = new HashMap<>();
        hashMap.put("text", "ইলিশ মাছের ৩০ কাটা বোয়াল মাছের দাড়ি, ঈদের দিনে বন্ধু তুমি এস আমার বাড়ি। ঈদ মুবারক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "মেঘলা আকাশ মেঘলা দিন, ঈদের বাকি কয়েকদিন, ঝড় বৃষ্টি রোদের দিন, আসবে কিন্তু ঈদের দিন, নদীর ধারে সাদা বক……তোমাকে জানাই অগ্রিম “ঈদ মোবারক”");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আমি সরি, আমাকে ভুলে যাও পিলিজ, আমি আর কিছুক্ষন পর চলে যাবো, আমার পরে যে আসবে তাকে নিয়েই তোমরা এনজয় করো, ইতি তোমার প্রিয় রমজান মুবারক। *ঈদ মুবারক*");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুল সুবাস দেয়, দৃষ্টি মন চুরি করে, খুশি আমাদের হাসায়, দুঃখ আমাদের কাদায়, আমার এস.এম.এস. তোমাকে শুভেচ্ছা জানাই। ঈদ মুবারক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "চিঠি দিয়ে নয়, ফুল দিয়ে নয়। কার্ড দিয়ে নয়, কল দিয়ে নয়। মনের গহীন থেকে মিষ্টি SMS দিয়ে জানাই ঈদের শুভেচ্ছা। ঈদ মোবারক…!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঈদের শুভেচ্ছা জানাই তোমাকে,অনেক বেশি খুশি ঘিরে রাখুক তোমাকে,সব আপনজনের মায়া মাতিয়ে রাখুক তোমাকে,শুধু যখন সালামি পাবে মনে করিও আমাকে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "এই এসএমএস, যার কাছে যাবি, যাকে পাবি, তাকেই আমার সালাম দিবি, লাল গোলাপের ভালোবাসা দিয়ে ঈদের দাওয়াত জানাবি, আর মিষ্টি করে বলবি ঈদ মোবারক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "বলছি আমি আমার কথা, ঈদে থাকবে নাকো মনের ব্যাথা,আমার জীবনে অনেক চাওয়া, ঈদ থেকে সব পাওয়া, ঈদের প্রতি তাই এত্ত ভালোবাসা,");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "তোর ইচ্ছাগুলো উড়ে বেড়াক পাখনা দুটি মেলে, দিনগুলি তোর যাকনা কেটে এমনি হেসে খেলে। অপূর্ণ না থাকে যেন তোর কোন সুখ, এই কামনায় ঈদ মোবারক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আসছে ঈদ লাগছে ভালো, তাইতো আমায় বলতে হলো, ঈদ মানে আকাশ ভরা এল, ঈদ মানে সবাই থাকবে ভালো। *ঈদ মুবারক*");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঈদ মানে খুশি, ঈদ মানে আনন্দ, ঈদ মানে ভুলিয়া দিতে সকল বিভেদ দ্বন্দ। ঈদ মানে ভুলে যাওয়া যত দুঃখ-ভয়, ঈদের মতোই তোমার জীবনটা হোক দিপ্তময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "আকাশের নীল দিয়ে, সাগরের গভীরত দিয়ে, হৃদয়ের সবটুকু ভালোবাসা দিয়ে তুমাকে জানাই ঈদের অগ্রীম শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঈদ আনে বস্তা ভর্তি খুশি, তাই তুমি খেয়ো পেট পুরে পোলাও আর খাশি। তাই বলে ঈদ কখনো হবে না বাসি, ঈদ মোবারক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "রঙ লেগেছে মনে। মধুর এই খনে। তোমায় আমি রাঙ্গিয়ে দিবো ঈদের এই দিনে। ঈদ মোবারাক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "নতুন চাঁদের আগমনে, সাড়া জাগলো এ মনে, ঈদ এলো পবিত্র দিনে, দুঃখ বেদনা ভুলে গিয়ে, এনজয় করো ইদের দিনে , দাওয়াত দিলাম তোমার তরে, পারলে এসো আমার ঘরে, ঈদ মোবারাক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ভালবাসার তালে .তালে চলব দুজন এক সাথে। কাছে এসে পাসে বসে মন রাখ আমার মনে। শপ্ন দেখ্ব দুজন মিলে, ঘর কর ছি এক সাথে। আর কি লাগে পৃথিবীতে। ঈদ মোবারক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঈদ মানে খুশি, গরুর গলায় রশি, শীতের সর্দি কাশি, আবার হুজুরের মুখে হাসি, তবুও ঈদ ভালোবাসি, তাই সবাইকে ঈদ মুবারক জানিয়ে এবার আমি আসি। *ঈদ মুবারক*");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ফুল ফুটেছে বনে বনে,,,,,,, ভাবছি তোমায় মনে মনে,,,,,, বলছি তোমায় কানে কানে,,,, ঈদের অনাবিল শুভেচ্ছা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঐ দেখা যায় ঈদের চাঁদ ** বাড়ীয়ে দিলাম দুটি হাত ** মিস্টি মিস্টি হাসিতে ** দাওয়াত দিলাম আসিতে ****** ঈদ মোবারক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঝড় বৃস্টি রোদের দিন ** আসবে  কিন্তু  ঈদের দিন ** অপেক্ষা করবো **সারাদিন ** ঈদ পাবে না প্রতিদিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "সাদা গোলাপ সবুজ পাতা**তোমাকে জানাই EID এর কথা**আসবে আমার বাড়িতে**বসতে দিব পিড়িতে। খাবে কিন্তু অল্প**করবো অনেক গল্প। ঈদ মোবারাক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ও চাঁদ তুমি কি খুশী নিয়ে এলে ? খুশীর আভাসে আজ পৃথিবী দোলে, তোমার জন্য ছিলো কত অপেক্ষা তাই বুঝি দিয়ে এক বছর পর দেখা । ঈদ মোবারাক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("text", "ঈদের দাওয়াত তোমার তরে আসবে তুমি আমার ঘরে কবুল কর আমার দাওয়াত না করলে পাবো আঘাত তখন কিন্তু দেবো আড়ি যাবো না আর তোমার বাড়ি। ঈদ মোবারাক");
        arrayList.add(hashMap);






        EidAdapter eidAdapter = new EidAdapter();
        listView.setAdapter(eidAdapter);

    }

    private class EidAdapter extends BaseAdapter {

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
            View eidView = layoutInflater.inflate(R.layout.item, parent, false);

            TextView tvDisplay = eidView.findViewById(R.id.tvDisplay);
            TextView tvCopy = eidView.findViewById(R.id.tvCopy);
            TextView tvShare = eidView.findViewById(R.id.tvShare);


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


            return eidView;
        }
    }

}