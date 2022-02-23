// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ce;

import io.pulumi.awsnative.ce.enums.CostCategoryRuleVersion;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CostCategoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CostCategoryArgs Empty = new CostCategoryArgs();

    /**
     * The default value for the cost category
     * 
     */
    @InputImport(name="defaultValue")
        private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="ruleVersion", required=true)
        private final Input<CostCategoryRuleVersion> ruleVersion;

    public Input<CostCategoryRuleVersion> getRuleVersion() {
        return this.ruleVersion;
    }

    /**
     * JSON array format of Expression in Billing and Cost Management API
     * 
     */
    @InputImport(name="rules", required=true)
        private final Input<String> rules;

    public Input<String> getRules() {
        return this.rules;
    }

    /**
     * Json array format of CostCategorySplitChargeRule in Billing and Cost Management API
     * 
     */
    @InputImport(name="splitChargeRules")
        private final @Nullable Input<String> splitChargeRules;

    public Input<String> getSplitChargeRules() {
        return this.splitChargeRules == null ? Input.empty() : this.splitChargeRules;
    }

    public CostCategoryArgs(
        @Nullable Input<String> defaultValue,
        @Nullable Input<String> name,
        Input<CostCategoryRuleVersion> ruleVersion,
        Input<String> rules,
        @Nullable Input<String> splitChargeRules) {
        this.defaultValue = defaultValue;
        this.name = name;
        this.ruleVersion = Objects.requireNonNull(ruleVersion, "expected parameter 'ruleVersion' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.splitChargeRules = splitChargeRules;
    }

    private CostCategoryArgs() {
        this.defaultValue = Input.empty();
        this.name = Input.empty();
        this.ruleVersion = Input.empty();
        this.rules = Input.empty();
        this.splitChargeRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<String> name;
        private Input<CostCategoryRuleVersion> ruleVersion;
        private Input<String> rules;
        private @Nullable Input<String> splitChargeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(CostCategoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.name = defaults.name;
    	      this.ruleVersion = defaults.ruleVersion;
    	      this.rules = defaults.rules;
    	      this.splitChargeRules = defaults.splitChargeRules;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRuleVersion(Input<CostCategoryRuleVersion> ruleVersion) {
            this.ruleVersion = Objects.requireNonNull(ruleVersion);
            return this;
        }

        public Builder setRuleVersion(CostCategoryRuleVersion ruleVersion) {
            this.ruleVersion = Input.of(Objects.requireNonNull(ruleVersion));
            return this;
        }

        public Builder setRules(Input<String> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(String rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public Builder setSplitChargeRules(@Nullable Input<String> splitChargeRules) {
            this.splitChargeRules = splitChargeRules;
            return this;
        }

        public Builder setSplitChargeRules(@Nullable String splitChargeRules) {
            this.splitChargeRules = Input.ofNullable(splitChargeRules);
            return this;
        }
        public CostCategoryArgs build() {
            return new CostCategoryArgs(defaultValue, name, ruleVersion, rules, splitChargeRules);
        }
    }
}
