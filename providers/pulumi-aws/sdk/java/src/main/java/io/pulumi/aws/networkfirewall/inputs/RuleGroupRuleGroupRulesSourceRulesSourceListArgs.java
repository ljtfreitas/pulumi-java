// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceRulesSourceListArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceRulesSourceListArgs Empty = new RuleGroupRuleGroupRulesSourceRulesSourceListArgs();

    /**
     * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
     * 
     */
    @Import(name="generatedRulesType", required=true)
      private final Output<String> generatedRulesType;

    public Output<String> getGeneratedRulesType() {
        return this.generatedRulesType;
    }

    /**
     * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
     * 
     */
    @Import(name="targetTypes", required=true)
      private final Output<List<String>> targetTypes;

    public Output<List<String>> getTargetTypes() {
        return this.targetTypes;
    }

    /**
     * Set of domains that you want to inspect for in your traffic flows.
     * 
     */
    @Import(name="targets", required=true)
      private final Output<List<String>> targets;

    public Output<List<String>> getTargets() {
        return this.targets;
    }

    public RuleGroupRuleGroupRulesSourceRulesSourceListArgs(
        Output<String> generatedRulesType,
        Output<List<String>> targetTypes,
        Output<List<String>> targets) {
        this.generatedRulesType = Objects.requireNonNull(generatedRulesType, "expected parameter 'generatedRulesType' to be non-null");
        this.targetTypes = Objects.requireNonNull(targetTypes, "expected parameter 'targetTypes' to be non-null");
        this.targets = Objects.requireNonNull(targets, "expected parameter 'targets' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceRulesSourceListArgs() {
        this.generatedRulesType = Output.empty();
        this.targetTypes = Output.empty();
        this.targets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceRulesSourceListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> generatedRulesType;
        private Output<List<String>> targetTypes;
        private Output<List<String>> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceRulesSourceListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generatedRulesType = defaults.generatedRulesType;
    	      this.targetTypes = defaults.targetTypes;
    	      this.targets = defaults.targets;
        }

        public Builder generatedRulesType(Output<String> generatedRulesType) {
            this.generatedRulesType = Objects.requireNonNull(generatedRulesType);
            return this;
        }

        public Builder generatedRulesType(String generatedRulesType) {
            this.generatedRulesType = Output.of(Objects.requireNonNull(generatedRulesType));
            return this;
        }

        public Builder targetTypes(Output<List<String>> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }

        public Builder targetTypes(List<String> targetTypes) {
            this.targetTypes = Output.of(Objects.requireNonNull(targetTypes));
            return this;
        }

        public Builder targets(Output<List<String>> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }

        public Builder targets(List<String> targets) {
            this.targets = Output.of(Objects.requireNonNull(targets));
            return this;
        }
        public RuleGroupRuleGroupRulesSourceRulesSourceListArgs build() {
            return new RuleGroupRuleGroupRulesSourceRulesSourceListArgs(generatedRulesType, targetTypes, targets);
        }
    }
}
