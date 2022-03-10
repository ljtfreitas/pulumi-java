// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.outputs.LocationObjectStorageTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationObjectStorageResult {
    /**
     * Optional. The access key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    private final @Nullable String accessKey;
    /**
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
     */
    private final @Nullable List<String> agentArns;
    /**
     * The Amazon Resource Name (ARN) of the location that is created.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the object storage location that was described.
     * 
     */
    private final @Nullable String locationUri;
    /**
     * The port that your self-managed server accepts inbound network traffic on.
     * 
     */
    private final @Nullable Integer serverPort;
    /**
     * The protocol that the object storage server uses to communicate.
     * 
     */
    private final @Nullable LocationObjectStorageServerProtocol serverProtocol;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationObjectStorageTag> tags;

    @OutputCustomType.Constructor
    private GetLocationObjectStorageResult(
        @OutputCustomType.Parameter("accessKey") @Nullable String accessKey,
        @OutputCustomType.Parameter("agentArns") @Nullable List<String> agentArns,
        @OutputCustomType.Parameter("locationArn") @Nullable String locationArn,
        @OutputCustomType.Parameter("locationUri") @Nullable String locationUri,
        @OutputCustomType.Parameter("serverPort") @Nullable Integer serverPort,
        @OutputCustomType.Parameter("serverProtocol") @Nullable LocationObjectStorageServerProtocol serverProtocol,
        @OutputCustomType.Parameter("tags") @Nullable List<LocationObjectStorageTag> tags) {
        this.accessKey = accessKey;
        this.agentArns = agentArns;
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.serverPort = serverPort;
        this.serverProtocol = serverProtocol;
        this.tags = tags;
    }

    /**
     * Optional. The access key is used if credentials are required to access the self-managed object storage server.
     * 
    */
    public Optional<String> getAccessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
    */
    public List<String> getAgentArns() {
        return this.agentArns == null ? List.of() : this.agentArns;
    }
    /**
     * The Amazon Resource Name (ARN) of the location that is created.
     * 
    */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the object storage location that was described.
     * 
    */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    /**
     * The port that your self-managed server accepts inbound network traffic on.
     * 
    */
    public Optional<Integer> getServerPort() {
        return Optional.ofNullable(this.serverPort);
    }
    /**
     * The protocol that the object storage server uses to communicate.
     * 
    */
    public Optional<LocationObjectStorageServerProtocol> getServerProtocol() {
        return Optional.ofNullable(this.serverProtocol);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LocationObjectStorageTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationObjectStorageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable List<String> agentArns;
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable Integer serverPort;
        private @Nullable LocationObjectStorageServerProtocol serverProtocol;
        private @Nullable List<LocationObjectStorageTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationObjectStorageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.agentArns = defaults.agentArns;
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.serverPort = defaults.serverPort;
    	      this.serverProtocol = defaults.serverProtocol;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setServerPort(@Nullable Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder setServerProtocol(@Nullable LocationObjectStorageServerProtocol serverProtocol) {
            this.serverProtocol = serverProtocol;
            return this;
        }

        public Builder setTags(@Nullable List<LocationObjectStorageTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocationObjectStorageResult build() {
            return new GetLocationObjectStorageResult(accessKey, agentArns, locationArn, locationUri, serverPort, serverProtocol, tags);
        }
    }
}
