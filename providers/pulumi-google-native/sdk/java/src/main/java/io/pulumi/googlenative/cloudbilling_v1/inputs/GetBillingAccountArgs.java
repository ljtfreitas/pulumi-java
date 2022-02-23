// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBillingAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountArgs Empty = new GetBillingAccountArgs();

    @InputImport(name="billingAccountId", required=true)
      private final String billingAccountId;

    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    public GetBillingAccountArgs(String billingAccountId) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
    }

    private GetBillingAccountArgs() {
        this.billingAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
        }

        public Builder setBillingAccountId(String billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public GetBillingAccountArgs build() {
            return new GetBillingAccountArgs(billingAccountId);
        }
    }
}
