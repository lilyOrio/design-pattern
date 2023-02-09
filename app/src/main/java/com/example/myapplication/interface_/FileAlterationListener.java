package com.example.myapplication.interface_;

import com.example.myapplication.adapter.FileAlterationObserver;

import java.io.File;

/**
 *适配器模式总体来说分三种：默认适配器模式、对象适配器模式、类适配器模式。先不急着分清楚这几个，先看看例子再说
 *
 * 默认适配器模式
 * 首先，我们先看看最简单的适配器模式**默认适配器模式(Default Adapter)**是怎么样的。
 *
 * 我们用 Appache commons-io 包中的 FileAlterationListener 做例子，此接口定义了很多的方法，
 * 用于对文件或文件夹进行监控，一旦发生了对应的操作，就会触发相应的方法。
 */
public interface FileAlterationListener {
    void onStart(final FileAlterationObserver observer);
    void onDirectoryCreate(final File directory);
    void onDirectoryChange(final File directory);
    void onDirectoryDelete(final File directory);
    void onFileCreate(final File file);
    void onFileChange(final File file);
    void onFileDelete(final File file);
    void onStop(final FileAlterationObserver observer);
}
