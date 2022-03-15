// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The billing configuration for the tenant.
 * 
 */
public final class B2CTenantResourcePropertiesResponseBillingConfig extends io.pulumi.resources.InvokeArgs {

    public static final B2CTenantResourcePropertiesResponseBillingConfig Empty = new B2CTenantResourcePropertiesResponseBillingConfig();

    /**
     * The type of billing. Will be MAU for all new customers. If 'Auths', it can be updated to 'MAU'. Cannot be changed if value is 'MAU'. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cbilling).
     * 
     */
    @Import(name="billingType")
      private final @Nullable String billingType;

    public Optional<String> getBillingType() {
        return this.billingType == null ? Optional.empty() : Optional.ofNullable(this.billingType);
    }

    /**
     * The data from which the billing type took effect
     * 
     */
    @Import(name="effectiveStartDateUtc", required=true)
      private final String effectiveStartDateUtc;

    public String getEffectiveStartDateUtc() {
        return this.effectiveStartDateUtc;
    }

    public B2CTenantResourcePropertiesResponseBillingConfig(
        @Nullable String billingType,
        String effectiveStartDateUtc) {
        this.billingType = billingType;
        this.effectiveStartDateUtc = Objects.requireNonNull(effectiveStartDateUtc, "expected parameter 'effectiveStartDateUtc' to be non-null");
    }

    private B2CTenantResourcePropertiesResponseBillingConfig() {
        this.billingType = null;
        this.effectiveStartDateUtc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingType;
        private String effectiveStartDateUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.effectiveStartDateUtc = defaults.effectiveStartDateUtc;
        }

        public Builder billingType(@Nullable String billingType) {
            this.billingType = billingType;
            return this;
        }

        public Builder effectiveStartDateUtc(String effectiveStartDateUtc) {
            this.effectiveStartDateUtc = Objects.requireNonNull(effectiveStartDateUtc);
            return this;
        }
        public B2CTenantResourcePropertiesResponseBillingConfig build() {
            return new B2CTenantResourcePropertiesResponseBillingConfig(billingType, effectiveStartDateUtc);
        }
    }
}
