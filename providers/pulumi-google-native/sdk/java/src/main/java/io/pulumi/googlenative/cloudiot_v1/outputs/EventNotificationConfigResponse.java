// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventNotificationConfigResponse {
    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     * 
     */
    private final String pubsubTopicName;
    /**
     * If the subfolder name matches this string exactly, this configuration will be used. The string must not include the leading '/' character. If empty, all strings are matched. This field is used only for telemetry events; subfolders are not supported for state changes.
     * 
     */
    private final String subfolderMatches;

    @CustomType.Constructor
    private EventNotificationConfigResponse(
        @CustomType.Parameter("pubsubTopicName") String pubsubTopicName,
        @CustomType.Parameter("subfolderMatches") String subfolderMatches) {
        this.pubsubTopicName = pubsubTopicName;
        this.subfolderMatches = subfolderMatches;
    }

    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     * 
    */
    public String getPubsubTopicName() {
        return this.pubsubTopicName;
    }
    /**
     * If the subfolder name matches this string exactly, this configuration will be used. The string must not include the leading '/' character. If empty, all strings are matched. This field is used only for telemetry events; subfolders are not supported for state changes.
     * 
    */
    public String getSubfolderMatches() {
        return this.subfolderMatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventNotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopicName;
        private String subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(EventNotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder pubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }

        public Builder subfolderMatches(String subfolderMatches) {
            this.subfolderMatches = Objects.requireNonNull(subfolderMatches);
            return this;
        }
        public EventNotificationConfigResponse build() {
            return new EventNotificationConfigResponse(pubsubTopicName, subfolderMatches);
        }
    }
}
