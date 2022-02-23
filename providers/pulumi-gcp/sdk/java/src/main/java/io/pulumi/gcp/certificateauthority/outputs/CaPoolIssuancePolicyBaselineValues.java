// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtension;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyBaselineValuesCaOptions;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyBaselineValuesKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyBaselineValuesPolicyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIssuancePolicyBaselineValues {
    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtension> additionalExtensions;
    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    private final @Nullable List<String> aiaOcspServers;
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private final CaPoolIssuancePolicyBaselineValuesCaOptions caOptions;
    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private final CaPoolIssuancePolicyBaselineValuesKeyUsage keyUsage;
    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyId> policyIds;

    @OutputCustomType.Constructor({"additionalExtensions","aiaOcspServers","caOptions","keyUsage","policyIds"})
    private CaPoolIssuancePolicyBaselineValues(
        @Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtension> additionalExtensions,
        @Nullable List<String> aiaOcspServers,
        CaPoolIssuancePolicyBaselineValuesCaOptions caOptions,
        CaPoolIssuancePolicyBaselineValuesKeyUsage keyUsage,
        @Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyId> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = Objects.requireNonNull(caOptions);
        this.keyUsage = Objects.requireNonNull(keyUsage);
        this.policyIds = policyIds;
    }

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    public List<CaPoolIssuancePolicyBaselineValuesAdditionalExtension> getAdditionalExtensions() {
        return this.additionalExtensions == null ? List.of() : this.additionalExtensions;
    }
    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    public List<String> getAiaOcspServers() {
        return this.aiaOcspServers == null ? List.of() : this.aiaOcspServers;
    }
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public CaPoolIssuancePolicyBaselineValuesCaOptions getCaOptions() {
        return this.caOptions;
    }
    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public CaPoolIssuancePolicyBaselineValuesKeyUsage getKeyUsage() {
        return this.keyUsage;
    }
    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public List<CaPoolIssuancePolicyBaselineValuesPolicyId> getPolicyIds() {
        return this.policyIds == null ? List.of() : this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtension> additionalExtensions;
        private @Nullable List<String> aiaOcspServers;
        private CaPoolIssuancePolicyBaselineValuesCaOptions caOptions;
        private CaPoolIssuancePolicyBaselineValuesKeyUsage keyUsage;
        private @Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyId> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtension> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setCaOptions(CaPoolIssuancePolicyBaselineValuesCaOptions caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }

        public Builder setKeyUsage(CaPoolIssuancePolicyBaselineValuesKeyUsage keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setPolicyIds(@Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyId> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public CaPoolIssuancePolicyBaselineValues build() {
            return new CaPoolIssuancePolicyBaselineValues(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
