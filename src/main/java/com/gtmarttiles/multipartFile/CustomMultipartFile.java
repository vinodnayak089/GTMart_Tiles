package com.gtmarttiles.multipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

public class CustomMultipartFile implements MultipartFile {

    private final byte[] fileBytes;
    private final String fileName;

    public CustomMultipartFile(byte[] fileBytes, String fileName) {
        this.fileBytes = fileBytes;
        this.fileName = fileName;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public String getOriginalFilename() {
        return fileName;
    }

    @Override
    public String getContentType() {
        // Set the appropriate content type for your file
        return "image/jpeg"; //use this if you do not know the type -> application/octet-stream
    }

    @Override
    public boolean isEmpty() {
        return fileBytes == null || fileBytes.length == 0;
    }

    @Override
    public long getSize() {
        return fileBytes.length;
    }

    @Override
    public byte[] getBytes() throws IOException {
        return fileBytes;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(fileBytes);
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {
        try (OutputStream outputStream = new FileOutputStream(dest)) {
            outputStream.write(fileBytes);
        }
    }
}
