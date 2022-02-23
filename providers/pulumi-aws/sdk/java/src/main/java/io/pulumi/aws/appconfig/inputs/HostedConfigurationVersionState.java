// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedConfigurationVersionState extends io.pulumi.resources.ResourceArgs {

    public static final HostedConfigurationVersionState Empty = new HostedConfigurationVersionState();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The configuration profile ID.
     * 
     */
    @InputImport(name="configurationProfileId")
    private final @Nullable Input<String> configurationProfileId;

    public Input<String> getConfigurationProfileId() {
        return this.configurationProfileId == null ? Input.empty() : this.configurationProfileId;
    }

    /**
     * The content of the configuration or the configuration data.
     * 
     */
    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * A description of the configuration.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The version number of the hosted configuration.
     * 
     */
    @InputImport(name="versionNumber")
    private final @Nullable Input<Integer> versionNumber;

    public Input<Integer> getVersionNumber() {
        return this.versionNumber == null ? Input.empty() : this.versionNumber;
    }

    public HostedConfigurationVersionState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> arn,
        @Nullable Input<String> configurationProfileId,
        @Nullable Input<String> content,
        @Nullable Input<String> contentType,
        @Nullable Input<String> description,
        @Nullable Input<Integer> versionNumber) {
        this.applicationId = applicationId;
        this.arn = arn;
        this.configurationProfileId = configurationProfileId;
        this.content = content;
        this.contentType = contentType;
        this.description = description;
        this.versionNumber = versionNumber;
    }

    private HostedConfigurationVersionState() {
        this.applicationId = Input.empty();
        this.arn = Input.empty();
        this.configurationProfileId = Input.empty();
        this.content = Input.empty();
        this.contentType = Input.empty();
        this.description = Input.empty();
        this.versionNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedConfigurationVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> configurationProfileId;
        private @Nullable Input<String> content;
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedConfigurationVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.arn = defaults.arn;
    	      this.configurationProfileId = defaults.configurationProfileId;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setConfigurationProfileId(@Nullable Input<String> configurationProfileId) {
            this.configurationProfileId = configurationProfileId;
            return this;
        }

        public Builder setConfigurationProfileId(@Nullable String configurationProfileId) {
            this.configurationProfileId = Input.ofNullable(configurationProfileId);
            return this;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
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

        public Builder setVersionNumber(@Nullable Input<Integer> versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public Builder setVersionNumber(@Nullable Integer versionNumber) {
            this.versionNumber = Input.ofNullable(versionNumber);
            return this;
        }
        public HostedConfigurationVersionState build() {
            return new HostedConfigurationVersionState(applicationId, arn, configurationProfileId, content, contentType, description, versionNumber);
        }
    }
}
