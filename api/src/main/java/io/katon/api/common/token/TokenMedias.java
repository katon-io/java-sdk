package io.katon.api.common.token;

public class TokenMedias {
    private String url;
    private String fileType;
    private String fileSize;

    public TokenMedias(String url, String fileType, String fileSize) {
        this.url = url;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

}
