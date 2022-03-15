// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.KeyPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Identity of the secret that includes name and version.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<KeyPropertiesArgs> key;

    public Output<KeyPropertiesArgs> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Output<String> id,
        @Nullable Output<KeyPropertiesArgs> key) {
        this.id = id;
        this.key = key;
    }

    private KeyVaultPropertiesArgs() {
        this.id = Output.empty();
        this.key = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<KeyPropertiesArgs> key;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder key(@Nullable Output<KeyPropertiesArgs> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable KeyPropertiesArgs key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(id, key);
        }
    }
}
