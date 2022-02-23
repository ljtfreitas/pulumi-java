// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class DataSourceParametersS3Args extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersS3Args Empty = new DataSourceParametersS3Args();

    /**
     * An object containing the S3 location of the S3 manifest file.
     * 
     */
    @InputImport(name="manifestFileLocation", required=true)
    private final Input<DataSourceParametersS3ManifestFileLocationArgs> manifestFileLocation;

    public Input<DataSourceParametersS3ManifestFileLocationArgs> getManifestFileLocation() {
        return this.manifestFileLocation;
    }

    public DataSourceParametersS3Args(Input<DataSourceParametersS3ManifestFileLocationArgs> manifestFileLocation) {
        this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation, "expected parameter 'manifestFileLocation' to be non-null");
    }

    private DataSourceParametersS3Args() {
        this.manifestFileLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataSourceParametersS3ManifestFileLocationArgs> manifestFileLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersS3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestFileLocation = defaults.manifestFileLocation;
        }

        public Builder setManifestFileLocation(Input<DataSourceParametersS3ManifestFileLocationArgs> manifestFileLocation) {
            this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation);
            return this;
        }

        public Builder setManifestFileLocation(DataSourceParametersS3ManifestFileLocationArgs manifestFileLocation) {
            this.manifestFileLocation = Input.of(Objects.requireNonNull(manifestFileLocation));
            return this;
        }
        public DataSourceParametersS3Args build() {
            return new DataSourceParametersS3Args(manifestFileLocation);
        }
    }
}