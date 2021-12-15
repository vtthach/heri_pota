package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lmodel/UICharacter;", "Lmodel/BaseCharacter;", "name", "", "species", "gender", "house", "wizard", "", "ancestry", "wand", "Lmodel/Wand;", "patronus", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lmodel/Wand;Ljava/lang/String;Landroidx/compose/ui/graphics/ImageBitmap;)V", "getAncestry", "()Ljava/lang/String;", "getGender", "getHouse", "getImageBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "getName", "getPatronus", "getSpecies", "getWand", "()Lmodel/Wand;", "getWizard", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "untitled"})
public final class UICharacter implements model.BaseCharacter {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String species = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String house = null;
    private final boolean wizard = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ancestry = null;
    @org.jetbrains.annotations.NotNull
    private final model.Wand wand = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String patronus = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.ui.graphics.ImageBitmap imageBitmap = null;
    
    @org.jetbrains.annotations.NotNull
    public final model.UICharacter copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String house, boolean wizard, @org.jetbrains.annotations.NotNull
    java.lang.String ancestry, @org.jetbrains.annotations.NotNull
    model.Wand wand, @org.jetbrains.annotations.NotNull
    java.lang.String patronus, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public UICharacter(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String house, boolean wizard, @org.jetbrains.annotations.NotNull
    java.lang.String ancestry, @org.jetbrains.annotations.NotNull
    model.Wand wand, @org.jetbrains.annotations.NotNull
    java.lang.String patronus, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getHouse() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @java.lang.Override
    public boolean getWizard() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getAncestry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final model.Wand component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public model.Wand getWand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPatronus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.ImageBitmap component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.ImageBitmap getImageBitmap() {
        return null;
    }
}