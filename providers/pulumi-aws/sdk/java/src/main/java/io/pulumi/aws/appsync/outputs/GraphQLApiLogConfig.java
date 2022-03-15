// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GraphQLApiLogConfig {
    /**
     * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * 
     */
    private final String cloudwatchLogsRoleArn;
    /**
     * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
     * 
     */
    private final @Nullable Boolean excludeVerboseContent;
    /**
     * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
     * 
     */
    private final String fieldLogLevel;

    @CustomType.Constructor
    private GraphQLApiLogConfig(
        @CustomType.Parameter("cloudwatchLogsRoleArn") String cloudwatchLogsRoleArn,
        @CustomType.Parameter("excludeVerboseContent") @Nullable Boolean excludeVerboseContent,
        @CustomType.Parameter("fieldLogLevel") String fieldLogLevel) {
        this.cloudwatchLogsRoleArn = cloudwatchLogsRoleArn;
        this.excludeVerboseContent = excludeVerboseContent;
        this.fieldLogLevel = fieldLogLevel;
    }

    /**
     * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * 
    */
    public String getCloudwatchLogsRoleArn() {
        return this.cloudwatchLogsRoleArn;
    }
    /**
     * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
     * 
    */
    public Optional<Boolean> getExcludeVerboseContent() {
        return Optional.ofNullable(this.excludeVerboseContent);
    }
    /**
     * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
     * 
    */
    public String getFieldLogLevel() {
        return this.fieldLogLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudwatchLogsRoleArn;
        private @Nullable Boolean excludeVerboseContent;
        private String fieldLogLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogsRoleArn = defaults.cloudwatchLogsRoleArn;
    	      this.excludeVerboseContent = defaults.excludeVerboseContent;
    	      this.fieldLogLevel = defaults.fieldLogLevel;
        }

        public Builder cloudwatchLogsRoleArn(String cloudwatchLogsRoleArn) {
            this.cloudwatchLogsRoleArn = Objects.requireNonNull(cloudwatchLogsRoleArn);
            return this;
        }

        public Builder excludeVerboseContent(@Nullable Boolean excludeVerboseContent) {
            this.excludeVerboseContent = excludeVerboseContent;
            return this;
        }

        public Builder fieldLogLevel(String fieldLogLevel) {
            this.fieldLogLevel = Objects.requireNonNull(fieldLogLevel);
            return this;
        }
        public GraphQLApiLogConfig build() {
            return new GraphQLApiLogConfig(cloudwatchLogsRoleArn, excludeVerboseContent, fieldLogLevel);
        }
    }
}
