// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.outputs;

import io.pulumi.awsnative.servicecatalog.enums.CloudFormationProvisionedProductAcceptLanguage;
import io.pulumi.awsnative.servicecatalog.outputs.CloudFormationProvisionedProductProvisioningParameter;
import io.pulumi.awsnative.servicecatalog.outputs.CloudFormationProvisionedProductProvisioningPreferences;
import io.pulumi.awsnative.servicecatalog.outputs.CloudFormationProvisionedProductTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCloudFormationProvisionedProductResult {
    private final @Nullable CloudFormationProvisionedProductAcceptLanguage acceptLanguage;
    private final @Nullable String cloudformationStackArn;
    /**
     * List of key-value pair outputs.
     * 
     */
    private final @Nullable Object outputs;
    private final @Nullable String pathId;
    private final @Nullable String pathName;
    private final @Nullable String productId;
    private final @Nullable String productName;
    private final @Nullable String provisionedProductId;
    private final @Nullable String provisioningArtifactId;
    private final @Nullable String provisioningArtifactName;
    private final @Nullable List<CloudFormationProvisionedProductProvisioningParameter> provisioningParameters;
    private final @Nullable CloudFormationProvisionedProductProvisioningPreferences provisioningPreferences;
    private final @Nullable String recordId;
    private final @Nullable List<CloudFormationProvisionedProductTag> tags;

    @OutputCustomType.Constructor({"acceptLanguage","cloudformationStackArn","outputs","pathId","pathName","productId","productName","provisionedProductId","provisioningArtifactId","provisioningArtifactName","provisioningParameters","provisioningPreferences","recordId","tags"})
    private GetCloudFormationProvisionedProductResult(
        @Nullable CloudFormationProvisionedProductAcceptLanguage acceptLanguage,
        @Nullable String cloudformationStackArn,
        @Nullable Object outputs,
        @Nullable String pathId,
        @Nullable String pathName,
        @Nullable String productId,
        @Nullable String productName,
        @Nullable String provisionedProductId,
        @Nullable String provisioningArtifactId,
        @Nullable String provisioningArtifactName,
        @Nullable List<CloudFormationProvisionedProductProvisioningParameter> provisioningParameters,
        @Nullable CloudFormationProvisionedProductProvisioningPreferences provisioningPreferences,
        @Nullable String recordId,
        @Nullable List<CloudFormationProvisionedProductTag> tags) {
        this.acceptLanguage = acceptLanguage;
        this.cloudformationStackArn = cloudformationStackArn;
        this.outputs = outputs;
        this.pathId = pathId;
        this.pathName = pathName;
        this.productId = productId;
        this.productName = productName;
        this.provisionedProductId = provisionedProductId;
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningArtifactName = provisioningArtifactName;
        this.provisioningParameters = provisioningParameters;
        this.provisioningPreferences = provisioningPreferences;
        this.recordId = recordId;
        this.tags = tags;
    }

    public Optional<CloudFormationProvisionedProductAcceptLanguage> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    public Optional<String> getCloudformationStackArn() {
        return Optional.ofNullable(this.cloudformationStackArn);
    }
    /**
     * List of key-value pair outputs.
     * 
     */
    public Optional<Object> getOutputs() {
        return Optional.ofNullable(this.outputs);
    }
    public Optional<String> getPathId() {
        return Optional.ofNullable(this.pathId);
    }
    public Optional<String> getPathName() {
        return Optional.ofNullable(this.pathName);
    }
    public Optional<String> getProductId() {
        return Optional.ofNullable(this.productId);
    }
    public Optional<String> getProductName() {
        return Optional.ofNullable(this.productName);
    }
    public Optional<String> getProvisionedProductId() {
        return Optional.ofNullable(this.provisionedProductId);
    }
    public Optional<String> getProvisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }
    public Optional<String> getProvisioningArtifactName() {
        return Optional.ofNullable(this.provisioningArtifactName);
    }
    public List<CloudFormationProvisionedProductProvisioningParameter> getProvisioningParameters() {
        return this.provisioningParameters == null ? List.of() : this.provisioningParameters;
    }
    public Optional<CloudFormationProvisionedProductProvisioningPreferences> getProvisioningPreferences() {
        return Optional.ofNullable(this.provisioningPreferences);
    }
    public Optional<String> getRecordId() {
        return Optional.ofNullable(this.recordId);
    }
    public List<CloudFormationProvisionedProductTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudFormationProvisionedProductResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudFormationProvisionedProductAcceptLanguage acceptLanguage;
        private @Nullable String cloudformationStackArn;
        private @Nullable Object outputs;
        private @Nullable String pathId;
        private @Nullable String pathName;
        private @Nullable String productId;
        private @Nullable String productName;
        private @Nullable String provisionedProductId;
        private @Nullable String provisioningArtifactId;
        private @Nullable String provisioningArtifactName;
        private @Nullable List<CloudFormationProvisionedProductProvisioningParameter> provisioningParameters;
        private @Nullable CloudFormationProvisionedProductProvisioningPreferences provisioningPreferences;
        private @Nullable String recordId;
        private @Nullable List<CloudFormationProvisionedProductTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudFormationProvisionedProductResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.cloudformationStackArn = defaults.cloudformationStackArn;
    	      this.outputs = defaults.outputs;
    	      this.pathId = defaults.pathId;
    	      this.pathName = defaults.pathName;
    	      this.productId = defaults.productId;
    	      this.productName = defaults.productName;
    	      this.provisionedProductId = defaults.provisionedProductId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningArtifactName = defaults.provisioningArtifactName;
    	      this.provisioningParameters = defaults.provisioningParameters;
    	      this.provisioningPreferences = defaults.provisioningPreferences;
    	      this.recordId = defaults.recordId;
    	      this.tags = defaults.tags;
        }

        public Builder setAcceptLanguage(@Nullable CloudFormationProvisionedProductAcceptLanguage acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setCloudformationStackArn(@Nullable String cloudformationStackArn) {
            this.cloudformationStackArn = cloudformationStackArn;
            return this;
        }

        public Builder setOutputs(@Nullable Object outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setPathId(@Nullable String pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder setPathName(@Nullable String pathName) {
            this.pathName = pathName;
            return this;
        }

        public Builder setProductId(@Nullable String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProvisionedProductId(@Nullable String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        public Builder setProvisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder setProvisioningArtifactName(@Nullable String provisioningArtifactName) {
            this.provisioningArtifactName = provisioningArtifactName;
            return this;
        }

        public Builder setProvisioningParameters(@Nullable List<CloudFormationProvisionedProductProvisioningParameter> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder setProvisioningPreferences(@Nullable CloudFormationProvisionedProductProvisioningPreferences provisioningPreferences) {
            this.provisioningPreferences = provisioningPreferences;
            return this;
        }

        public Builder setRecordId(@Nullable String recordId) {
            this.recordId = recordId;
            return this;
        }

        public Builder setTags(@Nullable List<CloudFormationProvisionedProductTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetCloudFormationProvisionedProductResult build() {
            return new GetCloudFormationProvisionedProductResult(acceptLanguage, cloudformationStackArn, outputs, pathId, pathName, productId, productName, provisionedProductId, provisioningArtifactId, provisioningArtifactName, provisioningParameters, provisioningPreferences, recordId, tags);
        }
    }
}
