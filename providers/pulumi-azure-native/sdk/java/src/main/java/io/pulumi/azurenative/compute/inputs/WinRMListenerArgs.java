// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.ProtocolTypes;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes Protocol and thumbprint of Windows Remote Management listener
 * 
 */
public final class WinRMListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final WinRMListenerArgs Empty = new WinRMListenerArgs();

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br> "data":"<Base64-encoded-certificate>",<br> "dataType":"pfx",<br> "password":"<pfx-file-password>"<br>} <br> To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @InputImport(name="certificateUrl")
        private final @Nullable Input<String> certificateUrl;

    public Input<String> getCertificateUrl() {
        return this.certificateUrl == null ? Input.empty() : this.certificateUrl;
    }

    /**
     * Specifies the protocol of WinRM listener. <br><br> Possible values are: <br>**http** <br><br> **https**
     * 
     */
    @InputImport(name="protocol")
        private final @Nullable Input<ProtocolTypes> protocol;

    public Input<ProtocolTypes> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public WinRMListenerArgs(
        @Nullable Input<String> certificateUrl,
        @Nullable Input<ProtocolTypes> protocol) {
        this.certificateUrl = certificateUrl;
        this.protocol = protocol;
    }

    private WinRMListenerArgs() {
        this.certificateUrl = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WinRMListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateUrl;
        private @Nullable Input<ProtocolTypes> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(WinRMListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.protocol = defaults.protocol;
        }

        public Builder setCertificateUrl(@Nullable Input<String> certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }

        public Builder setCertificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = Input.ofNullable(certificateUrl);
            return this;
        }

        public Builder setProtocol(@Nullable Input<ProtocolTypes> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable ProtocolTypes protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public WinRMListenerArgs build() {
            return new WinRMListenerArgs(certificateUrl, protocol);
        }
    }
}
