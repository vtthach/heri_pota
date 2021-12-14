package ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lui/CharactersViewModel;", "Lui/BaseViewModel;", "networkClient", "Lapi/HarryPotterNetworkClient;", "(Lapi/HarryPotterNetworkClient;)V", "dispose", "", "fetchCharacters", "Lui/CharactersViewModel$CharactersState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CharactersState", "untitled"})
public final class CharactersViewModel implements ui.BaseViewModel {
    private final api.HarryPotterNetworkClient networkClient = null;
    
    @javax.inject.Inject
    public CharactersViewModel(@org.jetbrains.annotations.NotNull
    api.HarryPotterNetworkClient networkClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCharacters(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super ui.CharactersViewModel.CharactersState> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void dispose() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lui/CharactersViewModel$CharactersState;", "", "()V", "Failed", "Idle", "Success", "Lui/CharactersViewModel$CharactersState$Idle;", "Lui/CharactersViewModel$CharactersState$Failed;", "Lui/CharactersViewModel$CharactersState$Success;", "untitled"})
    public static abstract class CharactersState {
        
        private CharactersState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lui/CharactersViewModel$CharactersState$Idle;", "Lui/CharactersViewModel$CharactersState;", "()V", "untitled"})
        public static final class Idle extends ui.CharactersViewModel.CharactersState {
            @org.jetbrains.annotations.NotNull
            public static final ui.CharactersViewModel.CharactersState.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lui/CharactersViewModel$CharactersState$Failed;", "Lui/CharactersViewModel$CharactersState;", "()V", "untitled"})
        public static final class Failed extends ui.CharactersViewModel.CharactersState {
            @org.jetbrains.annotations.NotNull
            public static final ui.CharactersViewModel.CharactersState.Failed INSTANCE = null;
            
            private Failed() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lui/CharactersViewModel$CharactersState$Success;", "Lui/CharactersViewModel$CharactersState;", "data", "", "Lmodel/Character;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "untitled"})
        public static final class Success extends ui.CharactersViewModel.CharactersState {
            @org.jetbrains.annotations.Nullable
            private final java.util.List<model.Character> data = null;
            
            @org.jetbrains.annotations.NotNull
            public final ui.CharactersViewModel.CharactersState.Success copy(@org.jetbrains.annotations.Nullable
            java.util.List<model.Character> data) {
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
            
            public Success(@org.jetbrains.annotations.Nullable
            java.util.List<model.Character> data) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<model.Character> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<model.Character> getData() {
                return null;
            }
        }
    }
}