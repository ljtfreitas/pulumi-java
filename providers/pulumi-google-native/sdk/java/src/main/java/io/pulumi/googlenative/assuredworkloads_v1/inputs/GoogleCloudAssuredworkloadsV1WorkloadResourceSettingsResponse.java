// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represent the custom settings for the resources to be created.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse Empty = new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse();

    /**
     * User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(
        String displayName,
        String resourceId,
        String resourceType) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse() {
        this.displayName = null;
        this.resourceId = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(displayName, resourceId, resourceType);
        }
    }
}
