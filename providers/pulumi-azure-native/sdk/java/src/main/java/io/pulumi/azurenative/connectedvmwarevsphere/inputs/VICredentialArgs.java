// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Username / Password Credentials to connect to vcenter.
 * 
 */
public final class VICredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final VICredentialArgs Empty = new VICredentialArgs();

    /**
     * Gets or sets the password to connect with the vCenter.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Gets or sets username to connect with the vCenter.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public VICredentialArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> username) {
        this.password = password;
        this.username = username;
    }

    private VICredentialArgs() {
        this.password = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VICredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(VICredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public VICredentialArgs build() {
            return new VICredentialArgs(password, username);
        }
    }
}
