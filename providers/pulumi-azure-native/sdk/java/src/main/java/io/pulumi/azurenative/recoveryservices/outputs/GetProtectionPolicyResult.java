// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureFileShareProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureIaaSVMProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureSqlProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureVmWorkloadProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.GenericProtectionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MabProtectionPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProtectionPolicyResult {
    /**
     * Optional ETag.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Resource Id represents the complete path to the resource.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name associated with the resource.
     * 
     */
    private final String name;
    /**
     * ProtectionPolicyResource properties
     * 
     */
    private final Object properties;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","location","name","properties","tags","type"})
    private GetProtectionPolicyResult(
        @Nullable String eTag,
        String id,
        @Nullable String location,
        String name,
        Object properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Optional ETag.
     * 
     */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Resource Id represents the complete path to the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * ProtectionPolicyResource properties
     * 
     */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectionPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private String name;
        private Object properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectionPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetProtectionPolicyResult build() {
            return new GetProtectionPolicyResult(eTag, id, location, name, properties, tags, type);
        }
    }
}
