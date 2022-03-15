// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceMemcacheNode {
    private final @Nullable String host;
    private final @Nullable String nodeId;
    private final @Nullable Integer port;
    private final @Nullable String state;
    private final @Nullable String zone;

    @CustomType.Constructor
    private InstanceMemcacheNode(
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("nodeId") @Nullable String nodeId,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.host = host;
        this.nodeId = nodeId;
        this.port = port;
        this.state = state;
        this.zone = zone;
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> getNodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> getZone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMemcacheNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable String nodeId;
        private @Nullable Integer port;
        private @Nullable String state;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMemcacheNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.nodeId = defaults.nodeId;
    	      this.port = defaults.port;
    	      this.state = defaults.state;
    	      this.zone = defaults.zone;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public InstanceMemcacheNode build() {
            return new InstanceMemcacheNode(host, nodeId, port, state, zone);
        }
    }
}
