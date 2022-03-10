// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.awsnative.licensemanager.outputs.LicenseBorrowConfiguration;
import io.pulumi.awsnative.licensemanager.outputs.LicenseProvisionalConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LicenseConsumptionConfiguration {
    private final @Nullable LicenseBorrowConfiguration borrowConfiguration;
    private final @Nullable LicenseProvisionalConfiguration provisionalConfiguration;
    private final @Nullable String renewType;

    @OutputCustomType.Constructor
    private LicenseConsumptionConfiguration(
        @OutputCustomType.Parameter("borrowConfiguration") @Nullable LicenseBorrowConfiguration borrowConfiguration,
        @OutputCustomType.Parameter("provisionalConfiguration") @Nullable LicenseProvisionalConfiguration provisionalConfiguration,
        @OutputCustomType.Parameter("renewType") @Nullable String renewType) {
        this.borrowConfiguration = borrowConfiguration;
        this.provisionalConfiguration = provisionalConfiguration;
        this.renewType = renewType;
    }

    public Optional<LicenseBorrowConfiguration> getBorrowConfiguration() {
        return Optional.ofNullable(this.borrowConfiguration);
    }
    public Optional<LicenseProvisionalConfiguration> getProvisionalConfiguration() {
        return Optional.ofNullable(this.provisionalConfiguration);
    }
    public Optional<String> getRenewType() {
        return Optional.ofNullable(this.renewType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseConsumptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LicenseBorrowConfiguration borrowConfiguration;
        private @Nullable LicenseProvisionalConfiguration provisionalConfiguration;
        private @Nullable String renewType;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseConsumptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.borrowConfiguration = defaults.borrowConfiguration;
    	      this.provisionalConfiguration = defaults.provisionalConfiguration;
    	      this.renewType = defaults.renewType;
        }

        public Builder setBorrowConfiguration(@Nullable LicenseBorrowConfiguration borrowConfiguration) {
            this.borrowConfiguration = borrowConfiguration;
            return this;
        }

        public Builder setProvisionalConfiguration(@Nullable LicenseProvisionalConfiguration provisionalConfiguration) {
            this.provisionalConfiguration = provisionalConfiguration;
            return this;
        }

        public Builder setRenewType(@Nullable String renewType) {
            this.renewType = renewType;
            return this;
        }
        public LicenseConsumptionConfiguration build() {
            return new LicenseConsumptionConfiguration(borrowConfiguration, provisionalConfiguration, renewType);
        }
    }
}
