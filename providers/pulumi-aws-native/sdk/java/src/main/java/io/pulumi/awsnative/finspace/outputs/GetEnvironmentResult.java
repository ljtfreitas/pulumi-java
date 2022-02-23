// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.outputs;

import io.pulumi.awsnative.finspace.enums.EnvironmentFederationMode;
import io.pulumi.awsnative.finspace.enums.EnvironmentStatus;
import io.pulumi.awsnative.finspace.outputs.EnvironmentFederationParameters;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * AWS account ID associated with the Environment
     * 
     */
    private final @Nullable String awsAccountId;
    /**
     * ID for FinSpace created account used to store Environment artifacts
     * 
     */
    private final @Nullable String dedicatedServiceAccountId;
    /**
     * Description of the Environment
     * 
     */
    private final @Nullable String description;
    /**
     * ARN of the Environment
     * 
     */
    private final @Nullable String environmentArn;
    /**
     * Unique identifier for representing FinSpace Environment
     * 
     */
    private final @Nullable String environmentId;
    /**
     * URL used to login to the Environment
     * 
     */
    private final @Nullable String environmentUrl;
    /**
     * Federation mode used with the Environment
     * 
     */
    private final @Nullable EnvironmentFederationMode federationMode;
    private final @Nullable EnvironmentFederationParameters federationParameters;
    /**
     * Name of the Environment
     * 
     */
    private final @Nullable String name;
    /**
     * SageMaker Studio Domain URL associated with the Environment
     * 
     */
    private final @Nullable String sageMakerStudioDomainUrl;
    /**
     * State of the Environment
     * 
     */
    private final @Nullable EnvironmentStatus status;

    @OutputCustomType.Constructor({"awsAccountId","dedicatedServiceAccountId","description","environmentArn","environmentId","environmentUrl","federationMode","federationParameters","name","sageMakerStudioDomainUrl","status"})
    private GetEnvironmentResult(
        @Nullable String awsAccountId,
        @Nullable String dedicatedServiceAccountId,
        @Nullable String description,
        @Nullable String environmentArn,
        @Nullable String environmentId,
        @Nullable String environmentUrl,
        @Nullable EnvironmentFederationMode federationMode,
        @Nullable EnvironmentFederationParameters federationParameters,
        @Nullable String name,
        @Nullable String sageMakerStudioDomainUrl,
        @Nullable EnvironmentStatus status) {
        this.awsAccountId = awsAccountId;
        this.dedicatedServiceAccountId = dedicatedServiceAccountId;
        this.description = description;
        this.environmentArn = environmentArn;
        this.environmentId = environmentId;
        this.environmentUrl = environmentUrl;
        this.federationMode = federationMode;
        this.federationParameters = federationParameters;
        this.name = name;
        this.sageMakerStudioDomainUrl = sageMakerStudioDomainUrl;
        this.status = status;
    }

    /**
     * AWS account ID associated with the Environment
     * 
     */
    public Optional<String> getAwsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }
    /**
     * ID for FinSpace created account used to store Environment artifacts
     * 
     */
    public Optional<String> getDedicatedServiceAccountId() {
        return Optional.ofNullable(this.dedicatedServiceAccountId);
    }
    /**
     * Description of the Environment
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * ARN of the Environment
     * 
     */
    public Optional<String> getEnvironmentArn() {
        return Optional.ofNullable(this.environmentArn);
    }
    /**
     * Unique identifier for representing FinSpace Environment
     * 
     */
    public Optional<String> getEnvironmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * URL used to login to the Environment
     * 
     */
    public Optional<String> getEnvironmentUrl() {
        return Optional.ofNullable(this.environmentUrl);
    }
    /**
     * Federation mode used with the Environment
     * 
     */
    public Optional<EnvironmentFederationMode> getFederationMode() {
        return Optional.ofNullable(this.federationMode);
    }
    public Optional<EnvironmentFederationParameters> getFederationParameters() {
        return Optional.ofNullable(this.federationParameters);
    }
    /**
     * Name of the Environment
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * SageMaker Studio Domain URL associated with the Environment
     * 
     */
    public Optional<String> getSageMakerStudioDomainUrl() {
        return Optional.ofNullable(this.sageMakerStudioDomainUrl);
    }
    /**
     * State of the Environment
     * 
     */
    public Optional<EnvironmentStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountId;
        private @Nullable String dedicatedServiceAccountId;
        private @Nullable String description;
        private @Nullable String environmentArn;
        private @Nullable String environmentId;
        private @Nullable String environmentUrl;
        private @Nullable EnvironmentFederationMode federationMode;
        private @Nullable EnvironmentFederationParameters federationParameters;
        private @Nullable String name;
        private @Nullable String sageMakerStudioDomainUrl;
        private @Nullable EnvironmentStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.dedicatedServiceAccountId = defaults.dedicatedServiceAccountId;
    	      this.description = defaults.description;
    	      this.environmentArn = defaults.environmentArn;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentUrl = defaults.environmentUrl;
    	      this.federationMode = defaults.federationMode;
    	      this.federationParameters = defaults.federationParameters;
    	      this.name = defaults.name;
    	      this.sageMakerStudioDomainUrl = defaults.sageMakerStudioDomainUrl;
    	      this.status = defaults.status;
        }

        public Builder setAwsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setDedicatedServiceAccountId(@Nullable String dedicatedServiceAccountId) {
            this.dedicatedServiceAccountId = dedicatedServiceAccountId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironmentArn(@Nullable String environmentArn) {
            this.environmentArn = environmentArn;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentUrl(@Nullable String environmentUrl) {
            this.environmentUrl = environmentUrl;
            return this;
        }

        public Builder setFederationMode(@Nullable EnvironmentFederationMode federationMode) {
            this.federationMode = federationMode;
            return this;
        }

        public Builder setFederationParameters(@Nullable EnvironmentFederationParameters federationParameters) {
            this.federationParameters = federationParameters;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSageMakerStudioDomainUrl(@Nullable String sageMakerStudioDomainUrl) {
            this.sageMakerStudioDomainUrl = sageMakerStudioDomainUrl;
            return this;
        }

        public Builder setStatus(@Nullable EnvironmentStatus status) {
            this.status = status;
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(awsAccountId, dedicatedServiceAccountId, description, environmentArn, environmentId, environmentUrl, federationMode, federationParameters, name, sageMakerStudioDomainUrl, status);
        }
    }
}
