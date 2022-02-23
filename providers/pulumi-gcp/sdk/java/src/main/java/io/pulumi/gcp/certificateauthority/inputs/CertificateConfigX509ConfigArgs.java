// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigCaOptionsArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigArgs Empty = new CertificateConfigX509ConfigArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="additionalExtensions")
        private final @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;

    public Input<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> getAdditionalExtensions() {
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
    @InputImport(name="caOptions")
        private final @Nullable Input<CertificateConfigX509ConfigCaOptionsArgs> caOptions;

    public Input<CertificateConfigX509ConfigCaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Input.empty() : this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="keyUsage", required=true)
        private final Input<CertificateConfigX509ConfigKeyUsageArgs> keyUsage;

    public Input<CertificateConfigX509ConfigKeyUsageArgs> getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @InputImport(name="policyIds")
        private final @Nullable Input<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds;

    public Input<List<CertificateConfigX509ConfigPolicyIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public CertificateConfigX509ConfigArgs(
        @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        @Nullable Input<CertificateConfigX509ConfigCaOptionsArgs> caOptions,
        Input<CertificateConfigX509ConfigKeyUsageArgs> keyUsage,
        @Nullable Input<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private CertificateConfigX509ConfigArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private @Nullable Input<CertificateConfigX509ConfigCaOptionsArgs> caOptions;
        private Input<CertificateConfigX509ConfigKeyUsageArgs> keyUsage;
        private @Nullable Input<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<CertificateConfigX509ConfigAdditionalExtensionArgs> additionalExtensions) {
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

        public Builder setCaOptions(@Nullable Input<CertificateConfigX509ConfigCaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }

        public Builder setCaOptions(@Nullable CertificateConfigX509ConfigCaOptionsArgs caOptions) {
            this.caOptions = Input.ofNullable(caOptions);
            return this;
        }

        public Builder setKeyUsage(Input<CertificateConfigX509ConfigKeyUsageArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setKeyUsage(CertificateConfigX509ConfigKeyUsageArgs keyUsage) {
            this.keyUsage = Input.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<CertificateConfigX509ConfigPolicyIdArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }
        public CertificateConfigX509ConfigArgs build() {
            return new CertificateConfigX509ConfigArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
