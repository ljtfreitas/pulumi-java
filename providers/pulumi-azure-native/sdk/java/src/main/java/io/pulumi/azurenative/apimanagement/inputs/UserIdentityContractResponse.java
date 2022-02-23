// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User identity details.
 * 
 */
public final class UserIdentityContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserIdentityContractResponse Empty = new UserIdentityContractResponse();

    /**
     * Identifier value within provider.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Identity provider name.
     * 
     */
    @InputImport(name="provider")
        private final @Nullable String provider;

    public Optional<String> getProvider() {
        return this.provider == null ? Optional.empty() : Optional.ofNullable(this.provider);
    }

    public UserIdentityContractResponse(
        @Nullable String id,
        @Nullable String provider) {
        this.id = id;
        this.provider = provider;
    }

    private UserIdentityContractResponse() {
        this.id = null;
        this.provider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.provider = defaults.provider;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setProvider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        public UserIdentityContractResponse build() {
            return new UserIdentityContractResponse(id, provider);
        }
    }
}
