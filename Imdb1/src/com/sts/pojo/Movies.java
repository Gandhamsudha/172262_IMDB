package com.sts.pojo;

public class Movies {
String Hero;
String Heroine;
String Genre;

public Movies(String hero, String heroine, String genre) {
	super();
	Hero = hero;
	Heroine = heroine;
	Genre = genre;
}
public Movies() {
	super();
}
public String getHero() {
	return Hero;
}
public void setHero(String hero) {
	Hero = hero;
}
public String getHeroine() {
	return Heroine;
}
public void setHeroine(String heroine) {
	Heroine = heroine;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
@Override
public String toString() {
	return "Movies [Hero=" + Hero + ", Heroine=" + Heroine + ", Genre=" + Genre + "]";
}

}
