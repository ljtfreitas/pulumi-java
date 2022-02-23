// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyDimension extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyDimension Empty = new FirewallPolicyDimension();

    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public FirewallPolicyDimension(String value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FirewallPolicyDimension() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FirewallPolicyDimension build() {
            return new FirewallPolicyDimension(value);
        }
    }
}
