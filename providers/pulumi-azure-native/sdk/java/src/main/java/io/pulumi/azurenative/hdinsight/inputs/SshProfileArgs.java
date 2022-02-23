// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.SshPublicKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The list of SSH public keys.
 * 
 */
public final class SshProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshProfileArgs Empty = new SshProfileArgs();

    /**
     * The list of SSH public keys.
     * 
     */
    @InputImport(name="publicKeys")
        private final @Nullable Input<List<SshPublicKeyArgs>> publicKeys;

    public Input<List<SshPublicKeyArgs>> getPublicKeys() {
        return this.publicKeys == null ? Input.empty() : this.publicKeys;
    }

    public SshProfileArgs(@Nullable Input<List<SshPublicKeyArgs>> publicKeys) {
        this.publicKeys = publicKeys;
    }

    private SshProfileArgs() {
        this.publicKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SshPublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(SshProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder setPublicKeys(@Nullable Input<List<SshPublicKeyArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        public Builder setPublicKeys(@Nullable List<SshPublicKeyArgs> publicKeys) {
            this.publicKeys = Input.ofNullable(publicKeys);
            return this;
        }
        public SshProfileArgs build() {
            return new SshProfileArgs(publicKeys);
        }
    }
}
