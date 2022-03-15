// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Resource pool model
 * 
 */
public final class ResourcePoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePoolResponse Empty = new ResourcePoolResponse();

    /**
     * Hierarchical resource pool name
     * 
     */
    @Import(name="fullName", required=true)
      private final String fullName;

    public String getFullName() {
        return this.fullName;
    }

    /**
     * resource pool id (privateCloudId:vsphereId)
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Azure region
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * {ResourcePoolName}
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The Private Cloud Id
     * 
     */
    @Import(name="privateCloudId", required=true)
      private final String privateCloudId;

    public String getPrivateCloudId() {
        return this.privateCloudId;
    }

    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ResourcePoolResponse(
        String fullName,
        String id,
        String location,
        String name,
        String privateCloudId,
        String type) {
        this.fullName = Objects.requireNonNull(fullName, "expected parameter 'fullName' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateCloudId = Objects.requireNonNull(privateCloudId, "expected parameter 'privateCloudId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourcePoolResponse() {
        this.fullName = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.privateCloudId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullName;
        private String id;
        private String location;
        private String name;
        private String privateCloudId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullName = defaults.fullName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.type = defaults.type;
        }

        public Builder fullName(String fullName) {
            this.fullName = Objects.requireNonNull(fullName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateCloudId(String privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourcePoolResponse build() {
            return new ResourcePoolResponse(fullName, id, location, name, privateCloudId, type);
        }
    }
}
