// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * The list of scopes to be made available for this service account.
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes == null ? Output.empty() : this.scopes;
    }

    public ServiceAccountArgs(
        @Nullable Output<String> email,
        @Nullable Output<List<String>> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    private ServiceAccountArgs() {
        this.email = Output.empty();
        this.scopes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private @Nullable Output<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }

        public Builder scopes(@Nullable Output<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = Output.ofNullable(scopes);
            return this;
        }
        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(email, scopes);
        }
    }
}
