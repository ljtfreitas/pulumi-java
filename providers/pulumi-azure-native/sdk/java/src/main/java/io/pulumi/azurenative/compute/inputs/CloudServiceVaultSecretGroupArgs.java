// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultCertificateArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a set of certificates which are all in the same Key Vault.
 * 
 */
public final class CloudServiceVaultSecretGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceVaultSecretGroupArgs Empty = new CloudServiceVaultSecretGroupArgs();

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    @Import(name="sourceVault")
      private final @Nullable Output<SubResourceArgs> sourceVault;

    public Output<SubResourceArgs> getSourceVault() {
        return this.sourceVault == null ? Output.empty() : this.sourceVault;
    }

    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    @Import(name="vaultCertificates")
      private final @Nullable Output<List<CloudServiceVaultCertificateArgs>> vaultCertificates;

    public Output<List<CloudServiceVaultCertificateArgs>> getVaultCertificates() {
        return this.vaultCertificates == null ? Output.empty() : this.vaultCertificates;
    }

    public CloudServiceVaultSecretGroupArgs(
        @Nullable Output<SubResourceArgs> sourceVault,
        @Nullable Output<List<CloudServiceVaultCertificateArgs>> vaultCertificates) {
        this.sourceVault = sourceVault;
        this.vaultCertificates = vaultCertificates;
    }

    private CloudServiceVaultSecretGroupArgs() {
        this.sourceVault = Output.empty();
        this.vaultCertificates = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultSecretGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubResourceArgs> sourceVault;
        private @Nullable Output<List<CloudServiceVaultCertificateArgs>> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultSecretGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder sourceVault(@Nullable Output<SubResourceArgs> sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public Builder sourceVault(@Nullable SubResourceArgs sourceVault) {
            this.sourceVault = Output.ofNullable(sourceVault);
            return this;
        }

        public Builder vaultCertificates(@Nullable Output<List<CloudServiceVaultCertificateArgs>> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }

        public Builder vaultCertificates(@Nullable List<CloudServiceVaultCertificateArgs> vaultCertificates) {
            this.vaultCertificates = Output.ofNullable(vaultCertificates);
            return this;
        }
        public CloudServiceVaultSecretGroupArgs build() {
            return new CloudServiceVaultSecretGroupArgs(sourceVault, vaultCertificates);
        }
    }
}
