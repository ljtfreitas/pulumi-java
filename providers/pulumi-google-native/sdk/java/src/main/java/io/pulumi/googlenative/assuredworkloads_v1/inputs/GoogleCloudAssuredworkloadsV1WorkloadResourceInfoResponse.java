// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represent the resources that are children of this Workload.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse Empty = new GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse();

    /**
     * Resource identifier. For a project this represents project_number.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Indicates the type of resource.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse(
        String resourceId,
        String resourceType) {
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse() {
        this.resourceId = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse(resourceId, resourceType);
        }
    }
}
