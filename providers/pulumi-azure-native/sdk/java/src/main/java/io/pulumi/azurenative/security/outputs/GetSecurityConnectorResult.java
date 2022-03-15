// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.CspmMonitorAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.DefenderForServersAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.SecurityConnectorPropertiesResponseOrganizationalData;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityConnectorResult {
    /**
     * The multi cloud resource's cloud name.
     * 
     */
    private final @Nullable String cloudName;
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    private final @Nullable String hierarchyIdentifier;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Kind of the resource
     * 
     */
    private final @Nullable String kind;
    /**
     * Location where the resource is stored
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * A collection of offerings for the security connector.
     * 
     */
    private final @Nullable List<Object> offerings;
    /**
     * The multi cloud account's organizational data
     * 
     */
    private final @Nullable SecurityConnectorPropertiesResponseOrganizationalData organizationalData;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSecurityConnectorResult(
        @CustomType.Parameter("cloudName") @Nullable String cloudName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("hierarchyIdentifier") @Nullable String hierarchyIdentifier,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offerings") @Nullable List<Object> offerings,
        @CustomType.Parameter("organizationalData") @Nullable SecurityConnectorPropertiesResponseOrganizationalData organizationalData,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.cloudName = cloudName;
        this.etag = etag;
        this.hierarchyIdentifier = hierarchyIdentifier;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.offerings = offerings;
        this.organizationalData = organizationalData;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The multi cloud resource's cloud name.
     * 
    */
    public Optional<String> getCloudName() {
        return Optional.ofNullable(this.cloudName);
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The multi cloud resource identifier (account id in case of AWS connector).
     * 
    */
    public Optional<String> getHierarchyIdentifier() {
        return Optional.ofNullable(this.hierarchyIdentifier);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of the resource
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A collection of offerings for the security connector.
     * 
    */
    public List<Object> getOfferings() {
        return this.offerings == null ? List.of() : this.offerings;
    }
    /**
     * The multi cloud account's organizational data
     * 
    */
    public Optional<SecurityConnectorPropertiesResponseOrganizationalData> getOrganizationalData() {
        return Optional.ofNullable(this.organizationalData);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetSecurityConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudName;
        private @Nullable String etag;
        private @Nullable String hierarchyIdentifier;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private @Nullable List<Object> offerings;
        private @Nullable SecurityConnectorPropertiesResponseOrganizationalData organizationalData;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudName = defaults.cloudName;
    	      this.etag = defaults.etag;
    	      this.hierarchyIdentifier = defaults.hierarchyIdentifier;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.offerings = defaults.offerings;
    	      this.organizationalData = defaults.organizationalData;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder cloudName(@Nullable String cloudName) {
            this.cloudName = cloudName;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder hierarchyIdentifier(@Nullable String hierarchyIdentifier) {
            this.hierarchyIdentifier = hierarchyIdentifier;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder offerings(@Nullable List<Object> offerings) {
            this.offerings = offerings;
            return this;
        }

        public Builder organizationalData(@Nullable SecurityConnectorPropertiesResponseOrganizationalData organizationalData) {
            this.organizationalData = organizationalData;
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
        public GetSecurityConnectorResult build() {
            return new GetSecurityConnectorResult(cloudName, etag, hierarchyIdentifier, id, kind, location, name, offerings, organizationalData, systemData, tags, type);
        }
    }
}
