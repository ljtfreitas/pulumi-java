// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Virtual network model
 * 
 */
public final class VirtualNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkResponse Empty = new VirtualNetworkResponse();

    /**
     * can be used in vm creation/deletion
     * 
     */
    @InputImport(name="assignable", required=true)
        private final Boolean assignable;

    public Boolean getAssignable() {
        return this.assignable;
    }

    /**
     * virtual network id (privateCloudId:vsphereId)
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Azure region
     * 
     */
    @InputImport(name="location", required=true)
        private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * {VirtualNetworkName}
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The Private Cloud id
     * 
     */
    @InputImport(name="privateCloudId", required=true)
        private final String privateCloudId;

    public String getPrivateCloudId() {
        return this.privateCloudId;
    }

    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public VirtualNetworkResponse(
        Boolean assignable,
        String id,
        String location,
        String name,
        String privateCloudId,
        String type) {
        this.assignable = Objects.requireNonNull(assignable, "expected parameter 'assignable' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateCloudId = Objects.requireNonNull(privateCloudId, "expected parameter 'privateCloudId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualNetworkResponse() {
        this.assignable = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.privateCloudId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean assignable;
        private String id;
        private String location;
        private String name;
        private String privateCloudId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignable = defaults.assignable;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.type = defaults.type;
        }

        public Builder setAssignable(Boolean assignable) {
            this.assignable = Objects.requireNonNull(assignable);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateCloudId(String privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VirtualNetworkResponse build() {
            return new VirtualNetworkResponse(assignable, id, location, name, privateCloudId, type);
        }
    }
}
