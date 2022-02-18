// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The B2B partner content.
 * 
 */
public final class B2BPartnerContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final B2BPartnerContentArgs Empty = new B2BPartnerContentArgs();

    /**
     * The list of partner business identities.
     * 
     */
    @InputImport(name="businessIdentities")
    private final @Nullable Input<List<BusinessIdentityArgs>> businessIdentities;

    public Input<List<BusinessIdentityArgs>> getBusinessIdentities() {
        return this.businessIdentities == null ? Input.empty() : this.businessIdentities;
    }

    public B2BPartnerContentArgs(@Nullable Input<List<BusinessIdentityArgs>> businessIdentities) {
        this.businessIdentities = businessIdentities;
    }

    private B2BPartnerContentArgs() {
        this.businessIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2BPartnerContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BusinessIdentityArgs>> businessIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(B2BPartnerContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.businessIdentities = defaults.businessIdentities;
        }

        public Builder setBusinessIdentities(@Nullable Input<List<BusinessIdentityArgs>> businessIdentities) {
            this.businessIdentities = businessIdentities;
            return this;
        }

        public Builder setBusinessIdentities(@Nullable List<BusinessIdentityArgs> businessIdentities) {
            this.businessIdentities = Input.ofNullable(businessIdentities);
            return this;
        }

        public B2BPartnerContentArgs build() {
            return new B2BPartnerContentArgs(businessIdentities);
        }
    }
}
