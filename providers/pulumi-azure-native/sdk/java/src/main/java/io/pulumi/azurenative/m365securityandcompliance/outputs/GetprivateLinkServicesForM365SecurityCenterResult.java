// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.outputs;

import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesPropertiesResponse;
import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesResourceResponseIdentity;
import io.pulumi.azurenative.m365securityandcompliance.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetprivateLinkServicesForM365SecurityCenterResult {
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

    @CustomType.Constructor
    private GetprivateLinkServicesForM365SecurityCenterResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ServicesResourceResponseIdentity identity,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") ServicesPropertiesResponse properties,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
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

    public static Builder builder(GetprivateLinkServicesForM365SecurityCenterResult defaults) {
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

        public Builder(GetprivateLinkServicesForM365SecurityCenterResult defaults) {
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

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable ServicesResourceResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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

        public Builder properties(ServicesPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetprivateLinkServicesForM365SecurityCenterResult build() {
            return new GetprivateLinkServicesForM365SecurityCenterResult(etag, id, identity, kind, location, name, properties, systemData, tags, type);
        }
    }
}
