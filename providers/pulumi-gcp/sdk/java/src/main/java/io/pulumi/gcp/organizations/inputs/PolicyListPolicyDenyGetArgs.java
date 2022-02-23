// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyListPolicyDenyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyListPolicyDenyGetArgs Empty = new PolicyListPolicyDenyGetArgs();

    /**
     * The policy allows or denies all values.
     * 
     */
    @InputImport(name="all")
        private final @Nullable Input<Boolean> all;

    public Input<Boolean> getAll() {
        return this.all == null ? Input.empty() : this.all;
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @InputImport(name="values")
        private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public PolicyListPolicyDenyGetArgs(
        @Nullable Input<Boolean> all,
        @Nullable Input<List<String>> values) {
        this.all = all;
        this.values = values;
    }

    private PolicyListPolicyDenyGetArgs() {
        this.all = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyListPolicyDenyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> all;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyListPolicyDenyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder setAll(@Nullable Input<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder setAll(@Nullable Boolean all) {
            this.all = Input.ofNullable(all);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public PolicyListPolicyDenyGetArgs build() {
            return new PolicyListPolicyDenyGetArgs(all, values);
        }
    }
}
