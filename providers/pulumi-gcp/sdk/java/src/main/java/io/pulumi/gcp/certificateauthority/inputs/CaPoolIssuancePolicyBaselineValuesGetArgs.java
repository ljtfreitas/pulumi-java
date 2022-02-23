// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyBaselineValuesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesGetArgs Empty = new CaPoolIssuancePolicyBaselineValuesGetArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="additionalExtensions")
        private final @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs>> additionalExtensions;

    public Input<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    @InputImport(name="aiaOcspServers")
        private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="caOptions", required=true)
        private final Input<CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs> caOptions;

    public Input<CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs> getCaOptions() {
        return this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="keyUsage", required=true)
        private final Input<CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs> keyUsage;

    public Input<CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs> getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @InputImport(name="policyIds")
        private final @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs>> policyIds;

    public Input<List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public CaPoolIssuancePolicyBaselineValuesGetArgs(
        @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        Input<CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs> caOptions,
        Input<CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs> keyUsage,
        @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = Objects.requireNonNull(caOptions, "expected parameter 'caOptions' to be non-null");
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private CaPoolIssuancePolicyBaselineValuesGetArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private Input<CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs> caOptions;
        private Input<CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs> keyUsage;
        private @Nullable Input<List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionGetArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(@Nullable Input<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Input.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(Input<CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs> caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }

        public Builder setCaOptions(CaPoolIssuancePolicyBaselineValuesCaOptionsGetArgs caOptions) {
            this.caOptions = Input.of(Objects.requireNonNull(caOptions));
            return this;
        }

        public Builder setKeyUsage(Input<CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setKeyUsage(CaPoolIssuancePolicyBaselineValuesKeyUsageGetArgs keyUsage) {
            this.keyUsage = Input.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyIdGetArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }
        public CaPoolIssuancePolicyBaselineValuesGetArgs build() {
            return new CaPoolIssuancePolicyBaselineValuesGetArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
