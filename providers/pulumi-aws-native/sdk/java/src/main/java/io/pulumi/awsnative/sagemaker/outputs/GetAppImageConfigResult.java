// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.AppImageConfigKernelGatewayImageConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppImageConfigResult {
    /**
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
     */
    private final @Nullable String appImageConfigArn;
    /**
     * The KernelGatewayImageConfig.
     * 
     */
    private final @Nullable AppImageConfigKernelGatewayImageConfig kernelGatewayImageConfig;

    @CustomType.Constructor
    private GetAppImageConfigResult(
        @CustomType.Parameter("appImageConfigArn") @Nullable String appImageConfigArn,
        @CustomType.Parameter("kernelGatewayImageConfig") @Nullable AppImageConfigKernelGatewayImageConfig kernelGatewayImageConfig) {
        this.appImageConfigArn = appImageConfigArn;
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
    */
    public Optional<String> getAppImageConfigArn() {
        return Optional.ofNullable(this.appImageConfigArn);
    }
    /**
     * The KernelGatewayImageConfig.
     * 
    */
    public Optional<AppImageConfigKernelGatewayImageConfig> getKernelGatewayImageConfig() {
        return Optional.ofNullable(this.kernelGatewayImageConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppImageConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appImageConfigArn;
        private @Nullable AppImageConfigKernelGatewayImageConfig kernelGatewayImageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppImageConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigArn = defaults.appImageConfigArn;
    	      this.kernelGatewayImageConfig = defaults.kernelGatewayImageConfig;
        }

        public Builder appImageConfigArn(@Nullable String appImageConfigArn) {
            this.appImageConfigArn = appImageConfigArn;
            return this;
        }

        public Builder kernelGatewayImageConfig(@Nullable AppImageConfigKernelGatewayImageConfig kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }
        public GetAppImageConfigResult build() {
            return new GetAppImageConfigResult(appImageConfigArn, kernelGatewayImageConfig);
        }
    }
}
