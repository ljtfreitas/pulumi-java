// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.outputs.ServiceAuthenticationConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceCodeRepository;
import io.pulumi.awsnative.apprunner.outputs.ServiceImageRepository;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSourceConfiguration {
    private final @Nullable ServiceAuthenticationConfiguration authenticationConfiguration;
    /**
     * Auto Deployment enabled
     * 
     */
    private final @Nullable Boolean autoDeploymentsEnabled;
    private final @Nullable ServiceCodeRepository codeRepository;
    private final @Nullable ServiceImageRepository imageRepository;

    @CustomType.Constructor
    private ServiceSourceConfiguration(
        @CustomType.Parameter("authenticationConfiguration") @Nullable ServiceAuthenticationConfiguration authenticationConfiguration,
        @CustomType.Parameter("autoDeploymentsEnabled") @Nullable Boolean autoDeploymentsEnabled,
        @CustomType.Parameter("codeRepository") @Nullable ServiceCodeRepository codeRepository,
        @CustomType.Parameter("imageRepository") @Nullable ServiceImageRepository imageRepository) {
        this.authenticationConfiguration = authenticationConfiguration;
        this.autoDeploymentsEnabled = autoDeploymentsEnabled;
        this.codeRepository = codeRepository;
        this.imageRepository = imageRepository;
    }

    public Optional<ServiceAuthenticationConfiguration> getAuthenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    /**
     * Auto Deployment enabled
     * 
    */
    public Optional<Boolean> getAutoDeploymentsEnabled() {
        return Optional.ofNullable(this.autoDeploymentsEnabled);
    }
    public Optional<ServiceCodeRepository> getCodeRepository() {
        return Optional.ofNullable(this.codeRepository);
    }
    public Optional<ServiceImageRepository> getImageRepository() {
        return Optional.ofNullable(this.imageRepository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceAuthenticationConfiguration authenticationConfiguration;
        private @Nullable Boolean autoDeploymentsEnabled;
        private @Nullable ServiceCodeRepository codeRepository;
        private @Nullable ServiceImageRepository imageRepository;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.autoDeploymentsEnabled = defaults.autoDeploymentsEnabled;
    	      this.codeRepository = defaults.codeRepository;
    	      this.imageRepository = defaults.imageRepository;
        }

        public Builder authenticationConfiguration(@Nullable ServiceAuthenticationConfiguration authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder autoDeploymentsEnabled(@Nullable Boolean autoDeploymentsEnabled) {
            this.autoDeploymentsEnabled = autoDeploymentsEnabled;
            return this;
        }

        public Builder codeRepository(@Nullable ServiceCodeRepository codeRepository) {
            this.codeRepository = codeRepository;
            return this;
        }

        public Builder imageRepository(@Nullable ServiceImageRepository imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }
        public ServiceSourceConfiguration build() {
            return new ServiceSourceConfiguration(authenticationConfiguration, autoDeploymentsEnabled, codeRepository, imageRepository);
        }
    }
}
