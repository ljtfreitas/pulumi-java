// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.globalaccelerator.EndpointGroupArgs;
import io.pulumi.aws.globalaccelerator.inputs.EndpointGroupState;
import io.pulumi.aws.globalaccelerator.outputs.EndpointGroupEndpointConfiguration;
import io.pulumi.aws.globalaccelerator.outputs.EndpointGroupPortOverride;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator endpoint group.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Global Accelerator endpoint groups can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:globalaccelerator/endpointGroup:EndpointGroup example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxx/endpoint-group/xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:globalaccelerator/endpointGroup:EndpointGroup")
public class EndpointGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the endpoint group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The list of endpoint objects. Fields documented below.
     * 
     */
    @Export(name="endpointConfigurations", type=List.class, parameters={EndpointGroupEndpointConfiguration.class})
    private Output</* @Nullable */ List<EndpointGroupEndpointConfiguration>> endpointConfigurations;

    /**
     * @return The list of endpoint objects. Fields documented below.
     * 
     */
    public Output</* @Nullable */ List<EndpointGroupEndpointConfiguration>> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }
    /**
     * The name of the AWS Region where the endpoint group is located.
     * 
     */
    @Export(name="endpointGroupRegion", type=String.class, parameters={})
    private Output<String> endpointGroupRegion;

    /**
     * @return The name of the AWS Region where the endpoint group is located.
     * 
     */
    public Output<String> getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }
    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * 
     */
    @Export(name="healthCheckIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthCheckIntervalSeconds;

    /**
     * @return The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * 
     */
    public Output</* @Nullable */ Integer> getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }
    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="healthCheckPath", type=String.class, parameters={})
    private Output<String> healthCheckPath;

    /**
     * @return If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<String> getHealthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="healthCheckPort", type=Integer.class, parameters={})
    private Output<Integer> healthCheckPort;

    /**
     * @return The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<Integer> getHealthCheckPort() {
        return this.healthCheckPort;
    }
    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     * 
     */
    @Export(name="healthCheckProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckProtocol;

    /**
     * @return The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     * 
     */
    public Output</* @Nullable */ String> getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }
    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
     */
    @Export(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the listener.
     * 
     */
    public Output<String> getListenerArn() {
        return this.listenerArn;
    }
    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * 
     */
    @Export(name="portOverrides", type=List.class, parameters={EndpointGroupPortOverride.class})
    private Output</* @Nullable */ List<EndpointGroupPortOverride>> portOverrides;

    /**
     * @return Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * 
     */
    public Output</* @Nullable */ List<EndpointGroupPortOverride>> getPortOverrides() {
        return this.portOverrides;
    }
    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     * 
     */
    @Export(name="thresholdCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> thresholdCount;

    /**
     * @return The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     * 
     */
    public Output</* @Nullable */ Integer> getThresholdCount() {
        return this.thresholdCount;
    }
    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     * 
     */
    @Export(name="trafficDialPercentage", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> trafficDialPercentage;

    /**
     * @return The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     * 
     */
    public Output</* @Nullable */ Double> getTrafficDialPercentage() {
        return this.trafficDialPercentage;
    }

    public interface BuilderApplicator {
        public void apply(EndpointGroupArgs.Builder a);
    }
    private static io.pulumi.aws.globalaccelerator.EndpointGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.globalaccelerator.EndpointGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EndpointGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointGroup(String name) {
        this(name, EndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointGroup(String name, EndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointGroup(String name, EndpointGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/endpointGroup:EndpointGroup", name, args == null ? EndpointGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EndpointGroup(String name, Output<String> id, @Nullable EndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/endpointGroup:EndpointGroup", name, state, makeResourceOptions(options, id));
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
    public static EndpointGroup get(String name, Output<String> id, @Nullable EndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EndpointGroup(name, id, state, options);
    }
}
