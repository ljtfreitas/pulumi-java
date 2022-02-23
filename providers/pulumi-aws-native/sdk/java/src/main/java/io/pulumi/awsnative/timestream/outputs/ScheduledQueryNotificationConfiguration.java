// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.ScheduledQuerySnsConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ScheduledQueryNotificationConfiguration {
    private final ScheduledQuerySnsConfiguration snsConfiguration;

    @OutputCustomType.Constructor({"snsConfiguration"})
    private ScheduledQueryNotificationConfiguration(ScheduledQuerySnsConfiguration snsConfiguration) {
        this.snsConfiguration = Objects.requireNonNull(snsConfiguration);
    }

    public ScheduledQuerySnsConfiguration getSnsConfiguration() {
        return this.snsConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryNotificationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQuerySnsConfiguration snsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryNotificationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snsConfiguration = defaults.snsConfiguration;
        }

        public Builder setSnsConfiguration(ScheduledQuerySnsConfiguration snsConfiguration) {
            this.snsConfiguration = Objects.requireNonNull(snsConfiguration);
            return this;
        }
        public ScheduledQueryNotificationConfiguration build() {
            return new ScheduledQueryNotificationConfiguration(snsConfiguration);
        }
    }
}
