// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the service principal.
 * 
 */
public final class ServicePrincipalPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalPropertiesResponse Empty = new ServicePrincipalPropertiesResponse();

    /**
     * Application ID of service principal.
     * 
     */
    @InputImport(name="applicationId")
        private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    /**
     * A secret string that the application uses to prove its identity, also can be referred to as application password (write only).
     * 
     */
    @InputImport(name="secret")
        private final @Nullable String secret;

    public Optional<String> getSecret() {
        return this.secret == null ? Optional.empty() : Optional.ofNullable(this.secret);
    }

    public ServicePrincipalPropertiesResponse(
        @Nullable String applicationId,
        @Nullable String secret) {
        this.applicationId = applicationId;
        this.secret = secret;
    }

    private ServicePrincipalPropertiesResponse() {
        this.applicationId = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.secret = defaults.secret;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        public ServicePrincipalPropertiesResponse build() {
            return new ServicePrincipalPropertiesResponse(applicationId, secret);
        }
    }
}
