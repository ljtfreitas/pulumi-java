// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntityInsightItemResponseQueryTimeInterval {
    private final @Nullable String endTime;
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"endTime","startTime"})
    private EntityInsightItemResponseQueryTimeInterval(
        @Nullable String endTime,
        @Nullable String startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInsightItemResponseQueryTimeInterval defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInsightItemResponseQueryTimeInterval defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public EntityInsightItemResponseQueryTimeInterval build() {
            return new EntityInsightItemResponseQueryTimeInterval(endTime, startTime);
        }
    }
}