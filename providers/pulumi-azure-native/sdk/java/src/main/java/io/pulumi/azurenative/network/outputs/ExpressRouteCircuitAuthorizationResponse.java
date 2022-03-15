// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitAuthorizationResponse {
    /**
     * The authorization key.
     * 
     */
    private final @Nullable String authorizationKey;
    /**
     * The authorization use status.
     * 
     */
    private final @Nullable String authorizationUseStatus;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the authorization resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ExpressRouteCircuitAuthorizationResponse(
        @CustomType.Parameter("authorizationKey") @Nullable String authorizationKey,
        @CustomType.Parameter("authorizationUseStatus") @Nullable String authorizationUseStatus,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.authorizationKey = authorizationKey;
        this.authorizationUseStatus = authorizationUseStatus;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The authorization key.
     * 
    */
    public Optional<String> getAuthorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    /**
     * The authorization use status.
     * 
    */
    public Optional<String> getAuthorizationUseStatus() {
        return Optional.ofNullable(this.authorizationUseStatus);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the authorization resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable String authorizationUseStatus;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.authorizationUseStatus = defaults.authorizationUseStatus;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder authorizationUseStatus(@Nullable String authorizationUseStatus) {
            this.authorizationUseStatus = authorizationUseStatus;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ExpressRouteCircuitAuthorizationResponse build() {
            return new ExpressRouteCircuitAuthorizationResponse(authorizationKey, authorizationUseStatus, etag, id, name, provisioningState, type);
        }
    }
}
