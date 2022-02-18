// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.enums.State;
import io.pulumi.azurenative.powerplatform.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption settings for a configuration store.
 * 
 */
public final class PropertiesEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PropertiesEncryptionArgs Empty = new PropertiesEncryptionArgs();

    /**
     * Key vault properties.
     * 
     */
    @InputImport(name="keyVault")
    private final @Nullable Input<KeyVaultPropertiesArgs> keyVault;

    public Input<KeyVaultPropertiesArgs> getKeyVault() {
        return this.keyVault == null ? Input.empty() : this.keyVault;
    }

    /**
     * The state of onboarding, which only appears in the response.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,State>> state;

    public Input<Either<String,State>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public PropertiesEncryptionArgs(
        @Nullable Input<KeyVaultPropertiesArgs> keyVault,
        @Nullable Input<Either<String,State>> state) {
        this.keyVault = keyVault;
        this.state = state;
    }

    private PropertiesEncryptionArgs() {
        this.keyVault = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVaultPropertiesArgs> keyVault;
        private @Nullable Input<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVault = defaults.keyVault;
    	      this.state = defaults.state;
        }

        public Builder setKeyVault(@Nullable Input<KeyVaultPropertiesArgs> keyVault) {
            this.keyVault = keyVault;
            return this;
        }

        public Builder setKeyVault(@Nullable KeyVaultPropertiesArgs keyVault) {
            this.keyVault = Input.ofNullable(keyVault);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,State>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,State> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public PropertiesEncryptionArgs build() {
            return new PropertiesEncryptionArgs(keyVault, state);
        }
    }
}
