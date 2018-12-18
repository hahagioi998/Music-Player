package com.happy.util;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;


public class Search {
    public static void main(String[] args) {

	// 环境配置，将vlc sdk导入到eclipse

	// if(RuntimeUtil.isWindows()){ }
	NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "D:\\Program Files\\VideoLAN\\VLC\\sdk\\lib"); // 导入的路径是vlc的安装路径
	Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
	// System.out.println(LibVlc.INSTANCE.libvlc_get_version());
    }
}