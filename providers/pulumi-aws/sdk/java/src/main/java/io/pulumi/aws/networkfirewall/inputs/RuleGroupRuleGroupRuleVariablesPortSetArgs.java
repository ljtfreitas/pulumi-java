// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesPortSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesPortSetArgs Empty = new RuleGroupRuleGroupRuleVariablesPortSetArgs();

    /**
     * An unique alphanumeric string to identify the `port_set`.
     * 
     */
    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * A configuration block that defines a set of port ranges. See Port Set below for details.
     * 
     */
    @InputImport(name="portSet", required=true)
    private final Input<RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs> portSet;

    public Input<RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs> getPortSet() {
        return this.portSet;
    }

    public RuleGroupRuleGroupRuleVariablesPortSetArgs(
        Input<String> key,
        Input<RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs> portSet) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.portSet = Objects.requireNonNull(portSet, "expected parameter 'portSet' to be non-null");
    }

    private RuleGroupRuleGroupRuleVariablesPortSetArgs() {
        this.key = Input.empty();
        this.portSet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesPortSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs> portSet;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesPortSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.portSet = defaults.portSet;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setPortSet(Input<RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs> portSet) {
            this.portSet = Objects.requireNonNull(portSet);
            return this;
        }

        public Builder setPortSet(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs portSet) {
            this.portSet = Input.of(Objects.requireNonNull(portSet));
            return this;
        }
        public RuleGroupRuleGroupRuleVariablesPortSetArgs build() {
            return new RuleGroupRuleGroupRuleVariablesPortSetArgs(key, portSet);
        }
    }
}
