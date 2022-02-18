// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the status of warm storage on an environment.
 * 
 */
public final class WarmStorageEnvironmentStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final WarmStorageEnvironmentStatusResponse Empty = new WarmStorageEnvironmentStatusResponse();

    /**
     * A value that represents the number of properties used by the environment for S1/S2 SKU and number of properties used by Warm Store for PAYG SKU
     * 
     */
    @InputImport(name="currentCount")
    private final @Nullable Integer currentCount;

    public Optional<Integer> getCurrentCount() {
        return this.currentCount == null ? Optional.empty() : Optional.ofNullable(this.currentCount);
    }

    /**
     * A value that represents the maximum number of properties used allowed by the environment for S1/S2 SKU and maximum number of properties allowed by Warm Store for PAYG SKU.
     * 
     */
    @InputImport(name="maxCount")
    private final @Nullable Integer maxCount;

    public Optional<Integer> getMaxCount() {
        return this.maxCount == null ? Optional.empty() : Optional.ofNullable(this.maxCount);
    }

    /**
     * This string represents the state of warm storage properties usage. It can be "Ok", "Error", "Unknown".
     * 
     */
    @InputImport(name="state")
    private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public WarmStorageEnvironmentStatusResponse(
        @Nullable Integer currentCount,
        @Nullable Integer maxCount,
        @Nullable String state) {
        this.currentCount = currentCount;
        this.maxCount = maxCount;
        this.state = state;
    }

    private WarmStorageEnvironmentStatusResponse() {
        this.currentCount = null;
        this.maxCount = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmStorageEnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer currentCount;
        private @Nullable Integer maxCount;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmStorageEnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCount = defaults.currentCount;
    	      this.maxCount = defaults.maxCount;
    	      this.state = defaults.state;
        }

        public Builder setCurrentCount(@Nullable Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public WarmStorageEnvironmentStatusResponse build() {
            return new WarmStorageEnvironmentStatusResponse(currentCount, maxCount, state);
        }
    }
}
