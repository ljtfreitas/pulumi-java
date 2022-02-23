// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Name of the application that contains the version
     * to be deployed
     * 
     */
    @InputImport(name="application", required=true)
    private final Input<String> application;

    public Input<String> getApplication() {
        return this.application;
    }

    /**
     * Prefix to use for the fully qualified DNS name of
     * the Environment.
     * 
     */
    @InputImport(name="cnamePrefix")
    private final @Nullable Input<String> cnamePrefix;

    public Input<String> getCnamePrefix() {
        return this.cnamePrefix == null ? Input.empty() : this.cnamePrefix;
    }

    /**
     * Short description of the Environment
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
     * to use in deployment
     * 
     */
    @InputImport(name="platformArn")
    private final @Nullable Input<String> platformArn;

    public Input<String> getPlatformArn() {
        return this.platformArn == null ? Input.empty() : this.platformArn;
    }

    /**
     * The time between polling the AWS API to
     * check if changes have been applied. Use this to adjust the rate of API calls
     * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
     * use the default behavior, which is an exponential backoff
     * 
     */
    @InputImport(name="pollInterval")
    private final @Nullable Input<String> pollInterval;

    public Input<String> getPollInterval() {
        return this.pollInterval == null ? Input.empty() : this.pollInterval;
    }

    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @InputImport(name="settings")
    private final @Nullable Input<List<EnvironmentSettingArgs>> settings;

    public Input<List<EnvironmentSettingArgs>> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * A solution stack to base your environment
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @InputImport(name="solutionStackName")
    private final @Nullable Input<String> solutionStackName;

    public Input<String> getSolutionStackName() {
        return this.solutionStackName == null ? Input.empty() : this.solutionStackName;
    }

    /**
     * A set of tags to apply to the Environment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the Elastic Beanstalk Configuration
     * template to use in deployment
     * 
     */
    @InputImport(name="templateName")
    private final @Nullable Input<String> templateName;

    public Input<String> getTemplateName() {
        return this.templateName == null ? Input.empty() : this.templateName;
    }

    /**
     * Elastic Beanstalk Environment tier. Valid values are `Worker`
     * or `WebServer`. If tier is left blank `WebServer` will be used.
     * 
     */
    @InputImport(name="tier")
    private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    /**
     * The name of the Elastic Beanstalk Application Version
     * to use in deployment.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for an Elastic Beanstalk Environment to be in a ready state before timing
     * out.
     * 
     */
    @InputImport(name="waitForReadyTimeout")
    private final @Nullable Input<String> waitForReadyTimeout;

    public Input<String> getWaitForReadyTimeout() {
        return this.waitForReadyTimeout == null ? Input.empty() : this.waitForReadyTimeout;
    }

    public EnvironmentArgs(
        Input<String> application,
        @Nullable Input<String> cnamePrefix,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> platformArn,
        @Nullable Input<String> pollInterval,
        @Nullable Input<List<EnvironmentSettingArgs>> settings,
        @Nullable Input<String> solutionStackName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> templateName,
        @Nullable Input<String> tier,
        @Nullable Input<String> version,
        @Nullable Input<String> waitForReadyTimeout) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.cnamePrefix = cnamePrefix;
        this.description = description;
        this.name = name;
        this.platformArn = platformArn;
        this.pollInterval = pollInterval;
        this.settings = settings;
        this.solutionStackName = solutionStackName;
        this.tags = tags;
        this.templateName = templateName;
        this.tier = tier;
        this.version = version;
        this.waitForReadyTimeout = waitForReadyTimeout;
    }

    private EnvironmentArgs() {
        this.application = Input.empty();
        this.cnamePrefix = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.platformArn = Input.empty();
        this.pollInterval = Input.empty();
        this.settings = Input.empty();
        this.solutionStackName = Input.empty();
        this.tags = Input.empty();
        this.templateName = Input.empty();
        this.tier = Input.empty();
        this.version = Input.empty();
        this.waitForReadyTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> application;
        private @Nullable Input<String> cnamePrefix;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> platformArn;
        private @Nullable Input<String> pollInterval;
        private @Nullable Input<List<EnvironmentSettingArgs>> settings;
        private @Nullable Input<String> solutionStackName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> templateName;
        private @Nullable Input<String> tier;
        private @Nullable Input<String> version;
        private @Nullable Input<String> waitForReadyTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.cnamePrefix = defaults.cnamePrefix;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.platformArn = defaults.platformArn;
    	      this.pollInterval = defaults.pollInterval;
    	      this.settings = defaults.settings;
    	      this.solutionStackName = defaults.solutionStackName;
    	      this.tags = defaults.tags;
    	      this.templateName = defaults.templateName;
    	      this.tier = defaults.tier;
    	      this.version = defaults.version;
    	      this.waitForReadyTimeout = defaults.waitForReadyTimeout;
        }

        public Builder setApplication(Input<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }

        public Builder setCnamePrefix(@Nullable Input<String> cnamePrefix) {
            this.cnamePrefix = cnamePrefix;
            return this;
        }

        public Builder setCnamePrefix(@Nullable String cnamePrefix) {
            this.cnamePrefix = Input.ofNullable(cnamePrefix);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPlatformArn(@Nullable Input<String> platformArn) {
            this.platformArn = platformArn;
            return this;
        }

        public Builder setPlatformArn(@Nullable String platformArn) {
            this.platformArn = Input.ofNullable(platformArn);
            return this;
        }

        public Builder setPollInterval(@Nullable Input<String> pollInterval) {
            this.pollInterval = pollInterval;
            return this;
        }

        public Builder setPollInterval(@Nullable String pollInterval) {
            this.pollInterval = Input.ofNullable(pollInterval);
            return this;
        }

        public Builder setSettings(@Nullable Input<List<EnvironmentSettingArgs>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable List<EnvironmentSettingArgs> settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setSolutionStackName(@Nullable Input<String> solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        public Builder setSolutionStackName(@Nullable String solutionStackName) {
            this.solutionStackName = Input.ofNullable(solutionStackName);
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

        public Builder setTemplateName(@Nullable Input<String> templateName) {
            this.templateName = templateName;
            return this;
        }

        public Builder setTemplateName(@Nullable String templateName) {
            this.templateName = Input.ofNullable(templateName);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWaitForReadyTimeout(@Nullable Input<String> waitForReadyTimeout) {
            this.waitForReadyTimeout = waitForReadyTimeout;
            return this;
        }

        public Builder setWaitForReadyTimeout(@Nullable String waitForReadyTimeout) {
            this.waitForReadyTimeout = Input.ofNullable(waitForReadyTimeout);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(application, cnamePrefix, description, name, platformArn, pollInterval, settings, solutionStackName, tags, templateName, tier, version, waitForReadyTimeout);
        }
    }
}
