// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.NsgSecurityRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the NSG resource settings.
 * 
 */
public final class NetworkSecurityGroupResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkSecurityGroupResourceSettingsResponse Empty = new NetworkSecurityGroupResourceSettingsResponse();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/networkSecurityGroups'.
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets Security rules of network security group.
     * 
     */
    @InputImport(name="securityRules")
        private final @Nullable List<NsgSecurityRuleResponse> securityRules;

    public List<NsgSecurityRuleResponse> getSecurityRules() {
        return this.securityRules == null ? List.of() : this.securityRules;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
        private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public NetworkSecurityGroupResourceSettingsResponse(
        String resourceType,
        @Nullable List<NsgSecurityRuleResponse> securityRules,
        String targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.securityRules = securityRules;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private NetworkSecurityGroupResourceSettingsResponse() {
        this.resourceType = null;
        this.securityRules = List.of();
        this.targetResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private @Nullable List<NsgSecurityRuleResponse> securityRules;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.securityRules = defaults.securityRules;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSecurityRules(@Nullable List<NsgSecurityRuleResponse> securityRules) {
            this.securityRules = securityRules;
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public NetworkSecurityGroupResourceSettingsResponse build() {
            return new NetworkSecurityGroupResourceSettingsResponse(resourceType, securityRules, targetResourceName);
        }
    }
}
