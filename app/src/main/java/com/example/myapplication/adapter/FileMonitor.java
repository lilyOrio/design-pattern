package com.example.myapplication.adapter;

import java.io.File;

//比如我们可以定义以下类，我们仅仅需要实现我们想实现的方法就可以了
    public class FileMonitor extends FileAlterationListenerAdaptor {
        public void onFileCreate(final File file) {
            // 文件创建
//            doSomething();
        }

        public void onFileDelete(final File file) {
            // 文件删除
//            doSomething();
        }
    }
//上面说的只是适配器模式的其中一种，也是最简单的一种
