// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs;
import io.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationDistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionArgs Empty = new DistributionConfigurationDistributionArgs();

    /**
     * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
     * 
     */
    @InputImport(name="amiDistributionConfiguration")
    private final @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration;

    public Input<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration == null ? Input.empty() : this.amiDistributionConfiguration;
    }

    /**
     * Configuration block with container distribution settings. Detailed below.
     * 
     */
    @InputImport(name="containerDistributionConfiguration")
    private final @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration;

    public Input<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> getContainerDistributionConfiguration() {
        return this.containerDistributionConfiguration == null ? Input.empty() : this.containerDistributionConfiguration;
    }

    /**
     * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
     * 
     */
    @InputImport(name="licenseConfigurationArns")
    private final @Nullable Input<List<String>> licenseConfigurationArns;

    public Input<List<String>> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns == null ? Input.empty() : this.licenseConfigurationArns;
    }

    /**
     * AWS Region for the distribution.
     * 
     */
    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    public DistributionConfigurationDistributionArgs(
        @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration,
        @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration,
        @Nullable Input<List<String>> licenseConfigurationArns,
        Input<String> region) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        this.containerDistributionConfiguration = containerDistributionConfiguration;
        this.licenseConfigurationArns = licenseConfigurationArns;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private DistributionConfigurationDistributionArgs() {
        this.amiDistributionConfiguration = Input.empty();
        this.containerDistributionConfiguration = Input.empty();
        this.licenseConfigurationArns = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration;
        private @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration;
        private @Nullable Input<List<String>> licenseConfigurationArns;
        private Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfiguration = defaults.amiDistributionConfiguration;
    	      this.containerDistributionConfiguration = defaults.containerDistributionConfiguration;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder setAmiDistributionConfiguration(@Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        public Builder setAmiDistributionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationArgs amiDistributionConfiguration) {
            this.amiDistributionConfiguration = Input.ofNullable(amiDistributionConfiguration);
            return this;
        }

        public Builder setContainerDistributionConfiguration(@Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        public Builder setContainerDistributionConfiguration(@Nullable DistributionConfigurationDistributionContainerDistributionConfigurationArgs containerDistributionConfiguration) {
            this.containerDistributionConfiguration = Input.ofNullable(containerDistributionConfiguration);
            return this;
        }

        public Builder setLicenseConfigurationArns(@Nullable Input<List<String>> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        public Builder setLicenseConfigurationArns(@Nullable List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = Input.ofNullable(licenseConfigurationArns);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }
        public DistributionConfigurationDistributionArgs build() {
            return new DistributionConfigurationDistributionArgs(amiDistributionConfiguration, containerDistributionConfiguration, licenseConfigurationArns, region);
        }
    }
}