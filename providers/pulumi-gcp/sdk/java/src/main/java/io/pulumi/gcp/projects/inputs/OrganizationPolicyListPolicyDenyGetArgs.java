// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyDenyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyDenyGetArgs Empty = new OrganizationPolicyListPolicyDenyGetArgs();

    /**
     * The policy allows or denies all values.
     * 
     */
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> getAll() {
        return this.all == null ? Output.empty() : this.all;
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public OrganizationPolicyListPolicyDenyGetArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<String>> values) {
        this.all = all;
        this.values = values;
    }

    private OrganizationPolicyListPolicyDenyGetArgs() {
        this.all = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyListPolicyDenyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyListPolicyDenyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = Output.ofNullable(all);
            return this;
        }

        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public OrganizationPolicyListPolicyDenyGetArgs build() {
            return new OrganizationPolicyListPolicyDenyGetArgs(all, values);
        }
    }
}
