// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Commitment for a particular license resource.
 * 
 */
public final class LicenseResourceCommitmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseResourceCommitmentArgs Empty = new LicenseResourceCommitmentArgs();

    /**
     * The number of licenses purchased.
     * 
     */
    @InputImport(name="amount")
      private final @Nullable Input<String> amount;

    public Input<String> getAmount() {
        return this.amount == null ? Input.empty() : this.amount;
    }

    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    @InputImport(name="coresPerLicense")
      private final @Nullable Input<String> coresPerLicense;

    public Input<String> getCoresPerLicense() {
        return this.coresPerLicense == null ? Input.empty() : this.coresPerLicense;
    }

    /**
     * Any applicable license URI.
     * 
     */
    @InputImport(name="license")
      private final @Nullable Input<String> license;

    public Input<String> getLicense() {
        return this.license == null ? Input.empty() : this.license;
    }

    public LicenseResourceCommitmentArgs(
        @Nullable Input<String> amount,
        @Nullable Input<String> coresPerLicense,
        @Nullable Input<String> license) {
        this.amount = amount;
        this.coresPerLicense = coresPerLicense;
        this.license = license;
    }

    private LicenseResourceCommitmentArgs() {
        this.amount = Input.empty();
        this.coresPerLicense = Input.empty();
        this.license = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> amount;
        private @Nullable Input<String> coresPerLicense;
        private @Nullable Input<String> license;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.coresPerLicense = defaults.coresPerLicense;
    	      this.license = defaults.license;
        }

        public Builder setAmount(@Nullable Input<String> amount) {
            this.amount = amount;
            return this;
        }

        public Builder setAmount(@Nullable String amount) {
            this.amount = Input.ofNullable(amount);
            return this;
        }

        public Builder setCoresPerLicense(@Nullable Input<String> coresPerLicense) {
            this.coresPerLicense = coresPerLicense;
            return this;
        }

        public Builder setCoresPerLicense(@Nullable String coresPerLicense) {
            this.coresPerLicense = Input.ofNullable(coresPerLicense);
            return this;
        }

        public Builder setLicense(@Nullable Input<String> license) {
            this.license = license;
            return this;
        }

        public Builder setLicense(@Nullable String license) {
            this.license = Input.ofNullable(license);
            return this;
        }
        public LicenseResourceCommitmentArgs build() {
            return new LicenseResourceCommitmentArgs(amount, coresPerLicense, license);
        }
    }
}
