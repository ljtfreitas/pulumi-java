// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.ResourceVersionProvisioningType;
import io.pulumi.awsnative.cloudformation.enums.ResourceVersionVisibility;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceVersionResult {
    /**
     * The Amazon Resource Name (ARN) of the type, here the ResourceVersion. This is used to uniquely identify a ResourceVersion resource
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates if this type version is the current default version
     * 
     */
    private final @Nullable Boolean isDefaultVersion;
    /**
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * 
     */
    private final @Nullable ResourceVersionProvisioningType provisioningType;
    /**
     * The Amazon Resource Name (ARN) of the type without the versionID.
     * 
     */
    private final @Nullable String typeArn;
    /**
     * The ID of the version of the type represented by this resource instance.
     * 
     */
    private final @Nullable String versionId;
    /**
     * The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
     */
    private final @Nullable ResourceVersionVisibility visibility;

    @CustomType.Constructor
    private GetResourceVersionResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("isDefaultVersion") @Nullable Boolean isDefaultVersion,
        @CustomType.Parameter("provisioningType") @Nullable ResourceVersionProvisioningType provisioningType,
        @CustomType.Parameter("typeArn") @Nullable String typeArn,
        @CustomType.Parameter("versionId") @Nullable String versionId,
        @CustomType.Parameter("visibility") @Nullable ResourceVersionVisibility visibility) {
        this.arn = arn;
        this.isDefaultVersion = isDefaultVersion;
        this.provisioningType = provisioningType;
        this.typeArn = typeArn;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    /**
     * The Amazon Resource Name (ARN) of the type, here the ResourceVersion. This is used to uniquely identify a ResourceVersion resource
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates if this type version is the current default version
     * 
    */
    public Optional<Boolean> getIsDefaultVersion() {
        return Optional.ofNullable(this.isDefaultVersion);
    }
    /**
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * 
    */
    public Optional<ResourceVersionProvisioningType> getProvisioningType() {
        return Optional.ofNullable(this.provisioningType);
    }
    /**
     * The Amazon Resource Name (ARN) of the type without the versionID.
     * 
    */
    public Optional<String> getTypeArn() {
        return Optional.ofNullable(this.typeArn);
    }
    /**
     * The ID of the version of the type represented by this resource instance.
     * 
    */
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }
    /**
     * The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
    */
    public Optional<ResourceVersionVisibility> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean isDefaultVersion;
        private @Nullable ResourceVersionProvisioningType provisioningType;
        private @Nullable String typeArn;
        private @Nullable String versionId;
        private @Nullable ResourceVersionVisibility visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.provisioningType = defaults.provisioningType;
    	      this.typeArn = defaults.typeArn;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder isDefaultVersion(@Nullable Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }

        public Builder provisioningType(@Nullable ResourceVersionProvisioningType provisioningType) {
            this.provisioningType = provisioningType;
            return this;
        }

        public Builder typeArn(@Nullable String typeArn) {
            this.typeArn = typeArn;
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder visibility(@Nullable ResourceVersionVisibility visibility) {
            this.visibility = visibility;
            return this;
        }
        public GetResourceVersionResult build() {
            return new GetResourceVersionResult(arn, isDefaultVersion, provisioningType, typeArn, versionId, visibility);
        }
    }
}
