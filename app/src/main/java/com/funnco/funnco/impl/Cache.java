package com.funnco.funnco.impl;

/**
 * 图片缓存，用于将压缩的图片放入缓存中。
 * Created by bokui on 14/12/1.
 */
public interface Cache {
    /**
     * 缓存图片接口。
     * @param url   上传完成后的云端url
     * @param data  缓存数据
     */
    void onWriteData(String url, byte[] data);
}
