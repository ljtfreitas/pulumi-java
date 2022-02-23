// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.CloudBuildOptionsResponse;
import io.pulumi.googlenative.appengine_v1.inputs.ContainerInfoResponse;
import io.pulumi.googlenative.appengine_v1.inputs.ZipInfoResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Code and application artifacts used to deploy a version to App Engine.
 * 
 */
public final class DeploymentResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentResponse Empty = new DeploymentResponse();

    /**
     * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
     * 
     */
    @InputImport(name="cloudBuildOptions", required=true)
      private final CloudBuildOptionsResponse cloudBuildOptions;

    public CloudBuildOptionsResponse getCloudBuildOptions() {
        return this.cloudBuildOptions;
    }

    /**
     * The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    @InputImport(name="container", required=true)
      private final ContainerInfoResponse container;

    public ContainerInfoResponse getContainer() {
        return this.container;
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
     * 
     */
    @InputImport(name="files", required=true)
      private final Map<String,String> files;

    public Map<String,String> getFiles() {
        return this.files;
    }

    /**
     * The zip file for this deployment, if this is a zip deployment.
     * 
     */
    @InputImport(name="zip", required=true)
      private final ZipInfoResponse zip;

    public ZipInfoResponse getZip() {
        return this.zip;
    }

    public DeploymentResponse(
        CloudBuildOptionsResponse cloudBuildOptions,
        ContainerInfoResponse container,
        Map<String,String> files,
        ZipInfoResponse zip) {
        this.cloudBuildOptions = Objects.requireNonNull(cloudBuildOptions, "expected parameter 'cloudBuildOptions' to be non-null");
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.files = Objects.requireNonNull(files, "expected parameter 'files' to be non-null");
        this.zip = Objects.requireNonNull(zip, "expected parameter 'zip' to be non-null");
    }

    private DeploymentResponse() {
        this.cloudBuildOptions = null;
        this.container = null;
        this.files = Map.of();
        this.zip = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBuildOptionsResponse cloudBuildOptions;
        private ContainerInfoResponse container;
        private Map<String,String> files;
        private ZipInfoResponse zip;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder setCloudBuildOptions(CloudBuildOptionsResponse cloudBuildOptions) {
            this.cloudBuildOptions = Objects.requireNonNull(cloudBuildOptions);
            return this;
        }

        public Builder setContainer(ContainerInfoResponse container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setFiles(Map<String,String> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }

        public Builder setZip(ZipInfoResponse zip) {
            this.zip = Objects.requireNonNull(zip);
            return this;
        }
        public DeploymentResponse build() {
            return new DeploymentResponse(cloudBuildOptions, container, files, zip);
        }
    }
}
