// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks.outputs;

import io.pulumi.azurenative.notebooks.outputs.NotebookResourceSystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNotebookProxyResult {
    /**
     * The friendly string identifier of the creator of the NotebookProxy resource.
     * 
     */
    private final @Nullable String hostname;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The public DNS name
     * 
     */
    private final @Nullable String publicDns;
    /**
     * Allow public network access on a V-Net locked notebook resource
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The region of the NotebookProxy resource.
     * 
     */
    private final @Nullable String region;
    /**
     * The unique identifier (a GUID) generated for every resource.
     * 
     */
    private final String resourceId;
    /**
     * The alternate application ID used for auth token request in the data plane
     * 
     */
    private final @Nullable String secondaryAppId;
    /**
     * System data for notebook resource
     * 
     */
    private final @Nullable NotebookResourceSystemDataResponse systemData;
    /**
     * The type of the resource. Ex- Microsoft.Storage/storageAccounts or Microsoft.Notebooks/notebookProxies.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"hostname","id","name","publicDns","publicNetworkAccess","region","resourceId","secondaryAppId","systemData","type"})
    private GetNotebookProxyResult(
        @Nullable String hostname,
        String id,
        String name,
        @Nullable String publicDns,
        @Nullable String publicNetworkAccess,
        @Nullable String region,
        String resourceId,
        @Nullable String secondaryAppId,
        @Nullable NotebookResourceSystemDataResponse systemData,
        String type) {
        this.hostname = hostname;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.publicDns = publicDns;
        this.publicNetworkAccess = publicNetworkAccess;
        this.region = region;
        this.resourceId = Objects.requireNonNull(resourceId);
        this.secondaryAppId = secondaryAppId;
        this.systemData = systemData;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The friendly string identifier of the creator of the NotebookProxy resource.
     * 
     */
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The public DNS name
     * 
     */
    public Optional<String> getPublicDns() {
        return Optional.ofNullable(this.publicDns);
    }
    /**
     * Allow public network access on a V-Net locked notebook resource
     * 
     */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The region of the NotebookProxy resource.
     * 
     */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The unique identifier (a GUID) generated for every resource.
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The alternate application ID used for auth token request in the data plane
     * 
     */
    public Optional<String> getSecondaryAppId() {
        return Optional.ofNullable(this.secondaryAppId);
    }
    /**
     * System data for notebook resource
     * 
     */
    public Optional<NotebookResourceSystemDataResponse> getSystemData() {
        return Optional.ofNullable(this.systemData);
    }
    /**
     * The type of the resource. Ex- Microsoft.Storage/storageAccounts or Microsoft.Notebooks/notebookProxies.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotebookProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private String id;
        private String name;
        private @Nullable String publicDns;
        private @Nullable String publicNetworkAccess;
        private @Nullable String region;
        private String resourceId;
        private @Nullable String secondaryAppId;
        private @Nullable NotebookResourceSystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotebookProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.publicDns = defaults.publicDns;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.secondaryAppId = defaults.secondaryAppId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicDns(@Nullable String publicDns) {
            this.publicDns = publicDns;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setSecondaryAppId(@Nullable String secondaryAppId) {
            this.secondaryAppId = secondaryAppId;
            return this;
        }

        public Builder setSystemData(@Nullable NotebookResourceSystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetNotebookProxyResult build() {
            return new GetNotebookProxyResult(hostname, id, name, publicDns, publicNetworkAccess, region, resourceId, secondaryAppId, systemData, type);
        }
    }
}
