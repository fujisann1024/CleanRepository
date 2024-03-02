package org.example.disignpattern.observer.exam;

/**発行者*/
public interface Observer {

    /**Subject(購読者)の状態が変わると呼び出される*/
    public void update(float temp, float humidity, float pressure);
}
