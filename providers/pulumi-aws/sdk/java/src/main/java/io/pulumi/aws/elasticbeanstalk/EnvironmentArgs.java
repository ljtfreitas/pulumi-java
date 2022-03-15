// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="application", required=true)
      private final Output<String> application;

    public Output<String> getApplication() {
        return this.application;
    }

    /**
     * Prefix to use for the fully qualified DNS name of
     * the Environment.
     * 
     */
    @Import(name="cnamePrefix")
      private final @Nullable Output<String> cnamePrefix;

    public Output<String> getCnamePrefix() {
        return this.cnamePrefix == null ? Output.empty() : this.cnamePrefix;
    }

    /**
     * Short description of the Environment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
     * to use in deployment
     * 
     */
    @Import(name="platformArn")
      private final @Nullable Output<String> platformArn;

    public Output<String> getPlatformArn() {
        return this.platformArn == null ? Output.empty() : this.platformArn;
    }

    /**
     * The time between polling the AWS API to
     * check if changes have been applied. Use this to adjust the rate of API calls
     * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
     * use the default behavior, which is an exponential backoff
     * 
     */
    @Import(name="pollInterval")
      private final @Nullable Output<String> pollInterval;

    public Output<String> getPollInterval() {
        return this.pollInterval == null ? Output.empty() : this.pollInterval;
    }

    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<List<EnvironmentSettingArgs>> settings;

    public Output<List<EnvironmentSettingArgs>> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * A solution stack to base your environment
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @Import(name="solutionStackName")
      private final @Nullable Output<String> solutionStackName;

    public Output<String> getSolutionStackName() {
        return this.solutionStackName == null ? Output.empty() : this.solutionStackName;
    }

    /**
     * A set of tags to apply to the Environment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the Elastic Beanstalk Configuration
     * template to use in deployment
     * 
     */
    @Import(name="templateName")
      private final @Nullable Output<String> templateName;

    public Output<String> getTemplateName() {
        return this.templateName == null ? Output.empty() : this.templateName;
    }

    /**
     * Elastic Beanstalk Environment tier. Valid values are `Worker`
     * or `WebServer`. If tier is left blank `WebServer` will be used.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    /**
     * The name of the Elastic Beanstalk Application Version
     * to use in deployment.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    /**
     * The maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for an Elastic Beanstalk Environment to be in a ready state before timing
     * out.
     * 
     */
    @Import(name="waitForReadyTimeout")
      private final @Nullable Output<String> waitForReadyTimeout;

    public Output<String> getWaitForReadyTimeout() {
        return this.waitForReadyTimeout == null ? Output.empty() : this.waitForReadyTimeout;
    }

    public EnvironmentArgs(
        Output<String> application,
        @Nullable Output<String> cnamePrefix,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> platformArn,
        @Nullable Output<String> pollInterval,
        @Nullable Output<List<EnvironmentSettingArgs>> settings,
        @Nullable Output<String> solutionStackName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> templateName,
        @Nullable Output<String> tier,
        @Nullable Output<String> version,
        @Nullable Output<String> waitForReadyTimeout) {
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
        this.application = Output.empty();
        this.cnamePrefix = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.platformArn = Output.empty();
        this.pollInterval = Output.empty();
        this.settings = Output.empty();
        this.solutionStackName = Output.empty();
        this.tags = Output.empty();
        this.templateName = Output.empty();
        this.tier = Output.empty();
        this.version = Output.empty();
        this.waitForReadyTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> application;
        private @Nullable Output<String> cnamePrefix;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> platformArn;
        private @Nullable Output<String> pollInterval;
        private @Nullable Output<List<EnvironmentSettingArgs>> settings;
        private @Nullable Output<String> solutionStackName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> templateName;
        private @Nullable Output<String> tier;
        private @Nullable Output<String> version;
        private @Nullable Output<String> waitForReadyTimeout;

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

        public Builder application(Output<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }

        public Builder cnamePrefix(@Nullable Output<String> cnamePrefix) {
            this.cnamePrefix = cnamePrefix;
            return this;
        }

        public Builder cnamePrefix(@Nullable String cnamePrefix) {
            this.cnamePrefix = Output.ofNullable(cnamePrefix);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder platformArn(@Nullable Output<String> platformArn) {
            this.platformArn = platformArn;
            return this;
        }

        public Builder platformArn(@Nullable String platformArn) {
            this.platformArn = Output.ofNullable(platformArn);
            return this;
        }

        public Builder pollInterval(@Nullable Output<String> pollInterval) {
            this.pollInterval = pollInterval;
            return this;
        }

        public Builder pollInterval(@Nullable String pollInterval) {
            this.pollInterval = Output.ofNullable(pollInterval);
            return this;
        }

        public Builder settings(@Nullable Output<List<EnvironmentSettingArgs>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable List<EnvironmentSettingArgs> settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }

        public Builder solutionStackName(@Nullable Output<String> solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        public Builder solutionStackName(@Nullable String solutionStackName) {
            this.solutionStackName = Output.ofNullable(solutionStackName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder templateName(@Nullable Output<String> templateName) {
            this.templateName = templateName;
            return this;
        }

        public Builder templateName(@Nullable String templateName) {
            this.templateName = Output.ofNullable(templateName);
            return this;
        }

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }

        public Builder waitForReadyTimeout(@Nullable Output<String> waitForReadyTimeout) {
            this.waitForReadyTimeout = waitForReadyTimeout;
            return this;
        }

        public Builder waitForReadyTimeout(@Nullable String waitForReadyTimeout) {
            this.waitForReadyTimeout = Output.ofNullable(waitForReadyTimeout);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(application, cnamePrefix, description, name, platformArn, pollInterval, settings, solutionStackName, tags, templateName, tier, version, waitForReadyTimeout);
        }
    }
}
