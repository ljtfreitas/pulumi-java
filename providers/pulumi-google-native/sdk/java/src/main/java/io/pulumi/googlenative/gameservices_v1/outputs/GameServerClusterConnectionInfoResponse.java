// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.GkeClusterReferenceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GameServerClusterConnectionInfoResponse {
    /**
     * Reference to the GKE cluster where the game servers are installed.
     * 
     */
    private final GkeClusterReferenceResponse gkeClusterReference;
    /**
     * Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private GameServerClusterConnectionInfoResponse(
        @CustomType.Parameter("gkeClusterReference") GkeClusterReferenceResponse gkeClusterReference,
        @CustomType.Parameter("namespace") String namespace) {
        this.gkeClusterReference = gkeClusterReference;
        this.namespace = namespace;
    }

    /**
     * Reference to the GKE cluster where the game servers are installed.
     * 
    */
    public GkeClusterReferenceResponse getGkeClusterReference() {
        return this.gkeClusterReference;
    }
    /**
     * Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterReferenceResponse gkeClusterReference;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterReference = defaults.gkeClusterReference;
    	      this.namespace = defaults.namespace;
        }

        public Builder gkeClusterReference(GkeClusterReferenceResponse gkeClusterReference) {
            this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public GameServerClusterConnectionInfoResponse build() {
            return new GameServerClusterConnectionInfoResponse(gkeClusterReference, namespace);
        }
    }
}
