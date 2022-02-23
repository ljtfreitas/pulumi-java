// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileArgs Empty = new ConfigurationProfileArgs();

    /**
     * The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @InputImport(name="applicationId", required=true)
    private final Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * The description of the configuration profile. Can be at most 1024 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://<Document_name>` or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format `ssm-parameter://<Parameter_name>` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://<bucket>/<objectKey>`.
     * 
     */
    @InputImport(name="locationUri", required=true)
    private final Input<String> locationUri;

    public Input<String> getLocationUri() {
        return this.locationUri;
    }

    /**
     * The name for the configuration profile. Must be between 1 and 64 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     * 
     */
    @InputImport(name="retrievalRoleArn")
    private final @Nullable Input<String> retrievalRoleArn;

    public Input<String> getRetrievalRoleArn() {
        return this.retrievalRoleArn == null ? Input.empty() : this.retrievalRoleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     * 
     */
    @InputImport(name="validators")
    private final @Nullable Input<List<ConfigurationProfileValidatorArgs>> validators;

    public Input<List<ConfigurationProfileValidatorArgs>> getValidators() {
        return this.validators == null ? Input.empty() : this.validators;
    }

    public ConfigurationProfileArgs(
        Input<String> applicationId,
        @Nullable Input<String> description,
        Input<String> locationUri,
        @Nullable Input<String> name,
        @Nullable Input<String> retrievalRoleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<ConfigurationProfileValidatorArgs>> validators) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.description = description;
        this.locationUri = Objects.requireNonNull(locationUri, "expected parameter 'locationUri' to be non-null");
        this.name = name;
        this.retrievalRoleArn = retrievalRoleArn;
        this.tags = tags;
        this.validators = validators;
    }

    private ConfigurationProfileArgs() {
        this.applicationId = Input.empty();
        this.description = Input.empty();
        this.locationUri = Input.empty();
        this.name = Input.empty();
        this.retrievalRoleArn = Input.empty();
        this.tags = Input.empty();
        this.validators = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationId;
        private @Nullable Input<String> description;
        private Input<String> locationUri;
        private @Nullable Input<String> name;
        private @Nullable Input<String> retrievalRoleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<ConfigurationProfileValidatorArgs>> validators;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.description = defaults.description;
    	      this.locationUri = defaults.locationUri;
    	      this.name = defaults.name;
    	      this.retrievalRoleArn = defaults.retrievalRoleArn;
    	      this.tags = defaults.tags;
    	      this.validators = defaults.validators;
        }

        public Builder setApplicationId(Input<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Input.of(Objects.requireNonNull(applicationId));
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

        public Builder setLocationUri(Input<String> locationUri) {
            this.locationUri = Objects.requireNonNull(locationUri);
            return this;
        }

        public Builder setLocationUri(String locationUri) {
            this.locationUri = Input.of(Objects.requireNonNull(locationUri));
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

        public Builder setRetrievalRoleArn(@Nullable Input<String> retrievalRoleArn) {
            this.retrievalRoleArn = retrievalRoleArn;
            return this;
        }

        public Builder setRetrievalRoleArn(@Nullable String retrievalRoleArn) {
            this.retrievalRoleArn = Input.ofNullable(retrievalRoleArn);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValidators(@Nullable Input<List<ConfigurationProfileValidatorArgs>> validators) {
            this.validators = validators;
            return this;
        }

        public Builder setValidators(@Nullable List<ConfigurationProfileValidatorArgs> validators) {
            this.validators = Input.ofNullable(validators);
            return this;
        }
        public ConfigurationProfileArgs build() {
            return new ConfigurationProfileArgs(applicationId, description, locationUri, name, retrievalRoleArn, tags, validators);
        }
    }
}
