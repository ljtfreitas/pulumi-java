// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PacketMirroringMirroredResourceInfoSubnetInfoResponse {
    /**
     * Unique identifier for the subnetwork; defined by the server.
     * 
     */
    private final String canonicalUrl;
    /**
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"canonicalUrl","url"})
    private PacketMirroringMirroredResourceInfoSubnetInfoResponse(
        String canonicalUrl,
        String url) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Unique identifier for the subnetwork; defined by the server.
     * 
     */
    public String getCanonicalUrl() {
        return this.canonicalUrl;
    }
    /**
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoSubnetInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoSubnetInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.url = defaults.url;
        }

        public Builder setCanonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public PacketMirroringMirroredResourceInfoSubnetInfoResponse build() {
            return new PacketMirroringMirroredResourceInfoSubnetInfoResponse(canonicalUrl, url);
        }
    }
}
