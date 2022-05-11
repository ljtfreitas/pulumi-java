// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.billing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMcaAccountScopeResult {
    private final String billingAccountName;
    private final String billingProfileName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String invoiceSectionName;

    @CustomType.Constructor
    private GetMcaAccountScopeResult(
        @CustomType.Parameter("billingAccountName") String billingAccountName,
        @CustomType.Parameter("billingProfileName") String billingProfileName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("invoiceSectionName") String invoiceSectionName) {
        this.billingAccountName = billingAccountName;
        this.billingProfileName = billingProfileName;
        this.id = id;
        this.invoiceSectionName = invoiceSectionName;
    }

    public String billingAccountName() {
        return this.billingAccountName;
    }
    public String billingProfileName() {
        return this.billingProfileName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String invoiceSectionName() {
        return this.invoiceSectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMcaAccountScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountName;
        private String billingProfileName;
        private String id;
        private String invoiceSectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMcaAccountScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountName = defaults.billingAccountName;
    	      this.billingProfileName = defaults.billingProfileName;
    	      this.id = defaults.id;
    	      this.invoiceSectionName = defaults.invoiceSectionName;
        }

        public Builder billingAccountName(String billingAccountName) {
            this.billingAccountName = Objects.requireNonNull(billingAccountName);
            return this;
        }
        public Builder billingProfileName(String billingProfileName) {
            this.billingProfileName = Objects.requireNonNull(billingProfileName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder invoiceSectionName(String invoiceSectionName) {
            this.invoiceSectionName = Objects.requireNonNull(invoiceSectionName);
            return this;
        }        public GetMcaAccountScopeResult build() {
            return new GetMcaAccountScopeResult(billingAccountName, billingProfileName, id, invoiceSectionName);
        }
    }
}
