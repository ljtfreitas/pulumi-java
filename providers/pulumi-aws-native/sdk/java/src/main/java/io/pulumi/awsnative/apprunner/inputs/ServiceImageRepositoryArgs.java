// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceImageRepositoryImageRepositoryType;
import io.pulumi.awsnative.apprunner.inputs.ServiceImageConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Image Repository
 * 
 */
public final class ServiceImageRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceImageRepositoryArgs Empty = new ServiceImageRepositoryArgs();

    @InputImport(name="imageConfiguration")
        private final @Nullable Input<ServiceImageConfigurationArgs> imageConfiguration;

    public Input<ServiceImageConfigurationArgs> getImageConfiguration() {
        return this.imageConfiguration == null ? Input.empty() : this.imageConfiguration;
    }

    /**
     * Image Identifier
     * 
     */
    @InputImport(name="imageIdentifier", required=true)
        private final Input<String> imageIdentifier;

    public Input<String> getImageIdentifier() {
        return this.imageIdentifier;
    }

    /**
     * Image Repository Type
     * 
     */
    @InputImport(name="imageRepositoryType", required=true)
        private final Input<ServiceImageRepositoryImageRepositoryType> imageRepositoryType;

    public Input<ServiceImageRepositoryImageRepositoryType> getImageRepositoryType() {
        return this.imageRepositoryType;
    }

    public ServiceImageRepositoryArgs(
        @Nullable Input<ServiceImageConfigurationArgs> imageConfiguration,
        Input<String> imageIdentifier,
        Input<ServiceImageRepositoryImageRepositoryType> imageRepositoryType) {
        this.imageConfiguration = imageConfiguration;
        this.imageIdentifier = Objects.requireNonNull(imageIdentifier, "expected parameter 'imageIdentifier' to be non-null");
        this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType, "expected parameter 'imageRepositoryType' to be non-null");
    }

    private ServiceImageRepositoryArgs() {
        this.imageConfiguration = Input.empty();
        this.imageIdentifier = Input.empty();
        this.imageRepositoryType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceImageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceImageConfigurationArgs> imageConfiguration;
        private Input<String> imageIdentifier;
        private Input<ServiceImageRepositoryImageRepositoryType> imageRepositoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceImageRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageConfiguration = defaults.imageConfiguration;
    	      this.imageIdentifier = defaults.imageIdentifier;
    	      this.imageRepositoryType = defaults.imageRepositoryType;
        }

        public Builder setImageConfiguration(@Nullable Input<ServiceImageConfigurationArgs> imageConfiguration) {
            this.imageConfiguration = imageConfiguration;
            return this;
        }

        public Builder setImageConfiguration(@Nullable ServiceImageConfigurationArgs imageConfiguration) {
            this.imageConfiguration = Input.ofNullable(imageConfiguration);
            return this;
        }

        public Builder setImageIdentifier(Input<String> imageIdentifier) {
            this.imageIdentifier = Objects.requireNonNull(imageIdentifier);
            return this;
        }

        public Builder setImageIdentifier(String imageIdentifier) {
            this.imageIdentifier = Input.of(Objects.requireNonNull(imageIdentifier));
            return this;
        }

        public Builder setImageRepositoryType(Input<ServiceImageRepositoryImageRepositoryType> imageRepositoryType) {
            this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType);
            return this;
        }

        public Builder setImageRepositoryType(ServiceImageRepositoryImageRepositoryType imageRepositoryType) {
            this.imageRepositoryType = Input.of(Objects.requireNonNull(imageRepositoryType));
            return this;
        }
        public ServiceImageRepositoryArgs build() {
            return new ServiceImageRepositoryArgs(imageConfiguration, imageIdentifier, imageRepositoryType);
        }
    }
}
