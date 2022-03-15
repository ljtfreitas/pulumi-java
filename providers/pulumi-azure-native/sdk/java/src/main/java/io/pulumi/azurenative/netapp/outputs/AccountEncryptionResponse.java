// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountEncryptionResponse {
    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     * 
     */
    private final @Nullable String keySource;

    @CustomType.Constructor
    private AccountEncryptionResponse(@CustomType.Parameter("keySource") @Nullable String keySource) {
        this.keySource = keySource;
    }

    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     * 
    */
    public Optional<String> getKeySource() {
        return Optional.ofNullable(this.keySource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
        }

        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }
        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(keySource);
        }
    }
}
