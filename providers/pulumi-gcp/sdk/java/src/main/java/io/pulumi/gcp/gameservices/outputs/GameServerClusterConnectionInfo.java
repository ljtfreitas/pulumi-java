// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.gameservices.outputs.GameServerClusterConnectionInfoGkeClusterReference;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GameServerClusterConnectionInfo {
    private final GameServerClusterConnectionInfoGkeClusterReference gkeClusterReference;
    private final String namespace;

    @OutputCustomType.Constructor({"gkeClusterReference","namespace"})
    private GameServerClusterConnectionInfo(
        GameServerClusterConnectionInfoGkeClusterReference gkeClusterReference,
        String namespace) {
        this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference);
        this.namespace = Objects.requireNonNull(namespace);
    }

    public GameServerClusterConnectionInfoGkeClusterReference getGkeClusterReference() {
        return this.gkeClusterReference;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerClusterConnectionInfoGkeClusterReference gkeClusterReference;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterReference = defaults.gkeClusterReference;
    	      this.namespace = defaults.namespace;
        }

        public Builder setGkeClusterReference(GameServerClusterConnectionInfoGkeClusterReference gkeClusterReference) {
            this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public GameServerClusterConnectionInfo build() {
            return new GameServerClusterConnectionInfo(gkeClusterReference, namespace);
        }
    }
}