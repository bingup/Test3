package com.com.day17.test15;

import java.io.File;
import java.io.FileFilter;

public class JavaFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        String s = pathname.getName();
        if (s.endsWith("java")){
            return  true;
        }else
        {
            return false;
        }

    }
}
