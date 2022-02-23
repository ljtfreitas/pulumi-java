// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Username / Password Credentials to connect to guest.
 * 
 */
public final class GuestCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestCredentialResponse Empty = new GuestCredentialResponse();

    /**
     * Gets or sets username to connect with the guest.
     * 
     */
    @InputImport(name="username")
        private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public GuestCredentialResponse(@Nullable String username) {
        this.username = username;
    }

    private GuestCredentialResponse() {
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public GuestCredentialResponse build() {
            return new GuestCredentialResponse(username);
        }
    }
}
