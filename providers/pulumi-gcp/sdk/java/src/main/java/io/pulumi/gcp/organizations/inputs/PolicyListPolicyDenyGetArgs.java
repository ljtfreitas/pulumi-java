// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> all() {
        return this.all == null ? Codegen.empty() : this.all;
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public PolicyListPolicyDenyGetArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<String>> values) {
        this.all = all;
        this.values = values;
    }

    private PolicyListPolicyDenyGetArgs() {
        this.all = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyListPolicyDenyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyListPolicyDenyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }
        public Builder all(@Nullable Boolean all) {
            this.all = Codegen.ofNullable(all);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public PolicyListPolicyDenyGetArgs build() {
            return new PolicyListPolicyDenyGetArgs(all, values);
        }
    }
}
