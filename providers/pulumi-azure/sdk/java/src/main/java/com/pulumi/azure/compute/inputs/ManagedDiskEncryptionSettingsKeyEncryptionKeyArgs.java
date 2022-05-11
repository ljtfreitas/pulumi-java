// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs Empty = new ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs();

    /**
     * The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
     * 
     */
    @Import(name="keyUrl", required=true)
    private Output<String> keyUrl;

    /**
     * @return The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
     * 
     */
    public Output<String> keyUrl() {
        return this.keyUrl;
    }

    /**
     * The ID of the source Key Vault.
     * 
     */
    @Import(name="sourceVaultId", required=true)
    private Output<String> sourceVaultId;

    /**
     * @return The ID of the source Key Vault.
     * 
     */
    public Output<String> sourceVaultId() {
        return this.sourceVaultId;
    }

    private ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs() {}

    private ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs(ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs $) {
        this.keyUrl = $.keyUrl;
        this.sourceVaultId = $.sourceVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs $;

        public Builder() {
            $ = new ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs();
        }

        public Builder(ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs defaults) {
            $ = new ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyUrl The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
         * 
         * @return builder
         * 
         */
        public Builder keyUrl(Output<String> keyUrl) {
            $.keyUrl = keyUrl;
            return this;
        }

        /**
         * @param keyUrl The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
         * 
         * @return builder
         * 
         */
        public Builder keyUrl(String keyUrl) {
            return keyUrl(Output.of(keyUrl));
        }

        /**
         * @param sourceVaultId The ID of the source Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder sourceVaultId(Output<String> sourceVaultId) {
            $.sourceVaultId = sourceVaultId;
            return this;
        }

        /**
         * @param sourceVaultId The ID of the source Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder sourceVaultId(String sourceVaultId) {
            return sourceVaultId(Output.of(sourceVaultId));
        }

        public ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs build() {
            $.keyUrl = Objects.requireNonNull($.keyUrl, "expected parameter 'keyUrl' to be non-null");
            $.sourceVaultId = Objects.requireNonNull($.sourceVaultId, "expected parameter 'sourceVaultId' to be non-null");
            return $;
        }
    }

}
