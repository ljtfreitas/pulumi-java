// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Time interval that the query actually executed on.
 * 
 */
public final class EntityInsightItemResponseQueryTimeInterval extends io.pulumi.resources.InvokeArgs {

    public static final EntityInsightItemResponseQueryTimeInterval Empty = new EntityInsightItemResponseQueryTimeInterval();

    /**
     * Insight query end time
     * 
     */
    @InputImport(name="endTime")
        private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Insight query start time
     * 
     */
    @InputImport(name="startTime")
        private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public EntityInsightItemResponseQueryTimeInterval(
        @Nullable String endTime,
        @Nullable String startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private EntityInsightItemResponseQueryTimeInterval() {
        this.endTime = null;
        this.startTime = null;
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
