// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.TargetEligibilityErrorMessageResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetEligibilityResultResponse {
    /**
     * The eligibility status of device, as a failover target device.
     * 
     */
    private final @Nullable String eligibilityStatus;
    /**
     * The list of error messages, if a device does not qualify as a failover target device.
     * 
     */
    private final @Nullable List<TargetEligibilityErrorMessageResponse> messages;

    @CustomType.Constructor
    private TargetEligibilityResultResponse(
        @CustomType.Parameter("eligibilityStatus") @Nullable String eligibilityStatus,
        @CustomType.Parameter("messages") @Nullable List<TargetEligibilityErrorMessageResponse> messages) {
        this.eligibilityStatus = eligibilityStatus;
        this.messages = messages;
    }

    /**
     * The eligibility status of device, as a failover target device.
     * 
    */
    public Optional<String> getEligibilityStatus() {
        return Optional.ofNullable(this.eligibilityStatus);
    }
    /**
     * The list of error messages, if a device does not qualify as a failover target device.
     * 
    */
    public List<TargetEligibilityErrorMessageResponse> getMessages() {
        return this.messages == null ? List.of() : this.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetEligibilityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eligibilityStatus;
        private @Nullable List<TargetEligibilityErrorMessageResponse> messages;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetEligibilityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eligibilityStatus = defaults.eligibilityStatus;
    	      this.messages = defaults.messages;
        }

        public Builder eligibilityStatus(@Nullable String eligibilityStatus) {
            this.eligibilityStatus = eligibilityStatus;
            return this;
        }

        public Builder messages(@Nullable List<TargetEligibilityErrorMessageResponse> messages) {
            this.messages = messages;
            return this;
        }
        public TargetEligibilityResultResponse build() {
            return new TargetEligibilityResultResponse(eligibilityStatus, messages);
        }
    }
}
