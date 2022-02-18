// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.CustomRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines contents of custom rules
 * 
 */
public final class CustomRuleListArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRuleListArgs Empty = new CustomRuleListArgs();

    /**
     * List of rules
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<CustomRuleArgs>> rules;

    public Input<List<CustomRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public CustomRuleListArgs(@Nullable Input<List<CustomRuleArgs>> rules) {
        this.rules = rules;
    }

    private CustomRuleListArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable Input<List<CustomRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<CustomRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public CustomRuleListArgs build() {
            return new CustomRuleListArgs(rules);
        }
    }
}
