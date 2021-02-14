package com.example.tester;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;

    }
    public void setDetails(Context ctx, String word){
        TextView mWord = mView.findViewById(R.id.wordList);
        mWord.setText(word);
    }
}
