// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueryPackResult {
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Current state of this QueryPack: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * The unique ID of your application. This field cannot be changed.
     * 
     */
    private final String queryPackId;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    private final String timeCreated;
    /**
     * Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    private final String timeModified;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","provisioningState","queryPackId","tags","timeCreated","timeModified","type"})
    private GetQueryPackResult(
        String id,
        String location,
        String name,
        String provisioningState,
        String queryPackId,
        @Nullable Map<String,String> tags,
        String timeCreated,
        String timeModified,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.queryPackId = Objects.requireNonNull(queryPackId);
        this.tags = tags;
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.timeModified = Objects.requireNonNull(timeModified);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Azure resource Id
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
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Current state of this QueryPack: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The unique ID of your application. This field cannot be changed.
     * 
     */
    public String getQueryPackId() {
        return this.queryPackId;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    public String getTimeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryPackResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String queryPackId;
        private @Nullable Map<String,String> tags;
        private String timeCreated;
        private String timeModified;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryPackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.queryPackId = defaults.queryPackId;
    	      this.tags = defaults.tags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setQueryPackId(String queryPackId) {
            this.queryPackId = Objects.requireNonNull(queryPackId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetQueryPackResult build() {
            return new GetQueryPackResult(id, location, name, provisioningState, queryPackId, tags, timeCreated, timeModified, type);
        }
    }
}
