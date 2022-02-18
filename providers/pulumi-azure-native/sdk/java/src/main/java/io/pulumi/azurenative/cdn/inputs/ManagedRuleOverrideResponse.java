// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class ManagedRuleOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRuleOverrideResponse Empty = new ManagedRuleOverrideResponse();

    /**
     * Describes the override action to be applied when rule matches.
     * 
     */
    @InputImport(name="action")
    private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable String enabledState;

    public Optional<String> getEnabledState() {
        return this.enabledState == null ? Optional.empty() : Optional.ofNullable(this.enabledState);
    }

    /**
     * Identifier for the managed rule.
     * 
     */
    @InputImport(name="ruleId", required=true)
    private final String ruleId;

    public String getRuleId() {
        return this.ruleId;
    }

    public ManagedRuleOverrideResponse(
        @Nullable String action,
        @Nullable String enabledState,
        String ruleId) {
        this.action = action;
        this.enabledState = enabledState;
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
    }

    private ManagedRuleOverrideResponse() {
        this.action = null;
        this.enabledState = null;
        this.ruleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String enabledState;
        private String ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public ManagedRuleOverrideResponse build() {
            return new ManagedRuleOverrideResponse(action, enabledState, ruleId);
        }
    }
}
