// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.enums.DatabaseEncryptionState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of etcd encryption.
 * 
 */
public final class DatabaseEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionArgs Empty = new DatabaseEncryptionArgs();

    /**
     * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * Denotes the state of etcd encryption.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<DatabaseEncryptionState> state;

    public Input<DatabaseEncryptionState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public DatabaseEncryptionArgs(
        @Nullable Input<String> keyName,
        @Nullable Input<DatabaseEncryptionState> state) {
        this.keyName = keyName;
        this.state = state;
    }

    private DatabaseEncryptionArgs() {
        this.keyName = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private @Nullable Input<DatabaseEncryptionState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setState(@Nullable Input<DatabaseEncryptionState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable DatabaseEncryptionState state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public DatabaseEncryptionArgs build() {
            return new DatabaseEncryptionArgs(keyName, state);
        }
    }
}
