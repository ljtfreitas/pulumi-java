// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the resource group resource settings.
 * 
 */
public final class ResourceGroupResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceGroupResourceSettingsResponse Empty = new ResourceGroupResourceSettingsResponse();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'resourceGroups'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public ResourceGroupResourceSettingsResponse(
        String resourceType,
        String targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private ResourceGroupResourceSettingsResponse() {
        this.resourceType = null;
        this.targetResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGroupResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public ResourceGroupResourceSettingsResponse build() {
            return new ResourceGroupResourceSettingsResponse(resourceType, targetResourceName);
        }
    }
}
