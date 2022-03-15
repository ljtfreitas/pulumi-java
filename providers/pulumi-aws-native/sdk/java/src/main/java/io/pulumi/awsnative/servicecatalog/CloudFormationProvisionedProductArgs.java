// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog;

import io.pulumi.awsnative.servicecatalog.enums.CloudFormationProvisionedProductAcceptLanguage;
import io.pulumi.awsnative.servicecatalog.inputs.CloudFormationProvisionedProductProvisioningParameterArgs;
import io.pulumi.awsnative.servicecatalog.inputs.CloudFormationProvisionedProductProvisioningPreferencesArgs;
import io.pulumi.awsnative.servicecatalog.inputs.CloudFormationProvisionedProductTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudFormationProvisionedProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFormationProvisionedProductArgs Empty = new CloudFormationProvisionedProductArgs();

    @Import(name="acceptLanguage")
      private final @Nullable Output<CloudFormationProvisionedProductAcceptLanguage> acceptLanguage;

    public Output<CloudFormationProvisionedProductAcceptLanguage> getAcceptLanguage() {
        return this.acceptLanguage == null ? Output.empty() : this.acceptLanguage;
    }

    @Import(name="notificationArns")
      private final @Nullable Output<List<String>> notificationArns;

    public Output<List<String>> getNotificationArns() {
        return this.notificationArns == null ? Output.empty() : this.notificationArns;
    }

    @Import(name="pathId")
      private final @Nullable Output<String> pathId;

    public Output<String> getPathId() {
        return this.pathId == null ? Output.empty() : this.pathId;
    }

    @Import(name="pathName")
      private final @Nullable Output<String> pathName;

    public Output<String> getPathName() {
        return this.pathName == null ? Output.empty() : this.pathName;
    }

    @Import(name="productId")
      private final @Nullable Output<String> productId;

    public Output<String> getProductId() {
        return this.productId == null ? Output.empty() : this.productId;
    }

    @Import(name="productName")
      private final @Nullable Output<String> productName;

    public Output<String> getProductName() {
        return this.productName == null ? Output.empty() : this.productName;
    }

    @Import(name="provisionedProductName")
      private final @Nullable Output<String> provisionedProductName;

    public Output<String> getProvisionedProductName() {
        return this.provisionedProductName == null ? Output.empty() : this.provisionedProductName;
    }

    @Import(name="provisioningArtifactId")
      private final @Nullable Output<String> provisioningArtifactId;

    public Output<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Output.empty() : this.provisioningArtifactId;
    }

    @Import(name="provisioningArtifactName")
      private final @Nullable Output<String> provisioningArtifactName;

    public Output<String> getProvisioningArtifactName() {
        return this.provisioningArtifactName == null ? Output.empty() : this.provisioningArtifactName;
    }

    @Import(name="provisioningParameters")
      private final @Nullable Output<List<CloudFormationProvisionedProductProvisioningParameterArgs>> provisioningParameters;

    public Output<List<CloudFormationProvisionedProductProvisioningParameterArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Output.empty() : this.provisioningParameters;
    }

    @Import(name="provisioningPreferences")
      private final @Nullable Output<CloudFormationProvisionedProductProvisioningPreferencesArgs> provisioningPreferences;

    public Output<CloudFormationProvisionedProductProvisioningPreferencesArgs> getProvisioningPreferences() {
        return this.provisioningPreferences == null ? Output.empty() : this.provisioningPreferences;
    }

    @Import(name="tags")
      private final @Nullable Output<List<CloudFormationProvisionedProductTagArgs>> tags;

    public Output<List<CloudFormationProvisionedProductTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CloudFormationProvisionedProductArgs(
        @Nullable Output<CloudFormationProvisionedProductAcceptLanguage> acceptLanguage,
        @Nullable Output<List<String>> notificationArns,
        @Nullable Output<String> pathId,
        @Nullable Output<String> pathName,
        @Nullable Output<String> productId,
        @Nullable Output<String> productName,
        @Nullable Output<String> provisionedProductName,
        @Nullable Output<String> provisioningArtifactId,
        @Nullable Output<String> provisioningArtifactName,
        @Nullable Output<List<CloudFormationProvisionedProductProvisioningParameterArgs>> provisioningParameters,
        @Nullable Output<CloudFormationProvisionedProductProvisioningPreferencesArgs> provisioningPreferences,
        @Nullable Output<List<CloudFormationProvisionedProductTagArgs>> tags) {
        this.acceptLanguage = acceptLanguage;
        this.notificationArns = notificationArns;
        this.pathId = pathId;
        this.pathName = pathName;
        this.productId = productId;
        this.productName = productName;
        this.provisionedProductName = provisionedProductName;
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningArtifactName = provisioningArtifactName;
        this.provisioningParameters = provisioningParameters;
        this.provisioningPreferences = provisioningPreferences;
        this.tags = tags;
    }

    private CloudFormationProvisionedProductArgs() {
        this.acceptLanguage = Output.empty();
        this.notificationArns = Output.empty();
        this.pathId = Output.empty();
        this.pathName = Output.empty();
        this.productId = Output.empty();
        this.productName = Output.empty();
        this.provisionedProductName = Output.empty();
        this.provisioningArtifactId = Output.empty();
        this.provisioningArtifactName = Output.empty();
        this.provisioningParameters = Output.empty();
        this.provisioningPreferences = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudFormationProvisionedProductAcceptLanguage> acceptLanguage;
        private @Nullable Output<List<String>> notificationArns;
        private @Nullable Output<String> pathId;
        private @Nullable Output<String> pathName;
        private @Nullable Output<String> productId;
        private @Nullable Output<String> productName;
        private @Nullable Output<String> provisionedProductName;
        private @Nullable Output<String> provisioningArtifactId;
        private @Nullable Output<String> provisioningArtifactName;
        private @Nullable Output<List<CloudFormationProvisionedProductProvisioningParameterArgs>> provisioningParameters;
        private @Nullable Output<CloudFormationProvisionedProductProvisioningPreferencesArgs> provisioningPreferences;
        private @Nullable Output<List<CloudFormationProvisionedProductTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationProvisionedProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.notificationArns = defaults.notificationArns;
    	      this.pathId = defaults.pathId;
    	      this.pathName = defaults.pathName;
    	      this.productId = defaults.productId;
    	      this.productName = defaults.productName;
    	      this.provisionedProductName = defaults.provisionedProductName;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningArtifactName = defaults.provisioningArtifactName;
    	      this.provisioningParameters = defaults.provisioningParameters;
    	      this.provisioningPreferences = defaults.provisioningPreferences;
    	      this.tags = defaults.tags;
        }

        public Builder acceptLanguage(@Nullable Output<CloudFormationProvisionedProductAcceptLanguage> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable CloudFormationProvisionedProductAcceptLanguage acceptLanguage) {
            this.acceptLanguage = Output.ofNullable(acceptLanguage);
            return this;
        }

        public Builder notificationArns(@Nullable Output<List<String>> notificationArns) {
            this.notificationArns = notificationArns;
            return this;
        }

        public Builder notificationArns(@Nullable List<String> notificationArns) {
            this.notificationArns = Output.ofNullable(notificationArns);
            return this;
        }

        public Builder pathId(@Nullable Output<String> pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder pathId(@Nullable String pathId) {
            this.pathId = Output.ofNullable(pathId);
            return this;
        }

        public Builder pathName(@Nullable Output<String> pathName) {
            this.pathName = pathName;
            return this;
        }

        public Builder pathName(@Nullable String pathName) {
            this.pathName = Output.ofNullable(pathName);
            return this;
        }

        public Builder productId(@Nullable Output<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder productId(@Nullable String productId) {
            this.productId = Output.ofNullable(productId);
            return this;
        }

        public Builder productName(@Nullable Output<String> productName) {
            this.productName = productName;
            return this;
        }

        public Builder productName(@Nullable String productName) {
            this.productName = Output.ofNullable(productName);
            return this;
        }

        public Builder provisionedProductName(@Nullable Output<String> provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }

        public Builder provisionedProductName(@Nullable String provisionedProductName) {
            this.provisionedProductName = Output.ofNullable(provisionedProductName);
            return this;
        }

        public Builder provisioningArtifactId(@Nullable Output<String> provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder provisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = Output.ofNullable(provisioningArtifactId);
            return this;
        }

        public Builder provisioningArtifactName(@Nullable Output<String> provisioningArtifactName) {
            this.provisioningArtifactName = provisioningArtifactName;
            return this;
        }

        public Builder provisioningArtifactName(@Nullable String provisioningArtifactName) {
            this.provisioningArtifactName = Output.ofNullable(provisioningArtifactName);
            return this;
        }

        public Builder provisioningParameters(@Nullable Output<List<CloudFormationProvisionedProductProvisioningParameterArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder provisioningParameters(@Nullable List<CloudFormationProvisionedProductProvisioningParameterArgs> provisioningParameters) {
            this.provisioningParameters = Output.ofNullable(provisioningParameters);
            return this;
        }

        public Builder provisioningPreferences(@Nullable Output<CloudFormationProvisionedProductProvisioningPreferencesArgs> provisioningPreferences) {
            this.provisioningPreferences = provisioningPreferences;
            return this;
        }

        public Builder provisioningPreferences(@Nullable CloudFormationProvisionedProductProvisioningPreferencesArgs provisioningPreferences) {
            this.provisioningPreferences = Output.ofNullable(provisioningPreferences);
            return this;
        }

        public Builder tags(@Nullable Output<List<CloudFormationProvisionedProductTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<CloudFormationProvisionedProductTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public CloudFormationProvisionedProductArgs build() {
            return new CloudFormationProvisionedProductArgs(acceptLanguage, notificationArns, pathId, pathName, productId, productName, provisionedProductName, provisioningArtifactId, provisioningArtifactName, provisioningParameters, provisioningPreferences, tags);
        }
    }
}
