// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentCloudBuildOptionsArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentContainerArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentFileArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentArgs Empty = new FlexibleAppVersionDeploymentArgs();

    /**
     * Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudBuildOptions")
        private final @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsArgs> cloudBuildOptions;

    public Input<FlexibleAppVersionDeploymentCloudBuildOptionsArgs> getCloudBuildOptions() {
        return this.cloudBuildOptions == null ? Input.empty() : this.cloudBuildOptions;
    }

    /**
     * The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    @InputImport(name="container")
        private final @Nullable Input<FlexibleAppVersionDeploymentContainerArgs> container;

    public Input<FlexibleAppVersionDeploymentContainerArgs> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @InputImport(name="files")
        private final @Nullable Input<List<FlexibleAppVersionDeploymentFileArgs>> files;

    public Input<List<FlexibleAppVersionDeploymentFileArgs>> getFiles() {
        return this.files == null ? Input.empty() : this.files;
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @InputImport(name="zip")
        private final @Nullable Input<FlexibleAppVersionDeploymentZipArgs> zip;

    public Input<FlexibleAppVersionDeploymentZipArgs> getZip() {
        return this.zip == null ? Input.empty() : this.zip;
    }

    public FlexibleAppVersionDeploymentArgs(
        @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsArgs> cloudBuildOptions,
        @Nullable Input<FlexibleAppVersionDeploymentContainerArgs> container,
        @Nullable Input<List<FlexibleAppVersionDeploymentFileArgs>> files,
        @Nullable Input<FlexibleAppVersionDeploymentZipArgs> zip) {
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    private FlexibleAppVersionDeploymentArgs() {
        this.cloudBuildOptions = Input.empty();
        this.container = Input.empty();
        this.files = Input.empty();
        this.zip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsArgs> cloudBuildOptions;
        private @Nullable Input<FlexibleAppVersionDeploymentContainerArgs> container;
        private @Nullable Input<List<FlexibleAppVersionDeploymentFileArgs>> files;
        private @Nullable Input<FlexibleAppVersionDeploymentZipArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder setCloudBuildOptions(@Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsArgs> cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }

        public Builder setCloudBuildOptions(@Nullable FlexibleAppVersionDeploymentCloudBuildOptionsArgs cloudBuildOptions) {
            this.cloudBuildOptions = Input.ofNullable(cloudBuildOptions);
            return this;
        }

        public Builder setContainer(@Nullable Input<FlexibleAppVersionDeploymentContainerArgs> container) {
            this.container = container;
            return this;
        }

        public Builder setContainer(@Nullable FlexibleAppVersionDeploymentContainerArgs container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder setFiles(@Nullable Input<List<FlexibleAppVersionDeploymentFileArgs>> files) {
            this.files = files;
            return this;
        }

        public Builder setFiles(@Nullable List<FlexibleAppVersionDeploymentFileArgs> files) {
            this.files = Input.ofNullable(files);
            return this;
        }

        public Builder setZip(@Nullable Input<FlexibleAppVersionDeploymentZipArgs> zip) {
            this.zip = zip;
            return this;
        }

        public Builder setZip(@Nullable FlexibleAppVersionDeploymentZipArgs zip) {
            this.zip = Input.ofNullable(zip);
            return this;
        }
        public FlexibleAppVersionDeploymentArgs build() {
            return new FlexibleAppVersionDeploymentArgs(cloudBuildOptions, container, files, zip);
        }
    }
}
