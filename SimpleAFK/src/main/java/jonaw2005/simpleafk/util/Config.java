package jonaw2005.simpleafk.util;

public class Config {
    private String afktitle;
    private String afksubtitle;
    private String resumetitle;
    private String resumesubtitle;
    private long afktime;

    public Config(){}

    public String getAfktitle() {
        return afktitle;
    }

    public void setAfktitle(String afktitle) {
        this.afktitle = afktitle;
    }

    public String getAfksubtitle() {
        return afksubtitle;
    }

    public void setAfksubtitle(String afksubtitle) {
        this.afksubtitle = afksubtitle;
    }

    public String getResumetitle() {
        return resumetitle;
    }

    public void setResumetitle(String resumetitle) {
        this.resumetitle = resumetitle;
    }

    public String getResumesubtitle() {
        return resumesubtitle;
    }

    public void setResumesubtitle(String resumesubtitle) {
        this.resumesubtitle = resumesubtitle;
    }

    public long getAfktime() {
        return afktime;
    }

    public void setAfktime(long afktime) {
        this.afktime = afktime;
    }

    @Override
    public String toString(){
        return "Config [afktitle="+afktitle+", afksubtitle="+afksubtitle+", resumetitle="+resumetitle+", resumesubtitle="+resumesubtitle+", afktime="+afktime+"]";
    }
}
