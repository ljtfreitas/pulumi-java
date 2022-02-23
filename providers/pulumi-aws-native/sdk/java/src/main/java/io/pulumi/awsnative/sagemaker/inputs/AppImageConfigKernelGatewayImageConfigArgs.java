// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigFileSystemConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
 * 
 */
public final class AppImageConfigKernelGatewayImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigArgs();

    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    @InputImport(name="fileSystemConfig")
        private final @Nullable Input<AppImageConfigFileSystemConfigArgs> fileSystemConfig;

    public Input<AppImageConfigFileSystemConfigArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Input.empty() : this.fileSystemConfig;
    }

    /**
     * The specification of the Jupyter kernels in the image.
     * 
     */
    @InputImport(name="kernelSpecs", required=true)
        private final Input<List<AppImageConfigKernelSpecArgs>> kernelSpecs;

    public Input<List<AppImageConfigKernelSpecArgs>> getKernelSpecs() {
        return this.kernelSpecs;
    }

    public AppImageConfigKernelGatewayImageConfigArgs(
        @Nullable Input<AppImageConfigFileSystemConfigArgs> fileSystemConfig,
        Input<List<AppImageConfigKernelSpecArgs>> kernelSpecs) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpecs = Objects.requireNonNull(kernelSpecs, "expected parameter 'kernelSpecs' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigArgs() {
        this.fileSystemConfig = Input.empty();
        this.kernelSpecs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppImageConfigFileSystemConfigArgs> fileSystemConfig;
        private Input<List<AppImageConfigKernelSpecArgs>> kernelSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpecs = defaults.kernelSpecs;
        }

        public Builder setFileSystemConfig(@Nullable Input<AppImageConfigFileSystemConfigArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder setFileSystemConfig(@Nullable AppImageConfigFileSystemConfigArgs fileSystemConfig) {
            this.fileSystemConfig = Input.ofNullable(fileSystemConfig);
            return this;
        }

        public Builder setKernelSpecs(Input<List<AppImageConfigKernelSpecArgs>> kernelSpecs) {
            this.kernelSpecs = Objects.requireNonNull(kernelSpecs);
            return this;
        }

        public Builder setKernelSpecs(List<AppImageConfigKernelSpecArgs> kernelSpecs) {
            this.kernelSpecs = Input.of(Objects.requireNonNull(kernelSpecs));
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigArgs build() {
            return new AppImageConfigKernelGatewayImageConfigArgs(fileSystemConfig, kernelSpecs);
        }
    }
}
