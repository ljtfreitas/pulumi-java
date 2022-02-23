// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclVisibilityConfig {
    /**
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    private final Boolean cloudwatchMetricsEnabled;
    /**
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    private final String metricName;
    /**
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    private final Boolean sampledRequestsEnabled;

    @OutputCustomType.Constructor({"cloudwatchMetricsEnabled","metricName","sampledRequestsEnabled"})
    private WebAclVisibilityConfig(
        Boolean cloudwatchMetricsEnabled,
        String metricName,
        Boolean sampledRequestsEnabled) {
        this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled);
        this.metricName = Objects.requireNonNull(metricName);
        this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
    }

    /**
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    public Boolean getCloudwatchMetricsEnabled() {
        return this.cloudwatchMetricsEnabled;
    }
    /**
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    public Boolean getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclVisibilityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cloudwatchMetricsEnabled;
        private String metricName;
        private Boolean sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclVisibilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchMetricsEnabled = defaults.cloudwatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder setCloudwatchMetricsEnabled(Boolean cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }
        public WebAclVisibilityConfig build() {
            return new WebAclVisibilityConfig(cloudwatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
