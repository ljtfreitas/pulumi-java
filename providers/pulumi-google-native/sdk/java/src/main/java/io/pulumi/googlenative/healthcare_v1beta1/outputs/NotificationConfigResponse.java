// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NotificationConfigResponse {
    private final String pubsubTopic;
    private final Boolean sendForBulkImport;

    @OutputCustomType.Constructor({"pubsubTopic","sendForBulkImport"})
    private NotificationConfigResponse(
        String pubsubTopic,
        Boolean sendForBulkImport) {
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
        this.sendForBulkImport = Objects.requireNonNull(sendForBulkImport);
    }

    public String getPubsubTopic() {
        return this.pubsubTopic;
    }
    public Boolean getSendForBulkImport() {
        return this.sendForBulkImport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopic;
        private Boolean sendForBulkImport;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.sendForBulkImport = defaults.sendForBulkImport;
        }

        public Builder setPubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }

        public Builder setSendForBulkImport(Boolean sendForBulkImport) {
            this.sendForBulkImport = Objects.requireNonNull(sendForBulkImport);
            return this;
        }

        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(pubsubTopic, sendForBulkImport);
        }
    }
}