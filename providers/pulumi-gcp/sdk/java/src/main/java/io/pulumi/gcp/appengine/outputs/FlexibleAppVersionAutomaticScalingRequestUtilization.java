// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionAutomaticScalingRequestUtilization {
    private final @Nullable Double targetConcurrentRequests;
    private final @Nullable String targetRequestCountPerSecond;

    @OutputCustomType.Constructor({"targetConcurrentRequests","targetRequestCountPerSecond"})
    private FlexibleAppVersionAutomaticScalingRequestUtilization(
        @Nullable Double targetConcurrentRequests,
        @Nullable String targetRequestCountPerSecond) {
        this.targetConcurrentRequests = targetConcurrentRequests;
        this.targetRequestCountPerSecond = targetRequestCountPerSecond;
    }

    public Optional<Double> getTargetConcurrentRequests() {
        return Optional.ofNullable(this.targetConcurrentRequests);
    }
    public Optional<String> getTargetRequestCountPerSecond() {
        return Optional.ofNullable(this.targetRequestCountPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingRequestUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double targetConcurrentRequests;
        private @Nullable String targetRequestCountPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingRequestUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConcurrentRequests = defaults.targetConcurrentRequests;
    	      this.targetRequestCountPerSecond = defaults.targetRequestCountPerSecond;
        }

        public Builder setTargetConcurrentRequests(@Nullable Double targetConcurrentRequests) {
            this.targetConcurrentRequests = targetConcurrentRequests;
            return this;
        }

        public Builder setTargetRequestCountPerSecond(@Nullable String targetRequestCountPerSecond) {
            this.targetRequestCountPerSecond = targetRequestCountPerSecond;
            return this;
        }

        public FlexibleAppVersionAutomaticScalingRequestUtilization build() {
            return new FlexibleAppVersionAutomaticScalingRequestUtilization(targetConcurrentRequests, targetRequestCountPerSecond);
        }
    }
}