// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LeaveUntransformedResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ThrowErrorResponse;
import java.util.Objects;


/**
 * How to handle transformation errors during de-identification. A transformation error occurs when the requested transformation is incompatible with the data. For example, trying to de-identify an IP address using a `DateShift` transformation would result in a transformation error, since date info cannot be extracted from an IP address. Information about any incompatible transformations, and how they were handled, is returned in the response as part of the `TransformationOverviews`.
 * 
 */
public final class GooglePrivacyDlpV2TransformationErrorHandlingResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TransformationErrorHandlingResponse Empty = new GooglePrivacyDlpV2TransformationErrorHandlingResponse();

    /**
     * Ignore errors
     * 
     */
    @Import(name="leaveUntransformed", required=true)
      private final GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;

    public GooglePrivacyDlpV2LeaveUntransformedResponse getLeaveUntransformed() {
        return this.leaveUntransformed;
    }

    /**
     * Throw an error
     * 
     */
    @Import(name="throwError", required=true)
      private final GooglePrivacyDlpV2ThrowErrorResponse throwError;

    public GooglePrivacyDlpV2ThrowErrorResponse getThrowError() {
        return this.throwError;
    }

    public GooglePrivacyDlpV2TransformationErrorHandlingResponse(
        GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed,
        GooglePrivacyDlpV2ThrowErrorResponse throwError) {
        this.leaveUntransformed = Objects.requireNonNull(leaveUntransformed, "expected parameter 'leaveUntransformed' to be non-null");
        this.throwError = Objects.requireNonNull(throwError, "expected parameter 'throwError' to be non-null");
    }

    private GooglePrivacyDlpV2TransformationErrorHandlingResponse() {
        this.leaveUntransformed = null;
        this.throwError = null;
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
