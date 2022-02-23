// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class VaultNotification {
    /**
     * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    private final List<String> events;
    /**
     * The SNS Topic ARN.
     * 
     */
    private final String snsTopic;

    @OutputCustomType.Constructor({"events","snsTopic"})
    private VaultNotification(
        List<String> events,
        String snsTopic) {
        this.events = Objects.requireNonNull(events);
        this.snsTopic = Objects.requireNonNull(snsTopic);
    }

    /**
     * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    public List<String> getEvents() {
        return this.events;
    }
    /**
     * The SNS Topic ARN.
     * 
     */
    public String getSnsTopic() {
        return this.snsTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> events;
        private String snsTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.snsTopic = defaults.snsTopic;
        }

        public Builder setEvents(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setSnsTopic(String snsTopic) {
            this.snsTopic = Objects.requireNonNull(snsTopic);
            return this;
        }
        public VaultNotification build() {
            return new VaultNotification(events, snsTopic);
        }
    }
}
