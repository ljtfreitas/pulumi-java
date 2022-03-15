// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotResult {
    /**
     * The creation date of the snapshot
     * 
     */
    private final String created;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * UUID v4 used to identify the Snapshot
     * 
     */
    private final String snapshotId;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("snapshotId") String snapshotId,
        @CustomType.Parameter("type") String type) {
        this.created = created;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.snapshotId = snapshotId;
        this.type = type;
    }

    /**
     * The creation date of the snapshot
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * UUID v4 used to identify the Snapshot
     * 
    */
    public String getSnapshotId() {
        return this.snapshotId;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String snapshotId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.snapshotId = defaults.snapshotId;
    	      this.type = defaults.type;
        }

        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(created, id, location, name, provisioningState, snapshotId, type);
        }
    }
}
