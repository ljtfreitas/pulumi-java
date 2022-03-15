// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VersionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationResponse {
    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    private final String cpeUri;
    /**
     * The path from which we gathered that this package/version is installed.
     * 
     */
    private final String path;
    /**
     * The version installed at this location.
     * 
     */
    private final VersionResponse version;

    @CustomType.Constructor
    private LocationResponse(
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("version") VersionResponse version) {
        this.cpeUri = cpeUri;
        this.path = path;
        this.version = version;
    }

    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
    */
    public String getCpeUri() {
        return this.cpeUri;
    }
    /**
     * The path from which we gathered that this package/version is installed.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The version installed at this location.
     * 
    */
    public VersionResponse getVersion() {
        return this.version;
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
