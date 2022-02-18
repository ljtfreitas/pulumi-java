// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChangeFeedResponse {
    /**
     * Indicates whether change feed event logging is enabled for the Blob service.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Indicates the duration of changeFeed retention in days. Minimum value is 1 day and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     * 
     */
    private final @Nullable Integer retentionInDays;

    @OutputCustomType.Constructor({"enabled","retentionInDays"})
    private ChangeFeedResponse(
        @Nullable Boolean enabled,
        @Nullable Integer retentionInDays) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
    }

    /**
     * Indicates whether change feed event logging is enabled for the Blob service.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Indicates the duration of changeFeed retention in days. Minimum value is 1 day and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     * 
     */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChangeFeedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retentionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(ChangeFeedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public ChangeFeedResponse build() {
            return new ChangeFeedResponse(enabled, retentionInDays);
        }
    }
}
