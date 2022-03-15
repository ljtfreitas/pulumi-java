// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the VM.
 * 
 */
public final class VaultCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultCertificateResponse Empty = new VaultCertificateResponse();

    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine to which the certificate should be added. The specified certificate store is implicitly in the LocalMachine account. <br><br>For Linux VMs, the certificate file is placed under the /var/lib/waagent directory, with the file name &lt;UppercaseThumbprint&gt;.crt for the X509 certificate file and &lt;UppercaseThumbprint&gt;.prv for private key. Both of these files are .pem formatted.
     * 
     */
    @Import(name="certificateStore")
      private final @Nullable String certificateStore;

    public Optional<String> getCertificateStore() {
        return this.certificateStore == null ? Optional.empty() : Optional.ofNullable(this.certificateStore);
    }

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br> "data":"<Base64-encoded-certificate>",<br> "dataType":"pfx",<br> "password":"<pfx-file-password>"<br>} <br> To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @Import(name="certificateUrl")
      private final @Nullable String certificateUrl;

    public Optional<String> getCertificateUrl() {
        return this.certificateUrl == null ? Optional.empty() : Optional.ofNullable(this.certificateUrl);
    }

    public VaultCertificateResponse(
        @Nullable String certificateStore,
        @Nullable String certificateUrl) {
        this.certificateStore = certificateStore;
        this.certificateUrl = certificateUrl;
    }

    private VaultCertificateResponse() {
        this.certificateStore = null;
        this.certificateUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateStore;
        private @Nullable String certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder certificateStore(@Nullable String certificateStore) {
            this.certificateStore = certificateStore;
            return this;
        }

        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        public VaultCertificateResponse build() {
            return new VaultCertificateResponse(certificateStore, certificateUrl);
        }
    }
}
