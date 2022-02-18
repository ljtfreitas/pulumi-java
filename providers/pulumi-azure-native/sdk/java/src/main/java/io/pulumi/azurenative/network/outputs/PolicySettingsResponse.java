// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicySettingsResponse {
    /**
     * Maximum file upload size in Mb for WAF.
     * 
     */
    private final @Nullable Integer fileUploadLimitInMb;
    /**
     * Maximum request body size in Kb for WAF.
     * 
     */
    private final @Nullable Integer maxRequestBodySizeInKb;
    /**
     * The mode of the policy.
     * 
     */
    private final @Nullable String mode;
    /**
     * Whether to allow WAF to check request Body.
     * 
     */
    private final @Nullable Boolean requestBodyCheck;
    /**
     * The state of the policy.
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"fileUploadLimitInMb","maxRequestBodySizeInKb","mode","requestBodyCheck","state"})
    private PolicySettingsResponse(
        @Nullable Integer fileUploadLimitInMb,
        @Nullable Integer maxRequestBodySizeInKb,
        @Nullable String mode,
        @Nullable Boolean requestBodyCheck,
        @Nullable String state) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        this.mode = mode;
        this.requestBodyCheck = requestBodyCheck;
        this.state = state;
    }

    /**
     * Maximum file upload size in Mb for WAF.
     * 
     */
    public Optional<Integer> getFileUploadLimitInMb() {
        return Optional.ofNullable(this.fileUploadLimitInMb);
    }
    /**
     * Maximum request body size in Kb for WAF.
     * 
     */
    public Optional<Integer> getMaxRequestBodySizeInKb() {
        return Optional.ofNullable(this.maxRequestBodySizeInKb);
    }
    /**
     * The mode of the policy.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Whether to allow WAF to check request Body.
     * 
     */
    public Optional<Boolean> getRequestBodyCheck() {
        return Optional.ofNullable(this.requestBodyCheck);
    }
    /**
     * The state of the policy.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fileUploadLimitInMb;
        private @Nullable Integer maxRequestBodySizeInKb;
        private @Nullable String mode;
        private @Nullable Boolean requestBodyCheck;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUploadLimitInMb = defaults.fileUploadLimitInMb;
    	      this.maxRequestBodySizeInKb = defaults.maxRequestBodySizeInKb;
    	      this.mode = defaults.mode;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
    	      this.state = defaults.state;
        }

        public Builder setFileUploadLimitInMb(@Nullable Integer fileUploadLimitInMb) {
            this.fileUploadLimitInMb = fileUploadLimitInMb;
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Integer maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Boolean requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public PolicySettingsResponse build() {
            return new PolicySettingsResponse(fileUploadLimitInMb, maxRequestBodySizeInKb, mode, requestBodyCheck, state);
        }
    }
}
