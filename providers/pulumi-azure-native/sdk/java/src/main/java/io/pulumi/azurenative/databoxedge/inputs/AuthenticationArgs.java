// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.SymmetricKeyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication mechanism for IoT devices.
 * 
 */
public final class AuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Symmetric key for authentication.
     * 
     */
    @Import(name="symmetricKey")
      private final @Nullable Output<SymmetricKeyArgs> symmetricKey;

    public Output<SymmetricKeyArgs> getSymmetricKey() {
        return this.symmetricKey == null ? Output.empty() : this.symmetricKey;
    }

    public AuthenticationArgs(@Nullable Output<SymmetricKeyArgs> symmetricKey) {
        this.symmetricKey = symmetricKey;
    }

    private AuthenticationArgs() {
        this.symmetricKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SymmetricKeyArgs> symmetricKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.symmetricKey = defaults.symmetricKey;
        }

        public Builder symmetricKey(@Nullable Output<SymmetricKeyArgs> symmetricKey) {
            this.symmetricKey = symmetricKey;
            return this;
        }

        public Builder symmetricKey(@Nullable SymmetricKeyArgs symmetricKey) {
            this.symmetricKey = Output.ofNullable(symmetricKey);
            return this;
        }
        public AuthenticationArgs build() {
            return new AuthenticationArgs(symmetricKey);
        }
    }
}
