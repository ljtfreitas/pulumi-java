// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.ContainerAccountResponse;
import io.pulumi.azurenative.aad.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOuContainerResult {
    /**
     * The list of container accounts
     * 
     */
    private final @Nullable List<ContainerAccountResponse> accounts;
    /**
     * The OuContainer name
     * 
     */
    private final String containerId;
    /**
     * The Deployment id
     * 
     */
    private final String deploymentId;
    /**
     * Distinguished Name of OuContainer instance
     * 
     */
    private final String distinguishedName;
    /**
     * The domain name of Domain Services.
     * 
     */
    private final String domainName;
    /**
     * Resource etag
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Status of OuContainer instance
     * 
     */
    private final String serviceStatus;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure Active Directory tenant id
     * 
     */
    private final String tenantId;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetOuContainerResult(
        @CustomType.Parameter("accounts") @Nullable List<ContainerAccountResponse> accounts,
        @CustomType.Parameter("containerId") String containerId,
        @CustomType.Parameter("deploymentId") String deploymentId,
        @CustomType.Parameter("distinguishedName") String distinguishedName,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serviceStatus") String serviceStatus,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.accounts = accounts;
        this.containerId = containerId;
        this.deploymentId = deploymentId;
        this.distinguishedName = distinguishedName;
        this.domainName = domainName;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serviceStatus = serviceStatus;
        this.systemData = systemData;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The list of container accounts
     * 
    */
    public List<ContainerAccountResponse> getAccounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * The OuContainer name
     * 
    */
    public String getContainerId() {
        return this.containerId;
    }
    /**
     * The Deployment id
     * 
    */
    public String getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Distinguished Name of OuContainer instance
     * 
    */
    public String getDistinguishedName() {
        return this.distinguishedName;
    }
    /**
     * The domain name of Domain Services.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Resource etag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
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
     * The current deployment or provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Status of OuContainer instance
     * 
    */
    public String getServiceStatus() {
        return this.serviceStatus;
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure Active Directory tenant id
     * 
    */
    public String getTenantId() {
        return this.tenantId;
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

    public static Builder builder(GetOuContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerAccountResponse> accounts;
        private String containerId;
        private String deploymentId;
        private String distinguishedName;
        private String domainName;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String serviceStatus;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOuContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.containerId = defaults.containerId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.distinguishedName = defaults.distinguishedName;
    	      this.domainName = defaults.domainName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceStatus = defaults.serviceStatus;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder accounts(@Nullable List<ContainerAccountResponse> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder containerId(String containerId) {
            this.containerId = Objects.requireNonNull(containerId);
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder distinguishedName(String distinguishedName) {
            this.distinguishedName = Objects.requireNonNull(distinguishedName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = Objects.requireNonNull(serviceStatus);
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

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetOuContainerResult build() {
            return new GetOuContainerResult(accounts, containerId, deploymentId, distinguishedName, domainName, etag, id, location, name, provisioningState, serviceStatus, systemData, tags, tenantId, type);
        }
    }
}
