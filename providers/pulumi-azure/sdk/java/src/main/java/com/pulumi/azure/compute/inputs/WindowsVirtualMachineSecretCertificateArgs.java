// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WindowsVirtualMachineSecretCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineSecretCertificateArgs Empty = new WindowsVirtualMachineSecretCertificateArgs();

    /**
     * The certificate store on the Virtual Machine where the certificate should be added.
     * 
     */
    @Import(name="store", required=true)
    private Output<String> store;

    /**
     * @return The certificate store on the Virtual Machine where the certificate should be added.
     * 
     */
    public Output<String> store() {
        return this.store;
    }

    /**
     * The Secret URL of a Key Vault Certificate.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The Secret URL of a Key Vault Certificate.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private WindowsVirtualMachineSecretCertificateArgs() {}

    private WindowsVirtualMachineSecretCertificateArgs(WindowsVirtualMachineSecretCertificateArgs $) {
        this.store = $.store;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineSecretCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineSecretCertificateArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineSecretCertificateArgs();
        }

        public Builder(WindowsVirtualMachineSecretCertificateArgs defaults) {
            $ = new WindowsVirtualMachineSecretCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param store The certificate store on the Virtual Machine where the certificate should be added.
         * 
         * @return builder
         * 
         */
        public Builder store(Output<String> store) {
            $.store = store;
            return this;
        }

        /**
         * @param store The certificate store on the Virtual Machine where the certificate should be added.
         * 
         * @return builder
         * 
         */
        public Builder store(String store) {
            return store(Output.of(store));
        }

        /**
         * @param url The Secret URL of a Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Secret URL of a Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WindowsVirtualMachineSecretCertificateArgs build() {
            $.store = Objects.requireNonNull($.store, "expected parameter 'store' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
