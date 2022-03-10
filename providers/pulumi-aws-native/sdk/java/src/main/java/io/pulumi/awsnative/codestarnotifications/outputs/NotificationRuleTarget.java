// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarnotifications.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NotificationRuleTarget {
    private final String targetAddress;
    private final String targetType;

    @OutputCustomType.Constructor
    private NotificationRuleTarget(
        @OutputCustomType.Parameter("targetAddress") String targetAddress,
        @OutputCustomType.Parameter("targetType") String targetType) {
        this.targetAddress = targetAddress;
        this.targetType = targetType;
    }

    public String getTargetAddress() {
        return this.targetAddress;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetAddress;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetAddress = defaults.targetAddress;
    	      this.targetType = defaults.targetType;
        }

        public Builder setTargetAddress(String targetAddress) {
            this.targetAddress = Objects.requireNonNull(targetAddress);
            return this;
        }

        public Builder setTargetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public NotificationRuleTarget build() {
            return new NotificationRuleTarget(targetAddress, targetType);
        }
    }
}
