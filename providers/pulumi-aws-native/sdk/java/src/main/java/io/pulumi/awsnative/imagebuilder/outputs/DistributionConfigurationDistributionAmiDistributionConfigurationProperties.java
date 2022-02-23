// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionConfigurationDistributionAmiDistributionConfigurationProperties {
    /**
     * The tags to apply to AMIs distributed to this Region.
     * 
     */
    private final @Nullable Object amiTags;
    /**
     * The description of the AMI distribution configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * The KMS key identifier used to encrypt the distributed image.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * 
     */
    private final @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration;
    /**
     * The name of the AMI distribution configuration.
     * 
     */
    private final @Nullable String name;
    /**
     * The ID of accounts to which you want to distribute an image.
     * 
     */
    private final @Nullable List<String> targetAccountIds;

    @OutputCustomType.Constructor({"amiTags","description","kmsKeyId","launchPermissionConfiguration","name","targetAccountIds"})
    private DistributionConfigurationDistributionAmiDistributionConfigurationProperties(
        @Nullable Object amiTags,
        @Nullable String description,
        @Nullable String kmsKeyId,
        @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration,
        @Nullable String name,
        @Nullable List<String> targetAccountIds) {
        this.amiTags = amiTags;
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.launchPermissionConfiguration = launchPermissionConfiguration;
        this.name = name;
        this.targetAccountIds = targetAccountIds;
    }

    /**
     * The tags to apply to AMIs distributed to this Region.
     * 
     */
    public Optional<Object> getAmiTags() {
        return Optional.ofNullable(this.amiTags);
    }
    /**
     * The description of the AMI distribution configuration.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The KMS key identifier used to encrypt the distributed image.
     * 
     */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * 
     */
    public Optional<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties> getLaunchPermissionConfiguration() {
        return Optional.ofNullable(this.launchPermissionConfiguration);
    }
    /**
     * The name of the AMI distribution configuration.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The ID of accounts to which you want to distribute an image.
     * 
     */
    public List<String> getTargetAccountIds() {
        return this.targetAccountIds == null ? List.of() : this.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object amiTags;
        private @Nullable String description;
        private @Nullable String kmsKeyId;
        private @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration;
        private @Nullable String name;
        private @Nullable List<String> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermissionConfiguration = defaults.launchPermissionConfiguration;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder setAmiTags(@Nullable Object amiTags) {
            this.amiTags = amiTags;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setLaunchPermissionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration) {
            this.launchPermissionConfiguration = launchPermissionConfiguration;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTargetAccountIds(@Nullable List<String> targetAccountIds) {
            this.targetAccountIds = targetAccountIds;
            return this;
        }
        public DistributionConfigurationDistributionAmiDistributionConfigurationProperties build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationProperties(amiTags, description, kmsKeyId, launchPermissionConfiguration, name, targetAccountIds);
        }
    }
}
