// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Cloud Run service destination.
 * 
 */
public final class CloudRunServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudRunServiceArgs Empty = new CloudRunServiceArgs();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The region the Cloud Run service is deployed in.
     * 
     */
    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
     * 
     */
    @InputImport(name="service", required=true)
      private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public CloudRunServiceArgs(
        @Nullable Input<String> path,
        Input<String> region,
        Input<String> service) {
        this.path = path;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private CloudRunServiceArgs() {
        this.path = Input.empty();
        this.region = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private Input<String> region;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }
        public CloudRunServiceArgs build() {
            return new CloudRunServiceArgs(path, region, service);
        }
    }
}
