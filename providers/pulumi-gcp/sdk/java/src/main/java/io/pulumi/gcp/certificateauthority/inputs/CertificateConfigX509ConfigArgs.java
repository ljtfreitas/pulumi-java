// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;

    public Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Output.empty() : this.additionalExtensions;
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
      private final @Nullable Output<List<String>> aiaOcspServers;

    public Output<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Output.empty() : this.aiaOcspServers;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions")
      private final @Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions;

    public Output<CertificateConfigX509ConfigCaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Output.empty() : this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsage", required=true)
      private final Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage;

    public Output<CertificateConfigX509ConfigKeyUsageArgs> getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
      private final @Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds;

    public Output<List<CertificateConfigX509ConfigPolicyIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Output.empty() : this.policyIds;
    }

    public CertificateConfigX509ConfigArgs(
        @Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Output<List<String>> aiaOcspServers,
        @Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions,
        Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage,
        @Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private CertificateConfigX509ConfigArgs() {
        this.additionalExtensions = Output.empty();
        this.aiaOcspServers = Output.empty();
        this.caOptions = Output.empty();
        this.keyUsage = Output.empty();
        this.policyIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Output<List<String>> aiaOcspServers;
        private @Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions;
        private Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage;
        private @Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds;

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

        public Builder additionalExtensions(@Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder additionalExtensions(@Nullable List<CertificateConfigX509ConfigAdditionalExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Output.ofNullable(additionalExtensions);
            return this;
        }

        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Output.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder caOptions(@Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }

        public Builder caOptions(@Nullable CertificateConfigX509ConfigCaOptionsArgs caOptions) {
            this.caOptions = Output.ofNullable(caOptions);
            return this;
        }

        public Builder keyUsage(Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder keyUsage(CertificateConfigX509ConfigKeyUsageArgs keyUsage) {
            this.keyUsage = Output.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder policyIds(@Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder policyIds(@Nullable List<CertificateConfigX509ConfigPolicyIdArgs> policyIds) {
            this.policyIds = Output.ofNullable(policyIds);
            return this;
        }
        public CertificateConfigX509ConfigArgs build() {
            return new CertificateConfigX509ConfigArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
