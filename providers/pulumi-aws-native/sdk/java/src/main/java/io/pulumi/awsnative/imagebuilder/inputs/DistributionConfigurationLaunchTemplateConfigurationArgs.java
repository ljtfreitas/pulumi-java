// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * launchTemplateConfiguration settings that apply to image distribution.
 * 
 */
public final class DistributionConfigurationLaunchTemplateConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationLaunchTemplateConfigurationArgs Empty = new DistributionConfigurationLaunchTemplateConfigurationArgs();

    /**
     * The account ID that this configuration applies to.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * Identifies the EC2 launch template to use.
     * 
     */
    @Import(name="launchTemplateId")
      private final @Nullable Output<String> launchTemplateId;

    public Output<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Output.empty() : this.launchTemplateId;
    }

    /**
     * Set the specified EC2 launch template as the default launch template for the specified account.
     * 
     */
    @Import(name="setDefaultVersion")
      private final @Nullable Output<Boolean> setDefaultVersion;

    public Output<Boolean> getSetDefaultVersion() {
        return this.setDefaultVersion == null ? Output.empty() : this.setDefaultVersion;
    }

    public DistributionConfigurationLaunchTemplateConfigurationArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<String> launchTemplateId,
        @Nullable Output<Boolean> setDefaultVersion) {
        this.accountId = accountId;
        this.launchTemplateId = launchTemplateId;
        this.setDefaultVersion = setDefaultVersion;
    }

    private DistributionConfigurationLaunchTemplateConfigurationArgs() {
        this.accountId = Output.empty();
        this.launchTemplateId = Output.empty();
        this.setDefaultVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationLaunchTemplateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> launchTemplateId;
        private @Nullable Output<Boolean> setDefaultVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationLaunchTemplateConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.setDefaultVersion = defaults.setDefaultVersion;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }

        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = Output.ofNullable(launchTemplateId);
            return this;
        }

        public Builder setDefaultVersion(@Nullable Output<Boolean> setDefaultVersion) {
            this.setDefaultVersion = setDefaultVersion;
            return this;
        }

        public Builder setDefaultVersion(@Nullable Boolean setDefaultVersion) {
            this.setDefaultVersion = Output.ofNullable(setDefaultVersion);
            return this;
        }
        public DistributionConfigurationLaunchTemplateConfigurationArgs build() {
            return new DistributionConfigurationLaunchTemplateConfigurationArgs(accountId, launchTemplateId, setDefaultVersion);
        }
    }
}
