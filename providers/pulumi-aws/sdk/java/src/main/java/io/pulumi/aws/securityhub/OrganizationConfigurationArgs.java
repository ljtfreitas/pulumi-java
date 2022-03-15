// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationArgs Empty = new OrganizationConfigurationArgs();

    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * 
     */
    @Import(name="autoEnable", required=true)
      private final Output<Boolean> autoEnable;

    public Output<Boolean> getAutoEnable() {
        return this.autoEnable;
    }

    public OrganizationConfigurationArgs(Output<Boolean> autoEnable) {
        this.autoEnable = Objects.requireNonNull(autoEnable, "expected parameter 'autoEnable' to be non-null");
    }

    private OrganizationConfigurationArgs() {
        this.autoEnable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> autoEnable;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
        }

        public Builder autoEnable(Output<Boolean> autoEnable) {
            this.autoEnable = Objects.requireNonNull(autoEnable);
            return this;
        }

        public Builder autoEnable(Boolean autoEnable) {
            this.autoEnable = Output.of(Objects.requireNonNull(autoEnable));
            return this;
        }
        public OrganizationConfigurationArgs build() {
            return new OrganizationConfigurationArgs(autoEnable);
        }
    }
}
