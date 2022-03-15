// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Description of the alias.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Lambda Function name or ARN.
     * 
     */
    @Import(name="functionName", required=true)
      private final Output<String> functionName;

    public Output<String> getFunctionName() {
        return this.functionName;
    }

    /**
     * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     * 
     */
    @Import(name="functionVersion", required=true)
      private final Output<String> functionVersion;

    public Output<String> getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Lambda alias' route configuration settings. Fields documented below
     * 
     */
    @Import(name="routingConfig")
      private final @Nullable Output<AliasRoutingConfigArgs> routingConfig;

    public Output<AliasRoutingConfigArgs> getRoutingConfig() {
        return this.routingConfig == null ? Output.empty() : this.routingConfig;
    }

    public AliasArgs(
        @Nullable Output<String> description,
        Output<String> functionName,
        Output<String> functionVersion,
        @Nullable Output<String> name,
        @Nullable Output<AliasRoutingConfigArgs> routingConfig) {
        this.description = description;
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.functionVersion = Objects.requireNonNull(functionVersion, "expected parameter 'functionVersion' to be non-null");
        this.name = name;
        this.routingConfig = routingConfig;
    }

    private AliasArgs() {
        this.description = Output.empty();
        this.functionName = Output.empty();
        this.functionVersion = Output.empty();
        this.name = Output.empty();
        this.routingConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> functionName;
        private Output<String> functionVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<AliasRoutingConfigArgs> routingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.functionName = defaults.functionName;
    	      this.functionVersion = defaults.functionVersion;
    	      this.name = defaults.name;
    	      this.routingConfig = defaults.routingConfig;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder functionName(Output<String> functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder functionName(String functionName) {
            this.functionName = Output.of(Objects.requireNonNull(functionName));
            return this;
        }

        public Builder functionVersion(Output<String> functionVersion) {
            this.functionVersion = Objects.requireNonNull(functionVersion);
            return this;
        }

        public Builder functionVersion(String functionVersion) {
            this.functionVersion = Output.of(Objects.requireNonNull(functionVersion));
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

        public Builder routingConfig(@Nullable Output<AliasRoutingConfigArgs> routingConfig) {
            this.routingConfig = routingConfig;
            return this;
        }

        public Builder routingConfig(@Nullable AliasRoutingConfigArgs routingConfig) {
            this.routingConfig = Output.ofNullable(routingConfig);
            return this;
        }
        public AliasArgs build() {
            return new AliasArgs(description, functionName, functionVersion, name, routingConfig);
        }
    }
}
