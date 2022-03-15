// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LeaveUntransformedResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ThrowErrorResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2TransformationErrorHandlingResponse {
    /**
     * Ignore errors
     * 
     */
    private final GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;
    /**
     * Throw an error
     * 
     */
    private final GooglePrivacyDlpV2ThrowErrorResponse throwError;

    @CustomType.Constructor
    private GooglePrivacyDlpV2TransformationErrorHandlingResponse(
        @CustomType.Parameter("leaveUntransformed") GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed,
        @CustomType.Parameter("throwError") GooglePrivacyDlpV2ThrowErrorResponse throwError) {
        this.leaveUntransformed = leaveUntransformed;
        this.throwError = throwError;
    }

    /**
     * Ignore errors
     * 
    */
    public GooglePrivacyDlpV2LeaveUntransformedResponse getLeaveUntransformed() {
        return this.leaveUntransformed;
    }
    /**
     * Throw an error
     * 
    */
    public GooglePrivacyDlpV2ThrowErrorResponse getThrowError() {
        return this.throwError;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;
        private GooglePrivacyDlpV2ThrowErrorResponse throwError;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leaveUntransformed = defaults.leaveUntransformed;
    	      this.throwError = defaults.throwError;
        }

        public Builder leaveUntransformed(GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed) {
            this.leaveUntransformed = Objects.requireNonNull(leaveUntransformed);
            return this;
        }

        public Builder throwError(GooglePrivacyDlpV2ThrowErrorResponse throwError) {
            this.throwError = Objects.requireNonNull(throwError);
            return this;
        }
        public GooglePrivacyDlpV2TransformationErrorHandlingResponse build() {
            return new GooglePrivacyDlpV2TransformationErrorHandlingResponse(leaveUntransformed, throwError);
        }
    }
}
