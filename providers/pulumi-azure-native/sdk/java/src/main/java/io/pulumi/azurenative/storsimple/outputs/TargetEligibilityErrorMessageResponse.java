// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TargetEligibilityErrorMessageResponse {
    /**
     * The localized error message stating the reason why the device is not eligible as a target device.
     * 
     */
    private final @Nullable String message;
    /**
     * The localized resolution message for the error.
     * 
     */
    private final @Nullable String resolution;
    /**
     * The result code for the error, due to which the device does not qualify as a failover target device.
     * 
     */
    private final @Nullable String resultCode;

    @OutputCustomType.Constructor({"message","resolution","resultCode"})
    private TargetEligibilityErrorMessageResponse(
        @Nullable String message,
        @Nullable String resolution,
        @Nullable String resultCode) {
        this.message = message;
        this.resolution = resolution;
        this.resultCode = resultCode;
    }

    /**
     * The localized error message stating the reason why the device is not eligible as a target device.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The localized resolution message for the error.
     * 
     */
    public Optional<String> getResolution() {
        return Optional.ofNullable(this.resolution);
    }
    /**
     * The result code for the error, due to which the device does not qualify as a failover target device.
     * 
     */
    public Optional<String> getResultCode() {
        return Optional.ofNullable(this.resultCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetEligibilityErrorMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String resolution;
        private @Nullable String resultCode;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetEligibilityErrorMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.resolution = defaults.resolution;
    	      this.resultCode = defaults.resultCode;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setResolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setResultCode(@Nullable String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public TargetEligibilityErrorMessageResponse build() {
            return new TargetEligibilityErrorMessageResponse(message, resolution, resultCode);
        }
    }
}
