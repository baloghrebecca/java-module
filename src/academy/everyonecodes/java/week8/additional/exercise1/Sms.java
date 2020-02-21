package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.Objects;

public class Sms {

    private String type;
    private String content;

    public Sms(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sms sms = (Sms) o;
        return Objects.equals(type, sms.type) &&
                Objects.equals(content, sms.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }
}
