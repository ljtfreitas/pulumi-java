// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.HealthCheckArgs;
import io.pulumi.aws.route53.inputs.HealthCheckState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route53 health check.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Health Checks can be imported using the `health check id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/healthCheck:HealthCheck http_check abcdef11-2222-3333-4444-555555fedcba
 * ```
 * 
 */
@ResourceType(type="aws:route53/healthCheck:HealthCheck")
public class HealthCheck extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Health Check.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Health Check.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
     * 
     */
    @Export(name="childHealthThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> childHealthThreshold;

    /**
     * @return The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
     * 
     */
    public Output</* @Nullable */ Integer> getChildHealthThreshold() {
        return this.childHealthThreshold;
    }
    /**
     * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
     * 
     */
    @Export(name="childHealthchecks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> childHealthchecks;

    /**
     * @return For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
     * 
     */
    public Output</* @Nullable */ List<String>> getChildHealthchecks() {
        return this.childHealthchecks;
    }
    /**
     * The name of the CloudWatch alarm.
     * 
     */
    @Export(name="cloudwatchAlarmName", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudwatchAlarmName;

    /**
     * @return The name of the CloudWatch alarm.
     * 
     */
    public Output</* @Nullable */ String> getCloudwatchAlarmName() {
        return this.cloudwatchAlarmName;
    }
    /**
     * The CloudWatchRegion that the CloudWatch alarm was created in.
     * 
     */
    @Export(name="cloudwatchAlarmRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudwatchAlarmRegion;

    /**
     * @return The CloudWatchRegion that the CloudWatch alarm was created in.
     * 
     */
    public Output</* @Nullable */ String> getCloudwatchAlarmRegion() {
        return this.cloudwatchAlarmRegion;
    }
    /**
     * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
     * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
     * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
     * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
     * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
     * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
     * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
     * 
     */
    @Export(name="enableSni", type=Boolean.class, parameters={})
    private Output<Boolean> enableSni;

    /**
     * @return A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
     * 
     */
    public Output<Boolean> getEnableSni() {
        return this.enableSni;
    }
    /**
     * The number of consecutive health checks that an endpoint must pass or fail.
     * 
     */
    @Export(name="failureThreshold", type=Integer.class, parameters={})
    private Output<Integer> failureThreshold;

    /**
     * @return The number of consecutive health checks that an endpoint must pass or fail.
     * 
     */
    public Output<Integer> getFailureThreshold() {
        return this.failureThreshold;
    }
    /**
     * The fully qualified domain name of the endpoint to be checked.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output</* @Nullable */ String> fqdn;

    /**
     * @return The fully qualified domain name of the endpoint to be checked.
     * 
     */
    public Output</* @Nullable */ String> getFqdn() {
        return this.fqdn;
    }
    /**
     * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
     * 
     */
    @Export(name="insufficientDataHealthStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> insufficientDataHealthStatus;

    /**
     * @return The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
     * 
     */
    public Output</* @Nullable */ String> getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus;
    }
    /**
     * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
     * 
     */
    @Export(name="invertHealthcheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> invertHealthcheck;

    /**
     * @return A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
     * 
     */
    public Output</* @Nullable */ Boolean> getInvertHealthcheck() {
        return this.invertHealthcheck;
    }
    /**
     * The IP address of the endpoint to be checked.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipAddress;

    /**
     * @return The IP address of the endpoint to be checked.
     * 
     */
    public Output</* @Nullable */ String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
     * 
     */
    @Export(name="measureLatency", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> measureLatency;

    /**
     * @return A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
     * 
     */
    public Output</* @Nullable */ Boolean> getMeasureLatency() {
        return this.measureLatency;
    }
    /**
     * The port of the endpoint to be checked.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port of the endpoint to be checked.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * This is a reference name used in Caller Reference
     * (helpful for identifying single health_check set amongst others)
     * 
     */
    @Export(name="referenceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> referenceName;

    /**
     * @return This is a reference name used in Caller Reference
     * (helpful for identifying single health_check set amongst others)
     * 
     */
    public Output</* @Nullable */ String> getReferenceName() {
        return this.referenceName;
    }
    /**
     * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
     * 
     */
    @Export(name="regions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> regions;

    /**
     * @return A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
     * 
     */
    public Output</* @Nullable */ List<String>> getRegions() {
        return this.regions;
    }
    /**
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
     * 
     */
    @Export(name="requestInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> requestInterval;

    /**
     * @return The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
     * 
     */
    public Output</* @Nullable */ Integer> getRequestInterval() {
        return this.requestInterval;
    }
    /**
     * The path that you want Amazon Route 53 to request when performing health checks.
     * 
     */
    @Export(name="resourcePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourcePath;

    /**
     * @return The path that you want Amazon Route 53 to request when performing health checks.
     * 
     */
    public Output</* @Nullable */ String> getResourcePath() {
        return this.resourcePath;
    }
    /**
     * The Amazon Resource Name (ARN) for the Route 53 Application Recovery Controller routing control. This is used when health check type is `RECOVERY_CONTROL`
     * 
     */
    @Export(name="routingControlArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> routingControlArn;

    /**
     * @return The Amazon Resource Name (ARN) for the Route 53 Application Recovery Controller routing control. This is used when health check type is `RECOVERY_CONTROL`
     * 
     */
    public Output</* @Nullable */ String> getRoutingControlArn() {
        return this.routingControlArn;
    }
    /**
     * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
     * 
     */
    @Export(name="searchString", type=String.class, parameters={})
    private Output</* @Nullable */ String> searchString;

    /**
     * @return String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
     * 
     */
    public Output</* @Nullable */ String> getSearchString() {
        return this.searchString;
    }
    /**
     * A map of tags to assign to the health check. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the health check. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED`, `CLOUDWATCH_METRIC` and `RECOVERY_CONTROL`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED`, `CLOUDWATCH_METRIC` and `RECOVERY_CONTROL`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(HealthCheckArgs.Builder a);
    }
    private static io.pulumi.aws.route53.HealthCheckArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.HealthCheckArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HealthCheck(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HealthCheck(String name) {
        this(name, HealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HealthCheck(String name, HealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HealthCheck(String name, HealthCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/healthCheck:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HealthCheck(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/healthCheck:HealthCheck", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HealthCheck get(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, state, options);
    }
}
