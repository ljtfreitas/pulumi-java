// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.enums.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for L7 DDoS detection.
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @Import(name="ruleVisibility")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility;

    /**
     * @return Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    public Optional<Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility>> ruleVisibility() {
        return Optional.ofNullable(this.ruleVisibility);
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs() {}

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs $) {
        this.enable = $.enable;
        this.ruleVisibility = $.ruleVisibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs $;

        public Builder() {
            $ = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs();
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
            $ = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable If set to true, enables CAAP for L7 DDoS detection.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable If set to true, enables CAAP for L7 DDoS detection.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param ruleVisibility Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
         * 
         * @return builder
         * 
         */
        public Builder ruleVisibility(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility) {
            $.ruleVisibility = ruleVisibility;
            return this;
        }

        /**
         * @param ruleVisibility Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
         * 
         * @return builder
         * 
         */
        public Builder ruleVisibility(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility ruleVisibility) {
            return ruleVisibility(Output.of(ruleVisibility));
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs build() {
            return $;
        }
    }

}
