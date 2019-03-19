package com.eileen.chinesenamegenerator.logic;

public class ChineseName {
    private String chineseCharacter;
    private String pinyin;
    private String chineseNameMeaning;
    private Integer strokes;

    public String getChineseCharacter() {
        return chineseCharacter;
    }

    public void setChineseCharacter(String chineseCharacter) {
        this.chineseCharacter = chineseCharacter;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getChineseNameMeaning() {
        return chineseNameMeaning;
    }

    public void setChineseNameMeaning(String chineseNameMeaning) {
        this.chineseNameMeaning = chineseNameMeaning;
    }

    public Integer getStrokes() {
        return strokes;
    }

    public void setStrokes(Integer strokes) {
        this.strokes = strokes;
    }

    @Override
    public String toString() {
        return "ChineseName{" +
                "chineseCharacter='" + chineseCharacter + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", chineseNameMeaning='" + chineseNameMeaning + '\'' +
                ", strokes=" + strokes +
                '}';
    }
}

