// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.BreakOutCategoryPoliciesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Virtual Appliance Sku Properties.
 * 
 */
public final class Office365PolicyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final Office365PolicyPropertiesResponse Empty = new Office365PolicyPropertiesResponse();

    /**
     * Office 365 breakout categories.
     * 
     */
    @InputImport(name="breakOutCategories")
        private final @Nullable BreakOutCategoryPoliciesResponse breakOutCategories;

    public Optional<BreakOutCategoryPoliciesResponse> getBreakOutCategories() {
        return this.breakOutCategories == null ? Optional.empty() : Optional.ofNullable(this.breakOutCategories);
    }

    public Office365PolicyPropertiesResponse(@Nullable BreakOutCategoryPoliciesResponse breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
    }

    private Office365PolicyPropertiesResponse() {
        this.breakOutCategories = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365PolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BreakOutCategoryPoliciesResponse breakOutCategories;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365PolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.breakOutCategories = defaults.breakOutCategories;
        }

        public Builder setBreakOutCategories(@Nullable BreakOutCategoryPoliciesResponse breakOutCategories) {
            this.breakOutCategories = breakOutCategories;
            return this;
        }
        public Office365PolicyPropertiesResponse build() {
            return new Office365PolicyPropertiesResponse(breakOutCategories);
        }
    }
}
