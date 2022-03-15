// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a GKE destination.
 * 
 */
public final class GKEResponse extends io.pulumi.resources.InvokeArgs {

    public static final GKEResponse Empty = new GKEResponse();

    /**
     * The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created.
     * 
     */
    @Import(name="cluster", required=true)
      private final String cluster;

    public String getCluster() {
        return this.cluster;
    }

    /**
     * The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for example, us-central1) for regional clusters.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The namespace the GKE service is running in.
     * 
     */
    @Import(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Name of the GKE service.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String getService() {
        return this.service;
    }

    public GKEResponse(
        String cluster,
        String location,
        String namespace,
        String path,
        String service) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GKEResponse() {
        this.cluster = null;
        this.location = null;
        this.namespace = null;
        this.path = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GKEResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private String location;
        private String namespace;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GKEResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.location = defaults.location;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GKEResponse build() {
            return new GKEResponse(cluster, location, namespace, path, service);
        }
    }
}
