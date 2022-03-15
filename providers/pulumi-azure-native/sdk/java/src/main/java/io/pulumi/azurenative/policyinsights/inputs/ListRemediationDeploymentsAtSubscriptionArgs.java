// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListRemediationDeploymentsAtSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListRemediationDeploymentsAtSubscriptionArgs Empty = new ListRemediationDeploymentsAtSubscriptionArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
      private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    /**
     * Maximum number of records to return.
     * 
     */
    @Import(name="top")
      private final @Nullable Integer top;

    public Optional<Integer> getTop() {
        return this.top == null ? Optional.empty() : Optional.ofNullable(this.top);
    }

    public ListRemediationDeploymentsAtSubscriptionArgs(
        String remediationName,
        @Nullable Integer top) {
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
        this.top = top;
    }

    private ListRemediationDeploymentsAtSubscriptionArgs() {
        this.remediationName = null;
        this.top = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRemediationDeploymentsAtSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String remediationName;
        private @Nullable Integer top;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRemediationDeploymentsAtSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remediationName = defaults.remediationName;
    	      this.top = defaults.top;
        }

        public Builder remediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }

        public Builder top(@Nullable Integer top) {
            this.top = top;
            return this;
        }
        public ListRemediationDeploymentsAtSubscriptionArgs build() {
            return new ListRemediationDeploymentsAtSubscriptionArgs(remediationName, top);
        }
    }
}
