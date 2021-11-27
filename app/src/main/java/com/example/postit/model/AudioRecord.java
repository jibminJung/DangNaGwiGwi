package com.example.postit.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AudioRecord {
    private String speakerID;
    @ServerTimestamp
    private Date time;
    private String audioLocation;
    private ArrayList<String> evalutaion;
    private int questionId;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    AudioRecord(){}

    public AudioRecord(String speakerID, String audioLocation, ArrayList<String> evalutaion, int questionId) {
        this.speakerID = speakerID;
        this.audioLocation = audioLocation;
        this.evalutaion = evalutaion;
        this.questionId = questionId;
    }

    public String getSpeakerID() {
        return speakerID;
    }

    public void setSpeakerID(String speakerID) {
        this.speakerID = speakerID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAudioLocation() {
        return audioLocation;
    }

    public void setAudioLocation(String audioLocation) {
        this.audioLocation = audioLocation;
    }

    public ArrayList<String> getEvalutaion() {
        return evalutaion;
    }

    public void setEvalutaion(ArrayList<String> evalutaion) {
        this.evalutaion = evalutaion;
    }
}
