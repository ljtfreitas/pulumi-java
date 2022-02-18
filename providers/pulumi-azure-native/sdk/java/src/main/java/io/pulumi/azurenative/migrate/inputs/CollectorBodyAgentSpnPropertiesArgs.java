// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CollectorBodyAgentSpnPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CollectorBodyAgentSpnPropertiesArgs Empty = new CollectorBodyAgentSpnPropertiesArgs();

    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Intended audience for the service principal.
     * 
     */
    @InputImport(name="audience")
    private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    @InputImport(name="authority")
    private final @Nullable Input<String> authority;

    public Input<String> getAuthority() {
        return this.authority == null ? Input.empty() : this.authority;
    }

    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="objectId")
    private final @Nullable Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId == null ? Input.empty() : this.objectId;
    }

    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public CollectorBodyAgentSpnPropertiesArgs(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> audience,
        @Nullable Input<String> authority,
        @Nullable Input<String> objectId,
        @Nullable Input<String> tenantId) {
        this.applicationId = applicationId;
        this.audience = audience;
        this.authority = authority;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    private CollectorBodyAgentSpnPropertiesArgs() {
        this.applicationId = Input.empty();
        this.audience = Input.empty();
        this.authority = Input.empty();
        this.objectId = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorBodyAgentSpnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> audience;
        private @Nullable Input<String> authority;
        private @Nullable Input<String> objectId;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorBodyAgentSpnPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setAudience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder setAuthority(@Nullable Input<String> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable String authority) {
            this.authority = Input.ofNullable(authority);
            return this;
        }

        public Builder setObjectId(@Nullable Input<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = Input.ofNullable(objectId);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public CollectorBodyAgentSpnPropertiesArgs build() {
            return new CollectorBodyAgentSpnPropertiesArgs(applicationId, audience, authority, objectId, tenantId);
        }
    }
}
