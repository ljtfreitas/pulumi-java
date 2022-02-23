// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DataSourceManifestFileLocation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class DataSourceS3Parameters {
    private final DataSourceManifestFileLocation manifestFileLocation;

    @OutputCustomType.Constructor({"manifestFileLocation"})
    private DataSourceS3Parameters(DataSourceManifestFileLocation manifestFileLocation) {
        this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation);
    }

    public DataSourceManifestFileLocation getManifestFileLocation() {
        return this.manifestFileLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceS3Parameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceManifestFileLocation manifestFileLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceS3Parameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestFileLocation = defaults.manifestFileLocation;
        }

        public Builder setManifestFileLocation(DataSourceManifestFileLocation manifestFileLocation) {
            this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation);
            return this;
        }
        public DataSourceS3Parameters build() {
            return new DataSourceS3Parameters(manifestFileLocation);
        }
    }
}
