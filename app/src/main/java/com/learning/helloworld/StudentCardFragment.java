package com.learning.helloworld;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StudentCardFragment extends Fragment {
    private final Student student;

    public StudentCardFragment(Student student) {
        this.student = student;
    }

    static StudentCardFragment newInstance(Student student) {
        return new StudentCardFragment(student);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_card, container, false);
        TextView textView = view.findViewById(R.id.name);
        textView.setText("Имя: " + student.firstName + "\nФамилия: " + student.lastName);
        return view;
    }
}
