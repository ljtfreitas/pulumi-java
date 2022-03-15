// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedIssuanceModesArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyArgs Empty = new CaPoolIssuancePolicyArgs();

    /**
     * IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedIssuanceModes")
      private final @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes;

    public Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> getAllowedIssuanceModes() {
        return this.allowedIssuanceModes == null ? Output.empty() : this.allowedIssuanceModes;
    }

    /**
     * If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here.
     * Otherwise, any key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedKeyTypes")
      private final @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes;

    public Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> getAllowedKeyTypes() {
        return this.allowedKeyTypes == null ? Output.empty() : this.allowedKeyTypes;
    }

    /**
     * A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
     * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
     * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
     * issuance request will fail.
     * Structure is documented below.
     * 
     */
    @Import(name="baselineValues")
      private final @Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues;

    public Output<CaPoolIssuancePolicyBaselineValuesArgs> getBaselineValues() {
        return this.baselineValues == null ? Output.empty() : this.baselineValues;
    }

    /**
     * Describes constraints on identities that may appear in Certificates issued through this CaPool.
     * If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
     * Structure is documented below.
     * 
     */
    @Import(name="identityConstraints")
      private final @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints;

    public Output<CaPoolIssuancePolicyIdentityConstraintsArgs> getIdentityConstraints() {
        return this.identityConstraints == null ? Output.empty() : this.identityConstraints;
    }

    /**
     * The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
     * expires before a Certificate's requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    @Import(name="maximumLifetime")
      private final @Nullable Output<String> maximumLifetime;

    public Output<String> getMaximumLifetime() {
        return this.maximumLifetime == null ? Output.empty() : this.maximumLifetime;
    }

    public CaPoolIssuancePolicyArgs(
        @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes,
        @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes,
        @Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues,
        @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints,
        @Nullable Output<String> maximumLifetime) {
        this.allowedIssuanceModes = allowedIssuanceModes;
        this.allowedKeyTypes = allowedKeyTypes;
        this.baselineValues = baselineValues;
        this.identityConstraints = identityConstraints;
        this.maximumLifetime = maximumLifetime;
    }

    private CaPoolIssuancePolicyArgs() {
        this.allowedIssuanceModes = Output.empty();
        this.allowedKeyTypes = Output.empty();
        this.baselineValues = Output.empty();
        this.identityConstraints = Output.empty();
        this.maximumLifetime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes;
        private @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes;
        private @Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues;
        private @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints;
        private @Nullable Output<String> maximumLifetime;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedKeyTypes = defaults.allowedKeyTypes;
    	      this.baselineValues = defaults.baselineValues;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.maximumLifetime = defaults.maximumLifetime;
        }

        public Builder allowedIssuanceModes(@Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes) {
            this.allowedIssuanceModes = allowedIssuanceModes;
            return this;
        }

        public Builder allowedIssuanceModes(@Nullable CaPoolIssuancePolicyAllowedIssuanceModesArgs allowedIssuanceModes) {
            this.allowedIssuanceModes = Output.ofNullable(allowedIssuanceModes);
            return this;
        }

        public Builder allowedKeyTypes(@Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes) {
            this.allowedKeyTypes = allowedKeyTypes;
            return this;
        }

        public Builder allowedKeyTypes(@Nullable List<CaPoolIssuancePolicyAllowedKeyTypeArgs> allowedKeyTypes) {
            this.allowedKeyTypes = Output.ofNullable(allowedKeyTypes);
            return this;
        }

        public Builder baselineValues(@Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues) {
            this.baselineValues = baselineValues;
            return this;
        }

        public Builder baselineValues(@Nullable CaPoolIssuancePolicyBaselineValuesArgs baselineValues) {
            this.baselineValues = Output.ofNullable(baselineValues);
            return this;
        }

        public Builder identityConstraints(@Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints) {
            this.identityConstraints = identityConstraints;
            return this;
        }

        public Builder identityConstraints(@Nullable CaPoolIssuancePolicyIdentityConstraintsArgs identityConstraints) {
            this.identityConstraints = Output.ofNullable(identityConstraints);
            return this;
        }

        public Builder maximumLifetime(@Nullable Output<String> maximumLifetime) {
            this.maximumLifetime = maximumLifetime;
            return this;
        }

        public Builder maximumLifetime(@Nullable String maximumLifetime) {
            this.maximumLifetime = Output.ofNullable(maximumLifetime);
            return this;
        }
        public CaPoolIssuancePolicyArgs build() {
            return new CaPoolIssuancePolicyArgs(allowedIssuanceModes, allowedKeyTypes, baselineValues, identityConstraints, maximumLifetime);
        }
    }
}
