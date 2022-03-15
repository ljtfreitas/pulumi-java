// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSourceManifestFileLocation;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * <p>S3 parameters.</p>
 * 
 */
public final class DataSourceS3Parameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceS3Parameters Empty = new DataSourceS3Parameters();

    @Import(name="manifestFileLocation", required=true)
      private final DataSourceManifestFileLocation manifestFileLocation;

    public DataSourceManifestFileLocation getManifestFileLocation() {
        return this.manifestFileLocation;
    }

    public DataSourceS3Parameters(DataSourceManifestFileLocation manifestFileLocation) {
        this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation, "expected parameter 'manifestFileLocation' to be non-null");
    }

    private DataSourceS3Parameters() {
        this.manifestFileLocation = null;
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

        public Builder manifestFileLocation(DataSourceManifestFileLocation manifestFileLocation) {
            this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation);
            return this;
        }
        public DataSourceS3Parameters build() {
            return new DataSourceS3Parameters(manifestFileLocation);
        }
    }
}
