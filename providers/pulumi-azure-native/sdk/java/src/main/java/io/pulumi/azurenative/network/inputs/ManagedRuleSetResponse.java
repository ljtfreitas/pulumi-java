// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ManagedRuleGroupOverrideResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a managed rule set.
 * 
 */
public final class ManagedRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRuleSetResponse Empty = new ManagedRuleSetResponse();

    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
     */
    @InputImport(name="ruleGroupOverrides")
    private final @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;

    public List<ManagedRuleGroupOverrideResponse> getRuleGroupOverrides() {
        return this.ruleGroupOverrides == null ? List.of() : this.ruleGroupOverrides;
    }

    /**
     * Defines the rule set type to use.
     * 
     */
    @InputImport(name="ruleSetType", required=true)
    private final String ruleSetType;

    public String getRuleSetType() {
        return this.ruleSetType;
    }

    /**
     * Defines the version of the rule set to use.
     * 
     */
    @InputImport(name="ruleSetVersion", required=true)
    private final String ruleSetVersion;

    public String getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public ManagedRuleSetResponse(
        @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides,
        String ruleSetType,
        String ruleSetVersion) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private ManagedRuleSetResponse() {
        this.ruleGroupOverrides = List.of();
        this.ruleSetType = null;
        this.ruleSetVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setRuleGroupOverrides(@Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }

        public ManagedRuleSetResponse build() {
            return new ManagedRuleSetResponse(ruleGroupOverrides, ruleSetType, ruleSetVersion);
        }
    }
}
