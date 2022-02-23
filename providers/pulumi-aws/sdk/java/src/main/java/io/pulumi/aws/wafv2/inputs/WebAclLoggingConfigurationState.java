// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationState Empty = new WebAclLoggingConfigurationState();

    /**
     * The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
     * 
     */
    @InputImport(name="logDestinationConfigs")
    private final @Nullable Input<List<String>> logDestinationConfigs;

    public Input<List<String>> getLogDestinationConfigs() {
        return this.logDestinationConfigs == null ? Input.empty() : this.logDestinationConfigs;
    }

    /**
     * A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
     * 
     */
    @InputImport(name="loggingFilter")
    private final @Nullable Input<WebAclLoggingConfigurationLoggingFilterGetArgs> loggingFilter;

    public Input<WebAclLoggingConfigurationLoggingFilterGetArgs> getLoggingFilter() {
        return this.loggingFilter == null ? Input.empty() : this.loggingFilter;
    }

    /**
     * The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
     * 
     */
    @InputImport(name="redactedFields")
    private final @Nullable Input<List<WebAclLoggingConfigurationRedactedFieldGetArgs>> redactedFields;

    public Input<List<WebAclLoggingConfigurationRedactedFieldGetArgs>> getRedactedFields() {
        return this.redactedFields == null ? Input.empty() : this.redactedFields;
    }

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
     * 
     */
    @InputImport(name="resourceArn")
    private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    public WebAclLoggingConfigurationState(
        @Nullable Input<List<String>> logDestinationConfigs,
        @Nullable Input<WebAclLoggingConfigurationLoggingFilterGetArgs> loggingFilter,
        @Nullable Input<List<WebAclLoggingConfigurationRedactedFieldGetArgs>> redactedFields,
        @Nullable Input<String> resourceArn) {
        this.logDestinationConfigs = logDestinationConfigs;
        this.loggingFilter = loggingFilter;
        this.redactedFields = redactedFields;
        this.resourceArn = resourceArn;
    }

    private WebAclLoggingConfigurationState() {
        this.logDestinationConfigs = Input.empty();
        this.loggingFilter = Input.empty();
        this.redactedFields = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> logDestinationConfigs;
        private @Nullable Input<WebAclLoggingConfigurationLoggingFilterGetArgs> loggingFilter;
        private @Nullable Input<List<WebAclLoggingConfigurationRedactedFieldGetArgs>> redactedFields;
        private @Nullable Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
    	      this.loggingFilter = defaults.loggingFilter;
    	      this.redactedFields = defaults.redactedFields;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setLogDestinationConfigs(@Nullable Input<List<String>> logDestinationConfigs) {
            this.logDestinationConfigs = logDestinationConfigs;
            return this;
        }

        public Builder setLogDestinationConfigs(@Nullable List<String> logDestinationConfigs) {
            this.logDestinationConfigs = Input.ofNullable(logDestinationConfigs);
            return this;
        }

        public Builder setLoggingFilter(@Nullable Input<WebAclLoggingConfigurationLoggingFilterGetArgs> loggingFilter) {
            this.loggingFilter = loggingFilter;
            return this;
        }

        public Builder setLoggingFilter(@Nullable WebAclLoggingConfigurationLoggingFilterGetArgs loggingFilter) {
            this.loggingFilter = Input.ofNullable(loggingFilter);
            return this;
        }

        public Builder setRedactedFields(@Nullable Input<List<WebAclLoggingConfigurationRedactedFieldGetArgs>> redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }

        public Builder setRedactedFields(@Nullable List<WebAclLoggingConfigurationRedactedFieldGetArgs> redactedFields) {
            this.redactedFields = Input.ofNullable(redactedFields);
            return this;
        }

        public Builder setResourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }
        public WebAclLoggingConfigurationState build() {
            return new WebAclLoggingConfigurationState(logDestinationConfigs, loggingFilter, redactedFields, resourceArn);
        }
    }
}