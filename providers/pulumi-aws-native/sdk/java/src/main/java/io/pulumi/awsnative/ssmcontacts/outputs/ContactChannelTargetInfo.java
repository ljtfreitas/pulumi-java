// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContactChannelTargetInfo {
    private final String channelId;
    private final Integer retryIntervalInMinutes;

    @OutputCustomType.Constructor({"channelId","retryIntervalInMinutes"})
    private ContactChannelTargetInfo(
        String channelId,
        Integer retryIntervalInMinutes) {
        this.channelId = Objects.requireNonNull(channelId);
        this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes);
    }

    public String getChannelId() {
        return this.channelId;
    }
    public Integer getRetryIntervalInMinutes() {
        return this.retryIntervalInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactChannelTargetInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelId;
        private Integer retryIntervalInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactChannelTargetInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.retryIntervalInMinutes = defaults.retryIntervalInMinutes;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }

        public Builder setRetryIntervalInMinutes(Integer retryIntervalInMinutes) {
            this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes);
            return this;
        }

        public ContactChannelTargetInfo build() {
            return new ContactChannelTargetInfo(channelId, retryIntervalInMinutes);
        }
    }
}