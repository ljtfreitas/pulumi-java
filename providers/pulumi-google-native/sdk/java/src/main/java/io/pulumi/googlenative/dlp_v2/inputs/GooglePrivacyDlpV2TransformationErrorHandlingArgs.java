// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LeaveUntransformedArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ThrowErrorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * How to handle transformation errors during de-identification. A transformation error occurs when the requested transformation is incompatible with the data. For example, trying to de-identify an IP address using a `DateShift` transformation would result in a transformation error, since date info cannot be extracted from an IP address. Information about any incompatible transformations, and how they were handled, is returned in the response as part of the `TransformationOverviews`.
 * 
 */
public final class GooglePrivacyDlpV2TransformationErrorHandlingArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TransformationErrorHandlingArgs Empty = new GooglePrivacyDlpV2TransformationErrorHandlingArgs();

    /**
     * Ignore errors
     * 
     */
    @InputImport(name="leaveUntransformed")
      private final @Nullable Input<GooglePrivacyDlpV2LeaveUntransformedArgs> leaveUntransformed;

    public Input<GooglePrivacyDlpV2LeaveUntransformedArgs> getLeaveUntransformed() {
        return this.leaveUntransformed == null ? Input.empty() : this.leaveUntransformed;
    }

    /**
     * Throw an error
     * 
     */
    @InputImport(name="throwError")
      private final @Nullable Input<GooglePrivacyDlpV2ThrowErrorArgs> throwError;

    public Input<GooglePrivacyDlpV2ThrowErrorArgs> getThrowError() {
        return this.throwError == null ? Input.empty() : this.throwError;
    }

    public GooglePrivacyDlpV2TransformationErrorHandlingArgs(
        @Nullable Input<GooglePrivacyDlpV2LeaveUntransformedArgs> leaveUntransformed,
        @Nullable Input<GooglePrivacyDlpV2ThrowErrorArgs> throwError) {
        this.leaveUntransformed = leaveUntransformed;
        this.throwError = throwError;
    }

    private GooglePrivacyDlpV2TransformationErrorHandlingArgs() {
        this.leaveUntransformed = Input.empty();
        this.throwError = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TransformationErrorHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2LeaveUntransformedArgs> leaveUntransformed;
        private @Nullable Input<GooglePrivacyDlpV2ThrowErrorArgs> throwError;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TransformationErrorHandlingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leaveUntransformed = defaults.leaveUntransformed;
    	      this.throwError = defaults.throwError;
        }

        public Builder setLeaveUntransformed(@Nullable Input<GooglePrivacyDlpV2LeaveUntransformedArgs> leaveUntransformed) {
            this.leaveUntransformed = leaveUntransformed;
            return this;
        }

        public Builder setLeaveUntransformed(@Nullable GooglePrivacyDlpV2LeaveUntransformedArgs leaveUntransformed) {
            this.leaveUntransformed = Input.ofNullable(leaveUntransformed);
            return this;
        }

        public Builder setThrowError(@Nullable Input<GooglePrivacyDlpV2ThrowErrorArgs> throwError) {
            this.throwError = throwError;
            return this;
        }

        public Builder setThrowError(@Nullable GooglePrivacyDlpV2ThrowErrorArgs throwError) {
            this.throwError = Input.ofNullable(throwError);
            return this;
        }
        public GooglePrivacyDlpV2TransformationErrorHandlingArgs build() {
            return new GooglePrivacyDlpV2TransformationErrorHandlingArgs(leaveUntransformed, throwError);
        }
    }
}
