// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.HlsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLiveOutputResult {
    /**
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     */
    private final String archiveWindowLength;
    /**
     * The asset that the live output will write to.
     * 
     */
    private final String assetName;
    /**
     * The creation time the live output.
     * 
     */
    private final String created;
    /**
     * The description of the live output.
     * 
     */
    private final @Nullable String description;
    /**
     * HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     */
    private final @Nullable HlsResponse hls;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The time the live output was last modified.
     * 
     */
    private final String lastModified;
    /**
     * The manifest file name. If not provided, the service will generate one automatically.
     * 
     */
    private final @Nullable String manifestName;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     */
    private final @Nullable Double outputSnapTime;
    /**
     * The provisioning state of the live output.
     * 
     */
    private final String provisioningState;
    /**
     * The resource state of the live output.
     * 
     */
    private final String resourceState;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"archiveWindowLength","assetName","created","description","hls","id","lastModified","manifestName","name","outputSnapTime","provisioningState","resourceState","type"})
    private GetLiveOutputResult(
        String archiveWindowLength,
        String assetName,
        String created,
        @Nullable String description,
        @Nullable HlsResponse hls,
        String id,
        String lastModified,
        @Nullable String manifestName,
        String name,
        @Nullable Double outputSnapTime,
        String provisioningState,
        String resourceState,
        String type) {
        this.archiveWindowLength = Objects.requireNonNull(archiveWindowLength);
        this.assetName = Objects.requireNonNull(assetName);
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.hls = hls;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.manifestName = manifestName;
        this.name = Objects.requireNonNull(name);
        this.outputSnapTime = outputSnapTime;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     */
    public String getArchiveWindowLength() {
        return this.archiveWindowLength;
    }
    /**
     * The asset that the live output will write to.
     * 
     */
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * The creation time the live output.
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * The description of the live output.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     */
    public Optional<HlsResponse> getHls() {
        return Optional.ofNullable(this.hls);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The time the live output was last modified.
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The manifest file name. If not provided, the service will generate one automatically.
     * 
     */
    public Optional<String> getManifestName() {
        return Optional.ofNullable(this.manifestName);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     */
    public Optional<Double> getOutputSnapTime() {
        return Optional.ofNullable(this.outputSnapTime);
    }
    /**
     * The provisioning state of the live output.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the live output.
     * 
     */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveOutputResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveWindowLength;
        private String assetName;
        private String created;
        private @Nullable String description;
        private @Nullable HlsResponse hls;
        private String id;
        private String lastModified;
        private @Nullable String manifestName;
        private String name;
        private @Nullable Double outputSnapTime;
        private String provisioningState;
        private String resourceState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLiveOutputResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveWindowLength = defaults.archiveWindowLength;
    	      this.assetName = defaults.assetName;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.hls = defaults.hls;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.manifestName = defaults.manifestName;
    	      this.name = defaults.name;
    	      this.outputSnapTime = defaults.outputSnapTime;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.type = defaults.type;
        }

        public Builder setArchiveWindowLength(String archiveWindowLength) {
            this.archiveWindowLength = Objects.requireNonNull(archiveWindowLength);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHls(@Nullable HlsResponse hls) {
            this.hls = hls;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputSnapTime(@Nullable Double outputSnapTime) {
            this.outputSnapTime = outputSnapTime;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLiveOutputResult build() {
            return new GetLiveOutputResult(archiveWindowLength, assetName, created, description, hls, id, lastModified, manifestName, name, outputSnapTime, provisioningState, resourceState, type);
        }
    }
}
