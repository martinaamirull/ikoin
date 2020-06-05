package com.example.ikoin.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ikoin.R;
public class Riwayat extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String json="[{\"id\":\"1\",\"name\":\"Sukses\",\"desc\":\"test1\"},{\"id\":\"2\",\"name\":\"Gagal\",\"desc\":\"Test2\"},{\"id\":\"3\",\"name\":\"Gagal\",\"desc\":\"test3\"},{\"id\":\"4\",\"name\":\"Sukses\",\"desc\":\"Test4\"},{\"id\":\"5\",\"name\":\"Sukses\",\"desc\":\"test5\"},{\"id\":\"6\",\"name\":\"Gagal\",\"desc\":\"Test6\"},{\"id\":\"7\",\"name\":\"Sukses\",\"desc\":\"test7\"},{\"id\":\"8\",\"name\":\"Sukses\",\"desc\":\"Test8\"}]";
        System.out.println("isi Jsonnya :"+json);
        return inflater.inflate(R.layout.fragment_riwayat, container, false);

    }
}