package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscriberContent = new LinkedHashSet<>();
    private Set<Content> finishContent = new LinkedHashSet<>();

    public void subscriberBootCamp(BootCamp bootCamp) {
        this.subscriberContent.addAll(bootCamp.getContents());
        bootCamp.getSubscriberDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscriberContent.stream()
                .findFirst();
        if (content.isPresent()) {
            this.finishContent.add(content.get());
            this.subscriberContent.add(content.get());
        } else {
            System.out.println("you not subscriber in none content ");
        }
    }

    public double calcTotalXp() {
        return this.finishContent.stream()
                .mapToDouble(Content::calcXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscriberContent() {
        return subscriberContent;
    }

    public void setSubscriberContent(Set<Content> subscriberContent) {
        this.subscriberContent = subscriberContent;
    }

    public Set<Content> getFinishContent() {
        return finishContent;
    }

    public void setFinishContent(Set<Content> finishContent) {
        this.finishContent = finishContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscriberContent, dev.subscriberContent) && Objects.equals(finishContent, dev.finishContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscriberContent, finishContent);
    }
}
