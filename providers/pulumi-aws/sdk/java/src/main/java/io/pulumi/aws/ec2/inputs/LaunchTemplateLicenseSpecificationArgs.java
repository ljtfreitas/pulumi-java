// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LaunchTemplateLicenseSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateLicenseSpecificationArgs Empty = new LaunchTemplateLicenseSpecificationArgs();

    /**
     * ARN of the license configuration.
     * 
     */
    @Import(name="licenseConfigurationArn", required=true)
      private final Output<String> licenseConfigurationArn;

    public Output<String> getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    public LaunchTemplateLicenseSpecificationArgs(Output<String> licenseConfigurationArn) {
        this.licenseConfigurationArn = Objects.requireNonNull(licenseConfigurationArn, "expected parameter 'licenseConfigurationArn' to be non-null");
    }

    private LaunchTemplateLicenseSpecificationArgs() {
        this.licenseConfigurationArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateLicenseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> licenseConfigurationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateLicenseSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseConfigurationArn = defaults.licenseConfigurationArn;
        }

        public Builder licenseConfigurationArn(Output<String> licenseConfigurationArn) {
            this.licenseConfigurationArn = Objects.requireNonNull(licenseConfigurationArn);
            return this;
        }

        public Builder licenseConfigurationArn(String licenseConfigurationArn) {
            this.licenseConfigurationArn = Output.of(Objects.requireNonNull(licenseConfigurationArn));
            return this;
        }
        public LaunchTemplateLicenseSpecificationArgs build() {
            return new LaunchTemplateLicenseSpecificationArgs(licenseConfigurationArn);
        }
    }
}
