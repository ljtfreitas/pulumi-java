// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.KeyPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * Uri of KeyVault
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Identity of the secret that includes name and version.
     * 
     */
    @InputImport(name="key")
        private final @Nullable Input<KeyPropertiesArgs> key;

    public Input<KeyPropertiesArgs> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Input<String> id,
        @Nullable Input<KeyPropertiesArgs> key) {
        this.id = id;
        this.key = key;
    }

    private KeyVaultPropertiesArgs() {
        this.id = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<KeyPropertiesArgs> key;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKey(@Nullable Input<KeyPropertiesArgs> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable KeyPropertiesArgs key) {
            this.key = Input.ofNullable(key);
            return this;
        }
        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(id, key);
        }
    }
}
