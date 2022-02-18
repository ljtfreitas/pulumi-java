// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings
 * 
 */
public final class AccountEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     * 
     */
    @InputImport(name="keySource")
    private final @Nullable Input<String> keySource;

    public Input<String> getKeySource() {
        return this.keySource == null ? Input.empty() : this.keySource;
    }

    public AccountEncryptionArgs(@Nullable Input<String> keySource) {
        this.keySource = keySource;
    }

    private AccountEncryptionArgs() {
        this.keySource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keySource;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
        }

        public Builder setKeySource(@Nullable Input<String> keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = Input.ofNullable(keySource);
            return this;
        }

        public AccountEncryptionArgs build() {
            return new AccountEncryptionArgs(keySource);
        }
    }
}
