// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Symmetric key for authentication.
 * 
 */
public final class SymmetricKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SymmetricKeyArgs Empty = new SymmetricKeyArgs();

    /**
     * Connection string based on the symmetric key.
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable Input<AsymmetricEncryptedSecretArgs> connectionString;

    public Input<AsymmetricEncryptedSecretArgs> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    public SymmetricKeyArgs(@Nullable Input<AsymmetricEncryptedSecretArgs> connectionString) {
        this.connectionString = connectionString;
    }

    private SymmetricKeyArgs() {
        this.connectionString = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SymmetricKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AsymmetricEncryptedSecretArgs> connectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(SymmetricKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
        }

        public Builder setConnectionString(@Nullable Input<AsymmetricEncryptedSecretArgs> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable AsymmetricEncryptedSecretArgs connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public SymmetricKeyArgs build() {
            return new SymmetricKeyArgs(connectionString);
        }
    }
}
