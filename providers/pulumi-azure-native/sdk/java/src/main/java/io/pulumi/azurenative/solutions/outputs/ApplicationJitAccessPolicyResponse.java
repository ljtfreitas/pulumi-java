// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.azurenative.solutions.outputs.JitApproverDefinitionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationJitAccessPolicyResponse {
    /**
     * Whether the JIT access is enabled.
     * 
     */
    private final Boolean jitAccessEnabled;
    /**
     * JIT approval mode.
     * 
     */
    private final @Nullable String jitApprovalMode;
    /**
     * The JIT approvers
     * 
     */
    private final @Nullable List<JitApproverDefinitionResponse> jitApprovers;
    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    private final @Nullable String maximumJitAccessDuration;

    @CustomType.Constructor
    private ApplicationJitAccessPolicyResponse(
        @CustomType.Parameter("jitAccessEnabled") Boolean jitAccessEnabled,
        @CustomType.Parameter("jitApprovalMode") @Nullable String jitApprovalMode,
        @CustomType.Parameter("jitApprovers") @Nullable List<JitApproverDefinitionResponse> jitApprovers,
        @CustomType.Parameter("maximumJitAccessDuration") @Nullable String maximumJitAccessDuration) {
        this.jitAccessEnabled = jitAccessEnabled;
        this.jitApprovalMode = jitApprovalMode;
        this.jitApprovers = jitApprovers;
        this.maximumJitAccessDuration = maximumJitAccessDuration;
    }

    /**
     * Whether the JIT access is enabled.
     * 
    */
    public Boolean getJitAccessEnabled() {
        return this.jitAccessEnabled;
    }
    /**
     * JIT approval mode.
     * 
    */
    public Optional<String> getJitApprovalMode() {
        return Optional.ofNullable(this.jitApprovalMode);
    }
    /**
     * The JIT approvers
     * 
    */
    public List<JitApproverDefinitionResponse> getJitApprovers() {
        return this.jitApprovers == null ? List.of() : this.jitApprovers;
    }
    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
    */
    public Optional<String> getMaximumJitAccessDuration() {
        return Optional.ofNullable(this.maximumJitAccessDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationJitAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean jitAccessEnabled;
        private @Nullable String jitApprovalMode;
        private @Nullable List<JitApproverDefinitionResponse> jitApprovers;
        private @Nullable String maximumJitAccessDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationJitAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jitAccessEnabled = defaults.jitAccessEnabled;
    	      this.jitApprovalMode = defaults.jitApprovalMode;
    	      this.jitApprovers = defaults.jitApprovers;
    	      this.maximumJitAccessDuration = defaults.maximumJitAccessDuration;
        }

        public Builder jitAccessEnabled(Boolean jitAccessEnabled) {
            this.jitAccessEnabled = Objects.requireNonNull(jitAccessEnabled);
            return this;
        }

        public Builder jitApprovalMode(@Nullable String jitApprovalMode) {
            this.jitApprovalMode = jitApprovalMode;
            return this;
        }

        public Builder jitApprovers(@Nullable List<JitApproverDefinitionResponse> jitApprovers) {
            this.jitApprovers = jitApprovers;
            return this;
        }

        public Builder maximumJitAccessDuration(@Nullable String maximumJitAccessDuration) {
            this.maximumJitAccessDuration = maximumJitAccessDuration;
            return this;
        }
        public ApplicationJitAccessPolicyResponse build() {
            return new ApplicationJitAccessPolicyResponse(jitAccessEnabled, jitApprovalMode, jitApprovers, maximumJitAccessDuration);
        }
    }
}
