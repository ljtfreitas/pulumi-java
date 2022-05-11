// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamedValueValueFromKeyVaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedValueValueFromKeyVaultArgs Empty = new NamedValueValueFromKeyVaultArgs();

    /**
     * The client ID of User Assigned Identity, for the API Management Service, which will be used to access the key vault secret. The System Assigned Identity will be used in absence.
     * 
     */
    @Import(name="identityClientId")
    private @Nullable Output<String> identityClientId;

    /**
     * @return The client ID of User Assigned Identity, for the API Management Service, which will be used to access the key vault secret. The System Assigned Identity will be used in absence.
     * 
     */
    public Optional<Output<String>> identityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }

    /**
     * The resource ID of the Key Vault Secret.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return The resource ID of the Key Vault Secret.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    private NamedValueValueFromKeyVaultArgs() {}

    private NamedValueValueFromKeyVaultArgs(NamedValueValueFromKeyVaultArgs $) {
        this.identityClientId = $.identityClientId;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedValueValueFromKeyVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedValueValueFromKeyVaultArgs $;

        public Builder() {
            $ = new NamedValueValueFromKeyVaultArgs();
        }

        public Builder(NamedValueValueFromKeyVaultArgs defaults) {
            $ = new NamedValueValueFromKeyVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityClientId The client ID of User Assigned Identity, for the API Management Service, which will be used to access the key vault secret. The System Assigned Identity will be used in absence.
         * 
         * @return builder
         * 
         */
        public Builder identityClientId(@Nullable Output<String> identityClientId) {
            $.identityClientId = identityClientId;
            return this;
        }

        /**
         * @param identityClientId The client ID of User Assigned Identity, for the API Management Service, which will be used to access the key vault secret. The System Assigned Identity will be used in absence.
         * 
         * @return builder
         * 
         */
        public Builder identityClientId(String identityClientId) {
            return identityClientId(Output.of(identityClientId));
        }

        /**
         * @param secretId The resource ID of the Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId The resource ID of the Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public NamedValueValueFromKeyVaultArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
