// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBillingAccountSinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountSinkArgs Empty = new GetBillingAccountSinkArgs();

    @InputImport(name="billingAccountId", required=true)
      private final String billingAccountId;

    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    @InputImport(name="sinkId", required=true)
      private final String sinkId;

    public String getSinkId() {
        return this.sinkId;
    }

    public GetBillingAccountSinkArgs(
        String billingAccountId,
        String sinkId) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.sinkId = Objects.requireNonNull(sinkId, "expected parameter 'sinkId' to be non-null");
    }

    private GetBillingAccountSinkArgs() {
        this.billingAccountId = null;
        this.sinkId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingAccountSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountId;
        private String sinkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingAccountSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.sinkId = defaults.sinkId;
        }

        public Builder setBillingAccountId(String billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder setSinkId(String sinkId) {
            this.sinkId = Objects.requireNonNull(sinkId);
            return this;
        }
        public GetBillingAccountSinkArgs build() {
            return new GetBillingAccountSinkArgs(billingAccountId, sinkId);
        }
    }
}
