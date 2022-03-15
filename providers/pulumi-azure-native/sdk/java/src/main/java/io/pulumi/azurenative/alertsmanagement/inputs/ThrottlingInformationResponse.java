// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional throttling information for the alert rule.
 * 
 */
public final class ThrottlingInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ThrottlingInformationResponse Empty = new ThrottlingInformationResponse();

    /**
     * The required duration (in ISO8601 format) to wait before notifying on the alert rule again. The time granularity must be in minutes and minimum value is 0 minutes
     * 
     */
    @Import(name="duration")
      private final @Nullable String duration;

    public Optional<String> getDuration() {
        return this.duration == null ? Optional.empty() : Optional.ofNullable(this.duration);
    }

    public ThrottlingInformationResponse(@Nullable String duration) {
        this.duration = duration;
    }

    private ThrottlingInformationResponse() {
        this.duration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThrottlingInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String duration;

        public Builder() {
    	      // Empty
        }

        public Builder(ThrottlingInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }
        public ThrottlingInformationResponse build() {
            return new ThrottlingInformationResponse(duration);
        }
    }
}
