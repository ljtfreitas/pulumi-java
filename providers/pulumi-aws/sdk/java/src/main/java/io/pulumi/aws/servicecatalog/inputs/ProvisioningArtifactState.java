// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisioningArtifactState extends io.pulumi.resources.ResourceArgs {

    public static final ProvisioningArtifactState Empty = new ProvisioningArtifactState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
    private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<Boolean> active;

    public Input<Boolean> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * Time when the provisioning artifact was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    @InputImport(name="disableTemplateValidation")
    private final @Nullable Input<Boolean> disableTemplateValidation;

    public Input<Boolean> getDisableTemplateValidation() {
        return this.disableTemplateValidation == null ? Input.empty() : this.disableTemplateValidation;
    }

    /**
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
     * 
     */
    @InputImport(name="guidance")
    private final @Nullable Input<String> guidance;

    public Input<String> getGuidance() {
        return this.guidance == null ? Input.empty() : this.guidance;
    }

    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Identifier of the product.
     * 
     */
    @InputImport(name="productId")
    private final @Nullable Input<String> productId;

    public Input<String> getProductId() {
        return this.productId == null ? Input.empty() : this.productId;
    }

    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    @InputImport(name="templatePhysicalId")
    private final @Nullable Input<String> templatePhysicalId;

    public Input<String> getTemplatePhysicalId() {
        return this.templatePhysicalId == null ? Input.empty() : this.templatePhysicalId;
    }

    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
     */
    @InputImport(name="templateUrl")
    private final @Nullable Input<String> templateUrl;

    public Input<String> getTemplateUrl() {
        return this.templateUrl == null ? Input.empty() : this.templateUrl;
    }

    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProvisioningArtifactState(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<Boolean> active,
        @Nullable Input<String> createdTime,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disableTemplateValidation,
        @Nullable Input<String> guidance,
        @Nullable Input<String> name,
        @Nullable Input<String> productId,
        @Nullable Input<String> templatePhysicalId,
        @Nullable Input<String> templateUrl,
        @Nullable Input<String> type) {
        this.acceptLanguage = acceptLanguage;
        this.active = active;
        this.createdTime = createdTime;
        this.description = description;
        this.disableTemplateValidation = disableTemplateValidation;
        this.guidance = guidance;
        this.name = name;
        this.productId = productId;
        this.templatePhysicalId = templatePhysicalId;
        this.templateUrl = templateUrl;
        this.type = type;
    }

    private ProvisioningArtifactState() {
        this.acceptLanguage = Input.empty();
        this.active = Input.empty();
        this.createdTime = Input.empty();
        this.description = Input.empty();
        this.disableTemplateValidation = Input.empty();
        this.guidance = Input.empty();
        this.name = Input.empty();
        this.productId = Input.empty();
        this.templatePhysicalId = Input.empty();
        this.templateUrl = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningArtifactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<Boolean> active;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disableTemplateValidation;
        private @Nullable Input<String> guidance;
        private @Nullable Input<String> name;
        private @Nullable Input<String> productId;
        private @Nullable Input<String> templatePhysicalId;
        private @Nullable Input<String> templateUrl;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningArtifactState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.active = defaults.active;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.disableTemplateValidation = defaults.disableTemplateValidation;
    	      this.guidance = defaults.guidance;
    	      this.name = defaults.name;
    	      this.productId = defaults.productId;
    	      this.templatePhysicalId = defaults.templatePhysicalId;
    	      this.templateUrl = defaults.templateUrl;
    	      this.type = defaults.type;
        }

        public Builder setAcceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder setActive(@Nullable Input<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Boolean active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisableTemplateValidation(@Nullable Input<Boolean> disableTemplateValidation) {
            this.disableTemplateValidation = disableTemplateValidation;
            return this;
        }

        public Builder setDisableTemplateValidation(@Nullable Boolean disableTemplateValidation) {
            this.disableTemplateValidation = Input.ofNullable(disableTemplateValidation);
            return this;
        }

        public Builder setGuidance(@Nullable Input<String> guidance) {
            this.guidance = guidance;
            return this;
        }

        public Builder setGuidance(@Nullable String guidance) {
            this.guidance = Input.ofNullable(guidance);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProductId(@Nullable Input<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductId(@Nullable String productId) {
            this.productId = Input.ofNullable(productId);
            return this;
        }

        public Builder setTemplatePhysicalId(@Nullable Input<String> templatePhysicalId) {
            this.templatePhysicalId = templatePhysicalId;
            return this;
        }

        public Builder setTemplatePhysicalId(@Nullable String templatePhysicalId) {
            this.templatePhysicalId = Input.ofNullable(templatePhysicalId);
            return this;
        }

        public Builder setTemplateUrl(@Nullable Input<String> templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }

        public Builder setTemplateUrl(@Nullable String templateUrl) {
            this.templateUrl = Input.ofNullable(templateUrl);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ProvisioningArtifactState build() {
            return new ProvisioningArtifactState(acceptLanguage, active, createdTime, description, disableTemplateValidation, guidance, name, productId, templatePhysicalId, templateUrl, type);
        }
    }
}
