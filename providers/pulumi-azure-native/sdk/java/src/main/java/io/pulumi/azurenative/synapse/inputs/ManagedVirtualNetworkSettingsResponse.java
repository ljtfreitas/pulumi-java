// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed Virtual Network Settings
 * 
 */
public final class ManagedVirtualNetworkSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedVirtualNetworkSettingsResponse Empty = new ManagedVirtualNetworkSettingsResponse();

    /**
     * Allowed Aad Tenant Ids For Linking
     * 
     */
    @InputImport(name="allowedAadTenantIdsForLinking")
        private final @Nullable List<String> allowedAadTenantIdsForLinking;

    public List<String> getAllowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking == null ? List.of() : this.allowedAadTenantIdsForLinking;
    }

    /**
     * Linked Access Check On Target Resource
     * 
     */
    @InputImport(name="linkedAccessCheckOnTargetResource")
        private final @Nullable Boolean linkedAccessCheckOnTargetResource;

    public Optional<Boolean> getLinkedAccessCheckOnTargetResource() {
        return this.linkedAccessCheckOnTargetResource == null ? Optional.empty() : Optional.ofNullable(this.linkedAccessCheckOnTargetResource);
    }

    /**
     * Prevent Data Exfiltration
     * 
     */
    @InputImport(name="preventDataExfiltration")
        private final @Nullable Boolean preventDataExfiltration;

    public Optional<Boolean> getPreventDataExfiltration() {
        return this.preventDataExfiltration == null ? Optional.empty() : Optional.ofNullable(this.preventDataExfiltration);
    }

    public ManagedVirtualNetworkSettingsResponse(
        @Nullable List<String> allowedAadTenantIdsForLinking,
        @Nullable Boolean linkedAccessCheckOnTargetResource,
        @Nullable Boolean preventDataExfiltration) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        this.preventDataExfiltration = preventDataExfiltration;
    }

    private ManagedVirtualNetworkSettingsResponse() {
        this.allowedAadTenantIdsForLinking = List.of();
        this.linkedAccessCheckOnTargetResource = null;
        this.preventDataExfiltration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAadTenantIdsForLinking;
        private @Nullable Boolean linkedAccessCheckOnTargetResource;
        private @Nullable Boolean preventDataExfiltration;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAadTenantIdsForLinking = defaults.allowedAadTenantIdsForLinking;
    	      this.linkedAccessCheckOnTargetResource = defaults.linkedAccessCheckOnTargetResource;
    	      this.preventDataExfiltration = defaults.preventDataExfiltration;
        }

        public Builder setAllowedAadTenantIdsForLinking(@Nullable List<String> allowedAadTenantIdsForLinking) {
            this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
            return this;
        }

        public Builder setLinkedAccessCheckOnTargetResource(@Nullable Boolean linkedAccessCheckOnTargetResource) {
            this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
            return this;
        }

        public Builder setPreventDataExfiltration(@Nullable Boolean preventDataExfiltration) {
            this.preventDataExfiltration = preventDataExfiltration;
            return this;
        }
        public ManagedVirtualNetworkSettingsResponse build() {
            return new ManagedVirtualNetworkSettingsResponse(allowedAadTenantIdsForLinking, linkedAccessCheckOnTargetResource, preventDataExfiltration);
        }
    }
}
