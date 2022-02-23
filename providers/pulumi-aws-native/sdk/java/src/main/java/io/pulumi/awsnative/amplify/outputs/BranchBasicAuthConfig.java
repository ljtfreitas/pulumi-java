// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BranchBasicAuthConfig {
    private final @Nullable Boolean enableBasicAuth;
    private final String password;
    private final String username;

    @OutputCustomType.Constructor({"enableBasicAuth","password","username"})
    private BranchBasicAuthConfig(
        @Nullable Boolean enableBasicAuth,
        String password,
        String username) {
        this.enableBasicAuth = enableBasicAuth;
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    public Optional<Boolean> getEnableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }
    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchBasicAuthConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableBasicAuth;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchBasicAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setEnableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public BranchBasicAuthConfig build() {
            return new BranchBasicAuthConfig(enableBasicAuth, password, username);
        }
    }
}
