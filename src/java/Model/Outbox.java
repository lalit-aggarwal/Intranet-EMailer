/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Outbox {
    String id;
    String tto;
    String subject;
    String content;
String user_id;
String ffrom;

    public String getFfrom() {
        return ffrom;
    }

    public void setFfrom(String ffrom) {
        this.ffrom = ffrom;
    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTto() {
        return tto;
    }

    public void setTto(String tto) {
        this.tto = tto;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
