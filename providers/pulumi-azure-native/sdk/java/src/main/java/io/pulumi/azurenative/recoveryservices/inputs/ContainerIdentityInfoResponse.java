// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container identity information
 * 
 */
public final class ContainerIdentityInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerIdentityInfoResponse Empty = new ContainerIdentityInfoResponse();

    /**
     * Protection container identity - AAD Tenant
     * 
     */
    @InputImport(name="aadTenantId")
    private final @Nullable String aadTenantId;

    public Optional<String> getAadTenantId() {
        return this.aadTenantId == null ? Optional.empty() : Optional.ofNullable(this.aadTenantId);
    }

    /**
     * Protection container identity - Audience
     * 
     */
    @InputImport(name="audience")
    private final @Nullable String audience;

    public Optional<String> getAudience() {
        return this.audience == null ? Optional.empty() : Optional.ofNullable(this.audience);
    }

    /**
     * Protection container identity - AAD Service Principal
     * 
     */
    @InputImport(name="servicePrincipalClientId")
    private final @Nullable String servicePrincipalClientId;

    public Optional<String> getServicePrincipalClientId() {
        return this.servicePrincipalClientId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalClientId);
    }

    /**
     * Unique name of the container
     * 
     */
    @InputImport(name="uniqueName")
    private final @Nullable String uniqueName;

    public Optional<String> getUniqueName() {
        return this.uniqueName == null ? Optional.empty() : Optional.ofNullable(this.uniqueName);
    }

    public ContainerIdentityInfoResponse(
        @Nullable String aadTenantId,
        @Nullable String audience,
        @Nullable String servicePrincipalClientId,
        @Nullable String uniqueName) {
        this.aadTenantId = aadTenantId;
        this.audience = audience;
        this.servicePrincipalClientId = servicePrincipalClientId;
        this.uniqueName = uniqueName;
    }

    private ContainerIdentityInfoResponse() {
        this.aadTenantId = null;
        this.audience = null;
        this.servicePrincipalClientId = null;
        this.uniqueName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerIdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadTenantId;
        private @Nullable String audience;
        private @Nullable String servicePrincipalClientId;
        private @Nullable String uniqueName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerIdentityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.audience = defaults.audience;
    	      this.servicePrincipalClientId = defaults.servicePrincipalClientId;
    	      this.uniqueName = defaults.uniqueName;
        }

        public Builder setAadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setServicePrincipalClientId(@Nullable String servicePrincipalClientId) {
            this.servicePrincipalClientId = servicePrincipalClientId;
            return this;
        }

        public Builder setUniqueName(@Nullable String uniqueName) {
            this.uniqueName = uniqueName;
            return this;
        }

        public ContainerIdentityInfoResponse build() {
            return new ContainerIdentityInfoResponse(aadTenantId, audience, servicePrincipalClientId, uniqueName);
        }
    }
}
