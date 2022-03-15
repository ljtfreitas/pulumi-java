// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationProperties;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationProperties;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationLaunchTemplateConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The distributions of the distribution configuration.
 * 
 */
public final class DistributionConfigurationDistribution extends io.pulumi.resources.InvokeArgs {

    public static final DistributionConfigurationDistribution Empty = new DistributionConfigurationDistribution();

    /**
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * 
     */
    @Import(name="amiDistributionConfiguration")
      private final @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration;

    public Optional<DistributionConfigurationDistributionAmiDistributionConfigurationProperties> getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.amiDistributionConfiguration);
    }

    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * 
     */
    @Import(name="containerDistributionConfiguration")
      private final @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration;

    public Optional<DistributionConfigurationDistributionContainerDistributionConfigurationProperties> getContainerDistributionConfiguration() {
        return this.containerDistributionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.containerDistributionConfiguration);
    }

    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    @Import(name="launchTemplateConfigurations")
      private final @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations;

    public List<DistributionConfigurationLaunchTemplateConfiguration> getLaunchTemplateConfigurations() {
        return this.launchTemplateConfigurations == null ? List.of() : this.launchTemplateConfigurations;
    }

    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    @Import(name="licenseConfigurationArns")
      private final @Nullable List<String> licenseConfigurationArns;

    public List<String> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns == null ? List.of() : this.licenseConfigurationArns;
    }

    /**
     * region
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public DistributionConfigurationDistribution(
        @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration,
        @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration,
        @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations,
        @Nullable List<String> licenseConfigurationArns,
        String region) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        this.containerDistributionConfiguration = containerDistributionConfiguration;
        this.launchTemplateConfigurations = launchTemplateConfigurations;
        this.licenseConfigurationArns = licenseConfigurationArns;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private DistributionConfigurationDistribution() {
        this.amiDistributionConfiguration = null;
        this.containerDistributionConfiguration = null;
        this.launchTemplateConfigurations = List.of();
        this.licenseConfigurationArns = List.of();
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration;
        private @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration;
        private @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations;
        private @Nullable List<String> licenseConfigurationArns;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfiguration = defaults.amiDistributionConfiguration;
    	      this.containerDistributionConfiguration = defaults.containerDistributionConfiguration;
    	      this.launchTemplateConfigurations = defaults.launchTemplateConfigurations;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder amiDistributionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        public Builder containerDistributionConfiguration(@Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        public Builder launchTemplateConfigurations(@Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = launchTemplateConfigurations;
            return this;
        }

        public Builder licenseConfigurationArns(@Nullable List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public DistributionConfigurationDistribution build() {
            return new DistributionConfigurationDistribution(amiDistributionConfiguration, containerDistributionConfiguration, launchTemplateConfigurations, licenseConfigurationArns, region);
        }
    }
}
