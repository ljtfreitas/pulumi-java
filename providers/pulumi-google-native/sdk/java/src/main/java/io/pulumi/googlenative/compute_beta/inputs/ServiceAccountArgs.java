// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A service account.
 * 
 */
public final class ServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * Email address of the service account.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The list of scopes to be made available for this service account.
     * 
     */
    @InputImport(name="scopes")
      private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    public ServiceAccountArgs(
        @Nullable Input<String> email,
        @Nullable Input<List<String>> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    private ServiceAccountArgs() {
        this.email = Input.empty();
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }
        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(email, scopes);
        }
    }
}
