package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lmodel/BaseCharacter;", "", "ancestry", "", "getAncestry", "()Ljava/lang/String;", "gender", "getGender", "house", "getHouse", "name", "getName", "patronus", "getPatronus", "species", "getSpecies", "wand", "Lmodel/Wand;", "getWand", "()Lmodel/Wand;", "wizard", "", "getWizard", "()Z", "untitled"})
public abstract interface BaseCharacter {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getSpecies();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getGender();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getHouse();
    
    public abstract boolean getWizard();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getAncestry();
    
    @org.jetbrains.annotations.NotNull
    public abstract model.Wand getWand();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getPatronus();
}