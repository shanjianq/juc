package com.example.juc.yewei.第四章java并发编程基础.一个简单的线程池示例;

public interface ThreadPool {
    //执行一个Job，这个Job需要实现Runnable
    void execute(Runnable job);
    //关闭线程
    void shutdown();
    //增加工作者线程
    void addWorkers(int num);
    //减少工作者线程
    void removeWorker(int num);
}
