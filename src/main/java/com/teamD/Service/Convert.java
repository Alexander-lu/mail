package com.teamD.Service;

import com.convertapi.client.Config;
import com.convertapi.client.ConvertApi;
public class Convert {
    public static void main(String[] args) {
        Config.setDefaultSecret("J0uMB0UBPUgTI3zJ");

//// Simplified file to file conversion example
//        ConvertApi.convertFile("test.docx", "/tmp/result.pdf");

// Simplified web site to pdf conversion example
        ConvertApi.convertUrl("https://www.bilibili.com/video/BV1S64y127n6?p=2&vd_source=3fdc711d863c2490201e3801586af64b", "example.pdf");

//// Simplified remote file to local file conversion example
//        ConvertApi.convertRemoteFile("https://cdn.convertapi.com/cara/testfiles/document.docx", "/tmp/demo.pdf");
    }

}
