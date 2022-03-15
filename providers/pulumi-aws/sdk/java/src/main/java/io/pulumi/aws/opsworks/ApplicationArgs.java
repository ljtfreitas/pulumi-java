// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.opsworks.inputs.ApplicationAppSourceArgs;
import io.pulumi.aws.opsworks.inputs.ApplicationEnvironmentArgs;
import io.pulumi.aws.opsworks.inputs.ApplicationSslConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * SCM configuration of the app as described below.
     * 
     */
    @Import(name="appSources")
      private final @Nullable Output<List<ApplicationAppSourceArgs>> appSources;

    public Output<List<ApplicationAppSourceArgs>> getAppSources() {
        return this.appSources == null ? Output.empty() : this.appSources;
    }

    /**
     * Run bundle install when deploying for application of type `rails`.
     * 
     */
    @Import(name="autoBundleOnDeploy")
      private final @Nullable Output<String> autoBundleOnDeploy;

    public Output<String> getAutoBundleOnDeploy() {
        return this.autoBundleOnDeploy == null ? Output.empty() : this.autoBundleOnDeploy;
    }

    /**
     * Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    @Import(name="awsFlowRubySettings")
      private final @Nullable Output<String> awsFlowRubySettings;

    public Output<String> getAwsFlowRubySettings() {
        return this.awsFlowRubySettings == null ? Output.empty() : this.awsFlowRubySettings;
    }

    /**
     * The data source's ARN.
     * 
     */
    @Import(name="dataSourceArn")
      private final @Nullable Output<String> dataSourceArn;

    public Output<String> getDataSourceArn() {
        return this.dataSourceArn == null ? Output.empty() : this.dataSourceArn;
    }

    /**
     * The database name.
     * 
     */
    @Import(name="dataSourceDatabaseName")
      private final @Nullable Output<String> dataSourceDatabaseName;

    public Output<String> getDataSourceDatabaseName() {
        return this.dataSourceDatabaseName == null ? Output.empty() : this.dataSourceDatabaseName;
    }

    /**
     * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    @Import(name="dataSourceType")
      private final @Nullable Output<String> dataSourceType;

    public Output<String> getDataSourceType() {
        return this.dataSourceType == null ? Output.empty() : this.dataSourceType;
    }

    /**
     * A description of the app.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Subfolder for the document root for application of type `rails`.
     * 
     */
    @Import(name="documentRoot")
      private final @Nullable Output<String> documentRoot;

    public Output<String> getDocumentRoot() {
        return this.documentRoot == null ? Output.empty() : this.documentRoot;
    }

    /**
     * A list of virtual host alias.
     * 
     */
    @Import(name="domains")
      private final @Nullable Output<List<String>> domains;

    public Output<List<String>> getDomains() {
        return this.domains == null ? Output.empty() : this.domains;
    }

    /**
     * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    @Import(name="enableSsl")
      private final @Nullable Output<Boolean> enableSsl;

    public Output<Boolean> getEnableSsl() {
        return this.enableSsl == null ? Output.empty() : this.enableSsl;
    }

    /**
     * Object to define environment variables.  Object is described below.
     * 
     */
    @Import(name="environments")
      private final @Nullable Output<List<ApplicationEnvironmentArgs>> environments;

    public Output<List<ApplicationEnvironmentArgs>> getEnvironments() {
        return this.environments == null ? Output.empty() : this.environments;
    }

    /**
     * A human-readable name for the application.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the Rails environment for application of type `rails`.
     * 
     */
    @Import(name="railsEnv")
      private final @Nullable Output<String> railsEnv;

    public Output<String> getRailsEnv() {
        return this.railsEnv == null ? Output.empty() : this.railsEnv;
    }

    /**
     * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    @Import(name="shortName")
      private final @Nullable Output<String> shortName;

    public Output<String> getShortName() {
        return this.shortName == null ? Output.empty() : this.shortName;
    }

    /**
     * The SSL configuration of the app. Object is described below.
     * 
     */
    @Import(name="sslConfigurations")
      private final @Nullable Output<List<ApplicationSslConfigurationArgs>> sslConfigurations;

    public Output<List<ApplicationSslConfigurationArgs>> getSslConfigurations() {
        return this.sslConfigurations == null ? Output.empty() : this.sslConfigurations;
    }

    /**
     * The id of the stack the application will belong to.
     * 
     */
    @Import(name="stackId", required=true)
      private final Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId;
    }

    /**
     * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ApplicationArgs(
        @Nullable Output<List<ApplicationAppSourceArgs>> appSources,
        @Nullable Output<String> autoBundleOnDeploy,
        @Nullable Output<String> awsFlowRubySettings,
        @Nullable Output<String> dataSourceArn,
        @Nullable Output<String> dataSourceDatabaseName,
        @Nullable Output<String> dataSourceType,
        @Nullable Output<String> description,
        @Nullable Output<String> documentRoot,
        @Nullable Output<List<String>> domains,
        @Nullable Output<Boolean> enableSsl,
        @Nullable Output<List<ApplicationEnvironmentArgs>> environments,
        @Nullable Output<String> name,
        @Nullable Output<String> railsEnv,
        @Nullable Output<String> shortName,
        @Nullable Output<List<ApplicationSslConfigurationArgs>> sslConfigurations,
        Output<String> stackId,
        Output<String> type) {
        this.appSources = appSources;
        this.autoBundleOnDeploy = autoBundleOnDeploy;
        this.awsFlowRubySettings = awsFlowRubySettings;
        this.dataSourceArn = dataSourceArn;
        this.dataSourceDatabaseName = dataSourceDatabaseName;
        this.dataSourceType = dataSourceType;
        this.description = description;
        this.documentRoot = documentRoot;
        this.domains = domains;
        this.enableSsl = enableSsl;
        this.environments = environments;
        this.name = name;
        this.railsEnv = railsEnv;
        this.shortName = shortName;
        this.sslConfigurations = sslConfigurations;
        this.stackId = Objects.requireNonNull(stackId, "expected parameter 'stackId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationArgs() {
        this.appSources = Output.empty();
        this.autoBundleOnDeploy = Output.empty();
        this.awsFlowRubySettings = Output.empty();
        this.dataSourceArn = Output.empty();
        this.dataSourceDatabaseName = Output.empty();
        this.dataSourceType = Output.empty();
        this.description = Output.empty();
        this.documentRoot = Output.empty();
        this.domains = Output.empty();
        this.enableSsl = Output.empty();
        this.environments = Output.empty();
        this.name = Output.empty();
        this.railsEnv = Output.empty();
        this.shortName = Output.empty();
        this.sslConfigurations = Output.empty();
        this.stackId = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApplicationAppSourceArgs>> appSources;
        private @Nullable Output<String> autoBundleOnDeploy;
        private @Nullable Output<String> awsFlowRubySettings;
        private @Nullable Output<String> dataSourceArn;
        private @Nullable Output<String> dataSourceDatabaseName;
        private @Nullable Output<String> dataSourceType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentRoot;
        private @Nullable Output<List<String>> domains;
        private @Nullable Output<Boolean> enableSsl;
        private @Nullable Output<List<ApplicationEnvironmentArgs>> environments;
        private @Nullable Output<String> name;
        private @Nullable Output<String> railsEnv;
        private @Nullable Output<String> shortName;
        private @Nullable Output<List<ApplicationSslConfigurationArgs>> sslConfigurations;
        private Output<String> stackId;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSources = defaults.appSources;
    	      this.autoBundleOnDeploy = defaults.autoBundleOnDeploy;
    	      this.awsFlowRubySettings = defaults.awsFlowRubySettings;
    	      this.dataSourceArn = defaults.dataSourceArn;
    	      this.dataSourceDatabaseName = defaults.dataSourceDatabaseName;
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.description = defaults.description;
    	      this.documentRoot = defaults.documentRoot;
    	      this.domains = defaults.domains;
    	      this.enableSsl = defaults.enableSsl;
    	      this.environments = defaults.environments;
    	      this.name = defaults.name;
    	      this.railsEnv = defaults.railsEnv;
    	      this.shortName = defaults.shortName;
    	      this.sslConfigurations = defaults.sslConfigurations;
    	      this.stackId = defaults.stackId;
    	      this.type = defaults.type;
        }

        public Builder appSources(@Nullable Output<List<ApplicationAppSourceArgs>> appSources) {
            this.appSources = appSources;
            return this;
        }

        public Builder appSources(@Nullable List<ApplicationAppSourceArgs> appSources) {
            this.appSources = Output.ofNullable(appSources);
            return this;
        }

        public Builder autoBundleOnDeploy(@Nullable Output<String> autoBundleOnDeploy) {
            this.autoBundleOnDeploy = autoBundleOnDeploy;
            return this;
        }

        public Builder autoBundleOnDeploy(@Nullable String autoBundleOnDeploy) {
            this.autoBundleOnDeploy = Output.ofNullable(autoBundleOnDeploy);
            return this;
        }

        public Builder awsFlowRubySettings(@Nullable Output<String> awsFlowRubySettings) {
            this.awsFlowRubySettings = awsFlowRubySettings;
            return this;
        }

        public Builder awsFlowRubySettings(@Nullable String awsFlowRubySettings) {
            this.awsFlowRubySettings = Output.ofNullable(awsFlowRubySettings);
            return this;
        }

        public Builder dataSourceArn(@Nullable Output<String> dataSourceArn) {
            this.dataSourceArn = dataSourceArn;
            return this;
        }

        public Builder dataSourceArn(@Nullable String dataSourceArn) {
            this.dataSourceArn = Output.ofNullable(dataSourceArn);
            return this;
        }

        public Builder dataSourceDatabaseName(@Nullable Output<String> dataSourceDatabaseName) {
            this.dataSourceDatabaseName = dataSourceDatabaseName;
            return this;
        }

        public Builder dataSourceDatabaseName(@Nullable String dataSourceDatabaseName) {
            this.dataSourceDatabaseName = Output.ofNullable(dataSourceDatabaseName);
            return this;
        }

        public Builder dataSourceType(@Nullable Output<String> dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        public Builder dataSourceType(@Nullable String dataSourceType) {
            this.dataSourceType = Output.ofNullable(dataSourceType);
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

        public Builder documentRoot(@Nullable Output<String> documentRoot) {
            this.documentRoot = documentRoot;
            return this;
        }

        public Builder documentRoot(@Nullable String documentRoot) {
            this.documentRoot = Output.ofNullable(documentRoot);
            return this;
        }

        public Builder domains(@Nullable Output<List<String>> domains) {
            this.domains = domains;
            return this;
        }

        public Builder domains(@Nullable List<String> domains) {
            this.domains = Output.ofNullable(domains);
            return this;
        }

        public Builder enableSsl(@Nullable Output<Boolean> enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder enableSsl(@Nullable Boolean enableSsl) {
            this.enableSsl = Output.ofNullable(enableSsl);
            return this;
        }

        public Builder environments(@Nullable Output<List<ApplicationEnvironmentArgs>> environments) {
            this.environments = environments;
            return this;
        }

        public Builder environments(@Nullable List<ApplicationEnvironmentArgs> environments) {
            this.environments = Output.ofNullable(environments);
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

        public Builder railsEnv(@Nullable Output<String> railsEnv) {
            this.railsEnv = railsEnv;
            return this;
        }

        public Builder railsEnv(@Nullable String railsEnv) {
            this.railsEnv = Output.ofNullable(railsEnv);
            return this;
        }

        public Builder shortName(@Nullable Output<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder shortName(@Nullable String shortName) {
            this.shortName = Output.ofNullable(shortName);
            return this;
        }

        public Builder sslConfigurations(@Nullable Output<List<ApplicationSslConfigurationArgs>> sslConfigurations) {
            this.sslConfigurations = sslConfigurations;
            return this;
        }

        public Builder sslConfigurations(@Nullable List<ApplicationSslConfigurationArgs> sslConfigurations) {
            this.sslConfigurations = Output.ofNullable(sslConfigurations);
            return this;
        }

        public Builder stackId(Output<String> stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }

        public Builder stackId(String stackId) {
            this.stackId = Output.of(Objects.requireNonNull(stackId));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(appSources, autoBundleOnDeploy, awsFlowRubySettings, dataSourceArn, dataSourceDatabaseName, dataSourceType, description, documentRoot, domains, enableSsl, environments, name, railsEnv, shortName, sslConfigurations, stackId, type);
        }
    }
}
