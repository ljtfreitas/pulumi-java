// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetOrganizationPolicyListPolicyDeny extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyListPolicyDeny Empty = new GetOrganizationPolicyListPolicyDeny();

    @Import(name="all", required=true)
      private final Boolean all;

    public Boolean all() {
        return this.all;
    }

    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> values() {
        return this.values;
    }

    public GetOrganizationPolicyListPolicyDeny(
        Boolean all,
        List<String> values) {
        this.all = Objects.requireNonNull(all, "expected parameter 'all' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetOrganizationPolicyListPolicyDeny() {
        this.all = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicyDeny defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyListPolicyDeny defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder all(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetOrganizationPolicyListPolicyDeny build() {
            return new GetOrganizationPolicyListPolicyDeny(all, values);
        }
    }
}
