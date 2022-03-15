// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An occurrence of a particular package installation found within a system's filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
 * 
 */
public final class LocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocationResponse Empty = new LocationResponse();

    /**
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The path from which we gathered that this package/version is installed.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The version installed at this location.
     * 
     */
    @Import(name="version", required=true)
      private final VersionResponse version;

    public VersionResponse getVersion() {
        return this.version;
    }

    public LocationResponse(
        String cpeUri,
        String path,
        VersionResponse version) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private LocationResponse() {
        this.cpeUri = null;
        this.path = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String path;
        private VersionResponse version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder version(VersionResponse version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public LocationResponse build() {
            return new LocationResponse(cpeUri, path, version);
        }
    }
}
