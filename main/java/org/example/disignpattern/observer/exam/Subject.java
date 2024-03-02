package org.example.disignpattern.observer.exam;

public interface Subject {

    /**
     * Observerの登録
     */
    public void registerObserver(Observer o);

    /**
     * Observerの削除
     */
    public void removeObserver(Observer o);

    /**
     * Observerの更新
     */
    public void notifyObserver();
}
