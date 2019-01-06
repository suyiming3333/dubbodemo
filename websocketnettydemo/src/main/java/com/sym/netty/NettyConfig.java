package com.netty.demo.config;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 存储工程的全局配置
 */

public class NettyConfig {

    /**
     * 存储每个客户端连接的channel对象
     */
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
