// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.outputs;

import io.pulumi.azurenative.securityandcompliance.outputs.ServicesPropertiesResponse;
import io.pulumi.azurenative.securityandcompliance.outputs.ServicesResourceResponseIdentity;
import io.pulumi.azurenative.securityandcompliance.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetprivateLinkServicesForEDMUploadResult {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    private final @Nullable ServicesResourceResponseIdentity identity;
    /**
     * The kind of the service.
     * 
     */
    private final String kind;
    /**
     * The resource location.
     * 
     */
    private final String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The common properties of a service.
     * 
     */
    private final ServicesPropertiesResponse properties;
    /**
     * Required property for system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","identity","kind","location","name","properties","systemData","tags","type"})
    private GetprivateLinkServicesForEDMUploadResult(
        @Nullable String etag,
        String id,
        @Nullable ServicesResourceResponseIdentity identity,
        String kind,
        String location,
        String name,
        ServicesPropertiesResponse properties,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Optional<ServicesResourceResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind of the service.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The common properties of a service.
     * 
     */
    public ServicesPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Required property for system data
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetprivateLinkServicesForEDMUploadResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable ServicesResourceResponseIdentity identity;
        private String kind;
        private String location;
        private String name;
        private ServicesPropertiesResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetprivateLinkServicesForEDMUploadResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ServicesResourceResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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

        public Builder setProperties(ServicesPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public GetprivateLinkServicesForEDMUploadResult build() {
            return new GetprivateLinkServicesForEDMUploadResult(etag, id, identity, kind, location, name, properties, systemData, tags, type);
        }
    }
}
